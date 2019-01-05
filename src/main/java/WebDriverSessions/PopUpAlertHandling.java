package WebDriverSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpAlertHandling {

	public static void main(String[] args) throws InterruptedException {

		//JS Alert
		System.setProperty("webdriver.chrome.driver", "/Users/NaveenKhunteta/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.name("proceed")).click(); //click on Go button
		
		Alert alert = driver.switchTo().alert();
		
		String text = alert.getText();
		System.out.println(text);
		
		if(text.equals("Please enter a valid user name")){
			System.out.println("correct error text");
		}else{
			System.out.println("in-correct error text");
		}
		
		Thread.sleep(5000);
		
		alert.accept(); //ok button
		
		alert.dismiss(); //cancel button
		
		
		
		
	}

}
