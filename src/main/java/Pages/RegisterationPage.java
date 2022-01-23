package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.shaft.gui.element.ElementActions;

public class RegisterationPage {

	WebDriver driver;
	private HighLevelFunctionsPage highlevelfunctionspage = new HighLevelFunctionsPage(driver);

	// constructor
	public RegisterationPage(WebDriver driver) {

		this.driver = driver;
	}

	// Locators

	private By Singnin_Button = By.xpath("//a[contains(text()='Sign in')]");
	private By Emailaddress_Text = By.id("email_create");
	private By CreateAccount_Button = By.xpath("//button[name='SubmitCreate']");
	private By Gender_RadioButton = By.xpath("//label[@for='id_gender2']");
	private By CustomerFristName_Text = By.name("customer_firstname");
	private By CustomerLastName_Text = By.name("customer_lastname");
	private By Email_Text = By.id("email");
	private By Password_Text = By.xpath("//input [name= 'passwd']");
	private By Day_DropDown = By.xpath("//select[@id='days']");
	private By month_DropDown = By.xpath("//select[@id='months']");
	private By Year_DropDown = By.xpath("//select[@id='years']");
	private By FristName_Text = By.xpath(" //input[@name='firstname']");
	private By LastName_Text = By.xpath("//input[@id='lastname']");
	private By Company_Text = By.xpath("//input[@id='company']");
	private By City_Text = By.xpath("//Name [@name='city']");
	private By State_DropDown = By.xpath("//select[@id='id_state']");
	private By ZipCode_Text = By.xpath("//input[@id='postcode']");
	private By Country_DropDown = By.xpath("//select[@id='id_country']");
	private By Mobile_Text = By.xpath("//input[@id='phone_mobile']");
	private By Referance_Text = By.xpath("//input[@id='alias']");
	private By Register_Button = By.xpath("//button[@id='submitAccount']");

	// Actions
	public void NavigatetoRegisterPage(String RegURL) {
		highlevelfunctionspage.navigate(RegURL);

	}

	public void FillRegisterData(String EmailAddress, String CustomerFristName, String CustomerLastName,
			String Password, String Day, String Month, String Year, String FirstName, String LastName, String Company,
			String City, String State, String ZipCode, String Country, String Mobile, String Referance) {
		new ElementActions(driver).clickAndHold(Singnin_Button).type(Emailaddress_Text, EmailAddress)
				.click(CreateAccount_Button).click(Gender_RadioButton).type(CustomerFristName_Text, CustomerFristName)
				.type(CustomerLastName_Text, CustomerLastName).click(Email_Text).type(Password_Text, Password)
				.select(Day_DropDown, Day).select(month_DropDown, Month).select(Year_DropDown, Year)
				.type(FristName_Text, FirstName).type(LastName_Text, LastName).type(Company_Text, Company)
				.type(City_Text, City).select(State_DropDown, State).type(ZipCode_Text, ZipCode)
				.select(Country_DropDown, Country).type(Mobile_Text, Mobile).type(Referance_Text, Referance)
				.click(Register_Button);
	}

}
