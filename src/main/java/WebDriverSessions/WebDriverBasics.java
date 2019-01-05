package WebDriverSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		
		//1. launch chrome:
		System.setProperty("webdriver.chrome.driver", "/Users/NaveenKhunteta/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		//2. enter url:
		driver.get("http://www.google.com");
		
		//3. get the title:
		String title = driver.getTitle();
		System.out.println("actual title of the page is: " + title);
		
		//validate the title:
		if(title.equals("Google")){
			System.out.println("correct title");
		}else{
			System.out.println("in correct title");
		}
		
		System.out.println(driver.getCurrentUrl());
		
		//System.out.println(driver.getPageSource());
		
		//close browser:
		driver.quit();
		
		

	}

}
