package com.example.demo;

/**
 * Normal class for string output
 */
public class NormalHello {

	/**
	 * Function to create the "Hello×? Normal World"
	 * @param cnt Number of times to repeat Hello
	 * @return "Hello×? Normal World" string
	 */
	public String HelloWorld(int cnt) {

		String result = "";
		for (int i = 0; i < cnt; i++) {
			result += "Hello ";
		}
		return result + "Normal World !";
	}
}