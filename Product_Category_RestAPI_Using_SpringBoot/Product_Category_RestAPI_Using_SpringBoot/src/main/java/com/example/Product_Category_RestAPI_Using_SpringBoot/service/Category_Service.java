package com.example.Product_Category_RestAPI_Using_SpringBoot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Product_Category_RestAPI_Using_SpringBoot.dao.Category_Dao;
import com.example.Product_Category_RestAPI_Using_SpringBoot.dto.Category;

@Service
public class Category_Service {
	  @Autowired
	    private Category_Dao dao;

	    public Category saveCategory(Category category){
	        return dao.saveCategory(category);
	    }

	    public Optional<Category> findCategoryById(int id){
	        return dao.findCategoryById(id);
	    }

//	    public List<Category> findAllCategory(){
//	        return dao.findAllCategory();
//	    }
	    public List<Category> getAllCategoryt(Integer pageNumber, Integer pageSize) {
			return dao.getAllCategory(pageNumber, pageSize);
		}

	    public Category updateById(int id,Category category){
	        return dao.updateById(id, category);
	    }

	    public void deleteById(int id){
	        dao.deleteCategoryById(id);
	    }

}
