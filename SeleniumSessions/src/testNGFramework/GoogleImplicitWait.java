package testNGFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class GoogleImplicitWait {
	WebDriver driver;
	@Test 
	public void a_pageLoad()
	{
		System.setProperty("webdriver.chrome.driver", "E://seleniumAutomation//Essentials//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	}
	@Test
	public void b_search()
	{
		driver.findElement(By.name("q")).sendKeys("kamila");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ENTER).build().perform();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//h3[contains(text(),'KAMILA (@kamilaofficiel)')]")).click();
	}
	

}
