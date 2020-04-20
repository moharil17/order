package com.order.it.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="users")
@Entity
public class User {

	@Id
	@Column(name="mobile_no")
	private String mobileNo;
	
	@Column(name="first_name")
	private String firststName;
	
	@Column(name="last_name")
	private String lastName;
	
	private String address;
	
	private String roles;
	
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getFirststName() {
		return firststName;
	}
	public void setFirststName(String firststName) {
		this.firststName = firststName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getRoles() {
		return roles;
	}
	public void setRoles(String roles) {
		this.roles = roles;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
