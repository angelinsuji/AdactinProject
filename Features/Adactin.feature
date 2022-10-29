@tag1
Feature: Adactin - Hotel Reservation System end to end test case

Background: User able to Launch Browser

Given    User able to Launch Login Page Successfully

When User enters the username in the 'username' textbox

And User enters the password in the 'password' textbox

And User clicks on the login button in Login Page

Then User verify the username displayed in the header


Scenario Outline: To verify whether the check-out date field accepts a later date than check-in date

When User able to select the location

And User able to select the hotel

And User able to select the Room type

And User able to select Number of roooms

And User able to enter '<Checkindate>' in the Checkin date textbox

And User able to enter '<Checkoutdate>' in the Checkout date textbox

Then User verify that system gives an error saying ‘check-indate should not be later than checkout-date’

Examples:

|Checkindate|Checkoutdate|
|6/11/2022|4/11/2022|

Scenario Outline: To check if error is date field is in the past

When User able to select the location

And User able to select the hotel

And User able to select the Room type

And User able to select Number of roooms

And User able to enter '<Checkindate>' in the Checkin date textbox

And User able to enter '<Checkoutdate>' in the Checkout date textbox

Then User Verify that application throws error message

Examples:

|Checkindate|Checkoutdate|
|6/11/2022|4/11/2022|

Scenario Outline: To verify whether locations in Select Hotelpage are displayed according to the location selected in Search Hotel

When User able to select the location

And User able to select the hotel

And User able to select the Room type

And User able to select Number of roooms

And User able to enter '<Checkindate>' in the Checkin date textbox

And User able to enter '<Checkoutdate>' in the Checkout date textbox

And User able to select Number of Adult rooms

And User able to select Number of Child rooms

And User able to click the search Button

Then User verify that hotel location displayed is the same as selected in search Hotel form

Then User verify that hotel name displayed is the same as selected in search Hotel form

Examples:

|Checkindate|Checkoutdate|
|6/11/2022|7/11/2022|

Scenario Outline: To verify date and Check Out date are being displayed in Select Hotel Page according to the dates selected in search Hotel

When User able to select the location

And User able to select the hotel

And User able to select the Room type

And User able to select Number of roooms

And User able to enter '<Checkindate>' in the Checkin date textbox

And User able to enter '<Checkoutdate>' in the Checkout date textbox

And User able to select Number of Adult rooms

And User able to select Number of Child rooms

And User able to click the search Button

Then User verify that check-in-date are the same as selected in search hotel form

Then User verify that check-out-date are the same as selected in search hotel form

Examples:
|Checkindate|Checkoutdate|
|6/11/2022|7/11/2022|

Scenario: To verify whether no. of rooms entry in Select Hotel page is same as the Number of rooms selected in search hotel page

When User able to select the location

And User able to select the hotel

And User able to select the Room type

And User able to select the Number of roooms

And User able to enter Checkindate in the Checkin date textbox

And User able to enter Checkoutdate in the Checkout date textbox

And User able to select Number of Adult rooms

And User able to select Number of Child rooms

And User able to click the search Button

Then User verify that no.of rooms reflected according to the no. of rooms selected in search hotel page


Scenario: To verify whether Room Type in Select Hotel page is same as Room type selected in search hotel page

When User able to select the location

And User able to select the hotel

And User able to select Room type

And User able to select Number of roooms

And User able to enter Checkindate in the Checkin date textbox

And User able to enter Checkoutdate in the Checkout date textbox

And User able to select Number of Adult rooms

And User able to select Number of Child rooms

And User able to click the search Button

Then User Verify that room type reflected is the same as selected in search hotel page


Scenario: To verify whether the total price (excl.GST) is calculated as “price per night *no. of nights* no of rooms”

When User able to select the location

And User able to select the hotel

And User able to select Room type

And User able to select Number of roooms

And User able to enter Checkindate in the Checkin date textbox

And User able to enter Checkoutdate in the Checkout date textbox

And User able to select Number of Adult rooms

And User able to select Number of Child rooms

And User able to click the search Button

Then Verify the total price excl GST is being calculated as price-per-night no-of-rooms no-of-days

And User able to select the radio button in the Select hotel page

And User able to click continue button in the Select hotel page


Scenario: To verify when pressed, logout button logs out from the application

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

And User able to click on book now button in the book a hotel page

Then User able to logout the application


Scenario: To check correct total price is Being Calculated as “price per night*no of days*no of rooms in Book a hotel Page

When User able to select the hotel location

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

Then User Verify that total-price is being calculated as price-pernight no-ofrooms no-of-days GST 

