package com.demo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.beans.Product;
import com.demo.controller.ProductController;

public class SPHibClient {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		ProductController pc=	ctx.getBean(ProductController.class);
        
		Product p1 =new Product();
		p1.setPid(123);
		p1.setProName("Marker");
		p1.setProPrice(20.5f);
		
		pc.post(p1);
	}

}
