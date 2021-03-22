package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.maven.base.testbase;

public class SignupPage extends testbase
{
	
	@FindBy(xpath="//a[@title='Create Rediffmail Account']")
	WebElement createAccount;
	
	@FindBy(xpath = "//input[starts-with(@name,'name')]")
	WebElement fullName;
	
	@FindBy(xpath="//input[starts-with(@name,'login')]")
	WebElement rediffmailId;
	
	@FindBy(xpath="//input[starts-with(@name,'btnchk')]")
	WebElement checkavailability;
	
	@FindBy(xpath="//input[starts-with(@name,'passwd')]")
	WebElement password;
	
	@FindBy(xpath="//input[starts-with(@name,'confirm')]")
	WebElement retypePassword;
	
	
	public SignupPage()
	{
		super();
		PageFactory.initElements(driver, this);
	}
	
	public void click_createAccount()
	{
		createAccount.click();
	}
	
	public void verifySignup(String fullname)
	{
		fullName.sendKeys(fullname);
	}
	

}
