package com.poscoict.helloworld.hello;

import java.util.HashMap;
import java.util.Map;

public class HelloWorld {
	public static int count = 10;
	public static void main(String[] args) {
		hello();
		System.out.println("Hello World!!!!!!!!");
	}
	
	public static void hello() {
		// block안에 있는 변수 = 지역변수 (stack에 저장)
		Map<String, Object> m = new HashMap<>();
	}
}
