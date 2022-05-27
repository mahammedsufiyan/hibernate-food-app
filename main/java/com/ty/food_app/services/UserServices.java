package com.ty.food_app.services;

import com.ty.food_app.dao.UserDao;
import com.ty.food_app.dto.User;

public class UserServices {

	UserDao dao = new UserDao();
	public User saveUser(User user) {
		return dao.saveUser(user);
	}
	
	public User getUserById(User user, int id) {
		return dao.getUserById(user, id);
	}
	
	public User updateUserById(User user, int id) {
		return dao.updateUserById(user, id);
	}
	
	public User validateUserById(String email, String password ) {
		return dao.validateUserById(email, password);
	}

}
