package com.parimal.service;

import com.parimal.exception.CustomerException;
import com.parimal.model.Customer;

public interface CustomerServiceDao
{

	public Customer createCustomer(Customer customer) throws CustomerException;

	public Customer updateCustomer(Customer customer, String key) throws CustomerException;

}
