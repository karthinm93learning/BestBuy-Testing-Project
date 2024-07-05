package enginecomponents;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentTest;
import com.beust.jcommander.Parameter;

import utils.GeneralUtility;
import utils.WebUtility;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class BaseClass extends WebUtility{
	
	@Parameters({"Browser"})
	@BeforeSuite
	public void beforeSuite(String Browser) throws Exception {
		reportInit();
		prop();
		launchBrowser(Browser); //Report init
		pageOpen();
	}
		
	@BeforeClass
	public void beforeClass() {
		test = reports.createTest(testcase); 
	}

	
	@BeforeMethod
	public void beforeMethod() {
		 // Browser lunch
		
	}

	@AfterMethod
	public void afterMethod() {
		// Close browser
		
	}

	@AfterClass
	public void afterClass() {
		
		// Closing test case info(Name of person run,Time of execution)
	}
	

	@AfterTest
	public void afterTest() throws Exception {
		
		book.close();
		file.close();
		// close Db connect, Excel connect, property file
	}

	@AfterSuite
	public void afterSuite() {
		reports.flush();
		driver.close();
	}
	
	@DataProvider
	public Object[][] readDataLogic() throws Exception {
		 Object[][] data = readExcel(sheetname);
		return data;
	}

}
