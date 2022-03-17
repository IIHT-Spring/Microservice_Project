package com.user.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.user.entity.User;


@Service
public class UserServiceImpl implements UserService {
	
	//fake user list
	
	
	List<User> list = List.of(
			new User(1311L,"Nishant Gupta","776655212"),
			new User(1312L,"Akshay Gupta","5521654035"),
			new User(1313L,"Rakesh Kumar","484515487"),
			new User(1314L,"Monoj Verma","4478124923"),
			new User(1315L,"Vijay Sharma","9954811546"),
			new User(1316L,"Raj Tewari","1543234873"), 
			new User(1317L,"Sunil Kumar","7788994455"),
			new User(1318L,"Roshan Kadam","445578412")	
			);
			
	
	@Override
	public User getUser(Long id) {
		return list.stream().filter(user-> user.getUserID().equals(id)).findAny().orElse(null);
		

	}

}
