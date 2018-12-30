package com.nhom18.btljava.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the import database table.
 * 
 */
@Entity
@NamedQuery(name = "Import.findAll", query = "SELECT i FROM Import i")
public class Import implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ImportPK id;

	private int amount;

	public Import() {
	}

	@ManyToOne
	@MapsId("productId")
	@JoinColumn(name = "product_id")
	private Product product;

	@ManyToOne
	@MapsId("employeeId")
	@JoinColumn(name = "employee_id")
	private Employee employee;

	public ImportPK getId() {
		return this.id;
	}

	public void setId(ImportPK id) {
		this.id = id;
	}

	public int getAmount() {
		return this.amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

}