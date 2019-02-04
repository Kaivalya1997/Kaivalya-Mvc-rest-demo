package com.sapient.order.rest.services;

import com.sapient.order.rest.dto.Orders;

public interface IOrderService {
	int processOrder(Orders order);
}
