package TestNGSessions;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGFeatures {
	
	//global pre conditions
	//pre conditions
	//test steps -- act vs exp pass/fail
	//post steps
	//global post steps
	
	
	//global pre conditions and pre conditions
	
	//1
	@BeforeSuite
	public void DBConnection() {
		System.out.println("BS -- DB connection");
	}
	
	//2
	@BeforeTest
	public void createUser() {
		System.out.println("BT -- createUser");
	}
	
	//3
	@BeforeClass
	public void openBrowser() {
		System.out.println("BC -- openBrowser");
	}
	
	//4 //7 //10
	@BeforeMethod
	public void loginToApp() {
		System.out.println("BM -- loginToApp");
	}
	
	//test steps
	
	//11
	@Test
	public void searchTest() {
		System.out.println("test -- searchTest");
	}
	
	//5
	@Test
	public void addToCartTest() {
		System.out.println("test -- add To Cart Test");
	}
	
	//8
	@Test
	public void paymentTest() {
		System.out.println("test -- payment Test");
	}

	//post conditions
	
	//6 //9 //12
	@AfterMethod
	public void logoutTest() {
		System.out.println("AM -- logout Test");
	}
	
	//13
	@AfterClass
	public void closeBrowser() {
		System.out.println("AC -- closeBrowser");
	}
	
	//14
	@AfterTest
	public void deleteUser() {
		System.out.println("AT -- delete User");
	}
	
	//15
	@AfterSuite
	public void closeDBConnection() {
		System.out.println("AS -- close DB Connection");
	}	

}
