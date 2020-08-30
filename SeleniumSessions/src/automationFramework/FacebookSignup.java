package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSignup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E://seleniumAutomation//Essentials//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();
	    driver.findElement(By.id("u_0_m")).sendKeys("August");
	    driver.findElement(By.name("lastname")).sendKeys("Monday");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("august3monday@yopmail.com");
		driver.findElement(By.id("u_0_u")).sendKeys("august3monday@yopmail.com");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Kamila@123");
		Select date = new Select(driver.findElement(By.id("day")));
		date.selectByVisibleText("15");
		Select monthe = new Select(driver.findElement(By.id("month")));
		monthe.selectByVisibleText("Sept");
		Select year = new Select(driver.findElement(By.name("birthday_year")));
		year.selectByVisibleText("1991");
		WebElement gender = driver.findElement(By.id("u_0_6"));
		gender.click();
		WebElement signup = driver.findElement(By.id("u_0_13"));
		signup.click();
		
		

	}

}
