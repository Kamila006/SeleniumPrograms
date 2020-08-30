package seleniumPracticing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testaddressbook {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E://seleniumAutomation//Essentials//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://a.testaddressbook.com/sign_up");
		driver.findElement(By.id("user_email")).sendKeys("kamilakousar@gmail.com");
		driver.findElement(By.id("user_password")).sendKeys("kamila@06");
		driver.findElement(By.xpath("//input[@name='commit']")).click();

	}

}

