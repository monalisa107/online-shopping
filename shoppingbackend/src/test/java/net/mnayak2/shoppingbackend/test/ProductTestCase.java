package net.mnayak2.shoppingbackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import net.mnayak2.shoppingbackend.dao.ProductDAO;
import net.mnayak2.shoppingbackend.dto.Product;

public class ProductTestCase {


	private static AnnotationConfigApplicationContext context;
	private static ProductDAO cdao;
	private Product product;


	@BeforeClass
	public static void init()
	{
		context=new AnnotationConfigApplicationContext();
		context.scan("net.mnayak2.shoppingbackend");
		context.refresh();

		cdao=(ProductDAO) context.getBean("productDAO");


	}



	/*@Test
	public void testAddproduct()
	{

		product=new product();

		product.setName("Television");
		product.setDescription("This is television desc");
		product.setImageURL("CAT1.png");

		assertEquals("Successfully added the product",true,cdao.add(product));


	}*/

	/*@Test
	public void testgetproduct()
	{

		product=cdao.get(1);
		assertEquals("Successfully afetcheded the product","Television",product.getName());


	}*/


	/*@Test
	public void testUpdateproduct()
	{

		product=cdao.get(1);
		product.setActive(false);
		assertEquals("Successfully afetcheded the product",true,cdao.delete(product));


	}
	 */

	/*@Test
	public void testActiveproduct()
	{


		assertEquals("Successfully afetcheded the product",0,cdao.list().size());


	}*/



	@Test
	public void testCRUDProduct()
	{/*

		product=new Product();

		product.setName("Oppo Selfie S53");
		product.setBrand("Oppo");
		product.setDescription("This is desc for oppo");
		product.setUnitPrice(25000);
		product.setActive(true);
        product.setCategoryId(3);
        product.setSupplierId(3);
		assertEquals("Something went wrong while inserting a product",true,cdao.add(product));
		
	
		//reading and updating the category
		product=cdao.get(2);
		product.setName("Samsung VLACK");
		assertEquals("Something went wrong while updating the product",true,cdao.update(product));
		
		assertEquals("Successfully went wrong while deleting the product",true,cdao.delete(product));
		
		assertEquals("Successfully afetcheded the product",6,cdao.list().size());

		
	*/
		
	  
		//assertEquals("Successfully went wrong while deleting the product",5,cdao.listActiveProducts());
	
		assertEquals("Successfully went wrong while deleting the product",3,cdao.listActiveProductsByCategory(3).size());
		assertEquals("Successfully went wrong while deleting the product",2,cdao.listActiveProductsByCategory(1).size());
		assertEquals("Successfully went wrong while getting latest active product",2,cdao.getLatestActiveProducts(2).size());
	
		
		
	}

}
