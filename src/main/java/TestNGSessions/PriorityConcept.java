package TestNGSessions;

import org.testng.annotations.Test;

public class PriorityConcept {
	
	@Test(priority=1)
	public void homePageHeaderTest(){
		System.out.println("homePageHeaderTest");
	}
	//11
	@Test(priority=2, enabled=true)
	public void homePageUserInfoTest(){
		System.out.println("homePageUserInfoTest");
	}
	//8
	@Test(priority=4, enabled=true)
	public void homePageTitleTest(){
		System.out.println("homePageTitleTest");
	}
	
	@Test(priority=3)
	public void homePageSearchTest(){
		System.out.println("homePageSearchTest");
	}
	
	
	
	

}
