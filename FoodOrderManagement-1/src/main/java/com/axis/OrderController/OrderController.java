package com.axis.OrderController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.axis.OrderServices.OrderServices;
import com.axis.Modal.Order;

@RestController 
@RequestMapping("/order/v1")
public class OrderController {
	
	@Autowired	
	OrderServices orderServices;
	
	@GetMapping
	public ResponseEntity<List<Order>> getAll() {
		List<Order> order1=orderServices.getAll();
		return new ResponseEntity<List<Order>>(order1,HttpStatus.OK);
	}
	
	@PostMapping("/add")
	public ResponseEntity<Order> addOrder(@RequestBody Order order) {
		Order order1=orderServices.addOrder(order);
		return new ResponseEntity<Order>(order1,HttpStatus.OK);
	}
	
	@PutMapping("/update/{orderId}")
	public ResponseEntity<Order> updateOrderById(@PathVariable (value="orderId") long orderId,@RequestBody Order order) {
		Order order1=orderServices.updateOrderById(orderId,order);		
		return new ResponseEntity<Order>(order1,HttpStatus.OK);
		
	}
	@DeleteMapping("/delete/{orderId}")
	public String DeleteOrderById( @PathVariable (value="orderId") long orderId) {
		//String message=orderServices.DeleteOrderById(orderId);
		return orderServices.DeleteOrderById(orderId);
		//return ResponseEntity<String>(message,HttpStatus.OK);
		//return new ResponseEntity<String>(message,HttpStatus.OK);
	}
	
	
}
