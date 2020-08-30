package automationFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseandQuit {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E://seleniumAutomation//Essentials//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("https://www.naukri.com/");
	    driver.manage().window().maximize();
	    //driver.close();
	    driver.quit();
	    
	    

	}

}
