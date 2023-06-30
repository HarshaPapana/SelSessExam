package Sel;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandleWithSelectTag {

	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/contact-sales/");

		By country = By.id("Form_getForm_Country");

		// WebElement countryEle = driver.findElement(country);
		// doSelectDropDownByIndex(country,2);
		// doSelectDropDownByVisibleText(country, "Canada");
		List<String> actCountryList = getAllDropDownOptions(country);
		System.out.println(actCountryList);
//		System.out.println(actCountryList.contains("India"));
//		System.out.println(actCountryList.contains("Canada"));
		doSelectDropDownValue(country, "Harsha");
//		if(actCount == 233) {
//			System.out.println("PASS ----- Count");
//		}
//		else
//		{
//			System.out.println("Fail ----- Count");
//		}

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);

	}

	public static int getDropDownValueCount(By locator) {
		return getAllDropDownOptions(locator).size();
	}

	public static List<String> getAllDropDownOptions(By locator) {
		Select select = new Select(getElement(locator));
		List<WebElement> optionsList = select.getOptions();
		List<String> optionsValueList = new ArrayList<String>();
		// System.out.println("total options " + optionList.size());
		// return optionList.size();

		for (WebElement e : optionsList) {
			String text = e.getText();
			System.out.println(text);
			optionsValueList.add(text);
		}
		return optionsValueList;
	}

	public static boolean doSelectDropDownValue(By locator, String dropDownValue) {
		boolean flag = false;
		Select select = new Select(getElement(locator));
		List<WebElement> optionsList = select.getOptions();

		for (WebElement e : optionsList) {
			String text = e.getText();
			System.out.println(text);

			if (text.equals(dropDownValue)) {
				flag = true;
				e.click();
				break;
			}
		}
		if (flag == false) {
			System.out.println(dropDownValue + " not present " + locator);
		}
		return flag;

	}

	public static boolean doSelectDropDownValueWithoutSelect(By locator, String Value) {
		boolean flag = false;
		List<WebElement> optionsList = driver.findElements(locator);
		//List<WebElement> optionsList = select.getOptions();
		
		for (WebElement e : optionsList) {
			String text = e.getText();
			System.out.println(text);
			if(text.equals(Value)) {
				flag = true;
				e.click();
				break;
			}
		}
		if(flag == false) {
			System.out.println(Value + " not present " + locator );
		}
		return flag;
	}

	public static void doSelectDropDownByIndex(By locator, int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}

	public static void doSelectDropDownByVisibleText(By locator, String text) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(text);
	}

	public static void doSelectDropDownByAttributeValue(By locator, String text) {
		Select select = new Select(getElement(locator));
		select.selectByValue(text);
	}

}
