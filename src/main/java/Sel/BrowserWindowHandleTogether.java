package Sel;

import java.util.List;
import java.util.Set;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandleTogether {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");//parent page
		Thread.sleep(3000);
		
		String parentWindowId = driver.getWindowHandle();
		System.out.println(parentWindowId);
		
		List<WebElement> links= driver.findElements(By.xpath("//div[@class='orangehrm-login-footer-sm']/a"));
		System.out.println(links.size());
//		
		driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();
		Thread.sleep(2000);
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		String parentId = it.next();
		String childId = it.next();
		driver.switchTo().window(childId);
		System.out.println(childId);
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		driver.close();
		driver.switchTo().window(parentId);
		System.out.println(parentId);
		
		
//		String childWindowId = driver.getWindowHandle();
//		driver.switchTo().window(childWindowId);
//		System.out.println(childWindowId);
//		String pageTitle = driver.getTitle();
//		System.out.println(pageTitle);
		
//		for(WebElement e : links) {			
//			//String linkText = e.getAttribute("href");
//			e.click();
//			Thread.sleep(3000);
//			String childWindowId = driver.getWindowHandle();
//			driver.switchTo().window(childWindowId);
//			System.out.println(childWindowId);
//			String pageTitle = driver.getTitle();
//			System.out.println(pageTitle);
//			//driver.close();
//			//driver.switchTo().window(parentWindowId);
//		}
		
//		driver.findElement(By.xpath("//a[contains(@href,'linkedin')]")).click();
//		driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();
//		driver.findElement(By.xpath("//a[contains(@href,'facebook')]")).click();
//		driver.findElement(By.xpath("//a[contains(@href,'youtube')]")).click();
		
//		Set<String> handles = driver.getWindowHandles();
//		Iterator<String> it = handles.iterator();
//		while(it.hasNext()) {
//			String windowId = it.next();
//			driver.switchTo().window(windowId);
//			String url = driver.getCurrentUrl();
//			System.out.println(url);
//			Thread.sleep(1000);
//			
//				if(!windowId.equals(parentWindowId)) {
//					driver.close();
//				}
//			
//		}
//		
//		driver.switchTo().window(parentWindowId);
//		System.out.println("parent window url: "+ driver.getCurrentUrl() ) ;
		
//		for(WebElement e : links) {
//			e.click();
//			Thread.sleep(1000);
//			
//			while(it.hasNext()) {
//				String windowId = it.next();
//				driver.switchTo().window(windowId);
//				String url = driver.getCurrentUrl();
//				System.out.println(url);
//				Thread.sleep(1000);
//				
//					if(!windowId.equals(parentWindowId)) {
//						driver.close();
//					}
//				
//			}
//		}
		

	}

}
