package com.dea.mealsonwheels.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="donor")
public class Donor {
	
	@Id
	private String demail;
	private String dfname;
	private String dlname;
	private String dphone;
	private double amount;
	private String how;
	
	
	public Donor() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Donor(String demail, String dfname, String dlname, String dphone, double amount, String how) {
		super();
		this.demail = demail;
		this.dfname = dfname;
		this.dlname = dlname;
		this.dphone = dphone;
		this.amount = amount;
		this.how = how;
	}


	public String getDemail() {
		return demail;
	}


	public void setDemail(String demail) {
		this.demail = demail;
	}


	public String getDfname() {
		return dfname;
	}


	public void setDfname(String dfname) {
		this.dfname = dfname;
	}


	public String getDlname() {
		return dlname;
	}


	public void setDlname(String dlname) {
		this.dlname = dlname;
	}


	public String getDphone() {
		return dphone;
	}


	public void setDphone(String dphone) {
		this.dphone = dphone;
	}


	public double getAmount() {
		return amount;
	}


	public void setAmount(double amount) {
		this.amount = amount;
	}


	public String getHow() {
		return how;
	}


	public void setHow(String how) {
		this.how = how;
	}


	@Override
	public String toString() {
		return "Donor [demail=" + demail + ", dfname=" + dfname + ", dlname=" + dlname + ", dphone=" + dphone
				+ ", amount=" + amount + ", how=" + how + "]";
	}
	
	

}
