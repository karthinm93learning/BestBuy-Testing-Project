package testcomponents;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.MediaEntityBuilder;

import enginecomponents.BaseClass;
import pagecomponents.SelectByBrand;

public class BrandShopTest extends BaseClass{

	@BeforeTest
	public void beforeTest() throws IOException {
		
		prop(); //Db connect, Excel connect, property file
		testcase = "testShopByBrand";
	}
	
	
	@Test
	public void testShopByBrand() throws Exception {
		
		SelectByBrand obj = new SelectByBrand();
		obj.shopByBrand();
		test.pass("Shop by Brand test case is Sucessful", 
				MediaEntityBuilder.createScreenCaptureFromPath("ShopbyBrandSS.png").build());
	}
}
