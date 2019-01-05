package WebDriverSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsConcept {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/NaveenKhunteta/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.amazon.com");
		
		List<WebElement> linksList = driver.findElements(By.tagName("a"));
		
		System.out.println("total links are: " + linksList.size());
		
		for(int i=0; i<linksList.size(); i++){
			System.out.println(linksList.get(i).getText());
		}
		
	}

}
