package com.axis.Modal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="`Order`")
public class Order{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long orderId;
	
	@Column(name="ItemName")
	private String itemName;
	
	@Column(name="Quantity")
	private String quantity;
	
	@Column(name="Price")
	private double price;
	

	public Order(long orderId,String itemName,String quantity,double price){
		super();
		orderId=orderId;
		this.itemName=itemName;
		this.quantity=quantity;
		this.price=price;
	}
	public long getOrderId() {
		return orderId;
	}
	public void setOrderId(long orderId) {
		orderId=orderId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName=itemName;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity=quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price=price;
	}
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
}

