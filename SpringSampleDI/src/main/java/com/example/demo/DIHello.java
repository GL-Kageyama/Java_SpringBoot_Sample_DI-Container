package com.example.demo;

import org.springframework.stereotype.Component;

/**
 * Class for string output using the DI container
 */
// Annotations to be registered in the DI container
@Component
public class DIHello {

	/**
	 * Function to create the "Hello×? Normal World"
	 * @param cnt Number of times to repeat Hello
	 * @return "Hello×? DI World" string
	 */
	public String HelloWorld(int cnt) {

		String result = "";
		for (int i = 0; i < cnt; i++) {
			result += "Hello ";
		}
		return result + "DI World !";
	}
}
