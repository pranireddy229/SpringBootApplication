package com.demo.customer.dal.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.customer.dal.entities.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Long> {

}
