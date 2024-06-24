package com.demo.dao;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.demo.beans.Product;

public class ProductDao {
	HibernateTemplate ht;
	
	public void setHt(HibernateTemplate ht) {
		this.ht = ht;
	}
	public void save(Product p) 
	{
		ht.save(p);
		System.out.println("Record inserted");
	}

}
