package Sel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.manager.SeleniumManager;

public class WebDriverBas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//WebDriver driver = new ChromeDriver(co);
		//FirefoxDriver driver = new FirefoxDriver();
		
		String browser = "chrome";
		WebDriver driver = null;
		if(browser.equals("chrome")) {
			ChromeOptions co = new ChromeOptions();
			co.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(co);
		} else if(browser.equals("firefox")) {
			driver = new FirefoxDriver();
		} else if(browser.equals("edge")) {
			driver = new EdgeDriver();
		}
		
		
		driver.get("https://www.amazon.com");
		String title = driver.getTitle();
		System.out.println(title);
		
		//String cPath = SeleniumManager.getInstance().getDriverPath("chromedriver");
		//System.out.println(cPath);
		
		//driver.quit();
		

	}

}
