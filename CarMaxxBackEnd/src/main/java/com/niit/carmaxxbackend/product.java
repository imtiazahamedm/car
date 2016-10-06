package com.niit.carmaxxbackend;

import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class product {
	private String productId;
	@Id
	private String productcategory;
	private String productname;
	private String productdesc; 
	private String productmanufacturer;
	private String productprice;
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductcategory() {
		return productcategory;
	}
	public void setProductcategory(String productcategory) {
		this.productcategory = productcategory;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getProductdesc() {
		return productdesc;
	}
	public void setProductdesc(String productdesc) {
		this.productdesc = productdesc;
	}
	public String getProductmanufacturer() {
		return productmanufacturer;
	}
	public void setProductmanufacturer(String productmanufacturer) {
		this.productmanufacturer = productmanufacturer;
	}
	public String getProductprice() {
		return productprice;
	}
	public void setProductprice(String productprice) {
		this.productprice = productprice;
	}
	
	

}
