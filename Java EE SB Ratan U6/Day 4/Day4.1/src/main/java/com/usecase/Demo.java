package com.usecase;

import javax.persistence.EntityManager;

import com.util.EMUtil;

public class Demo
{

	public static void main(String[] args)
	{
		EntityManager em1 = EMUtil.proviEntityManager();
	}
}
