package org.test;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleClass2 {
	public static void main(String[] args) throws Exception {

		// System.setProperty("WebDriver.chrome.driver",
		// "C:\\Users\\RIZWAN\\eclipse-workspace\\MavenProjectSampleVersion\\src\\main\\resources\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();

		driver.navigate().to("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//button[text()='✕']")).click();
		WebElement search = driver.findElement(By.xpath("//input[@name='q']"));

		
		driver.executeScript("arguments[0].setAttribute('Style','background: yellow')", search);
		search.sendKeys("Redmi mobiles", Keys.ENTER);
	
	driver.findElement(By.xpath("(//div[@class='_4rR01T'])[2]")).click();
		
	}
}

		



