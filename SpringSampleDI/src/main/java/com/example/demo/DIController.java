package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller class using the DI container
 */
@RestController
// Scanning for components from the DI container
@ComponentScan
public class DIController {

	// Instantiation using a DI container
	@Autowired
	DIHello diHello;

	/**
	 * Functions using DI container objects
	 * @return "Hello×3 DI World" string
	 */
	@RequestMapping("/hello2")
    public String Hello2() {

		return diHello.HelloWorld(3);
    }
}
