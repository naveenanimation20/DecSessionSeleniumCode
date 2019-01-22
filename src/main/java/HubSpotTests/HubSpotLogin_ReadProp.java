package HubSpotTests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class HubSpotLogin_ReadProp {
	
	static WebDriver driver;

	public static void main(String[] args) {

		Properties prop = new Properties();
		
		try {
			FileInputStream ip = new FileInputStream("/Users/NaveenKhunteta/Documents/workspace/DecSeleniumSession/"
					+ "src/main/java/HubSpotTests/config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		String browserName = prop.getProperty("browser");
		System.out.println("the browser name is : "+ browserName);
		
		String url = prop.getProperty("url");
		System.out.println(url);
		
		if(browserName.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "/Users/NaveenKhunteta/Downloads/chromedriver");
			driver = new ChromeDriver();
		}else if(browserName.equals("firefox")){
			System.setProperty("webdriver.gecko.driver", "/Users/NaveenKhunteta/Downloads/geckodriver");
			driver = new FirefoxDriver();
		}else if(browserName.equals("IE")){
			System.setProperty("webdriver.ie.driver", "/Users/NaveenKhunteta/Downloads/InternetExplorerdriver");
			driver = new InternetExplorerDriver();
		}else{
			System.out.println("browser value is not defined");
		}
		
		driver.get(url);
		driver.manage().timeouts().pageLoadTimeout(Integer.parseInt(prop.getProperty("pageloadtimeout")), TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(Integer.parseInt(prop.getProperty("implicitlywait")), TimeUnit.SECONDS);
		
		driver.findElement(By.id(prop.getProperty("loginpage_username_id"))).sendKeys(prop.getProperty("username"));
		driver.findElement(By.id(prop.getProperty("loginpage_password_id"))).sendKeys(prop.getProperty("password"));
		driver.findElement(By.id(prop.getProperty("loginpage_loginBtn_id"))).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Integer.parseInt(prop.getProperty("defaultexplicitwait")));
		wait.until(ExpectedConditions.titleContains(Constants.HOME_PAGE_TITLE));
		
		String title = driver.getTitle();
		System.out.println("home page title is: "+ title);
		Assert.assertEquals(title, Constants.HOME_PAGE_TITLE);
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("homepage_header_xpath"))));
		String header = driver.findElement(By.xpath(prop.getProperty("homepage_header_xpath"))).getText();
		System.out.println("home page header is: "+ header);
		
		
	}

}
