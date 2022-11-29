package com.ds.testLayer;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.ds.testBase.TestBase;

public class LoginPageTest extends TestBase {
	
	String expected_url = "https://www.apps.dalalstreet.ai/dashboard";
	
	@Test
	public void verifyLoginTest() throws InterruptedException
	{
		String actual_url = login.getCURL();
		Assert.assertEquals(actual_url, expected_url);
	}

}
