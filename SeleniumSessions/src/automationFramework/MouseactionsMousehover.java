package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseactionsMousehover {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E://seleniumAutomation//Essentials//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		WebElement home = driver.findElement(By.xpath("//span[contains(text(),'Home & Furniture')]"));
		Actions act = new Actions(driver);
		act.moveToElement(home).build().perform();
		driver.findElement(By.xpath("//a[contains(text(),'Stickers')]")).click();

	}

}
