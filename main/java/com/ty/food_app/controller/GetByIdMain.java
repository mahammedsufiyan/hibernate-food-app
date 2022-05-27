package com.ty.food_app.controller;

import java.util.List;

import com.ty.food_app.dto.FoodOrder;
import com.ty.food_app.dto.Item;
import com.ty.food_app.services.FoodOrderServices;

public class GetByIdMain {
	
	public static void main(String[] args) {
		FoodOrderServices foodOrderServices = new FoodOrderServices();
//		FoodOrder foodOrder = new FoodOrder();
		FoodOrder food=foodOrderServices.getOrderById(1);
		System.out.println(food.getName());
		System.out.println(food.getPhone());
		List<Item> item = food.getItem();
		for(Item item1:item) {
			System.out.print(item1.getId()+" ");
			System.out.print(item1.getName()+" ");
			System.out.print(item1.getQuantity()+" ");
			System.out.print(item1.getCost()+" ");
			System.out.println();
		}
	}
}
