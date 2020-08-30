package seleniumPracticing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class YourLogoSearch {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E://seleniumAutomation//Essentials//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.findElement(By.id("search_query_top")).sendKeys("shirt");
		driver.findElement(By.name("submit_search")).click();
		String Url = driver.getCurrentUrl();
		System.out.println(Url);
		Select sort = new Select(driver.findElement(By.id("selectProductSort")));
		sort.selectByVisibleText("Product Name: A to Z");
		driver.findElement(By.xpath("//li[text()='View']/following::i[2]")).click();
		

	}

}
