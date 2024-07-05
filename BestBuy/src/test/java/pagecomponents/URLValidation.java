package pagecomponents;


import java.net.HttpURLConnection;
import java.net.URL;


import utils.WebUtility;

public class URLValidation extends WebUtility{

	public void validateLink() throws Exception {
		
		URL urllink = new URL(prop.getProperty("url"));
		HttpURLConnection huc = ((HttpURLConnection) (urllink.openConnection()));
		Thread.sleep(3000);
		huc.connect();
		if(huc.getResponseCode() >= 400)
		{
			test.fail("URL is Broken");
		}else
		{
			test.pass("URL is Not Broken");
		}
	}
}
