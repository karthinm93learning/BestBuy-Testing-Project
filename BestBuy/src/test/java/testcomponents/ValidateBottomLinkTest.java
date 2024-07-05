package testcomponents;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import enginecomponents.BaseClass;
import pagecomponents.BottomLinksValidations;

public class ValidateBottomLinkTest extends BaseClass{

	@BeforeTest
	public void beforeTest() throws IOException {
		
		prop(); //Db connect, Excel connect, property file
		testcase = "testBottomVerifyLink";
	}
	
	@Test
	public void testBottomVerifyLink() {
		
		BottomLinksValidations obj = new BottomLinksValidations();
		obj.validateBottomLinks();
		test.pass("Botton Linked are Valid");
	}
}
