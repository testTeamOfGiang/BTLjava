package com.nhom18.btljava.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the import database table.
 * 
 */
@Embeddable
public class ImportPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="employee_id")
	private int employeeId;

	@Column(name="product_id")
	private int productId;

	public ImportPK() {
	}
	public int getEmployeeId() {
		return this.employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public int getProductId() {
		return this.productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ImportPK)) {
			return false;
		}
		ImportPK castOther = (ImportPK)other;
		return 
			(this.employeeId == castOther.employeeId)
			&& (this.productId == castOther.productId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.employeeId;
		hash = hash * prime + this.productId;
		
		return hash;
	}
}