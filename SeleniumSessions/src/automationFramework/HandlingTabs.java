package automationFramework;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTabs {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E://seleniumAutomation//Essentials//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/intl/en-GB/gmail/about/#");
		driver.manage().window().maximize();
		WebElement createaccount = driver.findElement(By.xpath("(//a[contains(text(),'account')])[1]"));
		createaccount.click();
		ArrayList <String> gmailtabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(gmailtabs.get(1));
		driver.findElement(By.id("firstName")).sendKeys("Afu");
		

	}

}
