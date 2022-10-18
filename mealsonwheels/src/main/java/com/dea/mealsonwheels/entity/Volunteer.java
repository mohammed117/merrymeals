package com.dea.mealsonwheels.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="volunteer")
public class Volunteer {
	
	@Id
	private String vemail;
	private String vfname;
	private String vlname;
	private String vphone;
	private String campname;
	
	
	
	public Volunteer() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Volunteer(String vemail, String vfname, String vlname, String vphone, String campname) {
		super();
		this.vemail = vemail;
		this.vfname = vfname;
		this.vlname = vlname;
		this.vphone = vphone;
		this.campname = campname;
		
	}


	public String getVemail() {
		return vemail;
	}


	public void setVemail(String vemail) {
		this.vemail = vemail;
	}


	public String getVfname() {
		return vfname;
	}


	public void setVfname(String vfname) {
		this.vfname = vfname;
	}


	public String getVlname() {
		return vlname;
	}


	public void setVlname(String vlname) {
		this.vlname = vlname;
	}


	public String getVphone() {
		return vphone;
	}


	public void setVphone(String vphone) {
		this.vphone = vphone;
	}


	public String getCampname() {
		return campname;
	}


	public void setCampname(String campname) {
		this.campname = campname;
	}




	@Override
	public String toString() {
		return "Volunteer [vemail=" + vemail + ", vfname=" + vfname + ", vlname=" + vlname + ", vphone=" + vphone
				+ ", campname=" + campname + "]";
	}


	
}
