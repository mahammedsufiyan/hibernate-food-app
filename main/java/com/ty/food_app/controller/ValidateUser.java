package com.ty.food_app.controller;

import com.ty.food_app.dto.User;
import com.ty.food_app.services.UserServices;

public class ValidateUser {
	
	public static void main(String[] args) {
		UserServices services = new UserServices();
		User user =services.validateUserById("rana@gmail.com", "chin12");
		System.out.println(user.getName());
		System.out.println(user.getEmail());
		System.out.println(user.getAddress());
		System.out.println(user.getAge());
	}
}
