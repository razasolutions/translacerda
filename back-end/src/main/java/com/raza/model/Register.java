package com.raza.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Register extends BaseEntity<Long> {

	private static final long serialVersionUID = -4954050064079269409L;

	@Column
	@NotNull
	@Min(-999999)
	@Max(999999)
	@Size(min = 1, max = 10)
	double value;
	
	@Column
	@Size(min = 0, max = 300)
	String description;
	
	@Column
	@NotNull
	@Size(min = 1, max = 10)
	String type;
	
	@Column
	@NotNull
	Date date;
	
	@NotNull
	@ManyToOne
	User user;
	
	@NotNull
	@ManyToOne
	Equipment equipment;
	
	/** Getters and Setters **/
	
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
