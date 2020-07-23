package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BrowseTabs {

	public static WebElement GetDefinition(WebDriver driver){
		WebElement definition = driver.findElement(By.linkText("Definition"));
		return definition;
	}
	
	public static WebElement GetExamples(WebDriver driver){
		WebElement examples = driver.findElement(By.linkText("Examples"));
		return examples;
	}
	
	public static WebElement GetUsage(WebDriver driver){
		WebElement usage = driver.findElement(By.linkText("Usage"));
		return usage;
	}
	
	public static WebElement GetSettings(WebDriver driver){
		WebElement settings = driver.findElement(By.linkText("Settings"));
		return settings;
	}
	
	}

