package com.example.Product_Category_RestAPI_Using_SpringBoot.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Repository;

import com.example.Product_Category_RestAPI_Using_SpringBoot.dto.Category;
import com.example.Product_Category_RestAPI_Using_SpringBoot.repository.Category_Repository;

@Repository
public class Category_Dao {
	
	  @Autowired
	    private Category_Repository repository;

	    public Category saveCategory(Category category){
	        return repository.save(category);
	    }

	    public Optional<Category> findCategoryById(int id){
	        return repository.findById(id);
	    }

//	    public List<Category> findAllCategory(){
//	        return repository.findAll();
//	    }
	    public List<Category> getAllCategory(Integer pageNumber, Integer pageSize) {
			Pageable p=PageRequest.of(pageNumber, pageSize);
			Page<Category> pageCategory= this.repository.findAll(p);
			List<Category> allCategory= pageCategory.getContent();
			return allCategory;
	    }
	   

	    public Category updateById(int id,Category category){
	        category.setId(id);
	        return repository.save(category);
	    }

	    public void deleteCategoryById(int id){
	        repository.deleteById(id);
	    }
	    
	    
	    
	    

}
