package com.parimal;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController
{
	@GetMapping("/hello/{id}")
	public ResponseEntity<String> sayHello(@PathVariable("id") Integer id) throws InvalidIdException
	{
		if (id > 10)
		{
			// int result = id / 0;

			return new ResponseEntity<String>("Welcome SpringBoot", HttpStatus.ACCEPTED);
		}
		else
		{
			throw new InvalidIdException("Invalid Id values");
		}

		// return new ResponseEntity<String>("", HttpStatus.BAD_REQUEST);

	}

}
