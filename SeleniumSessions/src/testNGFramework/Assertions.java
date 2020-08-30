package testNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertions {
	WebDriver driver;
	@Test 
	public void a_pageLoad()
	{
		System.setProperty("webdriver.chrome.driver", "E://seleniumAutomation//Essentials//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://zero.webappsecurity.com/index.html");
		driver.manage().window().maximize();
	}
	@Test
	public void b_assertequals()
	{
		String element1 = driver.findElement(By.xpath("//strong[contains(text(),'Online Banking')]")).getText();
		Assert.assertEquals(element1, "ONLINE BANKINGG");
		System.out.println("assertequals pass");
	}
	@Test
	public void c_assertNotEquals()
	{
		String element1 = driver.findElement(By.xpath("//strong[contains(text(),'Online Banking')]")).getText();
		Assert.assertNotEquals(element1, "ONLINE BANKINGG");
		System.out.println("asssertnotequals pass");
	}
	@Test
	public void d_assertTrue()
	{
		Assert.assertTrue("ONLINE BANKING".equals(driver.findElement(By.xpath("//strong[contains(text(),'Online Banking')]")).getText()));
		System.out.println("asserttrue Pass");
	}
	@Test
	public void e_assertfalse()
	{
		String element1 = driver.findElement(By.xpath("//strong[contains(text(),'Online Banking')]")).getText();
		Assert.assertFalse("ONLINE BANKINGG".equals(element1));
		System.out.println("assertfalse Pass");
	}
	@Test
	public void f_assertNotNull()
	{
		Object obj1 = driver.getTitle();
		Assert.assertNotNull(obj1);
		System.out.println("assertnotnull pass");
	}
	@Test
	public void g_assertNull()
	{
		Object obj = null;
		Assert.assertNull(obj);
		System.out.println("assertnull pass");
		
	}

}
