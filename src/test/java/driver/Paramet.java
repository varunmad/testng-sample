package driver;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Paramet {
	WebDriver driver;
	@BeforeClass
	private void launch() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\new\\eclipse-workspace\\TestngSample\\src\\test\\java\\driver\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
		
		System.out.println("Launch");
	}
	
	@BeforeMethod
	private void startTime() {
		Date d=new Date();
		System.out.println(d);
		
	}
	@Parameters({"username","password"})
	@Test
	private void testcase1(String s1,String s2) {
		
		WebElement textuser = driver.findElement(By.id("email"));
		textuser.sendKeys(s1);
		WebElement textpass = driver.findElement(By.id("pass"));
		textpass.sendKeys(s2);
							}
	@AfterClass
	private void closeBrowser() {
	System.out.println("close");
	}
	}
		
	


