package Sel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonTest {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BrowserUtil brUtil = new BrowserUtil();
		brUtil.initDriver("chrome");
		
		brUtil.launchURL("https://www.amazon.com");
		
		String actTitle = brUtil.getPageTitle();
		System.out.println("page title: " + actTitle);
		
		//Verify.equalValues(actTitle, "Amazon.com. Spend less. Smile more.");
		
		String actUrl = brUtil.getPageURL();
		System.out.println("page url " + actUrl);
		
		Verify.containValues(actUrl, "amazon");
		//brUtil.quitBrowser();		
		
		List<WebElement> linksList = driver.findElements(By.tagName("a"));
		int totalLinks = linksList.size();
		System.out.println("total links = " + totalLinks);

	}

}
