package com.ty.food_app.controller;

import com.ty.food_app.dto.User;
import com.ty.food_app.services.UserServices;

public class GetUser {
	
	public static void main(String[] args) {
		User user = new User();
		UserServices services = new UserServices();
		User u = services.getUserById(user, 2);
		System.out.println(u.getName());
		System.out.println(u.getEmail());
		System.out.println(u.getAge());
		System.out.println(u.getAddress());
		System.out.println(u.getPhno());
		
	}
}
