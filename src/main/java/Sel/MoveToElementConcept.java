package Sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementConcept {
	
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.get("http://mrbool.com/search/?txtsearch=how-to-create-menu-with-submenu-using-css-html");
		
		By contactParentMenu = By.className("menulink");
		By contactChildMenu = By.linkText("COURSES");	
		
		//by parent and by chidl menu
		//handleTwoLevelMenu(contactParentMenu,contactChildMenu);
		
		handleTwoLevelMenu(contactParentMenu,"ARTICLES");
		
		

	}
	
	public static void handleTwoLevelMenu(By parentMenu, By childMenu) throws InterruptedException {
		WebElement contactMenu = driver.findElement(parentMenu);
		Actions act = new Actions(driver);
		act.moveToElement(contactMenu).build().perform();
		Thread.sleep(2000);
		driver.findElement(childMenu).click();
	}
	
	public static void handleTwoLevelMenu(By parentMenu, String childMenuLinkText) throws InterruptedException {
		WebElement contactMenu = driver.findElement(parentMenu);
		Actions act = new Actions(driver);
		act.moveToElement(contactMenu).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.linkText(childMenuLinkText)).click();
	}

}
