package Sel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class jQueryComboTreeDropdownMultiple {
	
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		
		//By choices = By.id("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		
		driver.findElement(By.id("justAnInputBox")).click();
		Thread.sleep(1000);
		
		By choices = By.xpath("(//div[@class='comboTreeDropDownContainer'])[1]//li/span");
		
		// 1. TC_1: single selection:
		//selectChoice(choices, "choice 1");

		// 2. TC_2: Multiple Selection:
		//selectChoice(choices, "choice 1", "choice 2", "choice 6 2 1", "choice 7", "choice 10");

		// 3. TC_3: All selection:
		selectChoice(choices, "all");

	}
	
	// vararg
		public static void selectChoice(By locator, String... value) {
			List<WebElement> optionsList = driver.findElements(locator);
			System.out.println(optionsList.size());
			boolean flag = false;

			if (!value[0].equalsIgnoreCase("all")) {
				for (WebElement e : optionsList) {
					String text = e.getText();
					System.out.println(text);

					// multiple selection logic:
					for (int i = 0; i < value.length; i++) {
						if (text.equals(value[i])) {
							flag = true;
							e.click();
							break;
						}
					}

				}
			}
			else {
				//all selection logic:
				for(WebElement e : optionsList) {
					String text = e.getText();
						if(!text.equals("−")) {
							e.click();
							flag = true;
						}
				}
				
			}
			
			if(flag==false) {
				System.out.println("choice is not available");
			}
		}
		

}
