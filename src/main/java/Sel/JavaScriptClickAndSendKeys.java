package Sel;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JavaScriptClickAndSendKeys {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.yahoo.com/");
		Thread.sleep(3000);
		
		By userName = By.id("login-username");
		//driver.findElement(userName).sendKeys("testing");
		WebElement emailId = driver.findElement(userName);
		
		Actions act = new Actions(driver);
		act.sendKeys(emailId,"testing").build().perform();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", emailId);
		
		//js.executeScript("document.getElementById('" + id + "').value='" + value + "'");
		js.executeScript("document.getElementById('login-username').value='naveen@yahoo.com'");
		
	}
	
//	public void clickElementByJS(WebElement element) {
//		js.executeScript("arguments[0].click();", element);
//	}

}
