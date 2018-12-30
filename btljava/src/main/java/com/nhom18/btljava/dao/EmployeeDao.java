package com.nhom18.btljava.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nhom18.btljava.model.Employee;

@Repository(value = "employeeDao")
public interface EmployeeDao extends JpaRepository<Employee, Integer> {

}
