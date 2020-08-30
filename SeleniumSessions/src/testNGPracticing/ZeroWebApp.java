package testNGPracticing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ZeroWebApp {

	    WebDriver driver;
		@Test (priority = 1)
		public void pageLoad()
		{
			System.setProperty("webdriver.chrome.driver", "E://seleniumAutomation//Essentials//chromedriver_win32//chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("http://zero.webappsecurity.com/index.html");
			driver.manage().window().maximize();
		}
		
		@Test (priority = 2)
		public void signIn()
		{
			WebElement signin = driver.findElement(By.id("signin_button"));
			signin.click();
		}
		
		@Test (priority = 3)
		public void loginPage()
		{
			driver.findElement(By.id("user_login")).sendKeys("username");
			driver.findElement(By.id("user_password")).sendKeys("password");
			WebElement submitbtn = driver.findElement(By.name("submit"));
			submitbtn.click();
			
		}
		
		@Test (priority = 4)
		public void logOut() throws InterruptedException
		{
			Thread.sleep(5000);
			driver.findElement(By.xpath("//i[@class='icon-user']")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("logout_link")).click();
		}
		
		

}
