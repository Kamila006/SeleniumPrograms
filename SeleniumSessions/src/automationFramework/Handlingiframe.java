package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingiframe {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E://seleniumAutomation//Essentials//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://nunzioweb.com/index.shtml");
		driver.manage().window().maximize();
		int iframecount = driver.findElements(By.tagName("iframe")).size();
		System.out.println(iframecount);
		driver.switchTo().frame("oddcouple");
		String iframetext = driver.findElement(By.xpath("//div[contains(text(),'television show')]")).getText();
		System.out.println(iframetext);

	}

}
