package adactin_Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booked_Page {
	
	public WebDriver driver;
	
	@FindBy(name="order_id_757223")
	private WebElement orderid;
	
	@FindBy(id="hotel_name_756403")
	private WebElement hotelname;
	
	@FindBy(id="location_756403")
	private WebElement location;
	
	@FindBy(id="rooms_756403")
	private WebElement rooms;
	
	@FindBy(id="first_name_756403")
	private WebElement first;
	
	@FindBy(id="last_name_756403")
	private WebElement last;
	
	@FindBy(id="arr_date_756403")
	private WebElement arrival;
	
	@FindBy(id="dep_date_756403")
	private WebElement departure;
	
	@FindBy(id="room_type_756403")
	private WebElement roomtype;
	
	@FindBy(id="price_night_756403")
	private WebElement price;
	
	@FindBy(id="total_price_756403")
	private WebElement totalprice;
	
	@FindBy(id="order_id_text")
	private WebElement orderidtext;
	
	@FindBy(id="search_hotel_id")
	private WebElement gobtn;
	
	@FindBy(id="btn_id_756142")
	private WebElement cancelbook;
	
	@FindBy(id="search_result_error")
	private WebElement resulterror;
	
	@FindBy(name="order_id_757223")
	private WebElement orderid1;
	
	@FindBy(id="hotel_name_757223")
	private WebElement hotelname1;
	
	@FindBy(id="location_757223")
	private WebElement location1;
	
	@FindBy(id="rooms_757223")
	private WebElement rooms1;
	
	@FindBy(id="first_name_757223")
	private WebElement first1;
	
	@FindBy(id="last_name_757223")
	private WebElement last1;
	
	@FindBy(id="arr_date_757223")
	private WebElement arrival1;
	
	@FindBy(id="dep_date_757223")
	private WebElement departure1;
	
	@FindBy(id="room_type_757223")
	private WebElement roomtype1;
	
	@FindBy(id="price_night_757223")
	private WebElement price1;
	
	@FindBy(id="total_price_757223")
	private WebElement totalprice1;

	@FindBy(id="btn_id_752922")
	private WebElement cancellink;
	
	@FindBy(xpath="//a[text()='Show all']")
	private WebElement showall;
	
	@FindBy(xpath="//td[text()='Booked Itinerary']")
	private WebElement title_verify;
	
	public WebElement getTitle_verify() {
		return title_verify;
	}

	public WebElement getShowall() {
		return showall;
	}

	public WebElement getCancellink() {
		return cancellink;
	}

	public WebElement getOrderid1() {
		return orderid1;
	}

	public WebElement getHotelname1() {
		return hotelname1;
	}

	public WebElement getLocation1() {
		return location1;
	}

	public WebElement getRooms1() {
		return rooms1;
	}

	public WebElement getFirst1() {
		return first1;
	}

	public WebElement getLast1() {
		return last1;
	}

	public WebElement getArrival1() {
		return arrival1;
	}

	public WebElement getDeparture1() {
		return departure1;
	}

	public WebElement getRoomtype1() {
		return roomtype1;
	}

	public WebElement getPrice1() {
		return price1;
	}

	public WebElement getTotalprice1() {
		return totalprice1;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getOrderid() {
		return orderid;
	}

	public WebElement getHotelname() {
		return hotelname;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getRooms() {
		return rooms;
	}

	public WebElement getFirst() {
		return first;
	}

	public WebElement getLast() {
		return last;
	}

	public WebElement getArrival() {
		return arrival;
	}

	public WebElement getDeparture() {
		return departure;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getPrice() {
		return price;
	}

	public WebElement getTotalprice() {
		return totalprice;
	}

	public WebElement getOrderidtext() {
		return orderidtext;
	}

	public WebElement getGobtn() {
		return gobtn;
	}

	public WebElement getCancelbook() {
		return cancelbook;
	}

	public WebElement getResulterror() {
		return resulterror;
	}

	public Booked_Page(WebDriver mdriver) {
		this.driver = mdriver;
		PageFactory.initElements(driver, this);
	}

}
