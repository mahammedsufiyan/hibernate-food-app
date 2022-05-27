package com.ty.food_app.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.food_app.dto.Menu;

public class MenuDao {
	
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	
	public Menu saveMenu(Menu menu) {
		entityTransaction.begin();
		entityManager.persist(menu);
		entityTransaction.commit();
		return menu;
	}
	
	public Menu getMenuById(int id) {
		Menu menu = entityManager.find(Menu.class, id);
		if(menu != null) {
			Menu menu1 = new Menu();
			menu1.setId(menu.getId());		
			menu1.setName(menu.getName());
			menu1.setDescreption(menu.getDescreption());
			menu1.setType(menu.getType());
			menu1.setCost(menu.getCost());
			menu1.setOffer(menu.getOffer());
			menu1.setImage(menu.getImage());
			return menu1;
			
			/* Directly we can give
			 * if(menu != null){
			 * return menu;
			 * }
			 */
		}
		else return null;
	}
	
	public Menu deletMenuById(int id) {
		Menu menu = entityManager.find(Menu.class, id);
		if(menu != null) {
			entityTransaction.begin();
			entityManager.remove(menu);
			entityTransaction.commit();
		}
		return menu;
	}
	
	public Menu updateMenuById(int id, Menu menu) {
		Menu menu1 = entityManager.find(Menu.class, id);
		menu1.setCost(menu.getCost());
		menu1.setName(menu.getName());
		return menu1;
	}
	
	
}
