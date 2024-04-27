package com.example.Product_Category_RestAPI_Using_SpringBoot.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.Product_Category_RestAPI_Using_SpringBoot.dto.Product;
import com.example.Product_Category_RestAPI_Using_SpringBoot.repository.Product_Repository;

@Repository
public class Product_Dao {
	
	 @Autowired
	    private Product_Repository repository;

	    public Product saveProduct(Product product){
	        return  repository.save(product);
	    }

	    public Optional<Product> findProductById(int id){
	        return  repository.findById(id);
	    }

//    public List<Product> findAllProduct(){
//	    return repository.findAll();
//   }
	    
	    public List<Product> getAllProduct(Integer pageNumber, Integer pageSize) {
			Pageable p=PageRequest.of(pageNumber, pageSize);
			Page<Product> pageProduct= this.repository.findAll(p);
			List<Product> allProduct= pageProduct.getContent();
			return allProduct;
	    }
	    
	    
	  

	    public Product updateProductById(int id, Product product){
	        product.setId(id);
	        return repository.save(product);
	    }

	    public void deleteProductById(int id){
	        repository.deleteById(id);
	    }

}
