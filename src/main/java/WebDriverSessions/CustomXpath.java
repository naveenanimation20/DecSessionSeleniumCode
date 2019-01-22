package WebDriverSessions;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/NaveenKhunteta/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://app.hubspot.com/login");
		//Compound class names not permitted
		//driver.findElement(By.className("form-control private-form__control login-email")).sendKeys("test@gmail.com");
		
//		driver.findElement(By.xpath("//input[@class='form-control private-form__control login-email']"))
//		.sendKeys("test@gmail.com");
//		
		//driver.findElement(By.xpath("//input[@id='username']")).sendKeys("test@gmail.com");
		//driver.findElement(By.xpath("//input[@id='username' and @type='email']")).sendKeys("test@gmail.com");

		
		//<input id=username_123>
		//<input id=username_221>
		//<input id=123_username_444>
		//<button id=username_login_button_text>
		//<button id=username_signin_button_field>

		
		//input[@id='username' and @type='email']
		//input[@id='username']
		//input[contains(@id,'username_login')]
		//*[@id="password-description"]/div/div[2]/div/div/span/a/i18n-string
		//input[@type='email' and contains(@id,'username')]
		
		//body//div -- 30 
		//body/div -- 5
		
		//CSS Selector:
//		driver.findElement(By.cssSelector("input.form-control.private-form__control.login-email"))
//		.sendKeys("test");
		//driver.findElement(By.cssSelector("input.login-email")).sendKeys("test");
		//driver.findElement(By.cssSelector(".login-email")).sendKeys("test");
		//input.login-email.form-control.private-form__control
		
		//input#username
		//#username
		//input.login-email
		
		//<input id=username_123>
		//input#username_123
		
		
	}

}
