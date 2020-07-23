package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LaunchBrowser {
	
	static WebDriver driver;
	@Test
	public static void LaunchAndChangeTabs() {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Yun\\Automation_Selenium\\Selenium_Drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://semantic-ui.com/modules/tab.html");		
		driver.manage().window().maximize();
		
		if(BrowseTabs.GetDefinition(driver).isDisplayed())
			BrowseTabs.GetDefinition(driver).click();
		
		if(BrowseTabs.GetExamples(driver).isDisplayed())
			BrowseTabs.GetExamples(driver).click();
		
		if(BrowseTabs.GetUsage(driver).isDisplayed())
			BrowseTabs.GetUsage(driver).click();
		
		if(BrowseTabs.GetSettings(driver).isDisplayed())
			BrowseTabs.GetSettings(driver).click();
	}

}

