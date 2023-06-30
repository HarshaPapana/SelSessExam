package Sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gmail {
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//div[@class='gb_ye']//a/span")).click();
		//Thread.sleep(2000);
		driver.findElement(By.id("identifierId")).sendKeys("visalamachireddygari@gmail.com");
		driver.findElement(By.xpath("//div[@class='F9NWFb']//button//span[@class='VfPpkd-vQzf8d']")).click();
	}

}
