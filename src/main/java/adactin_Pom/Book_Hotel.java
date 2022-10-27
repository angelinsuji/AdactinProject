package adactin_Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_Hotel {
	public WebDriver driver;
	
	@FindBy(name="first_name")
	private WebElement firstnam;
	
	@FindBy(name="last_name")
	private WebElement lastnam;
	
	@FindBy(name="address")
	private WebElement add;
	
	@FindBy(name="cc_num")
	private WebElement cardnum;
	
	@FindBy(id="cc_type")
	private WebElement cardtype;
	
	@FindBy(id="cc_exp_month")
	private WebElement cardexpmonth;
	
	@FindBy(id="cc_exp_year")
	private WebElement cardexpyear;
	
	@FindBy(name="cc_cvv")
	private WebElement cvvnum;
	
	@FindBy(id="book_now")
	private WebElement bookbtn;
	
	@FindBy(id="total_price_dis")
	private WebElement totalprice_verify;
	
	@FindBy(id="final_price_dis")
	private WebElement finalprice_verify;
	
	@FindBy(id="hotel_name_dis")
	private WebElement hotelname_verify;
	
	@FindBy(id="location_dis")
	private WebElement loca_verify;
	
	@FindBy(id="room_type_dis")
	private WebElement roomtyp_verify;
	
	@FindBy(id="room_num_dis")
	private WebElement roomnos_verify;
	
	@FindBy(xpath="//td[text()='Book A Hotel ']")
	private WebElement title_verify;

	public WebElement getTitle_verify() {
		return title_verify;
	}

	public WebElement getHotelname_verify() {
		return hotelname_verify;
	}

	public WebElement getLoca_verify() {
		return loca_verify;
	}

	public WebElement getRoomtyp_verify() {
		return roomtyp_verify;
	}

	public WebElement getRoomnos_verify() {
		return roomnos_verify;
	}

	public WebElement getFinalprice_verify() {
		return finalprice_verify;
	}

	public WebElement getTotalprice_verify() {
		return totalprice_verify;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getFirstnam() {
		return firstnam;
	}

	public WebElement getLastnam() {
		return lastnam;
	}

	public WebElement getAdd() {
		return add;
	}

	public WebElement getCardnum() {
		return cardnum;
	}

	public WebElement getCardtype() {
		return cardtype;
	}

	public WebElement getCardexpmonth() {
		return cardexpmonth;
	}

	public WebElement getCardexpyear() {
		return cardexpyear;
	}

	public WebElement getCvvnum() {
		return cvvnum;
	}

	public WebElement getBookbtn() {
		return bookbtn;
	}

		public Book_Hotel(WebDriver mdriver) {
		this.driver = mdriver;
		PageFactory.initElements(driver, this);
	}

		
		
		
}
