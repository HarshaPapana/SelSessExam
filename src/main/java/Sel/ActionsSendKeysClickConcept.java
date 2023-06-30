package Sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsSendKeysClickConcept {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By email = By.id("input-email");
		By password = By.id("input-password");
		By login = By.xpath("//input[@value='Login']");
		
//		Actions act = new Actions(driver);
//		
//		act.sendKeys(driver.findElement(email),"test@gmail.com").build().perform();
//		//act.sendKeys(driver.findElement(email), "test@gmail.com").build().perform();
//		act.sendKeys(driver.findElement(password),"password").build().perform();
//		act.click(driver.findElement(login)).build().perform();
//		
		//diff between action send keys and webelement keys
		//Actions Send Keys:
		//move to that element internally	
		//click on it -- it will click on middle of the element
		//enter the value
		
		//WebElement sendKeys:
		//enter the value
		
		doActionsSendKeys(email,"test@gmail.com");
		doActionsSendKeys(password,"password");
		doActionsClick(login);

	}
	
	public static WebElement getElement(By locator) {
		 return driver.findElement(locator);
	}
	
	public static void doActionsSendKeys(By locator, String value) {
		Actions act = new Actions(driver);
		act.sendKeys(getElement(locator),value).build().perform();
		
	}
	
	public static void doActionsClick(By locator) {
		Actions act = new Actions(driver);
		act.sendKeys(getElement(locator)).build().perform();		
	}

}
