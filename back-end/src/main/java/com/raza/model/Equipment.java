package com.raza.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Equipment extends BaseEntity<Long>  {
	
	private static final long serialVersionUID = -8506028513793354501L;
	
	@Column
	@Size(min = 2, max = 8)
	private String plate;
	
	@Column
	@Size(min = 2, max = 15)
	private String model;
	
	@Column
	@NotNull
	@Size(min = 1, max = 25)
	private String name;
	
	@Column
	@Size(min = 2, max = 15)
	private String color;
	
	/** Getters and Setters **/
	
	public String getPlate() {
		return plate;
	}
	public void setPlate(String plate) {
		this.plate = plate;
	}
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
	
}
