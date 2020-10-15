package com.techment.service;

import java.util.List;

import com.techment.entity.Product;

public interface ProductService {

	void addProduct(Product product);
	List <Product> ViewProduct();
	
}
