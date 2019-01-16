package TestNGSessions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations {
	
	/**
	 * launch browser
		deleteAllCookies
		enter url
		
			login to app
			homePageHeaderTest
			logout
			
			login to app
			homePageTitleTest
			logout
			
			login to app
			homePageUserInfoTest
			logout
			
		deleteUser
		closeDBConnection
		close browser
	 */
	
	//1
	@BeforeSuite
	public void launchBrowser(){
		System.out.println("launch browser");
	}
	//2
	@BeforeTest
	public void deleteAllCookies(){
		System.out.println("deleteAllCookies");
	}
	//3
	@BeforeClass
	public void enterURL(){
		System.out.println("enter url");
	}
	//4//7//10
	@BeforeMethod
	public void login(){
		System.out.println("login to app");
	}
	
	//5
	@Test(priority=1)
	public void homePageHeaderTest(){
		System.out.println("homePageHeaderTest");
	}
	//11
	@Test(priority=2)
	public void homePageUserInfoTest(){
		System.out.println("homePageUserInfoTest");
	}
	//8
	@Test(priority=3)
	public void homePageTitleTest(){
		System.out.println("homePageTitleTest");
	}
	
	@Test(priority=4)
	public void homePageSearchTest(){
		System.out.println("homePageSearchTest");
	}
	
	//6//9//12
	@AfterMethod
	public void logout(){
		System.out.println("logout");
	}
	
	@AfterClass
	public void deleteUser(){
		System.out.println("deleteUser");
	}
	
	@AfterTest
	public void closeDBConnection(){
		System.out.println("closeDBConnection");
	}
	
	@AfterSuite
	public void closeBrowser(){
		System.out.println("close browser");
	}
	
	
	

}
