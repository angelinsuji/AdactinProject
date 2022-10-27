package adactin_Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	public WebDriver driver;
	
	@FindBy(id="username")
	private WebElement uname;
	
	@FindBy(id="password")
	private WebElement pass;
	
	@FindBy(name="login")
	private WebElement log;
	
	@FindBy(name="username_show")
	private WebElement uname_show;

	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getUname() {
		return uname;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getLog() {
		return log;
	}
	
	public WebElement getUname_show() {
		return uname_show;
	}

	public Login_Page(WebDriver mdriver) {
		this.driver = mdriver;
		PageFactory.initElements(driver, this);
	}
}
