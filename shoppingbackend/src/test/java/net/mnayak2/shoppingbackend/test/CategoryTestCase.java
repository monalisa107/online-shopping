package net.mnayak2.shoppingbackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import net.mnayak2.shoppingbackend.dao.CategoryDAO;
import net.mnayak2.shoppingbackend.dto.Category;

public class CategoryTestCase {


	private static AnnotationConfigApplicationContext context;
	private static CategoryDAO cdao;
	private Category category;


	@BeforeClass
	public static void init()
	{
		context=new AnnotationConfigApplicationContext();
		context.scan("net.mnayak2.shoppingbackend");
		context.refresh();

		cdao=(CategoryDAO) context.getBean("customerDAO");


	}



	/*@Test
	public void testAddCategory()
	{

		category=new Category();

		category.setName("Television");
		category.setDescription("This is television desc");
		category.setImageURL("CAT1.png");

		assertEquals("Successfully added the category",true,cdao.add(category));


	}*/

	/*@Test
	public void testgetCategory()
	{

		category=cdao.get(1);
		assertEquals("Successfully afetcheded the category","Television",category.getName());


	}*/


	/*@Test
	public void testUpdateCategory()
	{

		category=cdao.get(1);
		category.setActive(false);
		assertEquals("Successfully afetcheded the category",true,cdao.delete(category));


	}
	 */

	/*@Test
	public void testActiveCategory()
	{


		assertEquals("Successfully afetcheded the category",0,cdao.list().size());


	}*/



	@Test
	public void testCRUDCategory()
	{/*

		category=new Category();

		category.setName("Mobile");
		category.setDescription("This is Mobile desc");
		category.setImageURL("CAT1.png");

		assertEquals("Successfully added the category",true,cdao.add(category));
		
	
		category=new Category();
		category.setName("Laptop");
		category.setDescription("This is Laptop desc");
		category.setImageURL("CAT2.png");

		assertEquals("Successfully added the category",true,cdao.add(category));
		
		
		category=cdao.get(2);
		category.setName("Cellphone");
		assertEquals("Successfully afetcheded the category",true,cdao.update(category));
	
		
		category=cdao.get(2);
		category.setActive(false);
		assertEquals("Successfully afetcheded the category",true,cdao.delete(category));
		
		assertEquals("Successfully afetcheded the category",1,cdao.list().size());

		
	*/
		

		category=cdao.get(1);
		assertEquals("Successfully afetcheded the category","Laptop",category.getName());


	}

}
