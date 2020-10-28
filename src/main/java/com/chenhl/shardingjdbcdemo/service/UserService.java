package com.chenhl.shardingjdbcdemo.service;

import com.chenhl.shardingjdbcdemo.domain.User;

import java.sql.SQLException;
import java.util.List;


public interface UserService {
	
	public void processUsers();
	
	public List<User> getUsers();

}
