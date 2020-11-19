package org.main;

import java.util.concurrent.TimeUnit;

import org.baseclass.LibMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EbayDataProvider extends LibMethods
{
	@DataProvider(name = "value")
	public Object[][] getData() {
		return new Object[][] {{"DELL Laptop"} ,{"Costumes"} , {"Books"}};
		

	}
	
	@BeforeClass
	public static  void launch() 
	{
			browserLaunch();
			getUrl("https://pages.ebay.in/photocenter/");
			driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);

	}
	@Test(dataProvider= "value")
	private void ebay(String s )
	{
		WebElement data = driver.findElement(By.xpath("//*[@id=\'gh-ac\']"));
		data.sendKeys(s , Keys.ENTER);

	}
}
