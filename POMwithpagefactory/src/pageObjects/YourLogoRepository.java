package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class YourLogoRepository {
	WebDriver driver;
	public YourLogoRepository()
	{
		this.driver = driver;
	}
	
	@FindBy(how = How.CLASS_NAME,using="login") WebElement SignInLink;
	@FindBy(how = How.ID,using="email") WebElement EmailId;
	@FindBy(how = How.NAME,using="passwd") WebElement PassWord;
	@FindBy(how = How.XPATH,using="//button[@id='SubmitLogin']") WebElement SignInButton;
	@FindBy(how = How.CLASS_NAME,using="logout") WebElement SignOutLink;
	
	
	public void SignIn()
	{
		SignInLink.click();
		EmailId.sendKeys("august12098@yopmail.com");
		PassWord.sendKeys("Passw0rd$123");
		SignInButton.click();
	}
	public void SignOut()
	{
		SignOutLink.click();
	}
	
	

}
