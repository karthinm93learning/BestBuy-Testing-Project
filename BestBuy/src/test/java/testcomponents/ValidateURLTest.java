package testcomponents;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import enginecomponents.BaseClass;
import pagecomponents.URLValidation;

public class ValidateURLTest extends BaseClass {

	@BeforeTest
	public void beforeTest() throws IOException {
		
		prop(); //Db connect, Excel connect, property file
		testcase = "testValidateURL";
	}
	
	@Test
	public void testValidateURL() throws Exception {
		
		URLValidation obj = new URLValidation();
		obj.validateLink();
		test.pass("Bestbuy URL is Validated");
	}
}
