package com.order.it.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.order.it.entity.comppk.CartPK;

@Entity
@Table(name= "live_orders")
public class LiveOrder {

	@EmbeddedId
	private CartPK id;
	private int qty;
	/*@Column(name="unit_id")
	private String unit;*/
	private double amount;
	private String status;
	@Column(name = "order_placed_on", columnDefinition = "TIMESTAMP")
	private String orderPlacedOn;
	
	public CartPK getId() {
		return id;
	}
	public void setId(CartPK id) {
		this.id = id;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	/*public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}*/
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getOrderPlacedOn() {
		return orderPlacedOn;
	}
	public void setOrderPlacedOn(String orderPlacedOn) {
		this.orderPlacedOn = orderPlacedOn;
	}
	
	
	
	
}
