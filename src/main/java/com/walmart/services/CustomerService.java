package com.walmart.services;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.walmart.dtos.CustomerDto;
import com.walmart.entities.CustomerEntity;
import com.walmart.entities.CustomerLoginEntity;
import com.walmart.repositories.CustomerLoginRepository;
import com.walmart.repositories.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private CustomerLoginRepository customerLoginRepository;

	public void createCustomer(CustomerDto customerDto) {
		CustomerEntity customerEntity = new CustomerEntity();
		customerEntity.setName(customerDto.getName());
		customerEntity.setPhone(customerDto.getPhone());
		customerEntity.setAddress(customerDto.getAddress());
		customerEntity.setCreatedAt(new Date());
		
		CustomerLoginEntity loginEntity = new CustomerLoginEntity();
		loginEntity.setUsername(customerDto.getUsername());
		loginEntity.setPassword(customerDto.getPassword());
		loginEntity.setCustomer(customerEntity);
		
		customerLoginRepository.save(loginEntity);
	}

	public CustomerDto getCustomerById(Long id) {
		CustomerDto customer = new CustomerDto();
		customer.setName("Ram");
		customer.setPhone("5404673921");
		customer.setAddress("Virginia");

		return customer;
	}

	public CustomerRepository getCustomerRepository() {
		return customerRepository;
	}

	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	/*
	 * public CustomerLoginRepository getCustomerLoginRepository() { return
	 * customerLoginRepository; }
	 * 
	 * public void setCustomerLoginRepository(CustomerLoginRepository
	 * customerLoginRepository) { this.customerLoginRepository =
	 * customerLoginRepository; }
	 */
	
	

}
