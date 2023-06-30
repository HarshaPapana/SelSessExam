package Sel;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor {
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String title = js.executeScript("return document.title;").toString();
		System.out.println(title);
		
		//vertical scrollbar
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
		js.executeScript("window.scrollTo(document.body.scrollHeight, 0)");
		//horizontal scrollbar
		js.executeScript("window.scrollBy(0,1000)");
		
//		String script = "window.scrollBy('"+x+"' + , + '"+y+"')";
//		js.executeScript(script);
		
//		WebElement login = driver.findElement(By.xpath("//input[@value='login']"));
//		js.executeScript("arguments[0].style.border='3px solid red'", login);

	}

}
