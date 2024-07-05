package pagecomponents;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.WebUtility;

public class AllMenuValidation extends WebUtility{

	@FindBy(partialLinkText = "Top Deals")
	WebElement topdeals_link;
	
	@FindBy(partialLinkText = "Deal of the Day")
	WebElement dealofday_link;
	
	@FindBy(partialLinkText = "Yes, Best Buy Sells That")
	WebElement bestbuysells_link;
	
	@FindBy(partialLinkText =  "My Best Buy Memberships")
	WebElement bestbuymemberships_link;
	
	@FindBy(partialLinkText = "Credit Cards")
	WebElement creditcards_link;
	
	@FindBy (partialLinkText = "Gift Cards")
	WebElement giftcard_link;
	
	@FindBy(partialLinkText = "Gift Ideas")
	WebElement giftideas_link;
	
	@FindBy(xpath = "//span[text() = 'More']")
	WebElement more;
	
	public AllMenuValidation() {
		PageFactory.initElements(driver, this);
	}
	
	public void validateMenus()  {
		
		navigateToURL("https://www.bestbuy.com/?intl=nosplash");
		
		linkClick(topdeals_link);
		assertTrue(driver.getTitle().contains(prop.getProperty("topdeals")));
		driver.navigate().back();
		test.info("Top Deals Menu titles are Valid");
		
		linkClick(dealofday_link);
		assertTrue(driver.getTitle().contains(prop.getProperty("dealoftheday")));
		driver.navigate().back();
		test.info("Deal of day Menu titles are Valid");
		
		/*linkClick(bestbuysells_link);
		assertTrue(driver.getTitle().contains(prop.getProperty("yesbest")));
		driver.navigate().back();
		test.info("Best buy Sells Menu titles are Valid");*/
		
		linkClick(bestbuymemberships_link);
		assertTrue(driver.getTitle().contains(prop.getProperty("mybestbuy")));
		driver.navigate().back();
		test.info("Best buy Memberships Menu titles are Valid");
		
		linkClick(creditcards_link);
		assertTrue(driver.getTitle().contains(prop.getProperty("creditcard")));
		driver.navigate().back();
		test.info("Credit Card Menu titles are Valid");
		
		linkClick(giftcard_link);
		assertTrue(driver.getTitle().contains(prop.getProperty("giftcard")));
		driver.navigate().back();
		test.info("Gift Card Menu titles are Valid");
		
		linkClick(more);
		
		linkClick(giftideas_link);
		assertTrue(driver.getTitle().contains(prop.getProperty("giftideas")));
		driver.navigate().back();
		test.info("Gift Ideas Menu titles are Valid");
	}
}
