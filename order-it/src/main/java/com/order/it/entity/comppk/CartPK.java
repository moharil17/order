package com.order.it.entity.comppk;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class CartPK implements Serializable {

	@Column(name="mob_no")
	@Basic
	private String mobileNo;
	
	@Column(name="prod_id")
	@Basic
	private int prodID;
	
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public int getProdID() {
		return prodID;
	}
	public void setProdID(int prodID) {
		this.prodID = prodID;
	}
	
	
}
