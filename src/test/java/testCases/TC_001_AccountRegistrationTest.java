package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC_001_AccountRegistrationTest extends BaseClass {

	
	
	@Test(groups= {"Regression","Master"})
public	void test_account_Registration()

	{logger.debug("Application Logs..............");
		logger.info("**********starting TC_001_AccountRegistrationTest********* ");
	try {
		 HomePage hp=new HomePage(driver);
	 
	
	hp.clickMyAccount(); 
	logger.info("Clicked On My Account Link");
	hp.clickRegister();	
	logger.info("Clicked on register Link");
	AccountRegistrationPage regpage=new AccountRegistrationPage(driver);
	logger.info("Providing customer Data");
	regpage.setFirstName(randomeString().toUpperCase());
	regpage.setlastName(randomeString().toUpperCase()+"d");
	regpage.setEmail(randomeString()+"@gmail.com");
	regpage.setTelephone(randomeNumber());
	
	String pwd=randomAlphaNumeric(); 
	regpage.setPassword(pwd);
	regpage.setconfirmPassword(pwd);
	
	regpage.setPrivacyPolicy();
	logger.info("Clicked On Continue");
	regpage.clickContinue();
	String confmsg=regpage.getConfirmationMsg();
	logger.info("Validating Expected Message");
	Assert.assertEquals(confmsg, "Your Account Has Been Created!");
	}
	catch(Exception e)
	{
		logger.error("Test Failed");
		Assert.fail();
	}
	logger.info("******Finished TC_001_AccountRegistrationTest******" );
	}
	
	
}

