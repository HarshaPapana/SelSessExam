package Sel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class jQueryDropdown {
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.get("https://www.lambdatest.com/selenium-playground/jquery-dropdown-search-demo");

		By Country = By.id("country");
		getDropdownValuesCount(Country);
		getDropdownValuesAll(Country);
		

	}
	
	public static void getDropdownValuesCount(By locator) {
		WebElement days = driver.findElement(locator);
		Select options = new Select(days);
		List<WebElement> count = options.getOptions();
		int dropdownCount = count.size();
		System.out.println("Dropdown values count : " + dropdownCount);
	}
	
	public static void getDropdownValuesAll(By locator) {
		WebElement days = driver.findElement(locator);
		Select options = new Select(days);
		List<WebElement> values = options.getOptions();
		for (WebElement e : values) {
			String text = e.getText();
			System.out.println(text);
		}
	}

}
