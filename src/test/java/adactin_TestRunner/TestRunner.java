package adactin_TestRunner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import adactin_Helper.FileReadManager;
import adactin_Pom.Select_Hotel;
import adactin_Utilities.Base_Class;
import cucumber.api.CucumberOptions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(

		glue = "adactin_Stepdefinition", features = "Features",
		tags = "@tag1,@tag2",
		strict=true,
		dryRun = false, 
		monochrome = true)

public class TestRunner {
	
	public static WebDriver driver = null;
	
	@BeforeClass
	public static void setUp() throws Throwable {
		try {
			String browser = FileReadManager.getInstance().getCm().getbrowser();
			driver= Base_Class.getBrowser(browser);
		}catch(Exception e) {
			e.printStackTrace();
			throw new Exception("Browser Name is Invalid");
		}
		
	}
	
	@AfterClass
	public static void driverQuit() {
		driver.quit();
	}

}
