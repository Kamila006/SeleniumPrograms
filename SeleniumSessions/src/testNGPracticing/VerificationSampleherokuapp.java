package testNGPracticing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VerificationSampleherokuapp {
	WebDriver driver;
	@Test 
	public void a_pageLoad()
	{
		System.setProperty("webdriver.chrome.driver", "E://seleniumAutomation//Essentials//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/checkboxes");
		driver.manage().window().maximize();
	}
	
	
		@Test
		public void b_Verifycheckbox1() throws InterruptedException 
		{
			WebElement Checkbox1 = driver.findElement(By.xpath("//form[@id='checkboxes']/descendant::input[1]"));
			if (Checkbox1.isSelected())
			{
				System.out.println("true");
			} else 
			{
				System.out.println("false");
				Thread.sleep(10000);
				WebElement check1 = Checkbox1;
				check1.click();
			}
		}
		@Test
		public void c_Verifycheckbox2() throws InterruptedException 
		{
			WebElement Checkbox2 = driver.findElement(By.xpath("//form[@id='checkboxes']/descendant::input[2]"));
			if (Checkbox2.isSelected()) 
			{
				System.out.println("true");
				Thread.sleep(7000);
			} else 
			{
				System.out.println("false");
				WebElement check2 = Checkbox2;
				check2.click();
			}
		}

	}
	/*@Test
	public void b_verification() throws InterruptedException
	{
		Thread.sleep(5000);
		WebElement checkbox1 = driver.findElement(By.xpath("//form[@id='checkboxes']/descendant::input[1]"));
		checkbox1.click();
		Boolean checkbox = checkbox1.isSelected();
		System.out.println(checkbox);
		Boolean checkbox2 = driver.findElement(By.xpath("//form[@id='checkboxes']/descendant::input[2]")).isSelected();
		System.out.println(checkbox2);
		Boolean infocheck = driver.findElement(By.xpath("//h3[contains(text(),'Checkboxes')]")).isDisplayed();
		System.out.println(infocheck);
		
	}*/


