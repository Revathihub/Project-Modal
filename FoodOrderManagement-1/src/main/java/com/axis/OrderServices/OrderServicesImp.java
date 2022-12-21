package com.axis.OrderServices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.axis.Exception.UserException;
import com.axis.Modal.Order;
import com.axis.OrderRepository.OrderRepository;
import com.axis.Utility.AppConstants;

@Service
public class OrderServicesImp implements OrderServices{
	
	@Autowired
	OrderRepository orderRepository;
	
	@Override
	public List<Order> getAll() {
		// TODO Auto-generated method stub
		return orderRepository.findAll();
	}

	@Override
	public Order addOrder(Order order) {
		// TODO Auto-generated method stub
		return this.orderRepository.save(order);
	}

	@Override
	public Order updateOrderById(long orderId,Order order) {
		// TODO Auto-generated method stub
		Order order1=orderRepository.findById(orderId).orElseThrow(()->new UserException(AppConstants.ID_NOT_FOUND));
		order1.setOrderId(order.getOrderId());
		order1.setItemName(order.getItemName());
		order1.setQuantity(order.getQuantity());
		order1.setPrice(order.getPrice());
		return this.orderRepository.save(order1);
	}

	@Override
	public String DeleteOrderById(long orderId) {
		// TODO Auto-generated method stub
		Order order1=orderRepository.findById(orderId).orElseThrow(()->new UserException(AppConstants.ID_NOT_FOUND));
		orderRepository.delete(order1);
		return AppConstants.DELETE_MESSAGE;
	}

	
}
