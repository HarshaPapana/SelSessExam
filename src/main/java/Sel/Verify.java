package Sel;

import org.openqa.selenium.WebDriver;

public class Verify {
	
	private WebDriver driver;

	public Verify(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public boolean equalValues(String actResult, String expResult) {
		if(actResult.equals(expResult)) {
			System.out.println(actResult + " is equal to " + expResult);
			return true;
		}else {
			System.out.println(actResult + " is not equal to " + expResult);
			return false;			
		}
		
	}
	
	public static boolean containValues(String actResult, String expResult) {
		if(actResult.contains(expResult)) {
			System.out.println(actResult + " contains " + expResult);

			return true;
		}
		else {
			System.out.println(actResult + " does not contains " + expResult);
			return false;
		}
		
	}

}
