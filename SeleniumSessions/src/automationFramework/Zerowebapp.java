package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zerowebapp {

	public static void main(String[] args) {
         System.setProperty("webdriver.chrome.driver", "E://seleniumAutomation//Essentials//chromedriver_win32//chromedriver.exe");
         WebDriver driver = new ChromeDriver();
         driver.get("http://zero.webappsecurity.com/");
         driver.manage().window().maximize();
         driver.findElement(By.id("signin_button")).click();
         driver.findElement(By.name("user_login")).sendKeys("username");
         driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("password");
         driver.findElement(By.name("submit")).click();
         String Accounttitle = driver.getTitle();
         System.out.println(Accounttitle);
         String Url = driver.getCurrentUrl();
         System.out.println(Url);
         String Text = driver.findElement(By.xpath("//a[text()='Transfer Funds']")).getText();
         System.out.println(Text);
         String Text1 = driver.findElement(By.xpath("//h2[text()='Cash Accounts']")).getText();
         System.out.println(Text1);
         String Fontsize = driver.findElement(By.xpath("//h2[contains(text(),'Investment Accounts')]")).getCssValue("font-size");
         System.out.println(Fontsize);
         String Attribute = driver.findElement(By.xpath("//h2[contains(text(),'Investment Accounts')]")).getAttribute("class");
         System.out.println(Attribute);
         driver.close();
         
         
         
         
	}

}
