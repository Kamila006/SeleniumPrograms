package swagsLabObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SwagsLabsRepository {
	WebDriver driver;
	
	public SwagsLabsRepository()
	{
		this.driver=driver;
	}
	
	@FindBy(how = How.ID,using="user-name") WebElement Username;
	@FindBy(how = How.ID,using="password") WebElement Password;
	@FindBy(how = How.ID,using="login-button") WebElement Login;
	@FindBy(how = How.XPATH,using="//div[text()='Sauce Labs Onesie']") WebElement Item;
	@FindBy(how = How.XPATH,using="//button[text()='<- Back']") WebElement Backbtn;
	@FindBy(how = How.XPATH,using="(//button[contains(text(),'ADD')])[5]") WebElement Additem;
	@FindBy(how = How.XPATH,using="//div[@id='shopping_cart_container']") WebElement Cartitem;
	@FindBy(how = How.XPATH,using="//a[text()='CHECKOUT']") WebElement Checkoutbtn;
	@FindBy(how = How.ID,using="first-name") WebElement Firstname;
	@FindBy(how = How.ID,using="last-name") WebElement Lastname;
	@FindBy(how = How.ID,using="postal-code") WebElement Zipcode;
	@FindBy(how = How.XPATH,using="//a[text()='CANCEL']/following::input") WebElement Contibtn;
	
	
	
	
	
	
	public void Loginlink()
	{
		Username.sendKeys("problem_user");
		Password.sendKeys("secret_sauce");
		Login.click();
	}
	
	public void AddItem() throws InterruptedException
	{
		Item.click();
		Backbtn.click();
		Additem.click();
		Cartitem.click();
		Checkoutbtn.click();
		Thread.sleep(3000);
		Firstname.sendKeys("Priya");
		Lastname.sendKeys("David");
		Zipcode.sendKeys("56003");
		Contibtn.click();
		
		
	}

}
