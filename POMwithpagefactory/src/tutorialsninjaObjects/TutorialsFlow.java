package tutorialsninjaObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import scriptsfortutorials.TutorialsRepository;

public class TutorialsFlow {
	WebDriver driver;

	@Test
	public void a_pageload() 
	{
		System.setProperty("webdriver.chrome.driver",
				"E://seleniumAutomation//Essentials//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://tutorialsninja.com/demo/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void b_functional()
	{
		TutorialsRepository tutorials = PageFactory.initElements(driver, TutorialsRepository.class);
		tutorials.accountlink();
	}

}
