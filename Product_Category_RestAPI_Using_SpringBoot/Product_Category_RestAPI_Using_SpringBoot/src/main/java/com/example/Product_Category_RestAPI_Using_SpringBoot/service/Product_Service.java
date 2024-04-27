package com.example.Product_Category_RestAPI_Using_SpringBoot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Product_Category_RestAPI_Using_SpringBoot.dao.Product_Dao;
import com.example.Product_Category_RestAPI_Using_SpringBoot.dto.Product;

@Service
public class Product_Service {
	
	 @Autowired
	    private Product_Dao dao;

	    public Product saveProduct(Product product){
	        return  dao.saveProduct(product);
	    }

	    public Optional<Product> findProductById(int id){
	        return  dao.findProductById(id);
	    }

//	    public List<Product> findAllProduct(){
//	        return dao.findAllProduct();
//	    }
	    
	    public List<Product> getAllProduct(Integer pageNumber, Integer pageSize) {
			return dao.getAllProduct(pageNumber, pageSize);
		}

	    public Product updateProductById(int id, Product product){
	        return dao.updateProductById(id,product);
	    }

	    public void deleteById(int id){
	        dao.deleteProductById(id);
	    }


}
