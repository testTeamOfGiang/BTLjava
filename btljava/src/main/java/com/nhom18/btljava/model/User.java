package com.nhom18.btljava.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

/**
 * The persistent class for the user database table.
 * 
 */
@Entity
@NamedQuery(name = "User.findAll", query = "SELECT u FROM User u")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;
	@Column
	private String userFirstName;
	@Column
	private String userLastName;
	@Column
	private String userEmail;
	@Column
	private String userPhone;
	@Column
	private String userPassword;
	@Column
	private String userAddress;
	@Column
	private String userToken;
	@OneToMany(mappedBy = "user")
	private List<Cart> carts;

}