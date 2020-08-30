package testNGPracticing;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class JpetStore {
	
	WebDriver driver;
	@Test 
	public void a_pageLoad()
	{
		System.setProperty("webdriver.chrome.driver", "E://seleniumAutomation//Essentials//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://petstore.octoperf.com/actions/Catalog.action");
		driver.manage().window().maximize();
	}
	
	@Test 
	public void b_signIn()
	{
		driver.findElement(By.xpath("//a[text()='Sign In']")).click();
	}
	
	@Test 
	public void c_registerNow()
	{
		driver.findElement(By.xpath("//a[text()='Register Now!']")).click();
	}
	@Test 
	public void d_userInformation()
	{
		driver.findElement(By.name("username")).sendKeys("KamilaKausar");
		driver.findElement(By.name("password")).sendKeys("Pinky@006");
		driver.findElement(By.name("repeatedPassword")).sendKeys("Pinky@006");
	}
	@Test 
	public void e_accountInfo() throws InterruptedException
	{
		driver.findElement(By.name("account.firstName")).sendKeys("kamila");
		driver.findElement(By.name("account.lastName")).sendKeys("kausar");
		driver.findElement(By.name("account.email")).sendKeys("augustfriday_14@yopmail.com");
		driver.findElement(By.name("account.phone")).sendKeys("9123456678");
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		act.sendKeys(Keys.TAB,"Kolathur").build().perform();
		act.sendKeys(Keys.TAB,"Sub Kolathu").build().perform();
		act.sendKeys(Keys.TAB,"Chennai").build().perform();
		act.sendKeys(Keys.TAB,"Tamil Nadu").build().perform();
		act.sendKeys(Keys.TAB,"60009").build().perform();
		act.sendKeys(Keys.TAB,"India").build().perform();
	}
	@Test 
	public void f_profileInfo() throws InterruptedException
	{
		Select langprefer = new Select(driver.findElement(By.xpath("//select[@name='account.languagePreference']")));
		langprefer.selectByVisibleText("english");
		Select favcat = new Select(driver.findElement(By.xpath("//select[@name='account.favouriteCategoryId']")));
		favcat.selectByVisibleText("FISH");
		Thread.sleep(5000);
		WebElement checkmylist = driver.findElement(By.name("account.listOption"));
		checkmylist.click();
		WebElement checkmybanner = driver.findElement(By.name("account.bannerOption"));
		checkmybanner.click();
		Thread.sleep(2000);
		WebElement saveacct = driver.findElement(By.name("newAccount"));
		saveacct.click();
	}
	@Test 
	public void g_login()
	{
		driver.findElement(By.xpath("//a[text()='Sign In']")).click();
		driver.findElement(By.name("username")).sendKeys("KamilaKausar");
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("Pinky@006");
		WebElement login = driver.findElement(By.name("signon"));
		login.click();
		
	}
	@Test 
	public void h_logout()
	{
		driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
	}

}
