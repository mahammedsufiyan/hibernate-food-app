
package com.ty.food_app.controller;

import com.ty.food_app.dto.FoodOrder;
import com.ty.food_app.services.FoodOrderServices;

public class DeleteOrder {
	
	public static void main(String[] args) {
//		 FoodOrder foodOrder = new FoodOrder();
		 FoodOrderServices foodOrderServices = new FoodOrderServices();
		 FoodOrder food=foodOrderServices.deleteOrderById(2);
		 System.out.println(food==null ? "Row deleted ":"Somthing went wrong");
	}
}
