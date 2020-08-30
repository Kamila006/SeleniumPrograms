package testNGPracticing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DigitalBankFlow {
	
	WebDriver driver;
	@Test
	public void a_pageload()
	{
		System.setProperty("webdriver.chrome.driver", "E://seleniumAutomation//Essentials//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://dbankdemo.com/login");
		driver.manage().window().maximize();
	}
	@Test
	public void b_signUp()
	{
		driver.findElement(By.xpath("//a[text()=' Sign Up Here']")).click();
	}

	@Test
	public void c_registrationform() throws InterruptedException
	{
		Select title = new Select (driver.findElement(By.id("title")));
		title.selectByVisibleText("Mrs.");
		driver.findElement(By.id("firstName")).sendKeys("Kamila");
		driver.findElement(By.id("lastName")).sendKeys("Kausar");
		WebElement gender = driver.findElement(By.xpath("(//input[@id='gender'])[2]"));
		Thread.sleep(3000);
		gender.click();
		driver.findElement(By.id("dob")).sendKeys("08/17/1990");
		driver.findElement(By.id("ssn")).sendKeys("156-66-6689");
		driver.findElement(By.id("emailAddress")).sendKeys("Augsun_16@yopmail.com");
		driver.findElement(By.id("password")).sendKeys("Pinky@06");
		driver.findElement(By.id("confirmPassword")).sendKeys("Pinky@06");
		WebElement nextbtn =driver.findElement(By.xpath("//button[text()='Next']"));
		nextbtn.click();
	}
	@Test
	public void d_nextLevelForm() throws InterruptedException
	{
		driver.findElement(By.id("address")).sendKeys("No,30 RC Apartments,kolathur");
		driver.findElement(By.id("locality")).sendKeys("North Chennai");
		driver.findElement(By.id("region")).sendKeys("chennai");
		driver.findElement(By.id("postalCode")).sendKeys("54007");
		driver.findElement(By.id("country")).sendKeys("India");
		driver.findElement(By.id("homePhone")).sendKeys("04424565577");
		driver.findElement(By.id("mobilePhone")).sendKeys("9123753688");
		driver.findElement(By.id("workPhone")).sendKeys("04421635255");
		WebElement agreecheckbox = driver.findElement(By.id("agree-terms"));
		Thread.sleep(3000);
		agreecheckbox.click();
		WebElement registerbtn = driver.findElement(By.xpath("//button[text()='Register']"));
		registerbtn.click();
	}
	@Test
	public void e_login() throws InterruptedException
	{
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys("Augsun_16@yopmail.com");
		driver.findElement(By.id("password")).sendKeys("Pinky@06");
		WebElement signinbtn = driver.findElement(By.xpath("//button[text()='Sign in']"));
		Thread.sleep(2000);
		signinbtn.click();
	}
	@Test
	public void f_checking() throws InterruptedException
	{
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[text()='Checking']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='New Checking']")).click();
		WebElement accttypecheckbox = driver.findElement(By.xpath("//input[@id='Standard Checking']"));
		Thread.sleep(3000);
		accttypecheckbox.click();
		WebElement acctownership = driver.findElement(By.xpath("//input[@id='Individual']"));
		Thread.sleep(2000);
		acctownership.click();
		driver.findElement(By.id("name")).sendKeys("KK");
		driver.findElement(By.id("openingBalance")).sendKeys("4000");
		WebElement submitbtn = driver.findElement(By.xpath("//button[text()=' Submit']"));
		Thread.sleep(2000);
		submitbtn.click();
	}
	@Test
	public void g_transactions() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Transactions']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Deposit']")).click();
		Select acctdepositdrop = new Select(driver.findElement(By.name("id")));
		acctdepositdrop.selectByVisibleText("KK  -  (Standard Checking)  -  ($4000.00)");
		Thread.sleep(3000);
		driver.findElement(By.id("amount")).sendKeys("8000");
		WebElement submitbtn = driver.findElement(By.xpath("//button[text()=' Submit']"));
		Thread.sleep(2000);
		submitbtn.click();
	}
	@Test
	public void h_search()
	{
		driver.findElement(By.xpath("//label[text()='Search:']")).sendKeys("8000");
	}
	@Test
	public void i_withdraw() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Transactions']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Withdraw']")).click();
		Select acctwithdraw = new Select(driver.findElement(By.name("id")));
		acctwithdraw.selectByVisibleText("KK  -  (Standard Checking)  -  ($12000.00)");
		Thread.sleep(3000);
		driver.findElement(By.id("amount")).sendKeys("500");
		WebElement submitbtn = driver.findElement(By.xpath("//button[text()=' Submit']"));
		Thread.sleep(2000);
		submitbtn.click();
	}
	@Test
	public void j_logOut() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@id='right-panel']/descendant::img[1]s")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
	}
}

