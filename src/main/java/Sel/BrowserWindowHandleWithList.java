package Sel;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandleWithList {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");// parent page
		Thread.sleep(3000);

		driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();
		
		Set<String> handles = driver.getWindowHandles();
		List<String> handlesList = new ArrayList<String>(handles);
		
		String parentWindowId = handlesList.get(0);
		String childWindowId = handlesList.get(1);
		
		driver.switchTo().window(childWindowId);
		System.out.println("child window url : " + driver.getCurrentUrl());
		driver.close();
		
		driver.switchTo().window(parentWindowId);
		System.out.println("parent window url : " + driver.getCurrentUrl());
		
		
		

	}

}
