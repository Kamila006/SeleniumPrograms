package swagsLabsScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import swagsLabObjects.SwagsLabsRepository;

public class SwagsLabsFlow {
	WebDriver driver;
	
	@Test
	public void a_pageload()
	{
		System.setProperty("webdriver.chrome.driver", "E://seleniumAutomation//Essentials//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/index.html");
		driver.manage().window().maximize();
	}
	
	@Test
	public void b_SwagsLabsRepository() throws InterruptedException
	{
		SwagsLabsRepository swags = PageFactory.initElements(driver, SwagsLabsRepository.class);
		Thread.sleep(2000);
		swags.Loginlink();
		Thread.sleep(2000);
		swags.AddItem();
	}

}
