package com.nhom18.btljava.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the cart database table.
 * 
 */
@Entity
@Table(name = "cart")
@NamedQuery(name = "Cart.findAll", query = "SELECT c FROM Cart c")
public class Cart implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CartPK id;

	@Column
	private int amount;

	@ManyToOne
	@MapsId("userId")
	@JoinColumn(name = "user_id")
	private User user;
	@ManyToOne
	@MapsId("productId")
	@JoinColumn(name = "product_id")
	private Product product;

	public Cart() {
	}

	public CartPK getId() {
		return id;
	}

	public void setId(CartPK id) {
		this.id = id;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

}