package com.techment;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.techment.dao.ProductDao;
import com.techment.entity.Product;

@SpringBootApplication
public class SpringDay2Application implements CommandLineRunner{

	@Autowired
	ProductDao productDao;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringDay2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		List<Product> p = productDao.findByPrice(300);
		System.out.println("List of product"+p);
		
		for(Product product:p) {
			System.out.println(product.getId()+"\n"+product.getPrice()+"\n"+product.getProductName());
		}
	}

}
