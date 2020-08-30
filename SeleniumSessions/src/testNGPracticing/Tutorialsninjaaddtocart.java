package testNGPracticing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Tutorialsninjaaddtocart {
WebDriver driver;
	
	//PageLoad
	@Test
	public void a_pageload()
	{
		System.setProperty("webdriver.chrome.driver", "E://seleniumAutomation//Essentials//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://tutorialsninja.com/demo/");
		driver.manage().window().maximize();
	}
	
	//Selecting a Product
	@Test
	public void b_selectingproduct()
	{
	    WebElement desktops = driver.findElement(By.xpath("//a[text()='Desktops']"));
	    Actions act = new Actions(driver);
	    act.moveToElement(desktops).build().perform();
	    driver.findElement(By.xpath("//a[text()='Mac (1)']")).click();
	}
	
	//Adding product to a cart and removing
	@Test
	public void c_addingproduct() throws InterruptedException
	{
	    WebElement add = driver.findElement(By.xpath("//span[text()='Add to Cart']"));
	    add.click();
	    Thread.sleep(2000);
	    WebElement itembtn = driver.findElement(By.xpath("//span[@id='cart-total']"));
	    itembtn.click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//strong[text()=' View Cart']")).click();
	    WebElement removeiconbtn = driver.findElement(By.xpath("(//span[@class='input-group-btn'])[2]/descendant::button[2]"));
	    Thread.sleep(5000);
	    removeiconbtn.click();  
	}
	
	//Printing message on screen
	@Test
	public void d_printingmessage() throws InterruptedException
	{   
		Thread.sleep(2000);
		String shopping = driver.findElement(By.xpath("//h1[contains(text(),'Shopping Cart')]")).getText();
		System.out.println(shopping);
		String message = driver.findElement(By.xpath("(//p[contains(text(),'Your shopping cart is empty!')])[2]")).getText();
		System.out.println(message);
		
		
		
		/*String shopping = driver.findElement(By.xpath("//div[@id='content']/child::h1")).getText();
		System.out.println(shopping);
		String message = driver.findElement(By.xpath("//div[@id='content']/child::p")).getText();
		System.out.println(message);*/
	}

}
