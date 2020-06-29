package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Normal controller class
 */
@RestController
public class NormalController {

	// Instantiate by new
	NormalHello nHello = new NormalHello();

	/**
	 * Functions depending on the NormalHello class
	 * @return "Hello×3 Normal World" string
	 */
	@RequestMapping("/hello1")
    public String Hello1() {

		return nHello.HelloWorld(3);
    }
}
