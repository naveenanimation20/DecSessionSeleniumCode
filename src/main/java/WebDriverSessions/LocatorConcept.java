package WebDriverSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/NaveenKhunteta/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://app.hubspot.com/login");
		
		//1. id: --I -->its unique always
//		WebElement email = driver.findElement(By.id("username"));
//		email.sendKeys("naveenanimation20@gmail.com");
//
//		WebElement password = driver.findElement(By.id("password"));
//		password.sendKeys("test@1234");
		
		//2. name: -- II --> it's also unique most of the time
//		driver.findElement(By.name("test")).sendKeys("test@gmail.com");
		
		//3. xpath: address of element in html dom --III
//		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("test@gmail.com");
//		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("test@123");

		//4.  css selector: III
//		driver.findElement(By.cssSelector("#username")).sendKeys("test@gmail.com");
//		driver.findElement(By.cssSelector("#password")).sendKeys("test@1234");
		
		//5. linktext: only for links: having <a html tag
		//driver.findElement(By.linkText("Sign up")).click();
		
		//6. partialLinkText" only for links: having <a html tag
		//driver.findElement(By.partialLinkText("Sign")).click();
		
		//please register your username
		//please register your email
		//Sign up
		//Sign in
		
		//7. className: not recommended because its not unique: --IV
		//driver.findElement(By.className("login-email")).sendKeys("test@gmail.com");
		//form-control private-form__control login-email
		//form-control private-form__control login-password m-bottom-3
		driver.findElement(By.cssSelector("input.form-control.private-form__control.login-email")).sendKeys("test@1234");
	}

}
