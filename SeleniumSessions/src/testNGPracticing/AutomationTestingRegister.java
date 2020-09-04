package testNGPracticing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class AutomationTestingRegister {
	WebDriver driver;
	
	@Test
	public void a_pageload()
	{
		System.setProperty("webdriver.chrome.driver", "E://seleniumAutomation//Essentials//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Index.html");
		driver.manage().window().maximize();
	}
	//Skipping Sign In
	@Test
	public void b_skipSignIn()
	{
		WebElement skipbtn = driver.findElement(By.id("btn2"));
		skipbtn.click();
	}
	
	//Filling Registeration Form
    @Test
    public void c_register() throws InterruptedException
    {
    	Thread.sleep(50000);
    	//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    	/*WebDriverWait wait = new WebDriverWait(driver,5);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='Full Name* ']/following::div[1]"))).sendKeys("Karthick");*/
    	driver.findElement(By.xpath("//label[text()='Full Name* ']/following::div[1]")).sendKeys("Karthick");
    	driver.findElement(By.xpath("//label[text()='Full Name* ']/following::div[2]")).sendKeys("Kumar");
    	driver.findElement(By.xpath("//label[text()='Address']/following::div[1]")).sendKeys("chennai");
    	driver.findElement(By.xpath("//label[text()='Email address*']/following::div[1]")).sendKeys("sep02@yopmail.com");
    	driver.findElement(By.xpath("//label[text()='Phone*']/following::div[1]")).sendKeys("9732345173");
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//label[text()='Gender*']/following::input[1]")).click();
    	driver.findElement(By.xpath("//input[@id='checkbox2']")).click();
    	driver.findElement(By.xpath("//div[@id='msdd']")).sendKeys("English");
    	Select skills = new Select(driver.findElement(By.id("Skills")));
    	skills.selectByVisibleText("End User Support");
    	Select country = new Select(driver.findElement(By.id("countries")));
    	country.selectByVisibleText("India");
    	driver.findElement(By.xpath("//label[text()='Select Country :']/following::span[1]")).click();
    	Actions act = new Actions(driver);
    	for(int i =1;i<=5;i++)
    	{
    		Thread.sleep(2000);
    		act.sendKeys(Keys.ARROW_DOWN).build().perform();
    	}
    	act.sendKeys(Keys.ENTER).build().perform();
    	
    }
}
