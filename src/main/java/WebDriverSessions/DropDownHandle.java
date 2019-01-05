package WebDriverSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandle {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/NaveenKhunteta/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.facebook.com");
		
		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
		
//		Select select = new Select(day);
//		select.selectByVisibleText("10");
//		
//		Select select1 = new Select(month);
//		select1.selectByVisibleText("May");
//		
//		Select select2 = new Select(year);
//		select2.selectByVisibleText("1990");
		
		String dob = "10-May-1995";
		String dobArr[] = dob.split("-");
		
		selectValueFromDropDown(day, dobArr[0]);
		selectValueFromDropDown(month, dobArr[1]);
		selectValueFromDropDown(year, dobArr[2]);

		
	}
	
	
	public static void selectValueFromDropDown(WebElement element, String value){
		Select select = new Select(element);
		select.selectByVisibleText(value);
		
	}
	

}
