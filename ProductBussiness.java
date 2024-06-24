package com.demo.bussiness;

import com.demo.beans.Product;
import com.demo.dao.ProductDao;

public class ProductBussiness {

	ProductDao dao;
	public void setDao(ProductDao dao) {
		this.dao = dao;
	}
	public void addProduct(Product p) 
	{
		dao.save(p);
	}
}
