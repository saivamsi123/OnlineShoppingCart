package com.allianz.onlineshoppingcart.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "products")
public class Product {
	
	private Integer id;
	private String code;
	private String description;
	private Float price;
	private Date mfgDate;
	//private List<Category> categoryList = new ArrayList<Category>(); 
	
	public Product() {
		super();
	}
	public Product(int id, String code, String description, float price, Date mfgDate) {
		super();
		this.id = id;
		this.code = code;
		this.description = description;
		this.price = price;
		this.mfgDate = mfgDate;
	}
	
//	public List<Category> getCategoryList() {
//		return categoryList;
//	}
//	public void setCategoryList(List<Category> categoryList) {
//		this.categoryList = categoryList;
//	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Integer getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	public Date getMfgDate() {
		return mfgDate;
	}
	public void setMfgDate(Date mfgDate) {
		this.mfgDate = mfgDate;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", code=" + code + ", description=" + description + ", price=" + price
				+ ", mfgDate=" + mfgDate + "]";
	}
	
}
