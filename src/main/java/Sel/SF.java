package Sel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class SF {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

			// TODO Auto-generated method stub
			
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://developer.salesforce.com/");
		driver.get("https://login.salesforce.com/");
		Thread.sleep(2000);
		
//		JavascriptExecutor jse = (JavascriptExecutor)driver;
//		WebElement element = (WebElement)jse.executeScript("return document.querySelector(\"body > div.slds-grid.slds-grid_vertical > div.global-nav-container > "
//				+ "hgf-c360nav\").shadowRoot.querySelector(\"header > div > div.c360-nav__wrapper > nav.utility-nav.show > ul > li.utility-icons-items.login > "
//				+ "hgf-c360login\").shadowRoot.querySelector(\"hgf-popover > hgf-button > span:nth-child(2)\")");
//		
//		element.click();
//		Thread.sleep(3000);
//		
//		driver.findElement(By.xpath("//h4[text()='Salesforce'")).click();
//		
		
			
		By username = By.id("username");
		By password = By.id("password");
		By login = By.id("Login");
		By appLauncher = By.xpath("//div[@class='slds-icon-waffle']");
		By seachBox = By.xpath("//input[@placeholder='Search apps and items...']");
				
		//Actions act = new Actions(driver);
		//act.moveToElement((WebElement) login).build().perform();
		Thread.sleep(2000);
		//driver.findElement(childMenu).click();
		
		ElementUtil eleUtil = new ElementUtil(driver);
		JavaScriptUtil jsUtil = new JavaScriptUtil(driver);
		eleUtil.doSendKeys(username, "harsh@tr.com");
		eleUtil.doSendKeys(password, "Practice@123");
		eleUtil.doClick(login);
		
		waitForPageLoad(20);		
		
		Thread.sleep(3000);
		eleUtil.doClick(appLauncher);
		Thread.sleep(1000);
		eleUtil.doSendKeys(seachBox, "Sales");
		Select objSelect = new Select(driver.findElement(seachBox));
		List <WebElement> elementCount = objSelect.getOptions();
		System.out.println(elementCount.size());

//		Verify checkUrl = new Verify(driver);
//		checkUrl.equalValues("https://northamericanbancard--staging.sandbox.my.salesforce.com/", "https://northamericanbancard--staging.sandbox.my.salesforce.com/");
//		
			

	}
	
	public static void getElement(By locator) {
		driver.findElement(locator);
	}
	
	public static void waitForPageLoad(int timeOut) {
		long endTime = System.currentTimeMillis() + timeOut;
		while(System.currentTimeMillis() < endTime) {
			JavascriptExecutor js = (JavascriptExecutor)driver;
			String pageState = js.executeScript("return document.readyState").toString();
			if(pageState.equals("complete")) {
				System.out.println("PAGE DOM is fully loaded now...");
				break;
			}
		}
	}

}
