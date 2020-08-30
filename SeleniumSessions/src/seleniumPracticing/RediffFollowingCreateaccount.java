package seleniumPracticing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RediffFollowingCreateaccount {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E://seleniumAutomation//Essentials//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//td[text()='Full Name']/following::input[1]")).sendKeys("Tabish");
		driver.findElement(By.xpath("//td[contains(text(),'Rediffmail ID')]/following::input[1]")).sendKeys("August_08");
		driver.findElement(By.xpath("//td[contains(text(),'Rediffmail ID')]/following::input[2]")).click();
		driver.findElement(By.xpath("//td[text()='Password']/following::input[1]")).sendKeys("August@123");
		driver.findElement(By.xpath("//td[contains(text(),'Retype')]/following::input[1]")).sendKeys("August@123");
		driver.findElement(By.xpath("//td[contains(text(),'Alternate')]/following::input[1]")).sendKeys("August_month@yopmail.com");
		driver.findElement(By.id("mobno")).sendKeys("9912345678");
		Select date = new Select(driver.findElement(By.xpath("//td[text()='Date of Birth']/following::select[1]")));
		date.selectByVisibleText("06");
		Select month = new Select(driver.findElement(By.xpath("//td[contains(text(),'Date of Birth')]/following::select[2]")));
		month.selectByVisibleText("SEP");
		Select year = new Select(driver.findElement(By.xpath("//td[contains(text(),'Date of Birth')]/following::select[3]")));
		year.selectByVisibleText("1990");
		WebElement femaleradio = driver.findElement(By.xpath("//td[text()='Gender']/following::input[2]"));
		femaleradio.click();
		Select country = new Select(driver.findElement(By.xpath("//span[text()='Country']/following::select[1]")));
		country.selectByVisibleText("India");
		Select city = new Select(driver.findElement(By.xpath("//span[text()='Country']/following::select[2]")));
		city.selectByVisibleText("Jamshedpur");
		Thread.sleep(20000);
		WebElement myaccountbutton = driver.findElement(By.id("Register"));
		myaccountbutton.click();
		
		

	}

}
