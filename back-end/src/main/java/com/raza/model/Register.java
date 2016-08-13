package com.raza.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Register extends BaseEntity<Long> {

	private static final long serialVersionUID = -4954050064079269409L;

	@Column
	double value;
	@Column
	String description;
	@Column
	String type;
	@Column
	Date date;
	@Column
	User user;
	@Column
	Equipment equipment;
	
	/* Getters and Setters */
	
	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	public Equipment getEquipment() {
		return equipment;
	}
	public void setEquipment(Equipment equipment) {
		this.equipment = equipment;
	}
	
}
