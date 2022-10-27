@tag2
Feature: Adactin - Hotel Reservation System end to end test case1

Background: User able to Launch Browser

Given    User able to Launch Login Page Successfully

When User enters the username in the 'username' textbox

And User enters the password in the 'password' textbox

And User clicks on the login button in Login Page

Then User verify the username displayed in the header


Scenario: To check Hotel name, Location, room type, Total Day, price per night

When User able to select the location

And User able to select the hotel

And User able to select the Room type

And User able to select Num of roooms

And User able to enter Checkindate in the Checkin date textbox

And User able to enter Checkoutdate in the Checkout date textbox

And User able to select Number of Adult rooms

And User able to select Number of Child rooms

And User able to click the search Button

And User able to select the radio button in the search hotel page

And User able to click continue button in the search hotel page

And User verify the hotel location displayed in book a hotel page 

And User verify the hotel name displayed in book a hotel page

And User verify the room type displayed in book a hotel page

And User verify the No. of rooms displayed in book a hotel page

And User Verify that total-price is being calculated as price-pernight no-ofrooms no-ofdays



Scenario: To check correct Final billed price is Total Price + 10% Total price in Book a Hotel page

When User able to select the location

And User able to select the hotel

And User able to select the Room type

And User able to select Num of roooms

And User able to enter Checkindate in the Checkin date textbox

And User able to enter Checkoutdate in the Checkout date textbox

And User able to select Number of Adult rooms

And User able to select Number of Child rooms

And User able to click the search Button

And User able to select the radio button in the search hotel page

And User able to click continue button in the search hotel page

Then User verify final billed price in book a hotel page


Scenario: To verify whether the data displayed is same as the selected data in Book hotel page

When User able to select the location

And User able to select the hotel

And User able to select the Room type

And User able to select Num of roooms

And User able to enter Checkindate in the Checkin date textbox

And User able to enter Checkoutdate in the Checkout date textbox

And User able to select Number of Adult rooms

And User able to select Number of Child rooms

And User able to click the search Button

And User able to select the radio button in the search hotel page

And User able to click continue button in the search hotel page

And User verify the hotel name displayed in book a hotel page

And User verify the hotel location displayed in book a hotel page

And User verify the room type displayed in book a hotel page

And User verify the No. of rooms displayed in book a hotel page

And User Verify that total-price is being calculated as price-pernight no-ofrooms no-ofdays


Scenario: Verify Order number is generated in booking confirmation page

When User able to select the location

And User able to select the hotel

And User able to select the Room type

And User able to select Num of roooms

And User able to enter Checkindate in the Checkin date textbox

And User able to enter Checkoutdate in the Checkout date textbox

And User able to select Number of Adult rooms

And User able to select Number of Child rooms

And User able to click the search Button

And User able to select the radio button in the search hotel page

And User able to click continue button in the search hotel page

And User able to enter first name in the first name textbox

And User able to enter last name in the last name textbox

And User able to enter billing address in the billing address textbox

And User able to enter credit card number in the credit card number textbox

And User able to select credit card type

And User able to select expiry month

And User able to select expiry year

And User able to enter credit card cvv number in the cvv number textbox

And User able to click book now button in book a hotel page

Then User verify Order number is generated in booking confirmation page


Scenario: To verify whether the booked itinerary details are not editable

When User able to select the location of hotel

And User able to select the name of hotel

And User able to select the Room type

And User able to select Num of roooms

And User able to enter Checkindate in the Checkin date textbox

And User able to enter Checkoutdate in the Checkout date textbox

And User able to select Number of Adult rooms

And User able to select Number of Child rooms

And User able to click the search Button

And User able to select the radio button in the search hotel page

And User able to click continue button in the search hotel page

And User able to enter first name in the first name textbox

And User able to enter last name in the last name textbox

And User able to enter billing address in the billing address textbox

And User able to enter credit card number in the credit card number textbox

And User able to select credit card type

And User able to select expiry month

And User able to select expiry year

And User able to enter credit card cvv number in the cvv number textbox

And User able to click book now button in book a hotel page

And User able to click my itinerary button in booking confirmation page

Then User verify that the details are not editable in booked itinerary page


Scenario: To check whether the booked itinerary reflects the correct information in line with the booking

When User able to select the location

And User able to select the hotel

And User able to select the Room type

And User able to select Num of roooms

And User able to enter Checkindate in the Checkin date textbox

And User able to enter Checkoutdate in the Checkout date textbox

And User able to select Number of Adult rooms

And User able to select Number of Child rooms

And User able to click the search Button

And User able to select the radio button in the search hotel page

And User able to click continue button in the search hotel page

And User able to enter first name in the first name textbox

And User able to enter last name in the last name textbox

And User able to enter billing address in the billing address textbox

And User able to enter credit card number in the credit card number textbox

And User able to select credit card type

And User able to select expiry month

And User able to select expiry year

And User able to enter credit card cvv number in the cvv number textbox

And User able to click book now button in book a hotel page

And User able to click my itinerary button in booking confirmation page

And User verify the hotel name displayed in booked itinerary page 

And User verify the hotel location displayed in booked itinerary page 

And User verify the room type displayed in booked itinerary page 

And User verify the No. of rooms displayed in booked itinerary page 

And User verify the first name displayed in booked itinerary page 

And User verify the last name displayed in booked itinerary page 

And User verify the arrival date displayed in booked itinerary page 

And User verify the departure date displayed in booked itinerary page 

And User verify the price per night displayed in booked itinerary page 

And User verify the total price displayed in booked itinerary page 


Scenario: To check whether search order id” query is working and displaying the relevant details

When User able to select the location

And User able to select the hotel

And User able to select the Room type

And User able to select Num of roooms

And User able to enter Checkindate in the Checkin date textbox

And User able to enter Checkoutdate in the Checkout date textbox

And User able to select Number of Adult rooms

And User able to select Number of Child rooms

And User able to click the search Button

And User able to select the radio button in the search hotel page

And User able to click continue button in the search hotel page

And User able to enter first name in the first name textbox

And User able to enter last name in the last name textbox

And User able to enter billing address in the billing address textbox

And User able to enter credit card number in the credit card number textbox

And User able to select credit card type

And User able to select expiry month

And User able to select expiry year

And User able to enter credit card cvv number in the cvv number textbox

And User able to click book now button in book a hotel page

And User able to click my itinerary button in booking confirmation page

And User able to enter order id in the search order id textbox

And User able to click go button in the booked itinerary page

Then User Verify that the relevant details are displayed for the given order id


Scenario: Verify that all the details of newly generated order number in booked itinerary page are correct and match with data during booking

When User able to select the location

And User able to select the hotel

And User able to select the Room type

And User able to select Num of roooms

And User able to enter Checkindate in the Checkin date textbox

And User able to enter Checkoutdate in the Checkout date textbox

And User able to select Number of Adult rooms

And User able to select Number of Child rooms

And User able to click the search Button

And User able to select the radio button in the search hotel page

And User able to click continue button in the search hotel page

And User able to enter first name in the first name textbox

And User able to enter last name in the last name textbox

And User able to enter billing address in the billing address textbox

And User able to enter credit card number in the credit card number textbox

And User able to select credit card type

And User able to select expiry month

And User able to select expiry year

And User able to enter credit card cvv number in the cvv number textbox

And User able to click book now button in book a hotel page

And User able to click my itinerary button in booking confirmation page

And User able to enter order id in the search order id textbox

And User able to click go button in the booked itinerary page

And User verify order id in booked itinerary page

And User verify hotel name displayed in booked itinerary page 

And User verify hotel location displayed in booked itinerary page 

And User verify room type displayed in booked itinerary page 

And User verify No. of rooms displayed in booked itinerary page 

And User verify first name displayed in booked itinerary page 

And User verify last name displayed in booked itinerary page 

And User verify arrival date displayed in booked itinerary page 

And User verify departure date displayed in booked itinerary page 

And User verify price per night displayed in booked itinerary page 

And User verify total price displayed in booked itinerary page 


Scenario: To verify that the order gets cancelled after click on Cancel order number link

When User able to select the location

And User able to select the hotel

And User able to select the Room type

And User able to select Num of roooms

And User able to enter Checkindate in the Checkin date textbox

And User able to enter Checkoutdate in the Checkout date textbox

And User able to select Number of Adult rooms

And User able to select Number of Child rooms

And User able to click the search Button

And User able to select the radio button in the search hotel page

And User able to click continue button in the search hotel page

And User able to enter first name in the first name textbox

And User able to enter last name in the last name textbox

And User able to enter billing address in the billing address textbox

And User able to enter credit card number in the credit card number textbox

And User able to select credit card type

And User able to select expiry month

And User able to select expiry year

And User able to enter credit card cvv number in the cvv number textbox

And User able to click book now button in book a hotel page

And User able to get order no from booking confirmation page

And User able to click my itinerary button in booking confirmation page

And User able to enter order id in the search order id textbox

And User able to click go button in the booked itinerary page

And User able to click show all 

#And User able to Click on Cancel <Order Number>

#And User Click Yes on pop-up which asks whether to cancel order or not

#Then User Verify that order number is cancelled and no longer exists in Booked Itinerary page


Scenario: To verify Title of every Page reflects what the page objective is. For example Title of Search Hotel page should have Search Hotel

And User verify title Search Hotel in Search hotel page

When User able to select the location

And User able to select the hotel

And User able to select the Room type

And User able to select Num of roooms

And User able to enter Checkindate in the Checkin date textbox

And User able to enter Checkoutdate in the Checkout date textbox

And User able to select Number of Adult rooms

And User able to select Number of Child rooms

And User able to click the search Button

Then User verify title Select Hotel in select hotel page

And User able to select the radio button in the search hotel page

And User able to click continue button in the search hotel page

Then User verify title Book Hotel in book hotel page

And User able to enter first name in the first name textbox

And User able to enter last name in the last name textbox

And User able to enter billing address in the billing address textbox

And User able to enter credit card number in the credit card number textbox

And User able to select credit card type

And User able to select expiry month

And User able to select expiry year

And User able to enter credit card cvv number in the cvv number textbox

And User able to click book now button in book a hotel page

Then User verify title Booking Confirmation in Booking confirmation page

And User able to click my itinerary button in booking confirmation page

Then User verify title Book Itinerary in book itinerary page
