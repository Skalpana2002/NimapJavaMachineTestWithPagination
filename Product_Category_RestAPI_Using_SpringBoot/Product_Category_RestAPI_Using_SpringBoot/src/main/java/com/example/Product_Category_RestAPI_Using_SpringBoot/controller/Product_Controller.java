package com.example.Product_Category_RestAPI_Using_SpringBoot.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Product_Category_RestAPI_Using_SpringBoot.dto.Product;
import com.example.Product_Category_RestAPI_Using_SpringBoot.service.Product_Service;

@RestController
@RequestMapping("/api")
public class Product_Controller {
	 @Autowired
	    private Product_Service service;

	    @PostMapping("/product/save/{id}")
	    public Product saveProduct(@RequestBody Product product){
	        return  service.saveProduct(product);
	    }
//
//	    @GetMapping("/product/findById/{id}")
//	    public Optional<Product> findProductById(@PathVariable int id){
//	        return service.findProductById(id);
//	    }
//
//	    @GetMapping("/product/findAll/page=3")
//	    public List<Product> findAllProduct(){
//	        return service.findAllProduct();
//	    }
	    
	    
	    @GetMapping("/product/findById/{id}")
	    public Optional<Product> findProductById(@PathVariable int id){
	        return service.findProductById(id);
	    }

	    @GetMapping("/product")
	   	public List<Product> getAllProduct(@RequestParam(value = "pageNumber",defaultValue = "1",required = false) Integer pageNumber,
	   			@RequestParam(value = "pageSize",defaultValue = "5",required = false) Integer pageSize){
	   		return service.getAllProduct(pageNumber,pageSize);
	   	}

	    @PutMapping("/product/findById/{id}")
	    public Product updateProductById(@PathVariable int id,@RequestBody Product product){
	        return service.updateProductById(id,product);
	    }

	    @DeleteMapping("/product/delete/{id}")
	    public void deleteProductById(@PathVariable int id){
	        service.deleteById(id);
	    }

}
