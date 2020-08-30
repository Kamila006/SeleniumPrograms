package seleniumPracticing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jpetstoreregistrationform {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E://seleniumAutomation//Essentials//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://petstore.octoperf.com/actions/Account.action?newAccountForm=");
		driver.manage().window().maximize();
		

	}

}
