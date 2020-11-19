package org.main;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.baseclass.LibMethods;
import org.pojoclass.FaceBook;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestCase extends LibMethods
{	
	@BeforeClass
	public static  void launch() {
		browserLaunch();
		 getUrl("https://www.facebook.com/");
		 String actualTitle = "Facebook – log in or sign up";
		 Assert.assertEquals(driver.getTitle(), actualTitle);
		 driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		 
		

	}
	
	
	@Test
	public void login() throws IOException 
	{
		FaceBook fb = new FaceBook();
		 sendKeys(fb.getEmail(), excelData(1, 0));
		 String actualUser =fb.getEmail().getAttribute("value");
		Assert.assertEquals( "roja" , actualUser);
		
		 sendKeys(fb.getPassword(), excelData(1, 1));
		String actualPwd = fb.getPassword().getAttribute("value");
		
		SoftAssert s = new SoftAssert();
		Assert.assertEquals( "jithesh0918" , actualPwd);
		
		
		buttonClick(fb.getLogin());
		s.assertAll();
	

	}
	
	/*@AfterClass
	private void closePage() {
		driver.close();

	}*/
	
	

}
