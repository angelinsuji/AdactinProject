package adactin_Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_Iternary {
	
	public WebDriver driver;
	
	@FindBy(id="logout")
	private WebElement logoutbtn;
	
	@FindBy(id="order_no")
	private WebElement orderno;
	
	@FindBy(id="my_itinerary")
	private WebElement itinerary;  
	
	@FindBy(xpath="//td[text()='Booking Confirmation ']")
	private WebElement title_verify;

	public WebElement getTitle_verify() {
		return title_verify;
	}
	public WebElement getOrderno() {
		return orderno;
	}
	public WebElement getItinerary() {
		return itinerary;
	}
	public WebElement getLogoutbtn() {
		return logoutbtn;
	}
	public WebDriver getDriver() {
		return driver;
	}
	public Book_Iternary(WebDriver mdriver) {
		this.driver = mdriver;
		PageFactory.initElements(driver, this);
	}


}
