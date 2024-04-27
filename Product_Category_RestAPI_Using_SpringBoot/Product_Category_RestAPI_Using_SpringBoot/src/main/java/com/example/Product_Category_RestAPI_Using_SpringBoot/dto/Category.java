package com.example.Product_Category_RestAPI_Using_SpringBoot.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity

public class Category {
	
	
	 @Id
	    @GeneratedValue( strategy = GenerationType.IDENTITY)
	    private int id;
	    private String category_name;

	    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
	    @JsonManagedReference
	    private List<Product> productList;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getCategory_name() {
			return category_name;
		}

		public void setCategory_name(String category_name) {
			this.category_name = category_name;
		}

		public List<Product> getProductList() {
			return productList;
		}

		public void setProductList(List<Product> productList) {
			this.productList = productList;
		}
	   }
