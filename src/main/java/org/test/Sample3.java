package org.test;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.apache.commons.exec.launcher.CommandLauncher;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Sleeper;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample3 {
	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		

		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");

		driver.manage().windows().maximize();
		WebElement dropDown = driver.findElement(By.xpath("//select[@id='first']"));
		Select s = new Select(dropDown);
		s.selectByIndex(1);
		Thread.sleep(2000);
		s.selectByValue("Yahoo");
		Thread.sleep(2000);
		s.selectByVisibleText("Bing");

		List<WebElement> li = s.getOptions();
		for (int i = 0; i < li.size(); i++) {
			WebElement list = li.get(i);
			String so = list.getText();
			System.out.println(so);
		}

		WebElement animals = driver.findElement(By.xpath("//select[@id='animals']"));
		Select s1 = new Select(animals);
		s1.selectByVisibleText("Avatar");
		JavascriptExecutor js = (JavascriptExecutor) driver;


		WebElement multi = driver.findElement(By.xpath("//select[@id='second']"));
		Select se = new Select(multi);
		se.selectByIndex(0);
		se.selectByValue("burger");
		se.selectByVisibleText("Bonda");
		js.executeScript("arguments[0].setAttribute('style','background:yellow')", se);

	}
}
