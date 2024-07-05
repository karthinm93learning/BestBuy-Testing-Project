package pagecomponents;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.WebUtility;

public class Login extends WebUtility{

	@FindBy(xpath = "//span[text() = 'Account']")
	WebElement accountlink;
	
	@FindBy(xpath = "//a[text() = 'Sign In']")
	WebElement par_signin_btn;
	
	@FindBy(id = "fld-e")
	WebElement email_field;
	
	@FindBy(id = "fld-p1")
	WebElement password_field;
	
	@FindBy(xpath ="//button[text()= 'Sign In']")
	WebElement signin_btn;
	
	public Login() {
		PageFactory.initElements(driver, this);
	}
	
	public void Signin(String username, String password) throws Exception {
		navigateToURL("https://www.bestbuy.com/?intl=nosplash");
		linkClick(accountlink);
		linkClick(par_signin_btn);
		sendText(email_field,username);
		sendText(password_field, password);
		clickButton(signin_btn);
		Thread.sleep(3000);
	}
}
