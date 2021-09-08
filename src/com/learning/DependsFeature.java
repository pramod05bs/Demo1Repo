package com.learning;

import org.testng.annotations.Test;

public class DependsFeature {
	
	@Test(priority=1)
	public void Login() {
		System.out.println("login Test");
		try {
			int i = 10/0;
		}
	catch(ArithmeticException e) {
		System.out.println(e);
	}}
		
	@Test(priority=2, dependsOnMethods ="Login" )
	public void homepage() {
		System.out.println("Homepage");}
	
	@Test(priority=3, dependsOnMethods ="Login" )
	public void logout() {
		System.out.println("logout");}
	
	
	

}
