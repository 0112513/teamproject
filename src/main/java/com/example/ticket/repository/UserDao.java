package com.example.ticket.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.ticket.entity.Order;
import com.example.ticket.entity.User;


@Repository
public interface UserDao extends  JpaRepository<User, Integer>{

//	public User findByAccountAndPwd(String account, String pwd); //找資料用find 透過什麼用by 記得要小駝峰
	
//	public boolean existsByAccountAndPwd(String account, String pwd);
	
	public List<User> findByAccount(String account);
//	
	public boolean existsByAccount(String account);
	
	public List<User> findByAccountAndPwd(String account,String pwd);

	@Query(value = "SELECT * FROM user WHERE account LIKE %:account%"
	        + " AND password LIKE %:pwd%", nativeQuery = true)
	public List<User> findByLike(@Param("account") String account,
	        @Param("pwd") String pwd); 
}
