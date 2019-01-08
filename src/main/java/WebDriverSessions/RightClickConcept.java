package WebDriverSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickConcept {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/NaveenKhunteta/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		Actions action = new Actions(driver);
		
		action.contextClick(driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']")))
		.build()
		.perform();
		
		WebElement copyElement = driver.findElement(By.className("context-menu-icon-copy"));
		
		System.out.println(copyElement.getText());
		
		
		
	}

}
