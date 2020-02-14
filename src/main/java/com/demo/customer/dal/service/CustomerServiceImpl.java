package com.demo.customer.dal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.customer.dal.entities.Customer;
import com.demo.customer.dal.repos.CustomerRepo;

@Service
public class CustomerServiceImpl implements CustomerService{
	@Autowired
	CustomerRepo customerRepo;

	@Override
	public List<Customer> getAllCustomer() {
		
		return customerRepo.findAll();
	}
}
