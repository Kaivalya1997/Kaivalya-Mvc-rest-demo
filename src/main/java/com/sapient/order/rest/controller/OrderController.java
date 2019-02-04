package com.sapient.order.rest.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sapient.order.rest.dto.Orders;
import com.sapient.order.rest.repository.IOrderRepository;
import com.sapient.order.rest.services.IOrderService;

@RestController("/order")
public class OrderController {
	private static final Logger logger = LoggerFactory.getLogger(OrderController.class);
	@Autowired
	private IOrderService orderService;
//	@RequestMapping(method=RequestMethod.POST)
	@PostMapping
	public void createOrder(@RequestBody Orders order) {
		logger.info("creating order...{}", order);
		orderService.processOrder(order);
	}
}
