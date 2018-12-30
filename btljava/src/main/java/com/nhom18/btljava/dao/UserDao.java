package com.nhom18.btljava.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.nhom18.btljava.model.User;

@Repository(value = "userDao")
public interface UserDao extends JpaRepository<User, Integer> {

	@Query("select u from User u where u.userEmail =:email")
	public User getUserByEmail(@Param("email") String email);
}
