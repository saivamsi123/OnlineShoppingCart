package com.allianz.onlineshoppingcart.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.allianz.onlineshoppingcart.DAO.ProductDAOImpl;
import com.allianz.onlineshoppingcart.model.Product;

@RestController
@RequestMapping(value= {"productController"})
public class ProductController {
	
	@Autowired
	private ProductDAOImpl productDaoImpl;
	
	@GetMapping
	public List<Product> findAll()
	{
		return productDaoImpl.findAll();
		
	}
	

}
