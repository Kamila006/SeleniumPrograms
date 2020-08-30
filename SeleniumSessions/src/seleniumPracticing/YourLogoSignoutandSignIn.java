package seleniumPracticing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class YourLogoSignoutandSignIn {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E://seleniumAutomation//Essentials//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.findElement(By.className("login")).click();
		driver.findElement(By.id("email_create")).sendKeys("august15@yopmail.com");
		driver.findElement(By.id("SubmitCreate")).click();
		Thread.sleep(5000);
		WebElement gender2 = driver.findElement(By.id("id_gender2"));
		gender2.click();
		driver.findElement(By.id("customer_firstname")).sendKeys("august");
		driver.findElement(By.id("customer_lastname")).sendKeys("six");
		driver.findElement(By.id("passwd")).sendKeys("aug123");
		Select date = new Select(driver.findElement(By.id("days")));
		date.selectByVisibleText("10  ");
		Select month = new Select(driver.findElement(By.id("months")));
		month.selectByVisibleText("September ");
		Select year = new Select(driver.findElement(By.id("years")));
		year.selectByVisibleText("1991  ");
		WebElement newsletter = driver.findElement(By.id("newsletter"));
		newsletter.click();
		driver.findElement(By.id("firstname")).sendKeys("August");
		driver.findElement(By.id("lastname")).sendKeys("six");
		driver.findElement(By.id("address1")).sendKeys("Texas");
		driver.findElement(By.id("city")).sendKeys("US");
		Select state = new Select(driver.findElement(By.id("id_state")));
		state.selectByVisibleText("Texas");
		driver.findElement(By.id("postcode")).sendKeys("45076");
		Select country = new Select(driver.findElement(By.id("id_country")));
		country.selectByVisibleText("United States");
		driver.findElement(By.id("phone_mobile")).sendKeys("9123456789");
		driver.findElement(By.id("submitAccount")).click();
		//Thread.sleep(5000);
		driver.findElement(By.className("logout")).click();
		driver.findElement(By.id("email")).sendKeys("august15@yopmail.com");
		driver.findElement(By.id("passwd")).sendKeys("aug123");
		driver.findElement(By.id("SubmitLogin")).click();
		
		

	}

}
