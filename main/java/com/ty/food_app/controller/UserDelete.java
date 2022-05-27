package com.ty.food_app.controller;

import com.ty.food_app.dao.UserDao;
import com.ty.food_app.dto.User;

public class UserDelete {
	
	public static void main(String[] args) {
		User user = new User();
		UserDao dao = new UserDao();
		dao.deleteUserById(user, 2);
	}
}
