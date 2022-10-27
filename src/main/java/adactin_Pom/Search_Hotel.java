package adactin_Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel {
	
public WebDriver driver;
	
	@FindBy(id="location")
	private WebElement loc;
	
	@FindBy(name="hotels")
	private WebElement hote;
	
	@FindBy(id="room_type")
	private WebElement roomtype;
	
	@FindBy(name="room_nos")
	private WebElement roomnos;
	
	@FindBy(id="datepick_in")
	private WebElement in;
	
	@FindBy(id="datepick_out")
	private WebElement out;
	
	@FindBy(name="adult_room")
	private WebElement adultroom;
	
	@FindBy(name="child_room")
	private WebElement childroom;
	
	@FindBy(id="Submit")
	private WebElement submit;
	
	@FindBy(xpath = "//a[text()='Logout']")
	private WebElement logout;
	
	@FindBy(id = "checkin_span")
	private WebElement checkin_verify;
	
	@FindBy(id = "checkout_span")
	private WebElement checkout_verify;

	@FindBy(xpath= "//td[text()='Search Hotel ']")
	private WebElement title_verify;

	public WebElement getTitle_verify() {
		return title_verify;
	}

	public WebElement getCheckout_verify() {
		return checkout_verify;
	}

	public WebElement getCheckin_verify() {
		return checkin_verify;
	}

	public WebElement getLogout() {
		return logout;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getLoc() {
		return loc;
	}

	public WebElement getHote() {
		return hote;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getRoomnos() {
		return roomnos;
	}

	public WebElement getIn() {
		return in;
	}

	public WebElement getOut() {
		return out;
	}

	public WebElement getAdultroom() {
		return adultroom;
	}

	public WebElement getChildroom() {
		return childroom;
	}

	public WebElement getSubmit() {
		return submit;
	}
	
	//a[@text()='Logout']
	public Search_Hotel(WebDriver mdriver) {
		this.driver = mdriver;
		PageFactory.initElements(driver, this);
	}
}
