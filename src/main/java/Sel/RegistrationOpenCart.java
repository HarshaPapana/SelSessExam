package Sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationOpenCart {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		Thread.sleep(2000);
		
		By myAccount = By.xpath("//span[text()='My Account']");
		By register = By.linkText("Register");	
		
		WebElement ele = driver.findElement(register);
		
		By firstName = By.id("input-firstname");
		By lastName = By.id("input-lastname");
		By email = By.id("input-email");
		By telephone = By.id("input-telephone");
		By password = By.id("input-password");
		By confirmPassword = By.id("input-confirm");
		
		By no = By.xpath("//input[@value='0']");
		By checkBox = By.xpath("//input[@type='checkbox']");
		By continueButton = By.xpath("//input[@type='submit']");
		
		By successMessage = By.xpath("//h1[text()='Your Account Has Been Created!']");
		By logoutMessage = By.xpath("//h1[text()='Account Logout']");
		
		By logout = By.linkText("Logout");
		
		Thread.sleep(2000);	
		
		ElementUtil eleUtil = new ElementUtil(driver);	
		Verify veriUtil = new Verify(driver);
		
		eleUtil.doClick(myAccount);
		eleUtil.doClick(register);
		
		eleUtil.doSendKeys(firstName, "Harsha");
		eleUtil.doSendKeys(lastName, "P");
		eleUtil.doSendKeys(email, "Harsha2@gmail.com");
		eleUtil.doSendKeys(telephone, "9000111222");
		eleUtil.doSendKeys(password, "Harsha@123");
		eleUtil.doSendKeys(confirmPassword, "Harsha@123");
		
		eleUtil.doClick(no);
		eleUtil.doClick(checkBox);
		eleUtil.doClick(continueButton);
		
		//String expSuccessMessage = "Your Account Has Been Created!";
		
		String actSuccessMessage = driver.findElement(successMessage).getText();
		veriUtil.equalValues(actSuccessMessage, "Your Account Has Been Created!");	
		
		Thread.sleep(2000);
		
		eleUtil.doClick(logout);
		String actLogoutMessage = driver.findElement(logoutMessage).getText();
		veriUtil.equalValues(actLogoutMessage,"Account Logout");
		
		
	}	
	
	public static void getInnerText(By locator) {
		driver.findElement(locator).getText();
	}

}
