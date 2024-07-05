package pagecomponents;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.WebUtility;

public class SearchByItem extends WebUtility{

	@FindBy(xpath = "//input[@name = 'st']" )
	WebElement searchBox;
	
	@FindBy(xpath = "//button[@class = 'header-search-button']")
	WebElement search_icon;
	
	@FindBy(partialLinkText = "Apple - Pre-Owned iPhone 15 Pro Max 5G 1TB (Unlocked) - Natural Titanium")
	WebElement item_list;
	
	@FindBy(xpath = "//div[contains(@id,'fulfillment-add-to-cart-button-')]")
	WebElement addtocart_button;
	
	@FindBy(xpath = "//div[@class = 'go-to-cart-button']")
	WebElement cart_Icon;
	
	public SearchByItem() {
		PageFactory.initElements(driver, this);
	}
	
	public void searchByIteam() throws Exception {
		sendText(searchBox, "iphone 15 pro max");
		test.info("In Search Box iphone 15 pro max text got Typed");
		clickButton(search_icon);
		test.info("Search Icon is Clicked");
		explicitWait(item_list, 5);
		clickButton(item_list);
		test.info("Product has been Clicked");
		explicitWait(addtocart_button, 5);
		clickButton(addtocart_button);
		test.info("Add to Cart Button Got Clicked");
		explicitWait(cart_Icon, 15);
		clickButton(cart_Icon);
		Thread.sleep(8000);
		screenShot("SearchbyItemSS");
	}
}
