package com.parimal;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController
{
	@GetMapping("/hello/{id}")
	public ResponseEntity<String> sayHello(@PathVariable("id") Integer id) throws IllegalArgumentException
	{
		if (id > 10)
		{
			return new ResponseEntity<String>("Welcome SpringBoot", HttpStatus.ACCEPTED);
		}
		else
		{
			throw new IllegalArgumentException("Invalid Id values");
		}

		// return new ResponseEntity<String>("", HttpStatus.BAD_REQUEST);

	}

	@ExceptionHandler(IllegalArgumentException.class)
	public ResponseEntity<String> myExceptionHandeler(IllegalArgumentException ie)
	{
		return new ResponseEntity<String>(ie.getMessage(), HttpStatus.BAD_REQUEST);
	}

}
