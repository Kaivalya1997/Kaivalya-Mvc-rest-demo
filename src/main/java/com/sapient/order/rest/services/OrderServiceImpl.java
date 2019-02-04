package com.sapient.order.rest.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sapient.order.rest.dto.Orders;
import com.sapient.order.rest.repository.IOrderRepository;

//@Component
@Service
public class OrderServiceImpl implements IOrderService{
	@Autowired
	private IOrderRepository orderRepositoryImpl;
	public OrderServiceImpl() {
		System.out.println("OrderServiceImpl bean created");
	}
	/**
	 * 
	 * @param order
	 * @return order id
	 */
	public int processOrder(Orders order) {
		System.out.println("bean");
		orderRepositoryImpl.save(order);
		return order.getId();
	}

	public IOrderRepository getOrderRepositoryImpl() {
		return orderRepositoryImpl;
	}
}
