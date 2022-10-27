package adactin_Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout_Page {
	public WebDriver driver;
	
	@FindBy(linkText="You have successfully logged out")
	private WebElement Loggedout;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getLoggedout() {
		return Loggedout;
	}
	
	public Logout_Page(WebDriver mdriver) {
		this.driver =mdriver;
	PageFactory.initElements(driver, this);
	}
}
