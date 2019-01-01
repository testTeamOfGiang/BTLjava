package com.nhom18.btljava.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * The persistent class for the color database table.
 * 
 */
@Entity
@Table(name = "color")
@NamedQuery(name = "Color.findAll", query = "SELECT c FROM Color c")
public class Color implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "color_id")
	private int colorId;

	@Column(name = "color_code")
	private String colorCode;

	@ManyToMany
	@JoinTable(name = "product_color", joinColumns = @JoinColumn(name = "product_id"), inverseJoinColumns = @JoinColumn(name = "color_id"))
	private List<Product> products;

	public Color() {
	}

	public int getColorId() {
		return this.colorId;
	}

	public void setColorId(int colorId) {
		this.colorId = colorId;
	}

	public String getColorCode() {
		return this.colorCode;
	}

	public void setColorCode(String colorCode) {
		this.colorCode = colorCode;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

}