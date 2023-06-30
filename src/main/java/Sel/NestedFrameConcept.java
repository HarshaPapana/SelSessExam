package Sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrameConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://selectorshub.com/iframe-scenario/");
		
		driver.switchTo().frame("pact1");		
		driver.findElement(By.id("inp_val")).sendKeys("Harsha");
		
		driver.switchTo().frame("pact2");		
		driver.findElement(By.id("jex")).sendKeys("Jex");
		
		driver.switchTo().frame("pact3"); //driver -- pact 3
		driver.findElement(By.id("glaf")).sendKeys("Naveen");
		
		//frame 2; move to previous frame
		driver.switchTo().parentFrame();
		driver.findElement(By.id("jex")).sendKeys("riya");
		
		//frame1; move to previous frame
		driver.switchTo().parentFrame(); // driver --> pact1
		driver.findElement(By.id("inp_val")).sendKeys("Ankit");
		
		//pact 3 to pact 1		
//		driver.switchTo().parentFrame(); //pact2
//		driver.switchTo().parentFrame(); //pact 1
//		driver.findElement(By.id("inp_val")).sendKeys("Testing");
		
		driver.switchTo().defaultContent();
		String header = driver.findElement(By.cssSelector("h1.elementor-heading-title.elementor-size-default")).getText();
		System.out.println(header);
		
		//page to frame
				//f1 to f2
				//f2 to f3
				//f3 to f2
				//f2 to f1
				//f1 to f3 -- NO
				//f1 to f2  to f3 -- yes
				//f3 to default content ---> page
				//page --> f1 -> f2
				//f2 to main page --> yes with default content
				//page --> f3 -- NO
				//Page --> f2 --> NO
				//Page --> f1 --> f2 --> f3 ---> yes

		

	}

}
