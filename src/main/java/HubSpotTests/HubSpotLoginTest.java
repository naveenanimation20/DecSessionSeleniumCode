package HubSpotTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HubSpotLoginTest {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp(){
		System.setProperty("webdriver.chrome.driver", "/Users/NaveenKhunteta/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().fullscreen();
		driver.manage().deleteAllCookies();
		driver.get("https://app.hubspot.com/login");
	}
	
	@Test
	public void verifyLoginPageTitleTest(){
		System.out.println("********verifyLoginPageTitleTest*********");
		String title = driver.getTitle();
		System.out.println("the login page title is: "+ title);
		
//		if(title.equals("HubSpot LoginXX")){
//			System.out.println("PASS");
//		}else{
//			System.out.println("FAIL");
//		}
		Assert.assertEquals(title, "HubSpot LoginXX", "title is not equal");
	}
	
	
	@Test
	public void verifyLoginButtonTest(){
		WebElement button = driver.findElement(By.id("loginBtn"));
		Assert.assertTrue(button.isDisplayed());
	}
	
	@Test
	public void loginTest(){
		driver.findElement(By.id("username")).sendKeys("naveenanimation20@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Test@1234");
		driver.findElement(By.id("loginBtn")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.titleContains("Reports dashboard"));
		
		String title = driver.getTitle();
		System.out.println("home page title is: "+ title);
		Assert.assertEquals(title, "Reports dashboardXX");
		
	}
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	
	
	
	
	

}
