/**
 * 
 */
package com.test.service;


import com.test.dao.UserDao;
import com.test.model.User;


public class UserService {
	private UserDao userDao;

	public void register(User user) {
		this.userDao.register(user);
	}

	public boolean verifyUser(User user) {
		return this.userDao.verifyUser(user);
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
}
