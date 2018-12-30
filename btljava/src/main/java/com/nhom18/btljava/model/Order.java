package com.nhom18.btljava.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * The persistent class for the orders database table.
 * 
 */
@Entity
@Table(name = "orders")
@NamedQuery(name = "Order.findAll", query = "SELECT o FROM Order o")
public class Order implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "order_id")
	private int orderId;

	private String address;

	private boolean confirm;

	@Column(name = "order_check")
	private boolean orderCheck;

	@OneToMany(mappedBy = "order")
	private List<ProductDetail> productDetails;

	private String phone;

	@Temporal(TemporalType.DATE)
	private Date time;

	public Order() {
	}

	public int getOrderId() {
		return this.orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public boolean getConfirm() {
		return this.confirm;
	}

	public void setConfirm(boolean confirm) {
		this.confirm = confirm;
	}

	public boolean getOrderCheck() {
		return this.orderCheck;
	}

	public void setOrderCheck(boolean orderCheck) {
		this.orderCheck = orderCheck;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Date getTime() {
		return this.time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public List<ProductDetail> getProductDetails() {
		return productDetails;
	}

	public void setProductDetails(List<ProductDetail> productDetails) {
		this.productDetails = productDetails;
	}

}