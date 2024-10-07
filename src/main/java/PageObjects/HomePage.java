package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	//Constructor
	public HomePage(WebDriver driver) {
		super(driver);
	}

	//Locators
	@FindBy(xpath = "//a[@class='dropdown-toggle']")
	WebElement MyAccout;

	@FindBy(xpath="//li//a[text()='Register']")
	WebElement Register;
	
	@FindBy(xpath="//li//a[text()='Login']")
	WebElement Login;
	
	//Actions
	public void ClickMyAccount() {
		try {
			MyAccout.click();
		} catch (Exception e) {
			System.out.println("My account button notb clicked...");
		}
	}
	public void ClickRegister()
	{
		try {
			Register.click();
		}catch (Exception e) {
			System.out.println("Register button not clicked...");
		}
	}
	
	public void ClickLogin()
	{
		try {
			Login.click();
		}catch (Exception e) {
			System.out.println("Login button not clicked...");
		}
	}

}
