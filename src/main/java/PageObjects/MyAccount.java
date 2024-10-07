package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccount extends BasePage {

	public MyAccount(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = "//div//h2[text()='My Account']")
	WebElement HeadMessage;

	@FindBy(xpath="//a[@class='list-group-item' and text()='Logout']")
	WebElement logOut;
	
	public boolean isMyAccountPageExists() {
		try {
			return (HeadMessage.isDisplayed());
		} catch (Exception e) {
			return false;
		}
	}
	
	public void Logout()
	{
		try {
			logOut.click();
		}catch (Exception e) {
			System.out.println("Unable to click Logout...");
		}
	}
}
