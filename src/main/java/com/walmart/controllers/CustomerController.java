package com.walmart.controllers;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.walmart.dtos.CustomerDto;
import com.walmart.services.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@RequestMapping(value = "", method = RequestMethod.POST)
	public void createCustomer(@RequestBody CustomerDto customerDto) {
		customerService.createCustomer(customerDto);
		System.out.println("Hey There!");
	}

	@RequestMapping(value = "", method = RequestMethod.GET)
	public CustomerDto getCustomerById(@RequestParam(value = "id", required = true) Long customerId,
			@RequestParam(value = "name", required = false) String name) {
		System.out.println("id : " + customerId + " , name : " + name);
		return customerService.getCustomerById(customerId);
	}

	/*
	 * // http://localhost:8080//customer/20/detail
	 * 
	 * @RequestMapping(value ="/{id}/detail", method = RequestMethod.GET) public
	 * CustomerDto getCustomerFromId(@PathVariable(value="id") Long customerId,
	 * 
	 * @RequestHeader(value="auth-token") String authToken) {
	 * System.out.println("auth token : " + authToken); return
	 * customerService.getCustomerById(customerId); }
	 * 
	 * @RequestMapping(value ="/{id}/test", method = RequestMethod.GET) public
	 * CustomerDto test(@PathVariable(value="id") Long customerId) {
	 * System.out.println("customerId : " + customerId); return
	 * customerService.getCustomerById(customerId); }
	 */

}
