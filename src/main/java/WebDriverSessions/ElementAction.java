package WebDriverSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ElementAction {
	
	public static WebDriver driver;
	
	/**
	 * This method is used to launch the url. If url is blank or null, it will throw an exception.
	 * IF url is correct or valid, it will launch the url.
	 * @param url
	 */
	public static void launchUrl(String url){
		if(url.equals("") || url.equals(null)){
			try {
				throw new Exception("url is blank or null");
			} catch (Exception e) {
				e.printStackTrace();
			}	
			}
		try{
		driver.get(url);
		}
		catch(Exception e){
			System.out.println("URL did not load "+ url);	
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
	
	/**
	 * This method is used to launch the url. If url is blank or null, it will throw an exception.
	 * IF url is correct or valid, it will launch the url.
	 * @param url
	 */
	public static void navigateToUrl(String url){
		if(url.equals("") || url.equals(null)){
			try {
				throw new Exception("url is blank or null");
			} catch (Exception e) {
				e.printStackTrace();
			}	
			}
		try{
		driver.navigate().to(url);
		}
		catch(Exception e){
			System.out.println("URL did not load "+ url);	
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
	
	/**
	 * this method will return title of the page.
	 * @return title
	 */
	public static String getPageTitle(){
		String title = null;
		try{
			title = driver.getTitle();
			System.out.println("Page title is: "+title);
			return title;
		}catch(Exception e){
			try {
				throw new Exception("Title not available exception, some error occurred");
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
		return title;
	}
	
	/**
	 * this method will return a WebElement on the basis of By selector/locator
	 * @param selector
	 * @return
	 */
	public static WebElement getElement(By selector){
		try{
		return driver.findElement(selector);
		}
		catch(Exception e){
			try {
				throw new Exception("Element not found or not visible exception");
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
		return null;
	}
	
	
	
	
	public static void main(String args[]){
		System.setProperty("webdriver.chrome.driver", "/Users/NaveenKhunteta/Downloads/chromedriver");
		driver = new ChromeDriver();
		launchUrl("http://www.freecrm.com");
		
		getPageTitle();
		
		By un = By.name("username");
		By pwd = By.name("password");
		By login = By.xpath("//input[@type='submit']");
		
		getElement(un).sendKeys("naveen");
		getElement(pwd).sendKeys("test123");
		
		Actions action = new Actions(driver);
		action.click(getElement(login));
		

		
	}
	
	
	
	
	
	

}
