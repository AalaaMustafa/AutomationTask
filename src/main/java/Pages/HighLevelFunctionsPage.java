package Pages;

import org.openqa.selenium.WebDriver;

import com.shaft.gui.browser.BrowserActions;

public class HighLevelFunctionsPage {
	
		
		 WebDriver driver;

		public HighLevelFunctionsPage(WebDriver driver) {

			this.driver = driver;
		}
		
		public void navigate( String url) {
			BrowserActions.navigateToURL(driver, url);
		}
		public void close() {
			
			driver.quit();
		}
}
