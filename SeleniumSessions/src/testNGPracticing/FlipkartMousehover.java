package testNGPracticing;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class FlipkartMousehover {
	WebDriver driver;
	@Test 
	public void a_pageLoad()
	{
		System.setProperty("webdriver.chrome.driver", "E://seleniumAutomation//Essentials//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
	}
	
	@Test 
	public void b_loginLayerClose()
	{
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
	}
	@Test 
	public void c_homeMouseHover() throws InterruptedException
	{
		WebElement home = driver.findElement(By.xpath("//span[contains(text(),'Home & Furniture')]"));
		Actions act = new Actions(driver);
		act.moveToElement(home).build().perform();
		driver.findElement(By.xpath("//a[text()='Wall Lamp']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[text()='Afast Pendant Wall Lamp'])[1]")).click();
	}
	@Test
	public void d_producttab() throws InterruptedException
	{
		ArrayList <String> walllamptab = new ArrayList <String>(driver.getWindowHandles());
		driver.switchTo().window(walllamptab.get(1));
		driver.findElement(By.id("pincodeInputId")).sendKeys("600099");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(3000);
		WebElement addbtn = driver.findElement(By.xpath("//span[text()='Add 3 Items to Cart']"));
		addbtn.click();	
		
	}

}
