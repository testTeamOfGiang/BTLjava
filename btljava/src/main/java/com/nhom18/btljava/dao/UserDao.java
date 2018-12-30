package com.nhom18.btljava.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nhom18.btljava.model.User;

@Repository(value = "userDao")
public interface UserDao extends JpaRepository<User, Integer> {

}
