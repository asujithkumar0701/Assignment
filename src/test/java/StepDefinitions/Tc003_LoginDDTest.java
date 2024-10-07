package StepDefinitions;

import org.testng.annotations.Test;

import PageObjects.HomePage;
import PageObjects.LoginPage;
import PageObjects.MyAccount;
import TestBAse.BaseClass;

public class Tc003_LoginDDTest extends BaseClass {
	// @Test(dataProvider="LoginData", dataProviderClass=Dataproviders.class)
	@Test(groups="Master")
	public void verify_LoginDDT() {

		HomePage hp = new HomePage(driver);
		hp.ClickMyAccount();
		hp.ClickLogin();

		LoginPage lp = new LoginPage(driver);
		lp.enterEmail(p.getProperty("email"));
		lp.enterPassword(p.getProperty("password"));
		lp.clickBTN();

		MyAccount ma = new MyAccount(driver);
		boolean sttus = ma.isMyAccountPageExists();

	}

}

//	@Test(dataProvider = "LoginData", dataProviderClass = Dataproviders.class)
//	public void verify_Login(String email, String pwd, String exp) throws InterruptedException{
//		logger.info("*** Tc003_LoginDDT is started ****");
//		try {
//
//			HomePage hp = new HomePage(driver);
//			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//			hp.ClickMyAccount();
//			hp.ClickLogin();
//
//			LoginPage lp = new LoginPage(driver);
//			lp.enterEmail(email);
//			lp.enterPassword(pwd);
//			lp.clickBTN();
//
//			MyAccount ma = new MyAccount(driver);
//			boolean targetPage = ma.isMyAccountPageExists();
//
//			if (exp.equalsIgnoreCase("Valid")) {
//				if (targetPage == true) {
//					Assert.assertTrue(true);
//					ma.Logout();
//				} else {
//					Assert.assertTrue(false);
//				}
//			}
//			if (exp.equalsIgnoreCase("Invalid")) {
//				if (targetPage == true) {
//					ma.Logout();
//					Assert.assertTrue(false);
//				} else {
//					Assert.assertTrue(true);
//				}
//			}
//		} catch (Exception e) {
//			// logger.info("*** TC003_LoginDDT is Finished ****");
//		}
//	}
