package testcomponents;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import enginecomponents.BaseClass;
import pagecomponents.Login;

public class LoginTest extends BaseClass{
	
	@BeforeTest
	public void beforeTest() throws IOException {
		
		prop(); //Db connect, Excel connect, property file
		testcase = "testLogin";
		sheetname = "LoginDatas";
	}

	@Test(dataProvider = "readDataLogic")
	public void testLogin(String username, String password) throws Exception {
		
		Login obj = new Login();
		obj.Signin(username, password);
		test.pass("Login is Sucessful");
	}
	
	
}
