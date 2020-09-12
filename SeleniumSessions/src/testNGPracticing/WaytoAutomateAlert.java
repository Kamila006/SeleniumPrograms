package testNGPracticing;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WaytoAutomateAlert {
	WebDriver driver;
	@Test
	public void a_pageload()
	{
		System.setProperty("webdriver.chrome.driver", "E://seleniumAutomation//Essentials//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.way2automation.com/demo.html");
		driver.manage().window().maximize();
	}
	
	@Test
	public void b_alert()
	{
		driver.findElement(By.xpath("//h2[text()='Alert']")).click();
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
	}
	@Test
	public void c_Login() throws InterruptedException
	{
		driver.findElement(By.xpath("//a[text()='Signin']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@name='username'])[2]")).sendKeys("Divya04");
		driver.findElement(By.xpath("(//input[@name='password'])[2]")).sendKeys("Pinky@06");
		WebElement submitbtn = driver.findElement(By.xpath("(//input[@class='button'])[2]"));
		submitbtn.click();
	}
	@Test
	public void d_alertfunction()
	{
		
	}
	
	

}
