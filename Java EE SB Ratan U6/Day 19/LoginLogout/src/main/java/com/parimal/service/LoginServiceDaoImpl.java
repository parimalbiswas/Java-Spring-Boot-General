package com.parimal.service;

import java.time.LocalDateTime;
import java.util.Optional;

import javax.security.auth.login.LoginException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.parimal.model.CurrentUserSession;
import com.parimal.model.Customer;
import com.parimal.model.LoginDTO;
import com.parimal.repository.CurrentUserSessionRepositoryDAO;
import com.parimal.repository.CustomerRepositoryDAO;

import net.bytebuddy.utility.RandomString;

@Service
public class LoginServiceDaoImpl implements LoginServiceDao
{
	@Autowired
	private CustomerRepositoryDAO cRepo;
	@Autowired
	private CurrentUserSessionRepositoryDAO cuSession;

	@Override
	public String logIntoAccount(LoginDTO dto) throws LoginException
	{
		Customer existCustomer = cRepo.findByMobileNo(dto.getMobileNo());

		if (existCustomer == null)
		{
			throw new LoginException("Please a valid mobile Number");
		}

		Optional<CurrentUserSession> validCurstomerSessionOpt = cuSession.findById(existCustomer.getCustomerId());

		if (validCurstomerSessionOpt.isPresent())
		{
			throw new LoginException("User Already Login with mobile Number");
		}

		if (existCustomer.getPassword().equals(dto.getPassword()))
		{
			String key = RandomString.make(6);

			CurrentUserSession currentUserSession = new CurrentUserSession(existCustomer.getCustomerId(), key,
					LocalDateTime.now());

			cuSession.save(currentUserSession);

			return currentUserSession.toString();
		}

		else
		{
			throw new LoginException("Please Enter Valid Password");
		}
	}

	@Override
	public String logOutFromAccount(String key) throws LoginException
	{
		// TODO Auto-generated method stub
		return null;
	}

}
