package seleniumPracticing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Digitalbanl {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E://seleniumAutomation//Essentials//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://dbankdemo.com/login");
		driver.findElement(By.id("username")).sendKeys("kamilakousar@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Kamila@123");
		driver.findElement(By.id("submit")).click();
		

	}

}

