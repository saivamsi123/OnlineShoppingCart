package com.allianz.onlineshoppingcart.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.allianz.onlineshoppingcart.model.Product;

public interface ProductDAOImpl extends JpaRepository<Product, Integer>{

}
