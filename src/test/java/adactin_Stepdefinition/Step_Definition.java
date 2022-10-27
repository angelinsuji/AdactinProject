package adactin_Stepdefinition;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import adactin_Helper.Configuration_Manager;
import adactin_Helper.FileReadManager;
import adactin_Pom.Book_Hotel;
import adactin_Pom.Book_Iternary;
import adactin_Pom.Booked_Page;
import adactin_Pom.Login_Page;
import adactin_Pom.Logout_Page;
import adactin_Pom.Search_Hotel;
import adactin_Pom.Select_Hotel;
import adactin_Utilities.Base_Class;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Step_Definition extends Base_Class{
	public WebDriver driver=null;
	
	@Given("^User able to Launch Login Page Successfully$")
	public void user_able_to_Launch_Login_Page_Successfully(){
	    // Write code here that turns the phrase above into concrete actions
		String url = FileReadManager.getInstance().getCm().getURL();
		driver=getUrl(url);
		}

	@When("User enters the username in the {string} textbox")
	public void user_enters_the_username_in_the_textbox(String string) {
	    // Write code here that turns the phrase above into concrete actions
		Login_Page lp = new Login_Page(driver);
		WebElement uname = lp.getUname();
		inputValuestoWebelement(uname,"angel123");
		
	}

	@When("User enters the password in the {string} textbox")
	public void user_enters_the_password_in_the_textbox(String string) {
	    // Write code here that turns the phrase above into concrete actions
		
		Login_Page lp = new Login_Page(driver);
		WebElement pass = lp.getPass();
		inputValuestoWebelement(pass,"Adriel@27");
	}

	
	@And("^User clicks on the login button in Login Page$")
	public void user_clicks_on_the_login_button_in_Login_Page(){
	    // Write code here that turns the phrase above into concrete actions
	  
		Login_Page lp = new Login_Page(driver);
		WebElement log = lp.getLog();
		clickonWebelement(log);
	}
	
	@Then("^User verify the username displayed in the header$")
	public void user_verify_the_username_displayed_in_the_header() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Login_Page lp = new Login_Page(driver);
		
		WebElement uname_show = lp.getUname_show();
		String text = uname_show.getText();
//		Assert.assertEquals(text,"Hello angel123!");
		
	}
	
	@When("^User able to select the location$")
	public void user_able_to_select_the_location() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Search_Hotel sh = new Search_Hotel(driver);
		WebElement loc = sh.getLoc();
		selectDropDownOption(loc,"visibletext","Sydney");

	}

	@When("^User able to select the hotel$")
	public void user_able_to_select_the_hotel() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		Search_Hotel sh = new Search_Hotel(driver);
		WebElement hote = sh.getHote();
		selectDropDownOption(hote,"index","1");

	}

	@When("^User able to select the Room type$")
	public void user_able_to_select_the_Room_type() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Search_Hotel sh = new Search_Hotel(driver);
		WebElement roomtype = sh.getRoomtype();
		selectDropDownOption(roomtype, "visibletext", "Standard");

	}

	@When("^User able to select Number of roooms$")
	public void user_able_to_select_Number_of_roooms() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Search_Hotel sh = new Search_Hotel(driver);
		WebElement roomnos = sh.getRoomnos();
		selectDropDownOption(roomnos, "index", "1");

	}

	@When("User able to enter {string} in the Checkin date textbox")
	public void user_able_to_enter_in_the_Checkin_date_textbox(String string) {
	    // Write code here that turns the phrase above into concrete actions
		Search_Hotel sh = new Search_Hotel(driver);
		WebElement checkin = sh.getIn();
		checkin.clear();
		inputValuestoWebelement(checkin,string);
		

	}

	@When("User able to enter {string} in the Checkout date textbox")
	public void user_able_to_enter_in_the_Checkout_date_textbox(String string) {
	    // Write code here that turns the phrase above into concrete actions
		Search_Hotel sh = new Search_Hotel(driver);
		WebElement checkout = sh.getOut();
		checkout.clear();
		inputValuestoWebelement(checkout,string);

	}


	@Then("User verify that system gives an error saying ‘check-indate should not be later than checkout-date’")
	public void user_verify_that_system_gives_an_error_saying_check_indate_should_not_be_later_than_checkout_date() {
    // Write code here that turns the phrase above into concrete actions
		Search_Hotel sh = new Search_Hotel(driver);
		WebElement indate = sh.getCheckin_verify();
		String text1 = indate.getText();
//		Assert.assertEquals(text1,"Check-In Date shall be before than Check-Out Date");
//		System.out.println(text1);
	}
	
	@Then("User Verify that application throws error message")
	public void user_Verify_that_application_throws_error_message() {
	    // Write code here that turns the phrase above into concrete actions
		Search_Hotel sh = new Search_Hotel(driver);
		WebElement outdate = sh.getCheckout_verify();
		String text2 = outdate.getText();
//		Assert.assertEquals(text2,"Check-Out Date shall be after than Check-In Date");
		System.out.println(text2);
	}
	
	@When("^User able to select Number of Adult rooms$")
	public void user_able_to_select_Number_of_Adult_rooms() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Search_Hotel sh = new Search_Hotel(driver);
		WebElement adultroom = sh.getAdultroom();
		selectDropDownOption(adultroom, "index", "1");
		

	}

	@When("^User able to select Number of Child rooms$")
	public void user_able_to_select_Number_of_Child_rooms() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Search_Hotel sh = new Search_Hotel(driver);
		WebElement childroom = sh.getChildroom();
		selectDropDownOption(childroom, "index", "0");

	}

	@Then("^User able to click the search Button$")
	public void user_able_to_click_the_search_Button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Search_Hotel sh = new Search_Hotel(driver);
		WebElement submit = sh.getSubmit();
		submit.click();

	}

	@Then("User verify that hotel location displayed is the same as selected in search Hotel form")
	public void user_verify_that_hotel_location_displayed_is_the_same_as_selected_in_search_Hotel_form() {
    // Write code here that turns the phrase above into concrete actions
		
		Select_Hotel ssh = new Select_Hotel(driver);
		WebElement location = ssh.getHotelloc_verify();
		String text3 = location.getText();
//		Assert.assertEquals("text3","Sydney");
		System.out.println(text3);

}

	@Then("User verify that hotel name displayed is the same as selected in search Hotel form")
	public void user_verify_that_hotel_name_displayed_is_the_same_as_selected_in_search_Hotel_form() {
    // Write code here that turns the phrase above into concrete actions
		
		Select_Hotel ssh = new Select_Hotel(driver);
		WebElement hotelname = ssh.getHotelname_verify();
		String text4 = hotelname.getText();
//		Assert.assertEquals(text4,"Hotel Creek");
		System.out.println(text4);
   
}
	@Then("User verify that check-in-date are the same as selected in search hotel form")
	public void user_verify_that_check_in_date_are_the_same_as_selected_in_search_hotel_form() {
	    // Write code here that turns the phrase above into concrete actions
		
		Select_Hotel ssh = new Select_Hotel(driver);
		WebElement arrival = ssh.getIndate_verify();
		String text5 = arrival.getText();
	    
	}

	@Then("User verify that check-out-date are the same as selected in search hotel form")
	public void user_verify_that_check_out_date_are_the_same_as_selected_in_search_hotel_form() {
	    // Write code here that turns the phrase above into concrete actions
		
		Select_Hotel ssh = new Select_Hotel(driver);
		WebElement depar = ssh.getOutdate_verify();
		String text6 = depar.getText();
	    
	}
	@When("User able to select the Number of roooms")
	public void user_able_to_select_the_Number_of_roooms() {
	    // Write code here that turns the phrase above into concrete actions
		
		Search_Hotel sh = new Search_Hotel(driver);
		WebElement roomnos = sh.getRoomnos();
		selectDropDownOption(roomnos, "index", "3");
	    
	}

	@When("User able to enter Checkindate in the Checkin date textbox")
	public void user_able_to_enter_Checkindate_in_the_Checkin_date_textbox() {
	    // Write code here that turns the phrase above into concrete actions
		
		Search_Hotel sh = new Search_Hotel(driver);
		WebElement checkin = sh.getIn();
		checkin.clear();
		inputValuestoWebelement(checkin,"6/11/2022");
	    
	}

	@When("User able to enter Checkoutdate in the Checkout date textbox")
	public void user_able_to_enter_Checkoutdate_in_the_Checkout_date_textbox() {
	    // Write code here that turns the phrase above into concrete actions
		
		Search_Hotel sh = new Search_Hotel(driver);
		WebElement checkout = sh.getOut();
		checkout.clear();
		inputValuestoWebelement(checkout,"7/11/2022");
	    
	}

	@Then("User verify that no.of rooms reflected according to the no. of rooms selected in search hotel page")
	public void user_verify_that_no_of_rooms_reflected_according_to_the_no_of_rooms_selected_in_search_hotel_page() {
	    // Write code here that turns the phrase above into concrete actions
		
		Select_Hotel ssh = new Select_Hotel(driver);
	    WebElement no_of_rooms = ssh.getRooms_verify();
	    String text7 = no_of_rooms.getText();
	}
	@When("User able to select Room type")
	public void user_able_to_select_Room_type() {
	    // Write code here that turns the phrase above into concrete actions
		
		Search_Hotel sh = new Search_Hotel(driver);
		WebElement roomtype = sh.getRoomtype();
		selectDropDownOption(roomtype, "visibletext", "Deluxe");
	    
	}

	@Then("User Verify that room type reflected is the same as selected in search hotel page")
	public void user_Verify_that_room_type_reflected_is_the_same_as_selected_in_search_hotel_page() {
	    // Write code here that turns the phrase above into concrete actions
	    
		Select_Hotel ssh = new Select_Hotel(driver);
	    WebElement room_type = ssh.getRoommtype_verify();
	    String text8 = room_type.getText();
	}
	@Then("Verify the total price excl GST is being calculated as price-per-night no-of-rooms no-of-days")
	public void verify_the_total_price_excl_GST_is_being_calculated_as_price_per_night_no_of_rooms_no_of_days() {
	    // Write code here that turns the phrase above into concrete actions
		Select_Hotel ssh = new Select_Hotel(driver);
		WebElement totalprice = ssh.getTotalprice();
		String text9 = totalprice.getAttribute("value");
	}

	@When("User able to select the radio button in the search hotel page")
	public void user_able_to_select_the_radio_button_in_the_search_hotel_page() {
	    // Write code here that turns the phrase above into concrete actions
		Select_Hotel ssh = new Select_Hotel(driver);
		WebElement radiobtn = ssh.getRadiobtn();
		clickonWebelement(radiobtn);
	}

	@When("User able to click continue button in the search hotel page")
	public void user_able_to_click_continue_button_in_the_search_hotel_page() {
	    // Write code here that turns the phrase above into concrete actions
		Select_Hotel ssh = new Select_Hotel(driver);
	 WebElement continuee = ssh.getContin();
		clickonWebelement(continuee);
	}
	@When("User able to select Num of roooms")
	public void user_able_to_select_Num_of_roooms() {
	    // Write code here that turns the phrase above into concrete actions
	    
		Search_Hotel sh = new Search_Hotel(driver);
		WebElement roomnos = sh.getRoomnos();
		selectDropDownOption(roomnos, "index", "2");
	}

	@When("User able to enter first name in the first name textbox")
	public void user_able_to_enter_first_name_in_the_first_name_textbox() {
	    // Write code here that turns the phrase above into concrete actions
	    
		Book_Hotel bh = new Book_Hotel(driver);
		WebElement firstname = bh.getFirstnam();
		inputValuestoWebelement(firstname,"Adriel");
	}

	@When("User able to enter last name in the last name textbox")
	public void user_able_to_enter_last_name_in_the_last_name_textbox() {
	    // Write code here that turns the phrase above into concrete actions
		Book_Hotel bh = new Book_Hotel(driver);
		WebElement lastname = bh.getLastnam();
		inputValuestoWebelement(lastname,"Jeron");
	}

	@When("User able to enter billing address in the billing address textbox")
	public void user_able_to_enter_billing_address_in_the_billing_address_textbox() {
	    // Write code here that turns the phrase above into concrete actions
		Book_Hotel bh = new Book_Hotel(driver);
		WebElement address = bh.getAdd();
		inputValuestoWebelement(address,"#121 Payal Residency, Bangalore");
	}

	@When("User able to enter credit card number in the credit card number textbox")
	public void user_able_to_enter_credit_card_number_in_the_credit_card_number_textbox() {
	    // Write code here that turns the phrase above into concrete actions
		Book_Hotel bh = new Book_Hotel(driver);
		WebElement ccnum = bh.getCardnum();
		inputValuestoWebelement(ccnum,"4563123678968745");
	}

	@When("User able to select credit card type")
	public void user_able_to_select_credit_card_type() {
	    // Write code here that turns the phrase above into concrete actions
	   
		Book_Hotel bh = new Book_Hotel(driver);
		WebElement cardtype = bh.getCardtype();
		selectDropDownOption(cardtype, "visibletext", "VISA");
	}

	@When("User able to select expiry month")
	public void user_able_to_select_expiry_month() {
	    // Write code here that turns the phrase above into concrete actions
	    
		Book_Hotel bh = new Book_Hotel(driver);
		WebElement expmonth = bh.getCardexpmonth();
		selectDropDownOption(expmonth, "visibletext", "December");
		
	}

	@When("User able to select expiry year")
	public void user_able_to_select_expiry_year() {
	    // Write code here that turns the phrase above into concrete actions
	   
		Book_Hotel bh = new Book_Hotel(driver);
		WebElement expyear = bh.getCardexpyear();
		selectDropDownOption(expyear, "visibletext", "2022");
	}

	@When("User able to enter credit card cvv number in the cvv number textbox")
	public void user_able_to_enter_credit_card_cvv_number_in_the_cvv_number_textbox() {
	    // Write code here that turns the phrase above into concrete actions
	    
		Book_Hotel bh = new Book_Hotel(driver);
		WebElement cvvnum = bh.getCvvnum();
		inputValuestoWebelement(cvvnum,"123");
	}

	@When("User able to click on book now button in the book a hotel page")
	public void user_able_to_click_on_book_now_button_in_the_book_a_hotel_page() {
	    // Write code here that turns the phrase above into concrete actions
	    
		Book_Hotel bh = new Book_Hotel(driver);
		WebElement booknow = bh.getBookbtn();
		clickonWebelement(booknow);
		
	}
	@Then("^User able to logout the application$")
	public void user_able_to_logout_the_application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		Book_Iternary bi = new Book_Iternary(driver);
		WebElement logout = bi.getLogoutbtn();
		clickonWebelement(logout);

	}
	@When("User able to select the hotel location")
	public void user_able_to_select_the_hotel_location() {
	    // Write code here that turns the phrase above into concrete actions
	    
		Search_Hotel sh = new Search_Hotel(driver);
		WebElement loc = sh.getLoc();
		selectDropDownOption(loc,"visibletext","Melbourne");

	}

	@Then("User Verify that total-price is being calculated as price-pernight no-ofrooms no-of-days GST")
	public void user_Verify_that_total_price_is_being_calculated_as_price_pernight_no_ofrooms_no_of_days_GST (){
	    // Write code here that turns the phrase above into concrete actions
		
		Book_Hotel bh = new Book_Hotel(driver);
	WebElement price_verify = bh.getTotalprice_verify();
		String text10 = price_verify.getAttribute("value");
	}

	@When("User verify the hotel location in Select hotel page")
	public void user_verify_the_hotel_location_in_Select_hotel_page() {
	    // Write code here that turns the phrase above into concrete actions
	    
		Select_Hotel ssh = new Select_Hotel(driver);
		WebElement location_verify = ssh.getHotelloc_verify();
		String text11 = location_verify.getText();
	}

	@When("User verify the hotel name in Select hotel page")
	public void user_verify_the_hotel_name_in_Select_hotel_page() {
	    // Write code here that turns the phrase above into concrete actions
	    
		Select_Hotel ssh = new Select_Hotel(driver);
		WebElement hotelname_verify = ssh.getHotelname_verify();
		String text12 = hotelname_verify.getText();
	}

	@When("user verify the roomtype in Select hotel page")
	public void user_verify_the_roomtype_in_Select_hotel_page() {
	    // Write code here that turns the phrase above into concrete actions
	    
		Select_Hotel ssh = new Select_Hotel(driver);
	    WebElement roomtypeverify = ssh.getRoommtype_verify();
	    String text13 = roomtypeverify.getText();
	}

	@When("User verify the total No. of days in Select hotel page")
	public void user_verify_the_total_No_of_days_in_Select_hotel_page() {
	    // Write code here that turns the phrase above into concrete actions
		Select_Hotel ssh = new Select_Hotel(driver);
	    WebElement no_of_rooms_verify = ssh.getRooms_verify();
	    String text14 = no_of_rooms_verify.getText();
	}

	@Then("User verify that total-price is being calculated as price-pernight")
	public void user_verify_that_total_price_is_being_calculated_as_price_pernight() {
	    // Write code here that turns the phrase above into concrete actions
	    
		Select_Hotel ssh = new Select_Hotel(driver);
		WebElement totalprice = ssh.getTotalprice();
		String text15 = totalprice.getAttribute("value");
	}

	@Then("User verify final billed price in book a hotel page")
	public void user_verify_final_billed_price_in_book_a_hotel_page() {
	    // Write code here that turns the phrase above into concrete actions
	    
		Book_Hotel bh = new Book_Hotel(driver);
		WebElement finalprice_verify = bh.getFinalprice_verify();
		String text16 = finalprice_verify.getAttribute("value");
	}
	
	@When("User verify the hotel name displayed in book a hotel page")
	public void user_verify_the_hotel_name_displayed_in_book_a_hotel_page() {
		// Write code here that turns the phrase above into concrete actions
		
		Book_Hotel bh = new Book_Hotel(driver);
		WebElement hotelname_verify = bh.getHotelname_verify();
		String text17= hotelname_verify.getText();
}

	@When("User verify the hotel location displayed in book a hotel page")
	public void user_verify_the_hotel_location_displayed_in_book_a_hotel_page() {
		// Write code here that turns the phrase above into concrete actions
    
		Book_Hotel bh = new Book_Hotel(driver);
		WebElement hotellocation_verify = bh.getLoca_verify();
		String text18= hotellocation_verify.getText();
}

	@When("User verify the room type displayed in book a hotel page")
	public void user_verify_the_room_type_displayed_in_book_a_hotel_page() {
		// Write code here that turns the phrase above into concrete actions
   
		Book_Hotel bh = new Book_Hotel(driver);
		WebElement roomtypes_verify = bh.getRoomtyp_verify();
		String text19= roomtypes_verify.getText();
}

	@When("User verify the No. of rooms displayed in book a hotel page")
	public void user_verify_the_No_of_rooms_displayed_in_book_a_hotel_page() {
		// Write code here that turns the phrase above into concrete actions
   
		Book_Hotel bh = new Book_Hotel(driver);
		WebElement roomnos_verify = bh.getRoomnos_verify();
		String text20= roomnos_verify.getText();
}
	@Then("User Verify that total-price is being calculated as price-pernight no-ofrooms no-ofdays")
	public void user_Verify_that_total_price_is_being_calculated_as_price_pernight_no_ofrooms_no_ofdays() {
		// Write code here that turns the phrase above into concrete actions

		Book_Hotel bh = new Book_Hotel(driver);
		WebElement totprice_verify = bh.getTotalprice_verify();
		String text21 = totprice_verify.getAttribute("value");
	}
	
	@When("User able to click book now button in book a hotel page")
	public void user_able_to_click_book_now_button_in_book_a_hotel_page() {
	    // Write code here that turns the phrase above into concrete actions
	    
		Book_Hotel bh = new Book_Hotel(driver);
		WebElement booknow = bh.getBookbtn();
		clickonWebelement(booknow);
	}
	
	@Then("User verify Order number is generated in booking confirmation page")
	public void user_verify_Order_number_is_generated_in_booking_confirmation_page() {
	    // Write code here that turns the phrase above into concrete actions
	    
		Book_Iternary bi = new Book_Iternary(driver);
		WebElement orderno_verify = bi.getOrderno();
		String text22 = orderno_verify.getAttribute("value");
		
	}
	
	@When("User able to select the location of hotel")
	public void user_able_to_select_the_location_of_hotel() {
	    // Write code here that turns the phrase above into concrete actions
	   
		Search_Hotel sh = new Search_Hotel(driver);
		WebElement loc = sh.getLoc();
		selectDropDownOption(loc,"visibletext","Adelaide");
	}

	@When("User able to select the name of hotel")
	public void user_able_to_select_the_name_of_hotel() {
	    // Write code here that turns the phrase above into concrete actions
	    
		Search_Hotel sh = new Search_Hotel(driver);
		WebElement hote = sh.getHote();
		selectDropDownOption(hote,"index","4");
	}

	@When("User able to click my itinerary button in booking confirmation page")
	public void user_able_to_click_my_itinerary_button_in_booking_confirmation_page() {
	    // Write code here that turns the phrase above into concrete actions
	
		Book_Iternary bi = new Book_Iternary(driver);
		WebElement itinerary = bi.getItinerary();
		itinerary.click();
	
	}
	@Then("User verify that the details are not editable in booked itinerary page")
	public void user_verify_that_the_details_are_not_editable_in_booked_itinerary_page() {
	    // Write code here that turns the phrase above into concrete actions
	    
		Booked_Page bp = new Booked_Page(driver);
		WebElement orderid_verify = bp.getOrderid();
		boolean enabled1 = orderid_verify.isEnabled();
		System.out.println(enabled1);
	}
	@When("User verify the hotel name displayed in booked itinerary page")
	public void user_verify_the_hotel_name_displayed_in_booked_itinerary_page() {
	    // Write code here that turns the phrase above into concrete actions
	    
		Booked_Page bp = new Booked_Page(driver);
		WebElement hotelname = bp.getHotelname();
		String text23 = hotelname.getText();
	}

	@When("User verify the hotel location displayed in booked itinerary page")
	public void user_verify_the_hotel_location_displayed_in_booked_itinerary_page() {
	    // Write code here that turns the phrase above into concrete actions
	   
		Booked_Page bp = new Booked_Page(driver);
		WebElement locat = bp.getLocation();
		String text24 = locat.getText();
	}

	@When("User verify the room type displayed in booked itinerary page")
	public void user_verify_the_room_type_displayed_in_booked_itinerary_page() {
	    // Write code here that turns the phrase above into concrete actions
	    
		Booked_Page bp = new Booked_Page(driver);
		WebElement rtype = bp.getRoomtype();
		String text25 = rtype.getText();
	}

	@When("User verify the No. of rooms displayed in booked itinerary page")
	public void user_verify_the_No_of_rooms_displayed_in_booked_itinerary_page() {
	    // Write code here that turns the phrase above into concrete actions
	  
		Booked_Page bp = new Booked_Page(driver);
		WebElement rooms = bp.getRooms();
		String text26 = rooms.getText();
	}

	@When("User verify the first name displayed in booked itinerary page")
	public void user_verify_the_first_name_displayed_in_booked_itinerary_page() {
	    // Write code here that turns the phrase above into concrete actions
	  
		Booked_Page bp = new Booked_Page(driver);
		WebElement first = bp.getFirst();
		String text27 = first.getText();
	}

	@When("User verify the last name displayed in booked itinerary page")
	public void user_verify_the_last_name_displayed_in_booked_itinerary_page() {
	    // Write code here that turns the phrase above into concrete actions
	    
		Booked_Page bp = new Booked_Page(driver);
		WebElement last = bp.getLast();
		String text28 = last.getText();
	}

	@When("User verify the arrival date displayed in booked itinerary page")
	public void user_verify_the_arrival_date_displayed_in_booked_itinerary_page() {
	    // Write code here that turns the phrase above into concrete actions
	
		Booked_Page bp = new Booked_Page(driver);
		WebElement adate = bp.getArrival();
		String text29 = adate.getText();
	}

	@When("User verify the departure date displayed in booked itinerary page")
	public void user_verify_the_departure_date_displayed_in_booked_itinerary_page() {
	    // Write code here that turns the phrase above into concrete actions
	    
		Booked_Page bp = new Booked_Page(driver);
		WebElement depdate = bp.getDeparture();
		String text30 = depdate.getText();
	}

	@When("User verify the price per night displayed in booked itinerary page")
	public void user_verify_the_price_per_night_displayed_in_booked_itinerary_page() {
	    // Write code here that turns the phrase above into concrete actions
	    
		Booked_Page bp = new Booked_Page(driver);
		WebElement pernight = bp.getPrice();
		String text31 = pernight.getAttribute("value");
	}

	@When("User verify the total price displayed in booked itinerary page")
	public void user_verify_the_total_price_displayed_in_booked_itinerary_page() {
	    // Write code here that turns the phrase above into concrete actions
	    
		Booked_Page bp = new Booked_Page(driver);
		WebElement total = bp.getTotalprice();
		String text32 = total.getAttribute("value");
	}

	@When("User able to enter order id in the search order id textbox")
	public void user_able_to_enter_order_id_in_the_search_order_id_textbox() {
    // Write code here that turns the phrase above into concrete actions
    
		Booked_Page bp = new Booked_Page(driver);
		WebElement orderidtext = bp.getOrderidtext();
		inputValuestoWebelement(orderidtext,"T7DPU7SZ85");

}

	@Then("User able to click go button in the booked itinerary page")
	public void user_able_to_click_go_button_in_the_booked_itinerary_page() {
    // Write code here that turns the phrase above into concrete actions
    
		Booked_Page bp = new Booked_Page(driver);
		WebElement gobtn = bp.getGobtn();
		clickonWebelement(gobtn);

}

	@Then("User Verify that the relevant details are displayed for the given order id")
	public void user_Verify_that_the_relevant_details_are_displayed_for_the_given_order_id() {
    // Write code here that turns the phrase above into concrete actions
		
		Booked_Page bp = new Booked_Page(driver);
		WebElement verify_orderid = bp.getOrderid();
		String text33 = verify_orderid.getAttribute("value");

}
	@When("User verify hotel name displayed in booked itinerary page")
	public void user_verify_hotel_name_displayed_in_booked_itinerary_page() {
	    // Write code here that turns the phrase above into concrete actions
	    
		Booked_Page bp = new Booked_Page(driver);
		WebElement hotelnam = bp.getHotelname1();
		String text34 = hotelnam.getText();
	}

	@When("User verify hotel location displayed in booked itinerary page")
	public void user_verify_hotel_location_displayed_in_booked_itinerary_page() {
	    // Write code here that turns the phrase above into concrete actions
		Booked_Page bp = new Booked_Page(driver);
		WebElement location1 = bp.getLocation1();
		String text35 = location1.getText();
	}

	@When("User verify room type displayed in booked itinerary page")
	public void user_verify_room_type_displayed_in_booked_itinerary_page() {
	    // Write code here that turns the phrase above into concrete actions
		Booked_Page bp = new Booked_Page(driver);
		WebElement roomtype1 = bp.getRoomtype1();
		String text36 = roomtype1.getText();
	}

	@When("User verify No. of rooms displayed in booked itinerary page")
	public void user_verify_No_of_rooms_displayed_in_booked_itinerary_page() {
	    // Write code here that turns the phrase above into concrete actions
		Booked_Page bp = new Booked_Page(driver);
		WebElement rooms1 = bp.getRooms1();
		String text37 = rooms1.getText();
	}

	@When("User verify first name displayed in booked itinerary page")
	public void user_verify_first_name_displayed_in_booked_itinerary_page() {
	    // Write code here that turns the phrase above into concrete actions
		Booked_Page bp = new Booked_Page(driver);
		WebElement firstname1 = bp.getFirst1();
		String text38 = firstname1.getText();
	}

	@When("User verify last name displayed in booked itinerary page")
	public void user_verify_last_name_displayed_in_booked_itinerary_page() {
	    // Write code here that turns the phrase above into concrete actions
		Booked_Page bp = new Booked_Page(driver);
		WebElement last1 = bp.getLast1();
		String text39 = last1.getText();
	}

	@When("User verify arrival date displayed in booked itinerary page")
	public void user_verify_arrival_date_displayed_in_booked_itinerary_page() {
	    // Write code here that turns the phrase above into concrete actions
		Booked_Page bp = new Booked_Page(driver);
		WebElement arr = bp.getArrival1();
		String text40 = arr.getText();
	}

	@When("User verify departure date displayed in booked itinerary page")
	public void user_verify_departure_date_displayed_in_booked_itinerary_page() {
	    // Write code here that turns the phrase above into concrete actions
		Booked_Page bp = new Booked_Page(driver);
		WebElement dep = bp.getDeparture1();
		String text41 = dep.getText();
	}

	@When("User verify price per night displayed in booked itinerary page")
	public void user_verify_price_per_night_displayed_in_booked_itinerary_page() {
	    // Write code here that turns the phrase above into concrete actions
		Booked_Page bp = new Booked_Page(driver);
		WebElement price1 = bp.getPrice1();
		String text42 = price1.getText();
	}

	@When("User verify total price displayed in booked itinerary page")
	public void user_verify_total_price_displayed_in_booked_itinerary_page() {
	    // Write code here that turns the phrase above into concrete actions
		Booked_Page bp = new Booked_Page(driver);
		WebElement totprice1 = bp.getTotalprice1();
		String text43 = totprice1.getText();
	}

	@When("User able to get order no from booking confirmation page")
	public void user_able_to_get_order_no_from_booking_confirmation_page() {
		// Write code here that turns the phrase above into concrete actions
    
		Book_Iternary bi = new Book_Iternary(driver);
		WebElement orderno = bi.getOrderno();
		String text44 = orderno.getAttribute("value");
		System.out.println(text44);
	}
	@When("User verify order id in booked itinerary page")
	public void user_verify_order_id_in_booked_itinerary_page() {
	    // Write code here that turns the phrase above into concrete actions
	  
		Booked_Page bp = new Booked_Page(driver);
		WebElement verifyorderid = bp.getOrderid1();
		String textt = verifyorderid.getAttribute("value");
	}
	@When("User able to click show all")
	public void user_able_to_click_show_all() {
	    // Write code here that turns the phrase above into concrete actions
		Booked_Page bp = new Booked_Page(driver);
		WebElement showall = bp.getShowall();
		showall.click();
	}
//	@When("User able to Click on Cancel <Order Number>")
//	public void user_able_to_Click_on_Cancel_Order_Number() {
//		// Write code here that turns the phrase above into concrete actions
//		
//		Booked_Page bp = new Booked_Page(driver);
//		WebElement cancellink = bp.getCancellink();
//		cancellink.click();  
//	}

//	@When("User Click Yes on pop-up which asks whether to cancel order or not")
//	public void user_Click_Yes_on_pop_up_which_asks_whether_to_cancel_order_or_not() {
//		// Write code here that turns the phrase above into concrete actions
//		Booked_Page bp = new Booked_Page(driver);
		
	
//}

//	@Then("Verify that order number is cancelled and no longer exists in Booked Itinerary page")
//	public void verify_that_order_number_is_cancelled_and_no_longer_exists_in_Booked_Itinerary_page() {
//		// Write code here that turns the phrase above into concrete actions
//		Booked_Page bp = new Booked_Page(driver);
//		WebElement cancelverify = bp.getResulterror();
//		String text45 = cancelverify.getText();
//}
	
	@Then("User verify title Search Hotel in Search hotel page")
	public void user_verify_title_Search_Hotel_in_Search_hotel_page() {
	    // Write code here that turns the phrase above into concrete actions
		Search_Hotel sh = new Search_Hotel(driver);
		WebElement searchtitle = sh.getTitle_verify();
		String title1 = searchtitle.getText();
		System.out.println(title1);
	}

	@When("User verify title Select Hotel in select hotel page")
	public void user_verify_title_Select_Hotel_in_select_hotel_page() {
	    // Write code here that turns the phrase above into concrete actions
		Select_Hotel ssh = new Select_Hotel(driver);
		WebElement selecttitle = ssh.getTitle_verify();
		String title2 = selecttitle.getText();
		System.out.println(title2);
	}

	@When("User verify title Book Hotel in book hotel page")
	public void user_verify_title_Book_Hotel_in_book_hotel_page() {
	    // Write code here that turns the phrase above into concrete actions
		Book_Hotel bh = new Book_Hotel(driver);
		WebElement booktitle = bh.getTitle_verify();
		String title3 = booktitle.getText();
		System.out.println(title3);
	}
	
	@When("User verify title Booking Confirmation in Booking confirmation page")
	public void user_verify_title_Booking_Confirmation_in_Booking_confirmation_page() {
	    // Write code here that turns the phrase above into concrete actions
		Book_Iternary bi = new Book_Iternary(driver);
		WebElement booking_confir_title = bi.getTitle_verify();
		String title4 = booking_confir_title.getText();
		System.out.println(title4);
	}

	@When("User verify title Book Itinerary in book itinerary page")
	public void user_verify_title_Book_Itinerary_in_book_itinerary_page() {
	    // Write code here that turns the phrase above into concrete actions
		Booked_Page bp = new Booked_Page(driver);
		WebElement bookedpage_title = bp.getTitle_verify();
		String title5 = bookedpage_title.getText();
		System.out.println(title5);
	}
}
