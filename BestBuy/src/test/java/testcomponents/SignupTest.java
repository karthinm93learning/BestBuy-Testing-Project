package testcomponents;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.MediaEntityBuilder;

import enginecomponents.BaseClass;
import pagecomponents.Signup;

public class SignupTest extends BaseClass{
	
	@BeforeTest
	public void beforeTest() throws IOException {
		
		 //Db connect, Excel connect, property file
		testcase = "testSignup";
	}
	
	@Test
	public void testSignup() {
		
		Signup obj = new Signup();
		obj.createAccount();
		test.pass("Account is Created", 
		MediaEntityBuilder.createScreenCaptureFromPath("SignupSS.png").build());
	}
}
