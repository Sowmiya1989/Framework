package org.execution;
import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.baseclass.LibMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.pojoclass.AmazonPojoClass;
import org.testng.annotations.Test;

public class AmazonMainClass extends LibMethods
{	
	
	@Test
	public void launchBrowser() {
		browserLaunch();
		getUrl("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);

	}
	
	@Test
	public void tc1() {
		AmazonPojoClass a = new AmazonPojoClass();
		sendKeys(a.getSearchProduct(), "DELL Laptop");
		
		buttonClick(a.getClick());

	}
	
	@Test
	public void tc2() {
	java.util.List<WebElement> names = 	driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
	for (WebElement print : names) 
	{
		System.out.println(names);
	}
		

	}

}
