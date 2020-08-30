package testNGPracticing;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class FlipkartsearchByKeyboardAction {

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
	public void c_search()
	{
		driver.findElement(By.name("q")).sendKeys("mobiles");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ENTER).build().perform();
	}
	@Test
	public void d_chosenMobile() throws InterruptedException
	{
		Thread.sleep(10000);
		WebElement mobilename1 = driver.findElement(By.xpath("//div[text()='Redmi 8 (Ruby Red, 64 GB)']"));
		mobilename1.click();
		ArrayList <String> redmimobiletab = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(redmimobiletab.get(1));
		String mobname = driver.findElement(By.xpath("//span[text()='Redmi 8 (Ruby Red, 64 GB)']")).getText();
		System.out.println(mobname);
		driver.findElement(By.className("_3X4tVa")).sendKeys("600099");
		driver.findElement(By.xpath("//span[text()='Check']")).click();
		WebElement addbutton = driver.findElement(By.xpath("(//button[@class='_2AkmmA _1wk2G8 _2HNZdt _7UHT_c'])[1]"));
		addbutton.click();
		
	}
}
