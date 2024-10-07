package StepDefinitions;

import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.HomePage;
import PageObjects.LoginPage;
import PageObjects.MyAccount;
import TestBAse.BaseClass;

public class TC002_LoginTest extends BaseClass {

	@Test(groups= {"Sanity" , "Master"})
	public void verify_Login() {
		logger.info("*** Tc002_LoginTest is started ****");
		try {

			HomePage hp = new HomePage(driver);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			hp.ClickMyAccount();
			hp.ClickLogin();

			LoginPage lp = new LoginPage(driver);
			lp.enterEmail(p.getProperty("email"));
			lp.enterPassword(p.getProperty("password"));
			lp.clickBTN();

			MyAccount ma = new MyAccount(driver);
			boolean targetPage = ma.isMyAccountPageExists();

			Assert.assertTrue(targetPage);
			// Assert.assertEquals(targetPage, true, "login failed");
		} catch (Exception e) {
			Assert.fail();
		}
		logger.info("*** Tc002_LoginTest is Finished ****");
	}

}
