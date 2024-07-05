package pagecomponents;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.WebUtility;

public class Signup extends WebUtility{
	
	@FindBy(xpath = "//span[text() = 'Account']")
	WebElement accountlink;
	
	@FindBy(xpath = "//a[text() = 'Create Account']")
	WebElement cre_account_btn;
	
	@FindBy(id = "firstName")
	WebElement firstname;
	
	@FindBy(id = "lastName")
	WebElement lastname;
	
	@FindBy(id = "email")
	WebElement email;
	
	@FindBy(id = "fld-p1")
	WebElement password;
	
	@FindBy(id = "reenterPassword")
	WebElement con_password;
	
	@FindBy(id = "phone")
	WebElement phone_num;
	
	@FindBy(xpath = "//div[@class = 'cia-form__controls ']//child::button")
	WebElement btn_create_account;
	
	public Signup() {
		PageFactory.initElements(driver, this);
	}
	
	public void createAccount() {
		
		linkClick(accountlink);
		linkClick(cre_account_btn);
		explicitWait(firstname, 5);
		sendText(firstname, prop.getProperty("firstname"));
		test.info("Firstname got Typed");
		sendText(lastname, prop.getProperty("lastname"));
		test.info("Lastname got Typed");
		sendText(email, prop.getProperty("email"));
		test.info("Email got Typed");
		sendText(password, prop.getProperty("password"));
		test.info("Password got Typed");
		sendText(con_password, prop.getProperty("confirmpass"));
		test.info("Confirm Password got Typed");
		sendText(phone_num, prop.getProperty("mob_number"));
		test.info("Phone number got Typed");
		clickButton(btn_create_account);
		test.info("Create an Account Button got Clicked");
		screenShot("SignupSS");
	}
}
