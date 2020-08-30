package testNGFramework;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class autoITFileUpload {
	WebDriver driver;
	@Test 
	public void a_pageLoad()
	{
		System.setProperty("webdriver.chrome.driver", "E://seleniumAutomation//Essentials//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://tinyupload.com/");
		driver.manage().window().maximize();
	}
	@Test
	public void b_fileUpload() throws InterruptedException, IOException
	{
		WebElement upload = driver.findElement(By.name("uploaded_file"));
		Actions act = new Actions(driver);
		act.moveToElement(upload).click().build().perform();
		Thread.sleep(5000);
		Runtime.getRuntime().exec("E://seleniumAutomation//AutoIt//FileUploadScript.exe");
		
		
	}
	

}
