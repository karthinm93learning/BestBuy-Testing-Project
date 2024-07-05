package pagecomponents;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.WebUtility;

public class BottomLinksValidations extends WebUtility{

	@FindBy(partialLinkText = "Accessibility")
	WebElement link_accessibility;
	
	@FindBy(partialLinkText = "Terms & Conditions")
	WebElement link_TC;
	
	@FindBy(partialLinkText = "Privacy")
	WebElement link_Privacy;
	
	@FindBy(partialLinkText = "Interest-Based Ads")
	WebElement link_Intersbased;
	
	@FindBy(partialLinkText = "State Privacy Rights")
	WebElement link_State_Priva;
	
	@FindBy(partialLinkText = "Health Data Privacy")
	WebElement link_Health_Data;
	
	@FindBy(partialLinkText = "Do Not Sell/Share My Personal Information")
	WebElement link_DoNotSell;
	
	@FindBy(partialLinkText = "Limit Use of My Sensitive Personal Information")
	WebElement link_Limituse;
	
	@FindBy(partialLinkText = "Targeted Advertising Opt Out")
	WebElement link_TargetedAdver;
	
	@FindBy(partialLinkText = "CA Supply Chain Transparency Act")
	WebElement link_CASupply;
	
	
	public BottomLinksValidations() {
		PageFactory.initElements(driver, this);
	}
	
	public void validateBottomLinks() {
		
		linkClick(link_accessibility);
		assertTrue(driver.getTitle().contains(prop.getProperty("Accessibility")));
		driver.navigate().back();
		test.info("Accessibility Link is Valid");
		
		linkClick(link_TC);
		assertTrue(driver.getTitle().contains(prop.getProperty("TC")));
		driver.navigate().back();
		test.info("Terms & Conditions Link is Valid");
		
		linkClick(link_Privacy);
		assertTrue(driver.getTitle().contains(prop.getProperty("Privacy")));
		driver.navigate().back();
		test.info("Privacy Link is Valid");
		
		linkClick(link_Intersbased);
		assertTrue(driver.getTitle().contains(prop.getProperty("Interest")));
		driver.navigate().back();
		test.info("Interest-Based Ads Link is Valid");
		
		linkClick(link_State_Priva);
		assertTrue(driver.getTitle().contains(prop.getProperty("State")));
		driver.navigate().back();
		test.info("State Privacy Rights Link is Valid");
		
		linkClick(link_Health_Data);
		assertTrue(driver.getTitle().contains(prop.getProperty("Health")));
		driver.navigate().back();
		test.info("Health Data Privacy Link is Valid");
		
		linkClick(link_DoNotSell);
		assertTrue(driver.getTitle().contains(prop.getProperty("DoNotSell")));
		driver.navigate().back();
		test.info("Do Not Sell - Link is Valid");
		
		linkClick(link_Limituse);
		assertTrue(driver.getTitle().contains(prop.getProperty("LimitUse")));
		driver.navigate().back();
		test.info("Limit Use - Link is Valid");
		
		linkClick(link_TargetedAdver);
		assertTrue(driver.getTitle().contains(prop.getProperty("Targeted")));
		driver.navigate().back();
		test.info("Targeted Advertising - Link is Valid");
		
		linkClick(link_CASupply);
		assertTrue(driver.getTitle().contains(prop.getProperty("CASupply")));
		driver.navigate().back();
		test.info("CA Supply - Link is Valid");
		
	}
}
