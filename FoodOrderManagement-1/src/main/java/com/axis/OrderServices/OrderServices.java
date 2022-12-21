package com.axis.OrderServices;

import java.util.List;

import com.axis.Modal.Order;

public interface OrderServices {

	public Order addOrder(Order order);
	public Order updateOrderById(long orderId,Order order);
	public String DeleteOrderById(long orderId);
	List<Order> getAll();

	

}
