package com.parimal.service;

import javax.security.auth.login.LoginException;

import com.parimal.model.LoginDTO;

public interface LoginServiceDao
{

	public String logIntoAccount(LoginDTO dto) throws LoginException;

	public String logOutFromAccount(String key) throws LoginException;

}
