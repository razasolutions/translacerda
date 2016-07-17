package com.raza.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class User extends BaseEntity<Long> {

	private static final long serialVersionUID = 6025566720560241474L;

	@Column
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
