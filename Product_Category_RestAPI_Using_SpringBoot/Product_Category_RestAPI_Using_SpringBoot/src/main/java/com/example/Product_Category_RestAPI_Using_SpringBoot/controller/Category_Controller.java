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

import com.example.Product_Category_RestAPI_Using_SpringBoot.dto.Category;
import com.example.Product_Category_RestAPI_Using_SpringBoot.service.Category_Service;

@RestController
@RequestMapping("/api")
public class Category_Controller {
	
	@Autowired
    private Category_Service service;

    @PostMapping("/categories/save")
    public Category saveCategory(@RequestBody  Category category){
        return service.saveCategory(category);
    }

//    @GetMapping("/categories/findById/{id}")
//    public Optional<Category> findCategoryById(@PathVariable int id){
//        return service.findCategoryById(id);
//    }
//
//    @GetMapping("/categories/findAll/page=2")
//    public List<Category> findAllCategory(){
//        return service.findAllCategory();
//    }
    @GetMapping("/categories/findById/{id}")
    public Optional<Category> findCategoryById(@PathVariable int id){
        return service.findCategoryById(id);
    }

    @GetMapping("/categories")
   	public List<Category> getAllCategory(@RequestParam(value = "pageNumber",defaultValue = "1",required = false) Integer pageNumber,
   			@RequestParam(value = "pageSize",defaultValue = "5",required = false) Integer pageSize){
   		return service.getAllCategoryt(pageNumber,pageSize);
   	}
    

    @PutMapping("/categories/findById/{id}")
    public Category updateById(@PathVariable int id,@RequestBody Category category){
        return service.updateById(id, category);
    }

    @DeleteMapping("/categories/delete/{id}")
    public void deleteById(@PathVariable int id){
        service.deleteById(id);
    }


}
