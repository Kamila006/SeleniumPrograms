package testNGPracticing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SpiceJetVerification {
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
	public void b_verification() throws InterruptedException
	{
		Thread.sleep(10000);
		WebElement multiplecheck = driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_2"));
		multiplecheck.click();
		driver.findElement(By.id("MultiCityModelAlert")).click();
		Boolean multicity = multiplecheck.isEnabled();
		System.out.println(multicity);
		WebElement familycheckbox = driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily"));
		familycheckbox.click();
		Boolean familyfrndscheck = familycheckbox.isSelected();
		System.out.println(familyfrndscheck);
		WebElement snrcitizencheck = driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount"));
		snrcitizencheck.click();
		Boolean seniorchk = snrcitizencheck.isSelected();
		System.out.println(seniorchk);
		Boolean infocheck = driver.findElement(By.xpath("//span[text()='Flight Status']")).isDisplayed();
		System.out.println(infocheck);
	}

}
