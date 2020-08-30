package testNGFramework;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ZeroWebScreenShot {
	 WebDriver driver;
		@Test 
		public void a_pageLoad()
		{
			System.setProperty("webdriver.chrome.driver", "E://seleniumAutomation//Essentials//chromedriver_win32//chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("http://zero.webappsecurity.com/index.html");
			driver.manage().window().maximize();
		}
		
		@Test 
		public void b_signIn()
		{
			WebElement signin = driver.findElement(By.id("signin_button"));
			signin.click();
		}
		
		@Test 
		public void c_loginPage() throws IOException
		{
			driver.findElement(By.id("user_login")).sendKeys("username");
			driver.findElement(By.id("user_password")).sendKeys("password");
			WebElement submitbtn = driver.findElement(By.name("submit"));
			submitbtn.click();
			d_getscreenshot();
			
		}
		public void d_getscreenshot() throws IOException 
		{
			File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile, new File("E:\\seleniumAutomation\\Screenshots\\Screenshot" +System.currentTimeMillis()+ ".png"));
		}
		

}
