package com.ty.food_app.controller;

import com.ty.food_app.dto.FoodOrder;
import com.ty.food_app.services.FoodOrderServices;

public class UpdateOrder {
	public static void main(String[] args) {
		FoodOrder foodOrder = new FoodOrder();
		foodOrder.setName("Chill");
		foodOrder.setPhone(2222);
		
		FoodOrderServices foodOrderServices = new FoodOrderServices();
		FoodOrder f = foodOrderServices.updateOrderById(4, foodOrder);
		System.out.println(f!=null ? "row updated":"No row effected");
	}
}
