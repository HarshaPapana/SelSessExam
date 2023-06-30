package Sel;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrmLiveCom {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='Admin']")).click();
		Thread.sleep(000);
		
		//selectUsername("Kanthvija");
		List<String> userDetails = gettUsernameInfo("Kanthvija");
		System.out.println(userDetails);
		
		//div[text()='Kanthvija']/parent::div//following-sibling::div
		
		//xpath for trash and edit icons
		//(//div[text()='Kanthvija']/parent::div//following-sibling::div)[last()]//i[contains(@class,bi-trash)]

	}
	
//	public static void selectUsername(String username ) {
//		driver.findElement(By.xpath("//div[text()='"+username+"']/parent::div/preceding-sibling::div//input[@type='checkbox']")).click();
//	}
	
	public static List<String> gettUsernameInfo(String username) {
		List<WebElement> userInfo = driver.findElements(By.xpath("//div[text()='"+username+"']/parent::div//following-sibling::div"));
		List<String> userInfoDetails = new ArrayList<String>();
		
		for(WebElement e : userInfo) {
			String text = e.getText();
			userInfoDetails.add(text);
			System.out.println(text);
		}
		return userInfoDetails;
	}

}
