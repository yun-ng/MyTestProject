package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DragAndDrop {
	@Test
	public static void main() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Yun\\Automation_Selenium\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");		
		driver.manage().window().maximize();
		
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droptarget"));
		
		(new Actions(driver)).dragAndDrop(drag, target).perform();
		
		String str = driver.findElement(By.id("droptarget")).getText();		
		Assert.assertEquals(str, "You did great!");
		driver.quit();
	}
}
