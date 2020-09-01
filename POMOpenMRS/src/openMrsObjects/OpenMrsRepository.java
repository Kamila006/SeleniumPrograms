package openMrsObjects;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class OpenMrsRepository {
	WebDriver driver;
	
	public OpenMrsRepository()
	{
		this.driver=driver;
	}
	
	@FindBy(how = How.ID,using="Registration Desk") WebElement Registrationbtn;
	@FindBy(how = How.ID,using="username") WebElement Username;
	@FindBy(how = How.ID,using="password") WebElement Password;
	@FindBy(how = How.ID,using="loginButton") WebElement LoginBtn;
	@FindBy(how = How.XPATH,using="//h4[contains(text(),'Logged')]/following::a[3]") WebElement RegisterPat;
	@FindBy(how = How.NAME,using="givenName") WebElement PatientName;
	@FindBy(how = How.NAME,using="familyName") WebElement FamilyName;
	@FindBy(how = How.XPATH,using="//span[@id='genderLabel']") WebElement Gendertext;
	@FindBy(how = How.ID,using ="gender-field") WebElement SelectGender;
	@FindBy(how = How.XPATH,using ="//span[text()='Birthdate']") WebElement Birthdatetext;
	@FindBy(how = How.ID,using= "birthdateDay-field") WebElement Date;
	@FindBy(how = How.ID,using= "birthdateMonth-field") WebElement Month;
	@FindBy(how = How.ID,using= "birthdateYear-field") WebElement Year;
	@FindBy(how = How.XPATH,using="//span[contains(text(),'Address')]") WebElement Addresstext;
	@FindBy(how = How.XPATH,using="//input[@id='address1']") WebElement Address;
	@FindBy(how = How.XPATH,using="//input[@id='address2']") WebElement AddressSub;
	@FindBy(how = How.XPATH,using="//input[@id='cityVillage']") WebElement City;
	@FindBy(how = How.ID,using="stateProvince") WebElement State;
	@FindBy(how = How.ID,using="country") WebElement Country;
	@FindBy(how = How.ID,using="postalCode") WebElement Postal;
	@FindBy(how = How.XPATH,using="//span[text()='Phone Number']") WebElement Phone;
	@FindBy(how = How.NAME,using="phoneNumber") WebElement PhoneNumber;
	@FindBy(how = How.XPATH,using="//span[text()='Relatives']") WebElement Relativestext;
	@FindBy(how = How.ID,using="relationship_type") WebElement SelectRelative;
	@FindBy(how = How.XPATH,using="//h3[contains(text(),'Who')]/following::input[1]") WebElement PersonName;
	@FindBy(how = How.XPATH,using="//span[text()='Confirm']") WebElement Confirmtext;
	@FindBy(how = How.ID,using="submit") WebElement Confirmbutton;
	
	
	
	
	
	
	public void Registrationbtn()
	{
		Registrationbtn.click();;
	}
	
	public void Login()
	{
		Username.sendKeys("admin");
		Password.sendKeys("Admin123");
		LoginBtn.click();
	}
	
	public void registerDemographics() throws InterruptedException
	{
		Thread.sleep(3000);
		RegisterPat.click();
		PatientName.sendKeys("Sathish");
		FamilyName.sendKeys("Kumar");
		Gendertext.click();
		Thread.sleep(2000);
		Select gender = new Select(SelectGender);
		gender.selectByVisibleText("Male");
		Birthdatetext.click();
		Thread.sleep(2000);
	    Date.sendKeys("19");
		Select month = new Select(Month);
		month.selectByVisibleText("September");
		Year.sendKeys("1954");
	}
	public void registerContactInfo() throws InterruptedException
	{
		Addresstext.click();
		Thread.sleep(3000);
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Address.sendKeys("KKnagar");
		AddressSub.sendKeys("subchennai");
		City.sendKeys("Chennai");
		State.sendKeys("Tamil Nadu");
		Country.sendKeys("India");
		Postal.sendKeys("54666");
		Phone.click();
		PhoneNumber.sendKeys("9432678889");
	}
	public void registerRelationship()
	{
		Relativestext.click();
		Select sel = new Select(SelectRelative);
		sel.selectByVisibleText("Aunt/Uncle");
		PersonName.sendKeys("Uma");
	}
	public void confirmlink() throws InterruptedException 
	{
		Confirmtext.click();
		Thread.sleep(3000);
		Confirmbutton.click();
	}

}
