package seleniumPracticing;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardUpandDownGoogle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E://seleniumAutomation//Essentials//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("Dhoni");
		Actions act = new Actions(driver);
		for(int i=1;i<=5;i++)
		{
			Thread.sleep(2000);
			act.sendKeys(Keys.ARROW_DOWN).build().perform();
		}
		act.sendKeys(Keys.ENTER).build().perform();

	}

}
