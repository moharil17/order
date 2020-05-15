package com.order.it.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.order.it.entity.comppk.CartPK;

@Entity
@Table(name="cart")
public class Cart {
	
	@EmbeddedId
	private CartPK id;
	
	private int qty;
	private double amount;
	
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public CartPK getId() {
		return id;
	}
	public void setId(CartPK id) {
		this.id = id;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	
}
