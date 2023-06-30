package TestNGSessions;

import org.testng.annotations.Test;

public class TestWithPriority {
	
	@Test(priority = 1)
	public void searchTest() {
		System.out.println("test -- searchTest");
	}
	
	
	@Test(priority = 4)
	public void addToCartTest() {
		System.out.println("test -- add To Cart Test");
	}
	
	
	@Test(priority = 3)
	public void paymentTest() {
		System.out.println("test -- payment Test");
	}
	
	@Test(priority = 2)
	public void aTest() {
		System.out.println("test -- a Test");
	}
	
	@Test(priority = 0)
	public void bTest() {
		System.out.println("test -- b Test");
	}

}
