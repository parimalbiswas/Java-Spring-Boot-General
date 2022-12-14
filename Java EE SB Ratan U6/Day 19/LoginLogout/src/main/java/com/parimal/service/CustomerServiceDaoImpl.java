package com.parimal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.parimal.exception.CustomerException;
import com.parimal.model.CurrentUserSession;
import com.parimal.model.Customer;
import com.parimal.repository.CurrentUserSessionRepositoryDAO;
import com.parimal.repository.CustomerRepositoryDAO;

@Service
public class CustomerServiceDaoImpl implements CustomerServiceDao
{
	@Autowired
	private CustomerRepositoryDAO cRepo;
	@Autowired
	private CurrentUserSessionRepositoryDAO cuSession;

	@Override
	public Customer createCustomer(Customer customer) throws CustomerException
	{
		Customer existCustomer = cRepo.findByMobileNo(customer.getMobileNo());

		if (existCustomer != null)
		{
			throw new CustomerException("Customer Already exists");
		}

		return cRepo.save(customer);
	}

	@Override
	public Customer updateCustomer(Customer customer, String key) throws CustomerException
	{
		CurrentUserSession logedInUser = cuSession.findByUuid(key);

		if (logedInUser == null)
		{
			throw new CustomerException("Please provide a valid key to update customer");
		}

		if (logedInUser.getUserId() == customer.getCustomerId())
		{
			return cRepo.save(customer);
		}
		else
		{
			throw new CustomerException("Invalid Customer Details. Login First");
		}

	}

}
