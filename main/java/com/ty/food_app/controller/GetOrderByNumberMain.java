package com.ty.food_app.controller;

import java.util.List;

import com.ty.food_app.dto.FoodOrder;
import com.ty.food_app.services.FoodOrderServices;

public class GetOrderByNumberMain {
	
	public static void main(String[] args) {
		FoodOrderServices foodOrderServices = new FoodOrderServices();
		 List<FoodOrder> orders= foodOrderServices.getOrderByNumber(8888);
		 for(FoodOrder food:orders ) {
			 System.out.print(food.getId()+" ");
			 System.out.print(food.getName()+" ");
			 System.out.print(food.getPhone()+" ");
			 System.out.print(food.getTotal()+" ");
			 System.out.println();
		 }
	}
}
