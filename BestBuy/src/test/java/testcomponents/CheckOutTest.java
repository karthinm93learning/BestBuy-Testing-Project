package testcomponents;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import enginecomponents.BaseClass;
import pagecomponents.CheckOutProcess;

public class CheckOutTest extends BaseClass{

	@BeforeTest
	public void beforeTest() throws IOException {
		
		prop(); //Db connect, Excel connect, property file
		testcase = "testCheckOut";
	}
	@Test
	public void testCheckOut() {
		
		CheckOutProcess cheobj = new CheckOutProcess();
		cheobj.paymentProcess();
	}
}
