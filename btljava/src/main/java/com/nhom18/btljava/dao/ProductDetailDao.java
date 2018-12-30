package com.nhom18.btljava.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nhom18.btljava.model.ProductDetail;
import com.nhom18.btljava.model.ProductDetailPK;

@Repository(value = "productDetailDao")
public interface ProductDetailDao extends JpaRepository<ProductDetail, ProductDetailPK> {

}
