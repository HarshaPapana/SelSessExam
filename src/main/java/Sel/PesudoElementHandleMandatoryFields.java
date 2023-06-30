package Sel;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PesudoElementHandleMandatoryFields {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String manFieldFirstNameText = js.executeScript("return window.getComputedStyle(document.querySelector(\"label[for='input-firstname']\"),"
						+ "'::before').getPropertyValue('content')")
							 		.toString();
		System.out.println(manFieldFirstNameText);
		
		if(manFieldFirstNameText.contains("*")) {
			System.out.println("First name is a mandatory field");
		}		

	}

}
