package com.nhom18.btljava.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nhom18.btljava.model.Product;

@Repository(value = "productDao")
public interface ProductDao extends JpaRepository<Product, Integer> {

}
