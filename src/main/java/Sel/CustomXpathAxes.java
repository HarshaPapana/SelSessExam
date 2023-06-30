package Sel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpathAxes {
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		//By values = By.xpath("//div[text()='Get to Know Us']/following-sibling::ul//a");
		getColumnValues("Get to Know Us");
		//getColumnValues("Make Money with Us");

	}
	
	public static void getColumnValues(String columnName) {
		System.out.println("Print the values for " + columnName);
		List<WebElement> columnValues = driver.findElements(By.xpath("//div[text()='"+columnName+"']/following-sibling::ul//a"));
		
		for(WebElement e : columnValues) {
			String text = e.getText();
			int cnt = columnValues.size();			
			System.out.println(text);			
			
		}
	}

}
