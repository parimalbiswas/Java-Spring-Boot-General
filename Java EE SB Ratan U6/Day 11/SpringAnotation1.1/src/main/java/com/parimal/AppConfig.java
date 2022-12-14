package com.parimal;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.parimal")
public class AppConfig
{

	@Bean
	public List<String> getCities()
	{
		List<String> list = new ArrayList<>();
		list.add("KOL");
		list.add("BLR");
		list.add("MUM");

		return list;

	}

	@Bean
	public List<String> getNames()
	{
		List<String> list1 = new ArrayList<>();
		list1.add("Ravi");
		list1.add("Kovela");
		list1.add("Sundari");

		return list1;

	}
}
