package automationFramework;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindows {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E://seleniumAutomation//Essentials//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		//String mainwindowhandle = driver.getWindowHandle();
		//System.out.println(mainwindowhandle);
		ArrayList <String> nakuriwindows = new ArrayList<String>(driver.getWindowHandles());
		for(String nakuriwindowslist:nakuriwindows)
		{
			System.out.println(nakuriwindowslist);
		}
		driver.switchTo().window(nakuriwindows.get(1));
		String childwindow1 = driver.getTitle();
		System.out.println(childwindow1);
		driver.switchTo().window(nakuriwindows.get(2));
		String childwindow2 = driver.getTitle();
		System.out.println(childwindow2);
		driver.switchTo().window(nakuriwindows.get(3));
		String childwindow3 = driver.getTitle();
		System.out.println(childwindow3);
		
		
		
		

	}

}
