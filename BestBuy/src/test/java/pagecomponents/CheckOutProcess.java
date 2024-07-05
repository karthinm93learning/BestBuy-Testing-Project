package pagecomponents;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.WebUtility;

public class CheckOutProcess extends WebUtility{

	/*@FindBy(xpath = "//span[@class = 'cart-label']")
	WebElement link_Cart;*/
	
	@FindBy(xpath = "//button[text() = 'Checkout']")
	WebElement checkout_btn;
	
	@FindBy(xpath = "//button[text() = 'Continue as Guest']")
	WebElement continueasguest;
	
	@FindBy(id = "user.emailAddress")
	WebElement emailBox;
	
	@FindBy(id = "user.phone")
	WebElement phoneNumBox;
	
	@FindBy(xpath = "//button[@class = 'btn btn-lg btn-block btn-secondary']")
	WebElement contPayment_btn;
	
	@FindBy(xpath = "//input[@id = 'number']")
	WebElement ccNum_Field;
	
	@FindBy(xpath = "//input[@id = 'expirationDate']")
	WebElement exp_date;
	
	@FindBy(xpath = "//input[@id = 'cvv']")
	WebElement cvv;
	
	@FindBy(xpath = "//input[@id = 'first-name']")
	WebElement firstname_field;
	
	@FindBy(xpath = "//input[@id = 'last-name']")
	WebElement lastname_field;
	
	@FindBy(xpath = "//input[@name = 'addressLine1']")
	WebElement address;
	
	@FindBy(xpath = "//input[@id = 'city']")
	WebElement city;
	
	@FindBy(xpath = "//select[@id = 'state']")
	WebElement state;
	
	@FindBy(xpath = "//input[@id = 'postalCode']")
	WebElement zipcode;
	
	@FindBy(xpath = "//span[text() = 'Place Your Order']")
	WebElement placeyouord_btn;
	
	
	public CheckOutProcess() {
		PageFactory.initElements(driver, this);
	}
	
	public void paymentProcess() {
		
		//clickButton(link_Cart);
		clickButton(checkout_btn);
		test.info("Checkout Page Checkout Button is Clicked");
		explicitWait(continueasguest, 5);
		clickButton(continueasguest);
		test.info("Continue As guest Butto is Clicked");
		explicitWait(emailBox, 5);
		sendText(emailBox, prop.getProperty("email"));
		test.info("Email Id is typed in box");
		sendText(phoneNumBox, prop.getProperty("mob_number"));
		test.info("Mobile number is typed in box");
		clickButton(contPayment_btn);
		test.info("Continue Payment Button is Clicked");
		explicitWait(ccNum_Field, 5);
		sendText(ccNum_Field, prop.getProperty("CCNumber"));
		test.info("Credit Card Number is typed");
		sendText(exp_date, prop.getProperty("expdate"));
		test.info("Expried date is typed");
		sendText(cvv, prop.getProperty("cvv"));
		test.info("CCV Number is typed");
		sendText(firstname_field, prop.getProperty("firstname"));
		test.info("First Name is typed");
		sendText(lastname_field, prop.getProperty("lastname"));
		test.info("Last Name is typed");
		sendText(address, prop.getProperty("Address"));
		test.info("Address is typed");
		sendText(city, prop.getProperty("City"));
		test.info("City is typed");
		selectList(state, "IL");
		test.info("State is got Selected");
		sendText(zipcode, prop.getProperty("Zipcode"));
		test.info("Zipcode is typed");
		clickButton(placeyouord_btn);
		test.info("Place your order button is Clicked");
		
	}
	
}
