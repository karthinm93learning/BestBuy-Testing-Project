package testcomponents;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.MediaEntityBuilder;

import enginecomponents.BaseClass;
import pagecomponents.ShopByDepartment;

public class ShopByDeptTest extends BaseClass{

	@BeforeTest
	public void beforeTest() throws IOException {
		
		prop(); //Db connect, Excel connect, property file
		testcase = "testShopByDept";
	}
	
	
	@Test
	public void testShopByDept() throws Exception {
		ShopByDepartment obj = new ShopByDepartment();
		obj.addProductByDepartment();
		test.pass("Shop By Department test case is Successful",
		MediaEntityBuilder.createScreenCaptureFromPath("ShopbydeptSS.png").build());
	}
}
