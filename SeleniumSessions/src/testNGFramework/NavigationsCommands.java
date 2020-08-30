package testNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NavigationsCommands {
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
    public void b_navigation() throws InterruptedException
    {
    driver.findElement(By.linkText("Sign in")).click();
    driver.navigate().to("https://www.google.com/");
    driver.navigate().back();
    driver.navigate().forward();
    Thread.sleep(2000);
    driver.navigate().refresh();
    
    }

}
