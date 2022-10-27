package adactin_Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Hotel {
	
public WebDriver driver;

	@FindBy(id="hotel_name_0")
	private WebElement hotelname_verify;
	
	@FindBy(id="location_0")
	private WebElement hotelloc_verify;
	
	@FindBy(id="rooms_0")
	private WebElement rooms_verify;
	
	@FindBy(id="room_type_0")
	private WebElement roommtype_verify;
	
	@FindBy(id="no_days_0")
	private WebElement days_verify;
	
	@FindBy(id="arr_date_0")
	private WebElement indate_verify;
	
	@FindBy(id="dep_date_0")
	private WebElement outdate_verify;
	
	@FindBy(xpath="//td[text()='Select Hotel ']")
	private WebElement title_verify;
	
	public WebElement getTitle_verify() {
		return title_verify;
	}


	public WebElement getOutdate_verify() {
		return outdate_verify;
	}
	
	@FindBy(id="radiobutton_0")
	private WebElement radiobtn;
	
	@FindBy(name="continue")
	private WebElement contin;
	
	@FindBy(id="total_price_0")
	private WebElement totalprice;

	
	public WebElement getTotalprice() {
		return totalprice;
	}


	public WebElement getHotelname_verify() {
		return hotelname_verify;
	}


	public WebElement getHotelloc_verify() {
		return hotelloc_verify;
	}


	public WebElement getRooms_verify() {
		return rooms_verify;
	}


	public WebElement getRoommtype_verify() {
		return roommtype_verify;
	}


	public WebElement getDays_verify() {
		return days_verify;
	}


	public WebElement getIndate_verify() {
		return indate_verify;
	}


	public WebDriver getDriver() {
		return driver;
	}


	public WebElement getRadiobtn() {
		return radiobtn;
	}


	public WebElement getContin() {
		return contin;
	}


	public Select_Hotel(WebDriver mdriver) {
		this.driver = mdriver;
		PageFactory.initElements(driver, this);
	}

}
