package testNGPracticing;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SearchingProductTutorials {
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
	
	//Selecting a Product
	@Test
	public void b_search()
	{
		driver.findElement(By.name("search")).sendKeys("Mac");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ENTER).build().perform();
	}
	
	//Adding product and to wishlist
	@Test
	public void c_adding() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement add = driver.findElement(By.xpath("(//span[text()='Add to Cart'])[2]"));
		Thread.sleep(2000);
		add.click();
		WebElement add1 = driver.findElement(By.xpath("(//span[text()='Add to Cart'])[4]"));
		Thread.sleep(2000);
		add1.click();
		Thread.sleep(3000);
		WebElement prod =driver.findElement(By.xpath("(//div[@class='button-group'])[2]/following::button[2]"));
		Thread.sleep(2000);
		prod.click();
	}

}
