package com.ty.food_app.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.food_app.dto.FoodOrder;
import com.ty.food_app.dto.Item;

public class FoodOrderDao {
	
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction =  entityManager.getTransaction();
	
	public FoodOrder saveFoodOrder(FoodOrder foodOrder) {

		entityTransaction.begin();
		entityManager.persist(foodOrder);
		entityTransaction.commit();
		return foodOrder;
	}
	
	public FoodOrder getOrderById(int  id) {
		
		FoodOrder food= entityManager.find(FoodOrder.class, id);
		if(food != null)
			return food;
		return null;
	}
	
	public List<FoodOrder> getOrderByNumber(long phone){
		String sql ="select f  from FoodOrder f where f.phone =?1";
		Query query = entityManager.createQuery(sql);
		query.setParameter(1, phone);
		List<FoodOrder> lists = query.getResultList();
		if(lists != null) {
			return lists;
		}
		else return null;
		
	}
	
	public List<FoodOrder> getOrderByName(String name){
		String sql ="select f  from FoodOrder f where f.name =?1";
		Query query = entityManager.createQuery(sql);
		query.setParameter(1, name);
		List<FoodOrder> lists = query.getResultList();
		if(lists != null) {
			return lists;
		}
		else return null;
	}
	
	public FoodOrder deleteOrderById(int id) {
		FoodOrder foodOrder = entityManager.find(FoodOrder.class, id);
		if(foodOrder != null) {
			
			entityTransaction.begin();
			entityManager.remove(foodOrder);
			entityTransaction.commit();
		}
		else 
			{
			System.out.println("No row matchin id");
			return foodOrder;
			}
		return null;
		
	}
	
	
	
	public FoodOrder updateOrderById(int id, Item item) {
		FoodOrder food = entityManager.find(FoodOrder.class, id);
		food.setName(item.getName());
		Error here
		entityTransaction.begin();
		entityManager.merge(food);
		entityTransaction.commit();
		return food;
	}
}
