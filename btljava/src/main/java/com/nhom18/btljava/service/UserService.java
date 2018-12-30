package com.nhom18.btljava.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nhom18.btljava.dao.UserDao;
import com.nhom18.btljava.model.User;

@Service(value = "userService")
public class UserService {

	@Autowired
	UserDao userDao;

	//@Transactional(propagation = Propagation.NOT_SUPPORTED)
	public boolean addUser(User user) {
		try {
			userDao.save(user);
			return true;
		} catch (Exception e) {
			System.out.println("gap loi luc them user: " + e.getMessage());
			return false;
		}
	}
}
