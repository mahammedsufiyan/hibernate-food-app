package com.ty.food_app.controller;

import com.ty.food_app.dto.User;
import com.ty.food_app.services.UserServices;

public class SaveUser {
	public static void main(String[] args) {
		User user = new User();
		user.setName("janani");
		user.setEmail("janani@gmail.com");
		user.setPassword("jan12");
		user.setAddress("millur");
		user.setPhno(2222);
		user.setAge(81);
		
		UserServices services = new UserServices();
		services.saveUser(user);
	}
}
