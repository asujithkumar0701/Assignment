package StepDefinitions;

import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.AccountRegistrationPage;
import PageObjects.HomePage;
import TestBAse.BaseClass;

public class Tc001_AccRegTest extends BaseClass {

	@Test(groups= {"Regression","Master"})
	public void AccountRegistration() {

		logger.info("*** Tc001_AccRegTest is started ****");
		try {
			HomePage hp = new HomePage(driver);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			hp.ClickMyAccount();
			logger.info("*** My Account Clicked ****");
			hp.ClickRegister();
			logger.info("*** Register Clicked ****");

			AccountRegistrationPage arp = new AccountRegistrationPage(driver);
			arp.HeaderDisplay();
			arp.FirstName(randomString().toUpperCase());
			arp.LastName(randomString().toLowerCase());
			arp.Email(randomString() + "@gmail.com");
			arp.Telephone(randomNumbers());
			arp.PassWord(randomAlphaNumerics());

			String a = randomAlphaNumerics();
			arp.ConfirmPass(a);
			arp.ConfirmPass(a);
			arp.RadioBtn();
			arp.CheckBox();
			arp.ContinueBtn();
			arp.CnfrmText();

		} catch (Exception e) {

			logger.error("Test Failed");
			logger.debug("Debug logs..");
			Assert.fail();
		}
		logger.info("*** Tc001_AccRegTest is Finished ****");
	}

}



