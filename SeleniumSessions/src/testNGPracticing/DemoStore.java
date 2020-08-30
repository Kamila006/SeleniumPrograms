package testNGPracticing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DemoStore {
	WebDriver driver;
	@Test
	public void a_pageLoad() 
	{
		System.setProperty("webdriver.chrome.driver", "E://seleniumAutomation//Essentials//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demostore.x-cart.com/?target=cart");
		driver.manage().window().maximize();
	}
	@Test
	public void b_signup() throws InterruptedException
	{
		WebElement signup = driver.findElement(By.xpath("(//span[text()='Sign in / sign up'])[2]"));
		Thread.sleep(3000);
		signup.click();
	}
	@Test
	public void c_register() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[text()='Sign in'])[2]/following::a[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("login")).sendKeys("sunda16@yopmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("aug!123");
		driver.findElement(By.id("password-conf")).sendKeys("aug!123");
		WebElement createbtn = driver.findElement(By.xpath("//span[text()='Create']"));
		Thread.sleep(3000);
		createbtn.click();
	}
	
	@Test
	public void d_hotDeals() throws InterruptedException
	{
		Thread.sleep(5000);
		WebElement hotdeal = driver.findElement(By.xpath("(//span[text()='Hot deals'])[2]"));
		Actions act = new Actions(driver);
		act.moveToElement(hotdeal).build().perform();
		driver.findElement(By.xpath("(//span[text()='Bestsellers'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Multicolored Dress')]")).click();
		Thread.sleep(2000);
		WebElement addbtn = driver.findElement(By.xpath("(//span[text()='Add to cart'])[1]"));
		addbtn.click();
	}
	@Test
	public void e_viewProduct() throws InterruptedException
	{
		Thread.sleep(5000);
		WebElement viewbtn = driver.findElement(By.xpath("(//span[text()='View cart'])[2]"));
		viewbtn.click();
	}
	
	@Test
	public void f_checkoutProduct()
	{
		WebElement checkbtn = driver.findElement(By.xpath("//span[text()='Go to checkout']"));
		checkbtn.click();
	}
	
	@Test
	public void g_placeOrder() throws InterruptedException
	{
		driver.findElement(By.id("shippingaddress-firstname")).sendKeys("Kamila");
		driver.findElement(By.id("shippingaddress-lastname")).sendKeys("kausar");
		driver.findElement(By.id("shippingaddress-street")).sendKeys("159 Riverside Road");
		driver.findElement(By.id("shippingaddress-city")).clear();
		driver.findElement(By.id("shippingaddress-city")).sendKeys("Los Angeles");
		Thread.sleep(2000);
		Select country = new Select(driver.findElement(By.id("shippingaddress-country-code")));
		country.selectByVisibleText("United States");
		Thread.sleep(2000);
		Select state = new Select(driver.findElement(By.id("shippingaddress-state-id")));
		state.selectByVisibleText("California");
		driver.findElement(By.id("shippingaddress-zipcode")).clear();
		driver.findElement(By.id("shippingaddress-zipcode")).sendKeys("90001");
		driver.findElement(By.id("shippingaddress-phone")).sendKeys("5666034556");
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("sunda16@yopmail.com");
	}
	
	
	@Test (enabled = false)
	public void d_logOut() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='My account']/following::a[4]")).click();
	}
	
	@Test (enabled = false)
	public void e_signIn() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.id("login-email")).clear();
		driver.findElement(By.id("login-email")).sendKeys("augsund@yopmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("login-password")).sendKeys("aug!123");
		Thread.sleep(2000);
		WebElement signbtn = driver.findElement(By.xpath("(//span[text()='Sign in'])[2]"));
		signbtn.click();
		
	}

}
