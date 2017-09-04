package net.mnayak2.shoppingbackend.dao;

import java.util.List;

import net.mnayak.shoppingbackend.dto.Category;

public interface CategoryDAO {

	
	List<Category> list();

	Category get(int id);
	
}
