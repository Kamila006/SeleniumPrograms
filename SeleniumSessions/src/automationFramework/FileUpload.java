package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E://seleniumAutomation//Essentials//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/upload/");
		driver.manage().window().maximize();
		WebElement upload = driver.findElement(By.id("uploadfile_0"));
		upload.sendKeys("C://Users//Public//Pictures//Sample Pictures//Tulips.jpg");
		WebElement filecheckbox = driver.findElement(By.id("terms"));
		filecheckbox.click();
		WebElement submit = driver.findElement(By.id("submitbutton"));
		submit.click();
		Thread.sleep(3000);
		String filemsg = driver.findElement(By.xpath("//center[contains(text(),'1 file')]")).getText();
		System.out.println(filemsg);
		
		
		
		

	}

}
