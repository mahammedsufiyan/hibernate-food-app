package com.ty.food_app.services;

import java.util.List;

import com.ty.food_app.dao.FoodOrderDao;
import com.ty.food_app.dto.FoodOrder;

public class FoodOrderServices {
	
	FoodOrderDao foodOrder1= new FoodOrderDao();
	public FoodOrder saveFoodOrder(FoodOrder foodOrder) {
		
		return  foodOrder1.saveFoodOrder(foodOrder);
	}
	
	public FoodOrder getOrderById( int id) {
		
		return foodOrder1.getOrderById(id);
	}
	
	public List<FoodOrder> getOrderByNumber(long phone){
		
		return foodOrder1.getOrderByNumber(phone);
	}
	
	public List<FoodOrder> getOrderByName(String name){
		
		return foodOrder1.getOrderByName(name);
	}
	
	public FoodOrder deleteOrderById(int id) {
		foodOrder1.deleteOrderById(id);
		return null;
	}
	
	public FoodOrder updateOrderById(int id, FoodOrder foodOrder) {
		
		return foodOrder1.updateOrderById(id, foodOrder);
	}
}
