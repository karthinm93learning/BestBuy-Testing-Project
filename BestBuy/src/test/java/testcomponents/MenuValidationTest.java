package testcomponents;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import enginecomponents.BaseClass;
import pagecomponents.AllMenuValidation;

public class MenuValidationTest extends BaseClass{

	@BeforeTest
	public void beforeTest() throws Exception {
		
		prop();//Db connect, Excel connect, property file
		testcase = "testMenuValidation";
	}
	
	@Test
	public void testMenuValidation()  {
		
		AllMenuValidation obj = new AllMenuValidation();
		obj.validateMenus();
		test.pass("All Menu Title are Validated");
		
	}
}
