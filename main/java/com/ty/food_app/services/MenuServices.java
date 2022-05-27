package com.ty.food_app.services;

import com.ty.food_app.dao.MenuDao;
import com.ty.food_app.dto.Menu;

public class MenuServices {
	
	MenuDao dao = null;
	public Menu saveMenu(Menu menu) {
		dao=new MenuDao();
		return dao.saveMenu(menu);
	}
	
	public Menu getMenuById(int id) {
		dao = new MenuDao();
		return dao.getMenuById(id);
	}
	
	public Menu deleteById(int id) {
		dao = new MenuDao();
		return dao.deletMenuById(id);
	}
	
	public Menu updateMenuById(int id, Menu menu) {
		dao = new MenuDao();
		return dao.updateMenuById(id, menu);
	}
}
