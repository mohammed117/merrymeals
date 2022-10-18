package com.dea.mealsonwheels.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="membermeal")
public class MemberMeal {
	
	@Id
	private String email;
	private String monmeal;
	private String tuemeal;
	private String wedmeal;
	private String thurmeal;
	private String frimeal;
	public MemberMeal() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MemberMeal(String email, String monmeal, String tuemeal, String wedmeal, String thurmeal, String frimeal) {
		super();
		this.email = email;
		this.monmeal = monmeal;
		this.tuemeal = tuemeal;
		this.wedmeal = wedmeal;
		this.thurmeal = thurmeal;
		this.frimeal = frimeal;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMonmeal() {
		return monmeal;
	}
	public void setMonmeal(String monmeal) {
		this.monmeal = monmeal;
	}
	public String getTuemeal() {
		return tuemeal;
	}
	public void setTuemeal(String tuemeal) {
		this.tuemeal = tuemeal;
	}
	public String getWedmeal() {
		return wedmeal;
	}
	public void setWedmeal(String wedmeal) {
		this.wedmeal = wedmeal;
	}
	public String getThurmeal() {
		return thurmeal;
	}
	public void setThurmeal(String thurmeal) {
		this.thurmeal = thurmeal;
	}
	public String getFrimeal() {
		return frimeal;
	}
	public void setFrimeal(String frimeal) {
		this.frimeal = frimeal;
	}
	@Override
	public String toString() {
		return "MemberMeal [email=" + email + ", monmeal=" + monmeal + ", tuemeal=" + tuemeal + ", wedmeal=" + wedmeal
				+ ", thurmeal=" + thurmeal + ", frimeal=" + frimeal + "]";
	}
	
	
	
}
