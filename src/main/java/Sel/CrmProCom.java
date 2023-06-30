package Sel;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CrmProCom {
	
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.get("https://classic.freecrm.com/");
		Thread.sleep(6000);
		
		
		
		
		By username = By.name("username");
		By password = By.name("password");
		By login = By.xpath("//input[@type='submit']");
		//By contacts = By.xpath("//a[text()='Contacts']");
		
		//By fatimaInfo = By.xpath("//a[text()='Fatima Sana']/parent::td/following-sibling::td");
		
		ElementUtil elUtil = new ElementUtil(driver);		
		elUtil.doSendKeys(username,"newautomation");		
		elUtil.doSendKeys(password, "Selenium@12345");
		elUtil.doClick(login);
		Thread.sleep(5000);
		
		driver.switchTo().frame("mainpanel");
		driver.findElement(By.linkText("CONTACTS")).click();
		Thread.sleep(4000);
		
		List<String> johnInfo = getUserInfo("Fatima Sana");
		System.out.println(johnInfo);
		

	}
	
	public static List<String> getUserInfo(String userName) {
		List<WebElement> UserInfoList = driver.findElements(By.xpath("//a[text()='"+userName+"']/parent::td/following-sibling::td"));
		List<String> userInfoValList = new ArrayList<String>();
		for(WebElement e: UserInfoList) {
			String text = e.getText();
			userInfoValList.add(text);
		}
		return userInfoValList;
	}

}
