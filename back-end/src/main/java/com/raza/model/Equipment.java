package com.raza.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Equipment extends BaseEntity<Long>  {
	
	private static final long serialVersionUID = 6025566720560241474L;
	
	@Column
	private String licensePlate;
	private String model;
	private String name;
	private String color;
	
}
