package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.shaft.gui.element.ElementActions;


class LoginPage {

	// driver
	 WebDriver driver;
	
	// Locators
	private By UserName_Text = By.id("");
	private By Password_Text = By.id("");
	private By Sigin_Button = By.id("");


	// constructor
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void NavigatetoLoginPage( String loginURL) {
		new  HighLevelFunctionsPage(driver).navigate(loginURL);
		
	}
	
	public void Login(String userName, String password) {

		new ElementActions(driver).type(UserName_Text, userName).type(Password_Text, password).click(Sigin_Button);}
}
