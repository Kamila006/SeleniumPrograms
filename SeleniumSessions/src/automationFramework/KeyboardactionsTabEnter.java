package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardactionsTabEnter {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E://seleniumAutomation//Essentials//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("aug07@yopmail.com");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.TAB,"aug123").build().perform();
		act.sendKeys(Keys.ENTER).build().perform();
		
		
		
		

	}

}
