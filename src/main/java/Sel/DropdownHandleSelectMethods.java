package Sel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownHandleSelectMethods {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.get("https://www.lambdatest.com/selenium-playground/select-dropdown-demo");

		By selectDay = By.id("select-demo");
		By selectState = By.id("multi-select");

		selectDropdownOption(selectDay, "Friday");
		getDropdownValuesCount(selectDay);
		getDropdownValuesAll(selectDay);
		
		getDropdownValuesCount(selectState);
		getDropdownValuesAll(selectState);		
		selectDropdownOption(selectState,"Florida");
		selectDropdownOption(selectState, "New York");

	}

	public static void selectDropdownOption(By locator, String weekDay) {

		WebElement day = driver.findElement(locator);
		Select week = new Select(day);
		week.selectByVisibleText(weekDay);

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
