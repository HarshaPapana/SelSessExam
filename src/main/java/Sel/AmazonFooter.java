package Sel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonFooter {
	
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		
		List<WebElement> footerList = driver.findElements(By.xpath("//table[@class='navFooterMoreOnAmazon']//td/a"));
		int num = footerList.size();
		System.out.println(num);
		
		for(WebElement e : footerList) {
			String text = e.getText();
			System.out.println(text);
			if(text.contains("Amazon Music")) {
				e.click();
				break;
			}
			
			
		}
		System.out.println("--------------------");
		
		//navFooterVerticalRow navAccessibility
//		List<WebElement> footerList1 = driver.findElements(By.xpath("//div[@class='navFooterVerticalColumn navAccessibility']//li/a"));
//		int num1 = footerList1.size();
//		System.out.println(num1);
//		
//		
//		for(WebElement e : footerList1) {
//			String text1 = e.getText();
//			System.out.println(text1);
//			if(text1.equals("Careers")) {
//				e.click();
//				break;
//			}
//			
//		}
		

	}

}
