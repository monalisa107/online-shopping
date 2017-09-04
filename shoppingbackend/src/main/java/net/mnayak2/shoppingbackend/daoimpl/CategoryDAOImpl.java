package net.mnayak2.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.mnayak.shoppingbackend.dto.Category;
import net.mnayak2.shoppingbackend.dao.CategoryDAO;

@Repository("customerDAO")
public class CategoryDAOImpl implements CategoryDAO {


	private static List<Category> categories = new ArrayList<>();

	static{

		Category category= new Category();
		//1st category
		category.setId(1);
		category.setName("Television");
		category.setDescription("This is television desc");
		category.setImageURL("CAT1.png");
		categories.add(category);


		category= new Category();
		//2nd category
		category.setId(2);
		category.setName("Mobile");
		category.setDescription("This is Mobile desc");
		category.setImageURL("CAT2.png");
		categories.add(category);



		category= new Category();
		//1st category
		category.setId(3);
		category.setName("Laptop");
		category.setDescription("This is Laptop desc");
		category.setImageURL("CAT3.png");
		categories.add(category);



	}


	@Override
	public List<Category> list() {

		return categories;
	}


	@Override
	public Category get(int id) {

		for(Category category:categories)
		{
			if(category.getId()==id)
			{
				return category;
			}
			
		}
		return null;
	}

}
