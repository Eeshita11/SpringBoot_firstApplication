package com.example;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Todaysdate 
{
	@GetMapping("/date")
	public LocalDate displayDate()
	{
		LocalDate d=LocalDate.now();
		
		return d;
		
	}

}
