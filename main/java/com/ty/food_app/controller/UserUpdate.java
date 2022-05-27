package com.ty.food_app.controller;

import com.ty.food_app.dto.User;
import com.ty.food_app.services.UserServices;

public class UserUpdate {
	public static void main(String[] args) {
		User user = new User();
		user.setName("tanu");
		user.setEmail("tan@gmail.com");
		user.setAge(25);
		
		UserServices services = new UserServices();
		services.updateUserById(user, 4);
		
	}
}
