package Sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SendKeysWithPause {
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		WebElement emialid = driver.findElement(By.id("input-email"));
		
		String mailValue = "automation@gmail.com";
		Actions act = new Actions(driver);
		char c[] = mailValue.toCharArray();
		
		for(char e : c) {
			act.sendKeys(emialid,String.valueOf(e)).pause(500).build().perform();
		}
		

	}

}
