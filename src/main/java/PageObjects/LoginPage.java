package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//div//input[@name='email']")
	WebElement Email;

	@FindBy(xpath = "//div//input[@name='password']")
	WebElement Password;

	@FindBy(xpath = "//div//input[@type='submit']")
	WebElement Button;

	public void enterEmail(String mail) {
		try {
			Email.sendKeys(mail);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterPassword(String pass) {
		try {
			Password.sendKeys(pass);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickBTN() {
		try {
			Button.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
