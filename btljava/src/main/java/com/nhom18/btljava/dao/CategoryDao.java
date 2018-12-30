package com.nhom18.btljava.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nhom18.btljava.model.Category;

@Repository(value = "categoryDao")
public interface CategoryDao extends JpaRepository<Category, Integer> {

}
