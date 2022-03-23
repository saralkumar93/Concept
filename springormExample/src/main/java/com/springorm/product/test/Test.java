package com.springorm.product.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springorm.product.dao.ProductDao;
import com.springorm.product.entity.Product;

public class Test {
	public static void main(String[] args) {
		
		ApplicationContext context= new ClassPathXmlApplicationContext("com/springorm/product/test/config.xml");
		ProductDao productDao = (ProductDao) context.getBean("productDao");
		/*
		 * Product product=new Product(); product.setId(1); product.setName("Iphone");
		 * product.setDesc("Its a awesome product"); product.setPrice(7000);
		 */
		//productDao.create(product);
		//productDao.update(product);
		//productDao.delete(product);
		//Product find = productDao.find(1);
		List<Product> findAll = productDao.findAll();
		System.out.println(findAll);
	}

}
