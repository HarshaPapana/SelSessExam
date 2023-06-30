package Sel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickConcept {
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();

		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		WebElement rightClick = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		Actions action = new Actions(driver);
		action.contextClick(rightClick).build().perform();
		
		List<WebElement> rightClickEles = driver.findElements(By.cssSelector("ul.context-menu-list span"));
		System.out.println(rightClickEles.size());
		
		for(WebElement e : rightClickEles) {
			String text = e.getText();
			System.out.println(text);
				if(text.equals("Copy")) {
					e.click();
					break;
				}
		}
		

	}

}
