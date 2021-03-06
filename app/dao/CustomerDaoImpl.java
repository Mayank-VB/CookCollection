package com.app.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.app.pojos.CustomerPojo;

@Repository
@Transactional
public class CustomerDaoImpl implements ICustomerDao{

	@Autowired
	private SessionFactory sf;

	@Override
	public List<CustomerPojo> getCustomers() {
		String jpql="select c from CustomerPojo c";
		return sf.getCurrentSession().createQuery(jpql, CustomerPojo.class)
				.getResultList();
	}
}
