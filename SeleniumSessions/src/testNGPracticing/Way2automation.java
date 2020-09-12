package testNGPracticing;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Way2automation {

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
	public void b_selectable()
	{
		driver.findElement(By.xpath("//h2[text()='Selectable']")).click();
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
	public void d_countofboxes() throws InterruptedException
	{
		Thread.sleep(2000);
		List<WebElement> countbox = driver.findElements(By.xpath("//h3[contains(text(),' Many more')]/following::h2"));
		System.out.println(countbox.size());
	}
	
	@Test
	public void d_countofwidget()
	{
		List<WebElement> widgetcount = driver.findElements(By.xpath("//div[@class='row']//div[2]//ul[1]//h2"));
		System.out.println(widgetcount.size());
	}
	
	@Test
	public void e_dropdownclick()
	{
		driver.findElement(By.xpath("//h2[text()='Dropdown']")).click();
		String dropdowntext = driver.findElement(By.xpath("//h2[text()='Dropdown']")).getText();
		System.out.println(dropdowntext);
	}
	/*@Test
	public void c_RegistrationForm() throws InterruptedException
	{
		
		Thread.sleep(3000);
		driver.findElement(By.name("name")).sendKeys("Divya");
		driver.findElement(By.name("phone")).sendKeys("9834522213");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sep04@yopmail.com");
		Select country = new Select(driver.findElement(By.name("country")));
		country.selectByVisibleText("United Arab Emirates");
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Dubai");
		driver.findElement(By.xpath("(//input[@name='username'])[2]")).sendKeys("Divya04");
		driver.findElement(By.xpath("(//input[@name='password'])[2]")).sendKeys("Pinky@06");
		WebElement btn = driver.findElement(By.xpath("//p[contains(text(),'Already')]/following::input"));
		btn.click();
	}*/
	
	
}
