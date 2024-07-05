package utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebUtility extends GeneralUtility{
	
	public static WebDriver driver = null;
	public String sheetname;
	public String testcase;

	public static void launchBrowser(String browser) {
		
		switch (browser) {
		case "Chrome":
			ChromeOptions option = new ChromeOptions();
			option.addArguments("disable-popup-blocking");
			DesiredCapabilities descapabilities = new DesiredCapabilities();
			descapabilities.setCapability(ChromeOptions.CAPABILITY, option);
			driver = new ChromeDriver();
			break;
		case "Firefox":
			FirefoxOptions options = new FirefoxOptions();
			options.addArguments("disable-popup-blocking");
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability(ChromeOptions.CAPABILITY, options);
			driver = new FirefoxDriver();
			break;
		default:
			break;
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	}
	
	public static void pageOpen() {
		driver.navigate().to(prop.getProperty("url"));
	}
	
	public static void linkClick(WebElement ele) {
		ele.click();
	}
	
	public static void sendText(WebElement ele, String value) {
		ele.sendKeys(value);
	}
	
	public static void clickButton(WebElement ele) {
		ele.click();
	}
	
	public static void navigateToURL(String url) {
		driver.get(url);
	}
	
	public static void selectList(WebElement ele, String value) {
		
		Select list = new Select(ele);
		list.selectByVisibleText(value);
	}
		
	public static void screenShot(String filename) {
		//String timestamp = new SimpleDateFormat("yyyymmddhhmmss").format(new Date());
		String location = System.getProperty("user.dir")+ "/" + filename +".png";
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File(location);
		
		try {
			FileHandler.copy(src, des);
		} catch (IOException e) {
			
			System.out.println(e);
		}
	}
	
	public static void explicitWait(WebElement ele, int time) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
		wait.until(ExpectedConditions.visibilityOf(ele));
	}
	
}
