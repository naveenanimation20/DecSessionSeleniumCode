package TestNGSessions;

import org.testng.annotations.Test;

public class DependsOnMethodsConcept {
	
	
	@Test
	public void login(){
		System.out.println("login to app");
		int i = 9/0;
	}
	
	@Test(dependsOnMethods="login")
	public void homePageTest(){
		System.out.println("home page test");
	}
	
	@Test(dependsOnMethods="login")
	public void DealsPageTest(){
		System.out.println("deals page test");
	}
	
	@Test(dependsOnMethods="login")
	public void searchPageTest(){
		System.out.println("search page test");
	}
	
	
	

}
