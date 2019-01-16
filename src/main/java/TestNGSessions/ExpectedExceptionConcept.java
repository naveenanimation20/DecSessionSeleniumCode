package TestNGSessions;

import org.testng.annotations.Test;

public class ExpectedExceptionConcept {
	
	
	@Test(expectedExceptions=ArithmeticException.class)
	public void homePageHeaderTest(){
		System.out.println("homePageHeaderTest");
		int i = 9/0;
	}
	
	
	
	
	

}
