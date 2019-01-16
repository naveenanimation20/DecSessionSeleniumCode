package TestNGSessions;

import org.testng.annotations.Test;

public class InvocationCount {
	
	
	@Test()
	public void homePageHeaderTest(){
		System.out.println("homePageHeaderTest");
	}
	
	@Test(invocationCount=10)
	public void homePageUserInfoTest(){
		System.out.println("homePageUserInfoTest");
	}
	
	
	
	

}
