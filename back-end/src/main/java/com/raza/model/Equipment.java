package com.raza.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Equipment extends BaseEntity<Long>  {
	
	private static final long serialVersionUID = -8506028513793354501L;
	
	@Column							
	private String plate;
	@Column
	private String model;
	@Column
	private String name;
	@Column
	private String color;
	
	/** Getters and Setters **/
	
	public String getPlate() {
		return plate;
	}
	public void setPlate(String Plate) {
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
