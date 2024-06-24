package com.demo.controller;

import com.demo.beans.Product;
import com.demo.bussiness.ProductBussiness;

public class ProductController {
	ProductBussiness pb;
	
	public void setPb(ProductBussiness pb) {
		this.pb = pb;
	}
	public void post(Product p) 
	{
	   pb.addProduct(p);	
	}
	
}
