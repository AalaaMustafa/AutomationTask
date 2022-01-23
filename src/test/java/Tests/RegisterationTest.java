package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.shaft.driver.DriverFactory;
import Pages.RegisterationPage;

public class RegisterationTest {

	private WebDriver driver = DriverFactory.getDriver();
	private RegisterationPage registerationpage = new RegisterationPage(driver);

	@BeforeMethod
	public void beforemethod() {
		driver = new ChromeDriver();
	}

	@AfterMethod
	public void aftermethod() {
		driver.quit();
	}

	// Go to Register AccountPage
	@Test
	public void NavigatetoWebSite() {
		registerationpage.NavigatetoRegisterPage("http://automationpractice.com/index.php");

	}

	@Test(dependsOnMethods = { "NavigatetoWebSite" })
	public void FillData()

	{
		registerationpage.FillRegisterData("Ahmed@mailinator.com", " Ahmed", " Ali", "123Am%", "10", "11", "1977",
				"Ahmed", "Ali", "Micro", "Cairo", "Giza", "Hawaii","1111","United States","1111111111");
	}

}
