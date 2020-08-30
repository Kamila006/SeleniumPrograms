package seleniumPracticing;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingPopUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E://seleniumAutomation//Essentials//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		//Alert PopUp
		WebElement alert1 = driver.findElement(By.xpath("//a[text()='Alert with OK ']"));
		alert1.click();
		WebElement alert2 = driver.findElement(By.xpath("//button[contains(text(),'alert box')]"));
		alert2.click();
		Thread.sleep(2000);
		Alert aler = driver.switchTo().alert();
		String text1 = aler.getText();
		System.out.println(text1);
		aler.accept();
		//Confirmation PopUP
		WebElement confirm1 = driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));
		confirm1.click();
		WebElement confirm2 = driver.findElement(By.xpath("//button[contains(text(),'confirm box ')]"));
		confirm2.click();
		Thread.sleep(2000);
		Alert confirm = driver.switchTo().alert();
		String text2 = confirm.getText();
		System.out.println(text2);
		confirm.accept();
		//Prompt PopUp
		WebElement prompt1 = driver.findElement(By.xpath("//a[contains(text(),'Textbox')]"));
		prompt1.click();
		WebElement prompt2 = driver.findElement(By.xpath("//button[contains(text(),'prompt box')]"));
		prompt2.click();
		Thread.sleep(2000);
		Alert prompt = driver.switchTo().alert();
		String text3 = prompt.getText();
		System.out.println(text3);
		prompt.sendKeys("Hi Kamila");
		prompt.accept();
		String textfromprompt = driver.findElement(By.xpath("//p[contains(text(),'Kamila')]")).getText();
		System.out.println(textfromprompt);
		
		
		

	}

}
