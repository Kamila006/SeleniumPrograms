package seleniumPracticing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swaglabs {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E://seleniumAutomation//Essentials//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("kamilak");
		driver.findElement(By.id("password")).sendKeys("Kamila@123");
		driver.findElement(By.id("login-button")).click();

	}

}
