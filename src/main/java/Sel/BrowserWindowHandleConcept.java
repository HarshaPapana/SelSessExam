package Sel;

import java.util.Set;
import java.util.Iterator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandleConcept {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");//parent page
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();
		
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		
		String parentWindowId = it.next();
		String childWindowId = it.next();
		
		System.out.println(parentWindowId);
		System.out.println(childWindowId);
		
		driver.switchTo().window(childWindowId);
		driver.close();
		
		driver.switchTo().window(parentWindowId);
		driver.quit();
		
		

	}

}
