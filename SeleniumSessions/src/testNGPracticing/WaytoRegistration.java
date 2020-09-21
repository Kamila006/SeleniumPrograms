package testNGPracticing;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class WaytoRegistration {
	WebDriver driver;
	@Test
	public void a_pageload()
	{
		System.setProperty("webdriver.chrome.driver", "E://seleniumAutomation//Essentials//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.way2automation.com/demo.html");
		driver.manage().window().maximize();
	}
	
	@Test
	public void b_alert()
	{
		driver.findElement(By.xpath("//h2[text()='Alert']")).click();
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
	}
	@Test
	public void c_Login() throws InterruptedException
	{
		driver.findElement(By.xpath("//a[text()='Signin']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@name='username'])[2]")).sendKeys("Divya04");
		driver.findElement(By.xpath("(//input[@name='password'])[2]")).sendKeys("Pinky@06");
		WebElement submitbtn = driver.findElement(By.xpath("(//input[@class='button'])[2]"));
		submitbtn.click();
	}
	
	@Test
	public void d_registration() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.findElement(By.xpath("//h2[text()='Registration']")).click();
		driver.findElement(By.name("name")).sendKeys("Priya");
		driver.findElement(By.xpath("//label[text()='Last Name:']/following::input[1]")).sendKeys("Devi");
		WebElement martialstatuscheck = driver.findElement(By.xpath("//label[text()='Marital Status:']/following::input[1]"));
		martialstatuscheck.click();
		WebElement Hobbycheck = driver.findElement(By.xpath("//label[text()=' Reading']"));
		Hobbycheck.click();
		Thread.sleep(3000);
		Select country = new Select(driver.findElement(By.xpath("//label[text()='Country:']/following::select[1]")));
		country.selectByVisibleText("India");
		Select months = new Select(driver.findElement(By.xpath("//label[text()='Date of Birth:']/following::select[1]")));
		months.selectByVisibleText("1");
		Select day = new Select(driver.findElement(By.xpath("//label[text()='Date of Birth:']/following::select[2]")));
		day.selectByVisibleText("1");
		Select year = new Select(driver.findElement(By.xpath("//label[text()='Date of Birth:']/following::select[3]")));
		year.selectByVisibleText("2014");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()='Phone Number:']/following::input[1]")).sendKeys("9945235123");
		driver.findElement(By.name("username")).sendKeys("Priya06");
		driver.findElement(By.name("email")).sendKeys("sep_21@yopmail.com");
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(5000);
		WebElement fileupload = driver.findElement(By.xpath("//label[text()='Your Profile Picture']/following::input[1]"));
		fileupload.sendKeys("C://Users//Public//Pictures//Sample Pictures//Tulips.jpg");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()='About Yourself']/following::textarea")).sendKeys("Hi I am Priya looking for a opportunity");
		driver.findElement(By.name("password")).sendKeys("Pinky@06");
		driver.findElement(By.name("c_password")).sendKeys("Pinky@06");
		WebElement submitbtn = driver.findElement(By.xpath("//label[text()='Confirm Password:']/following::input[2]"));
		submitbtn.click();
		
		
	}

}
