package testNGPracticing;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoBlaze {
	
	WebDriver driver;
	
	@Test
	public void a_pageload()
	{
		System.setProperty("webdriver.chrome.driver", "E://seleniumAutomation//Essentials//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demoblaze.com/index.html");
		driver.manage().window().maximize();
	}
	
	@Test
	public void b_signUp() throws InterruptedException
	{
		driver.findElement(By.xpath("//a[text()='Sign up']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("sign-username")).sendKeys("AugappleAK");
		driver.findElement(By.id("sign-password")).sendKeys("August!123");
		WebElement signupbtn = driver.findElement(By.xpath("//button[text()='Sign up']"));
		signupbtn.click();
		Thread.sleep(2000);
		Alert aler = driver.switchTo().alert();
		aler.accept();
	}
	
	@Test
	public void c_login() throws InterruptedException
	{
		driver.findElement(By.id("login2")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("loginusername")).sendKeys("AugappleAK");
		driver.findElement(By.id("loginpassword")).sendKeys("August!123");
		WebElement loginbtn = driver.findElement(By.xpath("//button[text()='Log in']"));
		loginbtn.click();
	}
	@Test
	public void d_categories() throws InterruptedException
	{
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Laptops']")).click();
		driver.findElement(By.id("next2")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='2017 Dell 15.6 Inch']")).click();
	}
	@Test
	public void e_add() throws InterruptedException
	{
		
		Thread.sleep(3000);
		WebElement addbtn = driver.findElement(By.xpath("//a[contains(text(),'Add')]"));
		addbtn.click();
		Thread.sleep(3000);
		Alert aler1 = driver.switchTo().alert();
		String text1 = aler1.getText();
		System.out.println(text1);
		aler1.accept();
	}

}
