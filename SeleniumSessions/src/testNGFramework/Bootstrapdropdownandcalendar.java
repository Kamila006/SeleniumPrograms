package testNGFramework;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Bootstrapdropdownandcalendar {
	WebDriver driver;
	@Test 
	public void a_pageLoad()
	{
		System.setProperty("webdriver.chrome.driver", "E://seleniumAutomation//Essentials//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
	}
	@Test
	public void b_dropdown() throws InterruptedException
	{
		
		Thread.sleep(10000);
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		ArrayList <WebElement> dropIndiafrom = new ArrayList <WebElement> (driver.findElements(By.xpath("(//td[@class='mapbg'])[1]//ul/li/a")));
		for (WebElement Indiafrom:dropIndiafrom) {
			String IndiaDropdownValuesfrom = Indiafrom.getText();
			System.out.println(IndiaDropdownValuesfrom);
			if(IndiaDropdownValuesfrom.equalsIgnoreCase("Chennai (MAA)")) {
				Indiafrom.click();
				break;
			}
		}
		

		
	}

}
