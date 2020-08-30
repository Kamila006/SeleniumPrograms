package testNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OtherLocators {
	WebDriver driver;
    @Test 
    public void a_pageload()
    {
	System.setProperty("webdriver.chrome.driver", "E://seleniumAutomation//Essentials//chromedriver_win32//chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://automationpractice.com/index.php");
	driver.manage().window().maximize();
    }
    @Test
    public void b_login()
    {
    driver.findElement(By.linkText("Sign in")).click();
    driver.findElement(By.cssSelector("#email")).sendKeys("august1_098@yopmail.com");
    driver.findElement(By.cssSelector("#passwd")).sendKeys("Passw0rd$123");
    WebElement submitbtn = driver.findElement(By.id("SubmitLogin"));
    submitbtn.click();
    }
	

}
