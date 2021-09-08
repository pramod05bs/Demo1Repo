package com.learning;

import org.testng.annotations.Test;

public class INvocationcount {
	
	
	@Test(invocationCount= 10)
	public void Test1() {
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println("Sum is" + c );
		
		
	}

}
