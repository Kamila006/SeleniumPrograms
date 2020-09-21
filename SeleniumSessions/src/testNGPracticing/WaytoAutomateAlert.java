package testNGPracticing;

import java.util.ArrayList;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WaytoAutomateAlert {
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
	public void d_alertfunction() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.findElement(By.xpath("//h2[text()='Alert']")).click();
		int framecount = driver.findElements(By.tagName("iframe")).size();
		System.out.println(framecount);
		
		try {
		driver.switchTo().frame(0);
		}catch(NoSuchFrameException e) {
			System.out.println("Handled NoSuchFrameException");
		}
		Thread.sleep(5000);
		String iframetext = driver.findElement(By.xpath("//button[contains(text(),'Click the button to display an alert box:')]")).getText();
		System.out.println(iframetext);
		Thread.sleep(4000);
		WebElement alertbtn = driver.findElement(By.xpath("//button[contains(text(),'Click the button to display an alert box:')]"));
		alertbtn.click();
		Alert aler = driver.switchTo().alert();
		String alerttext = aler.getText();
		System.out.println(alerttext);
		aler.accept();
	}
	@Test
	public void e_alertinputfunc() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.findElement(By.linkText("Input Alert")).click();
		//driver.findElement(By.xpath("//a[text()='Input Alert']")).click();
		try {
			driver.switchTo().frame(1);
		}catch(NoSuchFrameException e) {
			System.out.println("Handled NoSuchFrameException");
		}
		Thread.sleep(5000);
		String iframetext1 = driver.findElement(By.xpath("//button[contains(text(),'demonstrate the Input box.')]")).getText();
		System.out.println(iframetext1);
		Thread.sleep(4000);
		WebElement alertbtn1 = driver.findElement(By.xpath("//button[contains(text(),'demonstrate the Input box.')]"));
		alertbtn1.click();
		Thread.sleep(4000);
		Alert prompt = driver.switchTo().alert();
		String alerttext1 = prompt.getText();
		System.out.println(alerttext1);
		prompt.sendKeys("divya");
		prompt.accept();
		
		
	}
	
	
	

}
