package pagecomponents;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.WebUtility;

public class SelectByBrand extends WebUtility{

	@FindBy(xpath = "//nav[@class = 'hamburger-menu']//child:: button")
	WebElement menu;
	
	@FindBy(xpath = "//ul[@class = 'hamburger-menu-flyout-list']/li/button[text() = 'Brands']")
	WebElement parlist;
	
	@FindBy(xpath = "//div[@class = 'hamburger-menu-flyout']//child::li/a[text() = 'Sony']")
	WebElement brand_name;
	
	@FindBy(xpath = "//div[@class = 'flex-copy-wrapper']//child::a[text() = 'Sony OLED and LED TVs']")
	WebElement product_type;
	
	@FindBy(partialLinkText = "Sony - 83\" Class BRAVIA XR A80L OLED 4K UHD Smart Google TV")
	WebElement Item_name;
	
	@FindBy(xpath = "//div[@class= 'fulfillment-add-to-cart-button']")
	WebElement addtocart_btn;
	
	@FindBy(xpath = "//div[@class = 'go-to-cart-button']")
	WebElement cart_Icon;
	
	@FindBy(xpath = "//button[@class = 'c-close-icon c-modal-close-icon']")
	WebElement close_btn;
		
	public SelectByBrand() {
		PageFactory.initElements(driver, this);
	}
	
	public void shopByBrand() throws Exception {
		
		linkClick(menu);
		test.info("Menu is got Clicked");
		linkClick(parlist);
		test.info("Parent Menu link is Clicked");
		linkClick(brand_name);
		test.info("Sub Menu link is Clicked");
		linkClick(product_type);
		test.info("Product type link is Clicked");
		linkClick(Item_name);
		test.info("Item is Selected");
		clickButton(addtocart_btn);
		test.info("Add to Cart Button is Clicked");
		explicitWait(cart_Icon, 7);
		clickButton(cart_Icon);
		test.info("Go to Cart Button is Clicked");
		clickButton(close_btn);
		Thread.sleep(5000);
		screenShot("ShopbyBrandSS");
	}
}
