package com.techment.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techment.dao.ProductDao;
import com.techment.entity.Product;
import com.techment.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductDao productDao;
	
	@Override
	public void addProduct(Product product) {
		// TODO Auto-generated method stub
		productDao.save(product);
	}

	@Override
	public List<Product> ViewProduct() {
		// TODO Auto-generated method stub
		return productDao.findAll();
	}

}
