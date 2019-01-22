package WebDriverSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandle {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/NaveenKhunteta/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.w3schools.com/html/html_tables.asp");

		// List<WebElement> rows =
		// driver.findElements(By.xpath("//table[@id='customers']//tr"));
		//
		// int rowCount = rows.size();
		// System.out.println("total rows: "+ rowCount);

		// *[@id="customers"]/tbody/tr[2]/td[1]
		// *[@id="customers"]/tbody/tr[3]/td[1]
		// *[@id="customers"]/tbody/tr[4]/td[1]
		// *[@id="customers"]/tbody/tr[7]/td[1]
		// *[@id="customers"]/tbody/tr[2]/td[2]
		// *[@id="customers"]/tbody/tr[4]/td[2]
		// *[@id="customers"]/tbody/tr[5]/td[2]
		// *[@id="customers"]/tbody/tr[6]/td[2]
		// *[@id="customers"]/tbody/tr[7]/td[2]

		String beforeXpath = "//*[@id='customers']/tbody/tr[";

		String afterXpath_Comp = "]/td[1]";
		String afterXpath_Contact = "]/td[2]";
		String afterXpath_Country = "]/td[3]";

		WebTableHandle webHandle = new WebTableHandle();
		ArrayList<String> compList = webHandle.getValuesWebTable(driver, beforeXpath, afterXpath_Comp);
		System.out.println(compList);
		
		ArrayList<String> contactList = webHandle.getValuesWebTable(driver, beforeXpath, afterXpath_Contact);
		System.out.println(contactList);
		
		ArrayList<String> countryList = webHandle.getValuesWebTable(driver, beforeXpath, afterXpath_Country);
		System.out.println(countryList);
		
	}

	public int getRowCount(WebDriver driver) {
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']//tr"));
		int rowCount = rows.size();
		return rowCount;
	}

	public ArrayList<String> getValuesWebTable(WebDriver driver, String beforeXpath, String afterXpath) {
		ArrayList<String> ar = new ArrayList<String>();
		
		for (int rowNum = 2; rowNum <= getRowCount(driver); rowNum++) {
			String actualXpath = beforeXpath + rowNum + afterXpath;
			String rowValue = driver.findElement(By.xpath(actualXpath)).getText();
			ar.add(rowValue);
		}
		return ar;

	}

}
