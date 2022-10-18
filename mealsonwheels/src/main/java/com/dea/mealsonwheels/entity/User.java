package com.dea.mealsonwheels.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {
	
	@Id
	private String email;
	private String name;
	private String phone;
	private String address;
	private String partm;
	private String password;
	private String serviceduration;
	private String relation;
	private String vehiclenum;
	private String role;
	private String ppartm;
	private String paddress;
	private String memail;
	private String mname;
	private String mphone;
	private String mpassword;
	
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}


	

	public User( String email, String name, String phone, String address, String partm, String password,
			String serviceduration, String relation, String vehiclenum, String role, String ppartm, String paddress,
			String memail, String mname, String mphone, String mpassword) {
		super();
		
		this.email = email;
		this.name = name;
		this.phone = phone;
		this.address = address;
		this.partm = partm;
		this.password = password;
		this.serviceduration = serviceduration;
		this.relation = relation;
		this.vehiclenum = vehiclenum;
		this.role = role;
		this.ppartm = ppartm;
		this.paddress = paddress;
		this.memail = memail;
		this.mname = mname;
		this.mphone = mphone;
		this.mpassword = mpassword;
	}







	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getPhone() {
		return phone;
	}



	public void setPhone(String phone) {
		this.phone = phone;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public String getPartm() {
		return partm;
	}



	public void setPartm(String partm) {
		this.partm = partm;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getServiceduration() {
		return serviceduration;
	}



	public void setServiceduration(String serviceduration) {
		this.serviceduration = serviceduration;
	}



	public String getRelation() {
		return relation;
	}



	public void setRelation(String relation) {
		this.relation = relation;
	}



	public String getVehiclenum() {
		return vehiclenum;
	}



	public void setVehiclenum(String vehiclenum) {
		this.vehiclenum = vehiclenum;
	}



	public String getRole() {
		return role;
	}



	public void setRole(String role) {
		this.role = role;
	}



	public String getPpartm() {
		return ppartm;
	}



	public void setPpartm(String ppartm) {
		this.ppartm = ppartm;
	}



	public String getPaddress() {
		return paddress;
	}



	public void setPaddress(String paddress) {
		this.paddress = paddress;
	}



	public String getMemail() {
		return memail;
	}



	public void setMemail(String memail) {
		this.memail = memail;
	}



	public String getMname() {
		return mname;
	}



	public void setMname(String mname) {
		this.mname = mname;
	}



	public String getMphone() {
		return mphone;
	}



	public void setMphone(String mphone) {
		this.mphone = mphone;
	}



	public String getMpassword() {
		return mpassword;
	}



	public void setMpassword(String mpassword) {
		this.mpassword = mpassword;
	}



	@Override
	public String toString() {
		return "User [ email=" + email + ", name=" + name + ", phone=" + phone + ", address=" + address
				+ ", partm=" + partm + ", password=" + password + ", serviceduration=" + serviceduration + ", relation="
				+ relation + ", vehiclenum=" + vehiclenum + ", role=" + role + ", ppartm=" + ppartm + ", paddress="
				+ paddress + ", memail=" + memail + ", mname=" + mname + ", mphone=" + mphone + ", mpassword="
				+ mpassword + "]";
	}

	


	
}

