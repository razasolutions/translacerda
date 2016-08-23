package com.raza.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class User extends BaseEntity<Long> {

	private static final long serialVersionUID = 6025566720560241474L;

	@Column
	@NotNull
	@Size(min = 2, max = 30)
	private String name;

	/** Getters and Setters **/
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
