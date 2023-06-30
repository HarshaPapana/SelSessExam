package Sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPage {
	
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
	
		Thread.sleep(4000);	
		
		driver.findElement(By.name("upfile")).sendKeys("/Users/6023260/Downloads/MeritLetter.jpeg/");

	}

}
