package scriptsfortutorials;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TutorialsRepository {
	WebDriver driver;
	
	public TutorialsRepository() 
	{
		
		this.driver=driver;
		
	}
	
	@FindBy(how = How.XPATH,using="//span[text()='My Account']") WebElement AccountLink;
	@FindBy(how = How.XPATH,using="//a[text()='Login']") WebElement LoginLink;
	@FindBy(how = How.ID,using="input-email") WebElement EmailId;
	@FindBy(how = How.ID,using="input-password") WebElement Password;
	@FindBy(how = How.XPATH,using="//input[@id='input-password']/following::input") WebElement Loginbtn;
	
	
	public void accountlink()
	{
		AccountLink.click();
		LoginLink.click();
		EmailId.sendKeys("aug_23@yopmail.com");
		Password.sendKeys("Aug!123");
		Loginbtn.click();
		
	}

}
