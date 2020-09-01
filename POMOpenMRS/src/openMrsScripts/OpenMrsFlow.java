package openMrsScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import openMrsObjects.OpenMrsRepository;

public class OpenMrsFlow {
	WebDriver driver;

	@Test
	public void a_pageload() 
	{
		System.setProperty("webdriver.chrome.driver",
				"E://seleniumAutomation//Essentials//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demo.openmrs.org/openmrs/login.htm");
		driver.manage().window().maximize();
	}
	
	
	@Test
	public void b_OpenMrsRepository() throws InterruptedException
	{
		OpenMrsRepository open = PageFactory.initElements(driver, OpenMrsRepository.class);
		Thread.sleep(3000);
		open.Registrationbtn();
		open.Login();
		Thread.sleep(2000);
		open.registerDemographics();
		Thread.sleep(2000);
		open.registerContactInfo();
		open.registerRelationship();
		Thread.sleep(3000);
		open.confirmlink();
	}

}
