package testNGPracticing;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class FlipKartSareeSelection {
	WebDriver driver;
	@Test
	public void a_pageload() 
	{
		System.setProperty("webdriver.chrome.driver", "E://seleniumAutomation//Essentials//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
	}
	@Test
	public void b_loginLayerclose()
	{
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
	}
	@Test
	public void c_search() throws InterruptedException
	{
		WebElement women = driver.findElement(By.xpath("//span[text()='Women']"));
		Actions act = new Actions(driver);
		act.moveToElement(women).build().perform();
		driver.findElement(By.xpath("//span[text()='Ethnic Wear']/following::a[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Woven Fashion')]")).click();
		
	}
	@Test
	public void d_addtocart() throws InterruptedException
	{
		ArrayList <String> sareestab = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(sareestab.get(1));
		driver.findElement(By.xpath("//span[text()='Check']/preceding::input[1]")).sendKeys("600099");
		driver.findElement(By.xpath("//span[text()='Check']")).click();
		Thread.sleep(2000);
		WebElement addbtn = driver.findElement(By.xpath("//button[text()='ADD TO CART']"));
		addbtn.click();
	}

}
