package testcomponents;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.MediaEntityBuilder;

import enginecomponents.BaseClass;
import pagecomponents.CheckOutProcess;
import pagecomponents.SearchByItem;

public class SearchByIteamTest extends BaseClass{
	
	@BeforeTest
	public void beforeTest() throws IOException {
		
		prop(); //Db connect, Excel connect, property file
		testcase = "testSearchByItem";
	}

	@Test
	public void testSearchByItem() throws Exception
	{
		SearchByItem obj = new SearchByItem();
		obj.searchByIteam();
		test.pass("Search By Item product is added in the cart", 
				MediaEntityBuilder.createScreenCaptureFromPath("SearchbyItemSS.png").build());
	}
	
}
