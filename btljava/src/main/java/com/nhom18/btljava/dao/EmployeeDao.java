package com.nhom18.btljava.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.nhom18.btljava.model.Employee;

@Repository(value = "employeeDao")
public interface EmployeeDao extends JpaRepository<Employee, Integer> {

	@Query("select e from Employee e where e.employeeEmail =:email")
	public Employee getEmployeeByEmail(@Param("email") String email);
}
