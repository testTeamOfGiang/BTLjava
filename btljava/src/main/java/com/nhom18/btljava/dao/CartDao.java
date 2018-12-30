package com.nhom18.btljava.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nhom18.btljava.model.Cart;
import com.nhom18.btljava.model.CartPK;

@Repository(value = "cartDao")
public interface CartDao extends JpaRepository<Cart, CartPK> {

}
