package com.example.Product_Category_RestAPI_Using_SpringBoot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Product_Category_RestAPI_Using_SpringBoot.dto.Product;

public interface Product_Repository extends JpaRepository<Product, Integer>{

}
