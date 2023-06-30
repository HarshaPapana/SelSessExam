package Sel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OpenCartPageTest {
	static WebDriver driver;

	public static void main(String[] args) {

		BrowserUtil brUtil = new BrowserUtil();
		
		WebDriver driver = brUtil.initDriver("chrome");
		
		brUtil.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		String title = brUtil.getPageTitle();
		System.out.println("page title:" + title);
		
		System.out.println(brUtil.getPageTitle());
		
		
		By email = By.id("input-email");
		By pwd = By.id("input-password");
		
		ElementUtil eleUtil = new ElementUtil(driver);
		
		eleUtil.doSendKeys(email, "naveen@gmail.com");
		eleUtil.doSendKeys(pwd, "naveen@123");
		
		List<WebElement> linksList = driver.findElements(By.className("list-group-item"));
		int linksCount = linksList.size();
		System.out.println(linksCount);
		
		for(WebElement e : linksList) {
			String text = e.getText();
			if(text.equals("Forgotten Password")) {
				e.click();
				break;
			}		
			
		}
		
		List<WebElement> linksListFooter = driver.findElements(By.className("navbar-header"));
		int linksListFooterCount= linksListFooter.size();
		System.out.println(linksListFooterCount);
		
//		for(WebElement e : linksListFooter) {
//			String text1 = e.getText();
////			if(text1.equals("Forgotten Password")) {
////				e.click();
////				break;
//					
//			
//		}
		
		
		
		
	
		
		
		
		
		
		
		//brUtil.quitBrowser();
		
		
	}

}
