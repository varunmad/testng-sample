package driver;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Sample2 {
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
	@Parameters("username")
	@Test
	private void testcase1() {
		String title = driver.getTitle();
		Assert.assertTrue(title.contains("Facebook"));
		WebElement textuser = driver.findElement(By.id("email"));
		textuser.sendKeys("s1");
		String name = textuser.getAttribute("value");
		Assert.assertEquals("verify password", "sathish",name);
	
		
	}
	@Parameters("password")
	@Test
	private void testcase2() {
		String url = driver.getCurrentUrl();
		SoftAssert s=new SoftAssert();
		s.assertTrue(url.contains("Facebook"));
		
		WebElement textpass = driver.findElement(By.id("pass"));
	textpass.sendKeys("987654321");
	String pass = textpass.getAttribute("value");
	Assert.assertEquals("verify password", "987654321",pass);
		
	}
	@Test
	private void testcase3() {
WebElement btnlogin = driver.findElement(By.id("u_o_b"));
btnlogin.click();
	}
	
	

	@AfterClass
	private void closeBrowser() {
	System.out.println("close");
	}
	}


