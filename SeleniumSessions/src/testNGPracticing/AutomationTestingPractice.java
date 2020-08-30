package testNGPracticing;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class AutomationTestingPractice {
	
	WebDriver driver;
	
	@Test
	public void a_pageload() throws InterruptedException
	{
		Thread.sleep(5000);
		System.setProperty("webdriver.chrome.driver", "E://seleniumAutomation//Essentials//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		//driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.MILLISECONDS);
		driver.get("http://practice.automationtesting.in/my-account/");
		driver.manage().window().maximize();
	}
	
	//Register
	@Test
	public void b_register()
	{
		driver.findElement(By.id("reg_email")).sendKeys("aug28@yopmail.com");
		driver.findElement(By.id("reg_password")).sendKeys("Kamila@06");
		WebElement reg =driver.findElement(By.name("register"));
		reg.click();
	}
	
	//Shopping,Sorting
	@Test
	public void c_shop() throws InterruptedException
	{
		driver.findElement(By.xpath("//a[text()='Shop']")).click();
		Thread.sleep(2000);
		Select sort = new Select(driver.findElement(By.name("orderby")));
		sort.selectByVisibleText("Sort by popularity");
		
		
	}

}
