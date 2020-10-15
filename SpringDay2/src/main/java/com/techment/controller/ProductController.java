package com.techment.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.techment.entity.Product;
import com.techment.service.ProductService;

@RestController(value="api/product")
public class ProductController {

	@Autowired
	ProductService productService;
	

	private Logger logger = LoggerFactory.getLogger(ProductController.class);
	
	@PostMapping(value="/addProduct")
	public String addProduct(@RequestBody Product product) {
		
		logger.info("Trying to add product");
		productService.addProduct(product);
		logger.info("Product Added");
		return "Product Added Successfully";
	}
	
	@GetMapping(value="/getAllProduct")
	public List<Product> viewproduct() {
		return productService.ViewProduct();
	}
	
	
}
