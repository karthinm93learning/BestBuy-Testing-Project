package pagecomponents;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.WebUtility;

public class ShopByDepartment extends WebUtility{

	@FindBy(xpath = "//nav[@class = 'hamburger-menu']//child:: button")
	WebElement menu;
	
	@FindBy(xpath = "//ul[@class = 'hamburger-menu-flyout-list']/li/button[text() = 'Wearable Technology']")
	WebElement parlist;
	
	@FindBy(xpath = "//div[@class = 'hamburger-menu-flyout']//child::li/button[text() = 'Smartwatches']")
	WebElement sub_brand;
	
	@FindBy(xpath = "//div[@class = 'hamburger-menu-flyout-list-item-wrapper']//child::li/a[text() = 'Samsung Galaxy Smartwatches']")
	WebElement brand_name;
	
	@FindBy(partialLinkText = "Samsung - Galaxy Watch6 Classic Stainless Steel")
	WebElement select_Item;
	
	@FindBy(xpath = "(//button[text() = 'Add to Cart'])[4]")
	WebElement addtocart_btn;
	
	@FindBy(xpath = "//a[text() = 'Go to Cart']")
	WebElement gotocart_btn;
	
	public ShopByDepartment() {
		PageFactory.initElements(driver, this);
	}
	
	public void addProductByDepartment() throws Exception {
		linkClick(menu);
		test.info("Menu is got Clicked");
		linkClick(parlist);
		test.info("Parent Menu link is Clicked");
		linkClick(sub_brand);
		test.info("Sub Menu link is Clicked");
		linkClick(brand_name);
		test.info("Brand link is Clicked");
		linkClick(select_Item);
		test.info("Item is Selected");
		clickButton(addtocart_btn);
		test.info("Add to Cart Button is Clicked");
		explicitWait(gotocart_btn, 5);
		clickButton(gotocart_btn);
		test.info("Go to Cart Button is Clicked");
		Thread.sleep(5000);
		screenShot("ShopbydeptSS");
	}
}
