package Sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class InputFormSubmit {
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.get("https://www.lambdatest.com/selenium-playground/input-form-demo");
		
		ElementUtil eleUtil = new ElementUtil(driver);
		
		By name = By.id("name");
		By email = By.id("inputEmail4");
		By pwd = By.id("inputPassword4");
		By company = By.id("company");
		By website = By.id("websitename");
		By country = By.name("country");
		By city = By.id("inputCity");
		By address1 = By.id("inputAddress1");
		By address2 = By.id("inputAddress2");
		By state = By.id("inputState");
		By zip = By.id("inputZip");
		By submit = By.xpath("//button[text()='Submit']");
		By confirmMessage = By.xpath("//p[text()='Thanks for contacting us, we will get back to you shortly.']");
		
		
		eleUtil.doSendKeys(name,"Harsha");
		eleUtil.doSendKeys(email,"Harsha@gmail.com");
		eleUtil.doSendKeys(pwd,"Harsha@123");
		eleUtil.doSendKeys(company,"TR");
		eleUtil.doSendKeys(website,"google.com");
		doSelectDropDownByVisibleText(country,"India");
		eleUtil.doSendKeys(city,"Hyderabad");
		eleUtil.doSendKeys(address1,"Addagutta");
		eleUtil.doSendKeys(address2,"Kukatpally");
		eleUtil.doSendKeys(state,"Telangana");
		eleUtil.doSendKeys(zip,"500072");
		eleUtil.doClick(submit);
		
		String message = getElement(confirmMessage).getText();
		
		Verify.containValues(message, "Thanks for contacting us");
		

	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doSelectDropDownByVisibleText(By locator, String text) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(text);
	}

}
