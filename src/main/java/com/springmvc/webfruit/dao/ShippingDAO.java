package com.springmvc.webfruit.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.springmvc.webfruit.entity.Shipping;

@Repository
@Transactional
public class ShippingDAO {
	@Autowired 
	private SessionFactory sessionFactory;

	public void save(Shipping shipping) {
		 Session session = this.sessionFactory.getCurrentSession();
		    session.save(shipping);
	}
}
