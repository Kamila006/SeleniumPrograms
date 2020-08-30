package seleniumPracticing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class YourlogoContactUs {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E://seleniumAutomation//Essentials//chromedriver_win32//chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Contact us']")).click();
		Thread.sleep(5000);
	    Select subdropdown = new Select(driver.findElement(By.id("id_contact")));
	    subdropdown.selectByVisibleText("Customer service");
	    driver.findElement(By.id("email")).sendKeys("august3monday@yopmail.com");
	    driver.findElement(By.id("id_order")).sendKeys("123");
	    driver.findElement(By.id("message")).sendKeys("Hi" + "\t"+ "I have to purchase 123 numbers of shirts");
	    WebElement send = driver.findElement(By.xpath("//span[text()='Send']"));
	    send.click();
	    driver.close();
	    

	}

}
