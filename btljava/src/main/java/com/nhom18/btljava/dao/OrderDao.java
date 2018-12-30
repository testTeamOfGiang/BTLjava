package com.nhom18.btljava.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nhom18.btljava.model.Order;

@Repository(value = "orderDao")
public interface OrderDao extends JpaRepository<Order, Integer> {

}
