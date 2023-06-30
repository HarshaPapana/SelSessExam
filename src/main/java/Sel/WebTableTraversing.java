package Sel;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableTraversing {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		System.out.println("Total Columns " + getColCount());
		System.out.println("Total Rows " + getRowCount());
		
		List<String> colNames = getColHeaders();
		System.out.println(colNames);
		
		List<String> rowsData = getRowData();
		System.out.println(rowsData);
		//table[@id='customers']//tr	
		
		System.out.println(getColHeaders().contains("Company"));
		
		List<String> colWiseData = getSpecificColumnData("Company");
		System.out.println(colWiseData);

	}
	
	//methods
	
	public static int getColCount() {
		return driver.findElements(By.xpath("//table[@id='customers']//th")).size();
	}
	
	public static int getRowCount() {
		return driver.findElements(By.xpath("//table[@id='customers']//tr")).size();
	}
	
	public static List<String> getColHeaders() {
		List<WebElement> ColHeaders = driver.findElements(By.xpath("//table[@id='customers']//th"));
		List<String> ColHeadersArray = new ArrayList();
		
		for(WebElement e : ColHeaders) {
			String text = e.getText();
		//ystem.out.println(text);
			ColHeadersArray.add(text);
		}
		return ColHeadersArray;
	}
	
	public static List<String> getRowData() {
		List<WebElement> RowData = driver.findElements(By.xpath("//table[@id='customers']//tr"));
		List<String> RowDataArray = new ArrayList();
		
		for(WebElement e : RowData) {
			String text = e.getText();
		//ystem.out.println(text);
			RowDataArray.add(text);
		}
		return RowDataArray;
	}
	
	public static List<String> getSpecificColumnData(String columnName) {
		List<WebElement> columnData = driver.findElements(By.xpath("//th[text()='"+columnName+"']/parent::tr/following-sibling::tr/td[1]"));
		List<String> colNameData = new ArrayList();
		for(WebElement e : columnData) {
			String text = e.getText();
			//System.out.println(text);
			colNameData.add(text);
		}
		return colNameData;
	}
	
	//th[text()='Company']/parent::tr/following-sibling::tr/td[1]
	
	
	
	
	

}
