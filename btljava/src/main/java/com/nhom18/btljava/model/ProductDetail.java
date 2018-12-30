package com.nhom18.btljava.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the product_detail database table.
 * 
 */
@Entity
@Table(name = "product_detail")
@NamedQuery(name = "ProductDetail.findAll", query = "SELECT p FROM ProductDetail p")
public class ProductDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ProductDetailPK id;

	@Column
	private int amount;

	@ManyToOne
	@MapsId("orderId")
	@JoinColumn(name = "order_id")
	private Order order;

	@ManyToOne
	@MapsId("productId")
	@JoinColumn(name = "product_id")
	private Product product;

	public ProductDetail() {
	}

	public ProductDetailPK getId() {
		return this.id;
	}

	public void setId(ProductDetailPK id) {
		this.id = id;
	}

	public int getAmount() {
		return this.amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

}