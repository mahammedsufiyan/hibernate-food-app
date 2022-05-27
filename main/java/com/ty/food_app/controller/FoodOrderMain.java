package com.ty.food_app.controller;

import java.util.ArrayList;
import java.util.List;

import com.ty.food_app.dto.FoodOrder;
import com.ty.food_app.dto.Item;
import com.ty.food_app.services.FoodOrderServices;

public class FoodOrderMain {
	public static void main(String[] args) {
		
		FoodOrder foodOrder = new FoodOrder();
		foodOrder.setName("Pavan");
		foodOrder.setPhone(7777);
		
		Item item = new Item();
		item.setName("Palaw");
		item.setQuantity(3);
		item.setCost(200);
		
		Item item2 = new Item();
		item2.setName("GheeRice");
		item2.setQuantity(1);
		item2.setCost(90);
		
		Item item3 = new Item();
		item3.setName("Parota");
		item3.setQuantity(2);
		item3.setCost(60);
		
		List<Item> items = new ArrayList<Item>();
		items.add(item);
		items.add(item2);
		items.add(item3);
		item.setFoodOrder(foodOrder);
		item2.setFoodOrder(foodOrder);
		item3.setFoodOrder(foodOrder);
		foodOrder.setItem(items);
		FoodOrderServices foodOrderServices = new FoodOrderServices();
		foodOrderServices.saveFoodOrder(foodOrder);
		
		
	}
}
