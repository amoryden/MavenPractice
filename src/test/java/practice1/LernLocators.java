package practice1;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LernLocators {
	WebDriver driver;

	@Before
	public void init() {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://objectspy.space/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
		@Test
		public void testLocators() {
			
			driver.findElement(By.name("firstname")).sendKeys("Selenium");
			driver.findElement(By.id("sex-1")).click();
			driver.findElement(By.id("photo")).sendKeys("C:\\Users\\amrei\\OneDrive\\Documents\\Ayman Mreiden.docx");
			driver.findElement(By.linkText("OS-API Product FrontEnd")).click();
			driver.navigate().back();
			driver.findElement(By.partialLinkText("TF-API")).click();
			driver.navigate().back();
			driver.findElement(By.cssSelector("input#tool-2")).click();
			driver.findElement(By.cssSelector("input[id='profession-1']")).click();
			driver.findElement(By.cssSelector("a[href='http://techfios.com/api-prod/api/']")).click();
			driver.navigate().back();
			
//			driver.findElement(By.xpath("html/body/div/div[2]/div[2]/form/div[10]/input")).sendKeys("feb23");
			driver.findElement(By.xpath("//input[@name='lastname'and @type='text']")).sendKeys("is fun");
			driver.findElement(By.xpath("//strong[contains(text(),'Link Test : Page Change')]")).click();
			
			
	
		
		
		
	}
//		@After
		public void tearDown() {
			
			driver.close();
			driver.quit();
		}

}
