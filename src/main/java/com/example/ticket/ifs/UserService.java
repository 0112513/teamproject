package com.example.ticket.ifs;

import com.example.ticket.vo.UserLoginGetRes;
import com.example.ticket.vo.UserLoginRes;

public interface UserService {
	
	public UserLoginRes login(String account, String pwd ); //若public 後面加的不是void 都需要在return後面加上需要回傳的東西
	
	public UserLoginRes create(String account,String pwd,String email,String name,String phone, int age, String birthday);
	
	public UserLoginRes update(int UserId,String account,String pwd,String email,String name,String phone, int age, String birthday); 

	public UserLoginGetRes search(String account, String pwd);
}
