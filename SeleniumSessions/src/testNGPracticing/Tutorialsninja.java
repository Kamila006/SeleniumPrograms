package testNGPracticing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Tutorialsninja {
	WebDriver driver;
	
	//PageLoad
	@Test
	public void a_pageload()
	{
		System.setProperty("webdriver.chrome.driver", "E://seleniumAutomation//Essentials//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://tutorialsninja.com/demo/");
		driver.manage().window().maximize();
	}
	// Selecting MP3 Players
	@Test
	public void b_selectingMP()
	{
		WebElement mpplayers = driver.findElement(By.xpath("(//a[contains(text(),'MP3 Players')])[1]"));
		Actions act = new Actions(driver);
		act.moveToElement(mpplayers).build().perform();
		driver.findElement(By.xpath("//a[text()='test 20 (0)']")).click();
		
		
	}

}
