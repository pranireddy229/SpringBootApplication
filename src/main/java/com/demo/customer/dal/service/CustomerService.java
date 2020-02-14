package com.demo.customer.dal.service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.demo.customer.dal.entities.Customer;

@Service
public interface CustomerService {
	public List<Customer>getAllCustomer();

}
