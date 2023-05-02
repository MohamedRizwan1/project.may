package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleClass {
	static int coloumValue;
	static int rowValue;
	
	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.guru99.com/test/web-table-element.php");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		int row = driver.findElements(By.xpath("//table[@class='dataTable']//tbody//tr")).size();
		System.out.println(row);
//
		int coloum = driver.findElements(By.xpath("//table[@class='dataTable']//tbody//tr[1]//td")).size();
		System.out.println(coloum);
//
//		for (int i = 1; i <= row; i++) {
//			for (int j = 1; j <= coloum; j++) {
//				WebElement coloumList = driver.findElement(By.xpath("//table[@class='dataTable']//tbody//tr[" + i + "]//td[" + j + "]"));
//				String coloumListName = coloumList.getText();
//
//				if (coloumListName.contains("Central")) {
//					System.out.println(i);
//					 coloumValue=j;
//					 rowValue=i;
//				}
//				
//
//			}
//
//		}
//		for (int k = 1; k <=coloum; k++) {
//			WebElement particular=driver.findElement(By.xpath("//table[@class='dataTable']//tbody//tr[" + rowValue + "]//td["+k+"]"));
//			String pr = particular.getText();
//			System.out.println(pr);
//		}

		
		List<WebElement> head = driver.findElements(By.xpath("//table[@class='dataTable']//thead//tr//th"));
		WebElement comp=driver.findElement(By.xpath("//table[@class='dataTable']//thead//tr//th[1]"));
		int numb = head.indexOf(comp)+1;
		
		for (int i = 1; i <=row; i++) {
			WebElement company=driver.findElement(By.xpath("//table[@class='dataTable']//tbody//tr["+i+"]//td["+numb+"]"));
			String allNames=company.getText();
			System.out.println(allNames);
		}
	}
	
	
}