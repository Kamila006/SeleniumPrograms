package testNGPracticing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Tutorialsninjaregistration {
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
	public void b_components() throws InterruptedException
	{
		WebElement component =driver.findElement(By.xpath("//a[text()='Components']"));
		Actions act = new Actions(driver);
		act.moveToElement(component).build().perform();
		driver.findElement(By.xpath("(//a[contains(text(),'Show All')])[3]")).click();
		Thread.sleep(3000);
	}
	
	//Expanded show all components
	@Test
	public void c_monitor()
	{
		driver.findElement(By.xpath("(//a[contains(text(),'Monitors')])[3]")).click();
	}
	
	//Adding the Wishlist
	@Test
	public void d_addingwishlist() throws InterruptedException
	{
		WebElement wishlist = driver.findElement(By.xpath("//div[@class='button-group']/following::button[2]"));
		Thread.sleep(2000);
		wishlist.click();
		Thread.sleep(3000);
	}
	//Clicking on account creation
	@Test
	public void e_accountcreation() throws InterruptedException
	{
		driver.findElement(By.xpath("//a[text()='create an account']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("input-firstname")).sendKeys("Kamila");
		driver.findElement(By.id("input-lastname")).sendKeys("Kausar");
		driver.findElement(By.id("input-email")).sendKeys("aug_23@yopmail.com");
		driver.findElement(By.name("telephone")).sendKeys("9834522345");
		driver.findElement(By.id("input-password")).sendKeys("Aug!123");
		driver.findElement(By.name("confirm")).sendKeys("Aug!123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@name='newsletter'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='agree']")).click();
		WebElement contbtn= driver.findElement(By.xpath("//input[@name='agree']/following::input"));
		Thread.sleep(2000);
		contbtn.click();
	}
	
	//Clicking on continue link
	@Test
	public void f_continue()
	{
		driver.findElement(By.xpath("//a[text()='Continue']")).click();
	}

}
