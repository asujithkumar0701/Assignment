package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage {

	public AccountRegistrationPage(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = "//div//h1[text()='Register Account']")
	WebElement header;

	@FindBy(xpath = "//div//input[@class='form-control' and @placeholder='First Name' ]")
	WebElement frstName;

	@FindBy(xpath = "//div//input[@class='form-control' and @placeholder='Last Name' ]")
	WebElement lstName;

	@FindBy(xpath = "//div//input[@class='form-control' and @placeholder='E-Mail']")
	WebElement email;

	@FindBy(xpath = "//div//input[@class='form-control' and @placeholder='Telephone']")
	WebElement phone;

	@FindBy(xpath = "//div//input[@class='form-control' and @placeholder='Password']")
	WebElement password;

	@FindBy(xpath = "//div//input[@class='form-control' and @placeholder='Password Confirm']")
	WebElement cnfrmPassword;

	@FindBy(xpath="//*[text()='Yes']//input[@type='radio']")
	WebElement radioBTn;
	
	@FindBy(xpath="//input[@type='checkbox']")
	WebElement checkBox;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement cont;
	
	@FindBy(xpath="//div//h1[text()='Your Account Has Been Created!']")
	WebElement text;
	
	public void CnfrmText() {
		try {
		String str = 	text.getText();
		if(str.equalsIgnoreCase("Your Account Has Been Created!"))
		{
			System.out.println("USer Registartion successfull..");
		}
		}catch (Exception e) {
			System.out.println("User not regsitered....");
		}
	}
	public void ContinueBtn() {
		try {
			cont.click();
			Thread.sleep(4000);
		}catch (Exception e) {
			System.out.println("Continue button not clicked...");
		}
	}
	public void CheckBox() {
		try {
			checkBox.click();
		}catch (Exception e) {
			System.out.println("Unable to click checkbox.....");
		}
	}
	public void RadioBtn() {
		try {
			radioBTn.click();
		}catch (Exception e) {
			System.out.println("Unable to click radio button...");
		}
	}
	public void ConfirmPass(String pwd) {
		try {
			cnfrmPassword.sendKeys(pwd);
		} catch (Exception e) {
			System.out.println("Confirm pass not enetered");
		}
	}

	public void PassWord(String pwd) {
		try {
			password.sendKeys(pwd);
		} catch (Exception e) {
			System.out.println("password not entered");
		}
	}

	public void Telephone(String NUM) {
		try {
			phone.sendKeys(NUM);
		} catch (Exception e) {
			System.out.println("Mobile number not entered");
		}
	}

	public void Email(String mail) {
		try {
			email.sendKeys(mail);
		} catch (Exception e) {
			System.out.println("email id not entered");
		}
	}

	public void LastName(String Lname) {
		try {
			lstName.sendKeys(Lname);
		} catch (Exception e) {
			System.out.println("Last name not entered");
		}
	}



	public void FirstName(String fname) {
		try {
			frstName.sendKeys(fname);
		} catch (Exception e) {
			System.out.println("First name not entered");
		}
	}
	
	public void HeaderDisplay() {
		try {
			if (header.isDisplayed()) {
				System.out.println("Register page is opened..");
			}
		} catch (Exception e) {
			System.out.println("Register page is not opened");
		}
	}

}
