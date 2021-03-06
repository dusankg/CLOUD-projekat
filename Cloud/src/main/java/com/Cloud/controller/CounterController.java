package com.Cloud.controller;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Cloud.model.Counter;
import com.Cloud.repo.CounterRepo;

@RestController
@RequestMapping(value = "/counter")
public class CounterController {
	@Autowired
	CounterRepo repo;
	
	
	@GetMapping()
	public String getTestData() {
		List<Counter> counters = (List<Counter>) repo.findAll();
		
		Counter c;
		if (counters.size() == 0) {
			c = new Counter();
			c.setId(1L);
			c.setBrojac(0);
		} else {
			c = counters.get(0);
		}
		
		Integer number = c.getBrojac();
		number=number+1;
		c.setBrojac(number);
		repo.save(c);
		
        Map<String, String> env = System.getenv();
        
        System.out.println(env.get("HOST"));
			
	    return new String("Brojac: " + number.toString() + "</br>Host: " + env.get("HOST"));
	}	
}
