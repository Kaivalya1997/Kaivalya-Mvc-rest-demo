package com.sapient.order.rest.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sapient.order.rest.dto.Orders;

@Component
public class OrderRepositoryImpl implements IOrderRepository {
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public void save(Orders order) {
		Session session = sessionFactory.getCurrentSession();
		Transaction transaction = session.beginTransaction();

			session.save(order);
			transaction.commit();
			
	}
}
