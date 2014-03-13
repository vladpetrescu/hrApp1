package ro.leasing.service;

import ro.leasing.dao.UserDao;

public class DaoManager{
	UserDao userDao;

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	
	
	
}
