package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

;

public class HomePage extends BasePage {
	public HomePage(WebDriver driver) {
		super(driver);
	} 
       //Elements
	
	
	
	@FindBy(xpath="//span[normalize-space()='My Account']")
	WebElement linkMyaccount;

	@FindBy(xpath = "//a[normalize-space()='Register']")
	WebElement lnkRegister;
	
	@FindBy(linkText="Login")
	WebElement loginLink;
	
/*	@FindBy(linkText="Register")
	WebElement linkRegister;
	*/
	  //Action Methods
	
	public void clickMyAccount() {
		linkMyaccount.click();
	}
	

	public void clickRegister() {
		lnkRegister.click();
	}
	
	public void loginLink() {
		 loginLink.click();
	}
	
	
	
}
