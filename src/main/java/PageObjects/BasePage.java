package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;



public class BasePage {
	public WebDriver driver;
	public BasePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	

//	void OpenUrl()
//	{
//		try {
//			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//			driver.get("https://tutorialsninja.com/demo/");
//			driver.manage().window().maximize();
//		}catch (Exception e) {
//			// TODO: handle exception
//		}
//	}
}
