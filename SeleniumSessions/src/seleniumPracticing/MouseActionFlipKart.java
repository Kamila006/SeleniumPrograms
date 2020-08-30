package seleniumPracticing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionFlipKart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E://seleniumAutomation//Essentials//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		WebElement babythings = driver.findElement(By.xpath("//span[text()='Baby & Kids']"));
		Actions act = new Actions(driver);
		act.moveToElement(babythings).build().perform();
		driver.findElement(By.xpath("//a[text()='Educational Toys']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[contains(text(),'Zephyr Mini Alpha Board')]")).click();
		
		

}
}
