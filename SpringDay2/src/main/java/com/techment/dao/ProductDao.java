package com.techment.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techment.entity.Product;

@Repository
public interface ProductDao extends JpaRepository<Product,Integer>{

	List<Product> findByPrice(int price);
	//List<Product> findByPriceAndProductName(int price,String ProductName);
}
