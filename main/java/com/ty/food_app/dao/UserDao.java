package com.ty.food_app.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.food_app.dto.User;

public class UserDao {


	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction =  entityManager.getTransaction();
		
	public User saveUser(User user) {
		entityTransaction.begin();
		entityManager.persist(user);
		entityTransaction.commit();
		return user;
	}
	
	public User getUserById(User user, int id) {
		User user1=entityManager.find(User.class, id);
		return user1;
	}
	
	public void deleteUserById(User user, int id) {
		User user1=entityManager.find(User.class, id);
		entityTransaction.begin();
		entityManager.remove(user1);
		entityTransaction.commit();
		System.out.println("Row deleted");
	}
	
	public User updateUserById(User user, int id) {
		User user1=entityManager.find(User.class, id);
		
		user1.setAddress(user.getAddress());
		user1.setAge(user.getAge());
		user1.setEmail(user.getEmail());
		user1.setPhno(user.getPhno());
		entityTransaction.begin();
		entityManager.persist(user1);
		entityTransaction.commit();
		return user1;
	}
	
	public User validateUserById(String email, String password ) {
		String sql = "select f from f where f.email=?1, f.password=?2";
		Query query = entityManager.createQuery(sql);
		List<User> user = query.getResultList();
		for(User user1: user) {
			if(user1.getEmail().equals(email) && user1.getPassword().equals(password)) {
				return user1;
			}
		}
		return null;
	}
	
}
