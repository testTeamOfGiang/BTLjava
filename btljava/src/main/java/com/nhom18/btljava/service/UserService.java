package com.nhom18.btljava.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nhom18.btljava.dao.EmployeeDao;
import com.nhom18.btljava.dao.UserDao;
import com.nhom18.btljava.model.Employee;
import com.nhom18.btljava.model.User;

@Service(value = "userService")
public class UserService {

	@Autowired
	UserDao userDao;
	@Autowired
	EmployeeDao employeeDao;

	public boolean addUser(User user) {
		try {
			userDao.save(user);
			return true;
		} catch (Exception e) {
			System.out.println("gap loi luc them user: " + e.getMessage());
			return false;
		}
	}

	public Object findUser(String email, String password) {
		User user = userDao.getUserByEmail(email);
		if (user != null) {
			System.out.println("la user");
			if (user.getUserPassword().equals(password)) {
				return user;
			} else {
				return null;
			}
		} else {
			Employee employee = employeeDao.getEmployeeByEmail(email);
			if (employee != null) {
				System.out.println("la employee");
				if (employee.getEmployeePassword().equals(password)) {
					return employee;
				} else {
					return null;
				}
			}
		}
		return null;
	}
}