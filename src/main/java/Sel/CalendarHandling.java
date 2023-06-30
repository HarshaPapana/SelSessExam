package Sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarHandling {
	
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		
		
		driver.findElement(By.id("datepicker")).click();
		//selectDate("24");
		//selectFutureDate("October 2023", "23");
		
		//driver.findElement(By.id("datepicker")).click();
		//selectDate("24");
		selectPreviousDate("May 2023", 23);
		
		
	}
	
	public static void selectFutureDate(String expMonthYear, int day) {
		
		if(expMonthYear.contains("February") && (day > 29)) {
			System.out.println("wrong date is passed...plz pass the right date for Feb" + day);
			return;
		}
		
		if(day > 31) {
			System.out.println("wrong date is passed...plz pass the right date");
			return;
		}
		
		if(day <= 0) {
			System.out.println("wrong date is passed...plz pass the right date");
			return;
		}
		
		String actMonth = driver.findElement(By.cssSelector(".ui-datepicker-title")).getText();
		System.out.println(actMonth);
		
		while(!actMonth.equalsIgnoreCase(expMonthYear)) {
			driver.findElement(By.xpath("//span[text()='Next']")).click();
			actMonth = driver.findElement(By.cssSelector(".ui-datepicker-title")).getText();
		}
		
		selectDate(day);
		
	}
	
	public static void selectPreviousDate(String expMonthYear, int day) {
		
		String actMonth = driver.findElement(By.cssSelector(".ui-datepicker-title")).getText();
		System.out.println(actMonth);
		
		while(!actMonth.equalsIgnoreCase(expMonthYear)) {
			driver.findElement(By.xpath("//span[text()='Prev']")).click();
			actMonth = driver.findElement(By.cssSelector(".ui-datepicker-title")).getText();
		}
		
		selectDate(day);
		
	}
	
	public static void selectDate(int day) {
		driver.findElement(By.xpath("//a[text()='"+day+"']")).click();
	}

}
