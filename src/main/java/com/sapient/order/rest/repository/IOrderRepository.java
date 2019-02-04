package com.sapient.order.rest.repository;

import com.sapient.order.rest.dto.Orders;

public interface IOrderRepository {

	void save(Orders order);

}