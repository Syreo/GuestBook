package com.catalystitservices.service.impl;

import org.springframework.transaction.annotation.Transactional;

import com.catalystitservices.guest.dao.UserDao;
import com.catalystitservices.guest.model.User;
import com.catalystitservices.service.UserService;

@Transactional(readOnly = true)
public class UserServiceImpl implements UserService{

	UserDao userDao;
	
	public void addGuest(User user){
		userDao.persist(user);
	}
	
	
}
