package seleniumPracticing;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class KeyboardActionRediff {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E://seleniumAutomation//Essentials//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//td[text()='Full Name']/following::input[1]")).sendKeys("Tabish");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.TAB,"aug_09").build().perform();
		//act.sendKeys(Keys.ENTER).build().perform();
        act.sendKeys(Keys.TAB,"Aug!123").build().perform();
        //driver.findElement(By.xpath("//td[contains(text(),'Retype')]/following::input[1]")).sendKeys("August@123");
		act.sendKeys(Keys.TAB,"Aug!123").build().perform();
        WebElement checkbox = driver.findElement(By.xpath("//td[contains(text(),'Alternate')]/following::input[2]"));
        checkbox.click();
		//act.sendKeys(Keys.TAB,"aug_month1@yopmail.com").build().perform();
		act.sendKeys(Keys.TAB,"9912345678").build().perform();
		
		
		

	}

}
