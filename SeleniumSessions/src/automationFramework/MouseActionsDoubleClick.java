package automationFramework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionsDoubleClick {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E://seleniumAutomation//Essentials//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		WebElement doubleclick =driver.findElement(By.xpath("//button[contains(text(),'Double-Click Me To See Alert')]"));
		Actions act = new Actions(driver);
		act.doubleClick(doubleclick).build().perform();
		Alert aler = driver.switchTo().alert();
		String text1 = aler.getText();
		System.out.println(text1);
		aler.accept();
		

	}

}
