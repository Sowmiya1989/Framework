package org.execution;

import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.baseclass.LibMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.pojoclass.BookHotel;
import org.pojoclass.LoginUnit;
import org.pojoclass.SearchHotel;
import org.pojoclass.SelectHotel;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AdactinTestCase extends LibMethods
{	
	
	@BeforeClass
	public static  void launch() 
	{
		browserLaunch();
		getUrl("http://adactinhotelapp.com/");
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);

	}
	
	@Test
	public void tc1() throws IOException 
	{
		LoginUnit l = new LoginUnit();
		sendKeys(l.getTxtUser(), excelData(1, 0));
		String user = l.getTxtUser().getAttribute("value");
		
		SoftAssert s = new SoftAssert();
		AssertJUnit.assertEquals("jitheshsowmiya", user);
		
		sendKeys(l.getTxtPass(), excelData(1, 1));
		String pwd = l.getTxtPass().getAttribute("value");
		AssertJUnit.assertEquals("sowmiyajithesh", pwd);
		
		buttonClick(l.getLogin());
		s.assertAll();
		
		
		

	}
	
	@Test
	public void tc2() throws IOException, InterruptedException
	{	Thread.sleep(2000);
		SearchHotel sh = new SearchHotel();
		selectByIndex(sh.getLocation(), 1);
		String loc = sh.getLocation().getAttribute("value");
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals("Sydney", loc);
		
		selectByIndex(sh.getHotels(), 1);
		String hotel = sh.getHotels().getAttribute("value");
		sa.assertEquals("Hotel Creek", hotel);
		
		selectByIndex(sh.getRoomType(),1);
		String type = sh.getRoomType().getAttribute("value");
		sa.assertEquals("Standard", type);
		
		selectByIndex(sh.getRoomNos(), 1);
		String nos = sh.getRoomNos().getAttribute("value");
		sa.assertEquals("1", nos);
		
		sendKeys(sh.getDateIn(), excelData(1, 2));
		
		sendKeys(sh.getDateOut(), excelData(1, 3));
		
		selectByIndex(sh.getAdult(), 1);
		String adult = sh.getAdult().getAttribute("value");
		sa.assertEquals("1", adult);
		
		selectByIndex(sh.getChild(), 1);
		String child = sh.getChild().getAttribute("value");
		sa.assertEquals("1", child);
		
		buttonClick(sh.getSubmit());
		sa.assertAll();


		
		

	}
	
	@Test
	public void tc3()
	{
		SelectHotel s = new SelectHotel();
		radioClick(s.getRadioButton());
		
		buttonClick(s.getContin());
		

	}
	
	@Test
	public void tc4() throws IOException {
		BookHotel b = new BookHotel();
		sendKeys(b.getFirstName(), excelData(1, 4));
		sendKeys(b.getLastName(), excelData(1, 5));
		sendKeys(b.getAddress(), excelData(1, 6));
		sendKeys(b.getCcNum(),excelData(1, 7));
		selectByIndex(b.getCcType(), 1);
		selectByIndex(b.getMonth(), 1);
		selectByIndex(b.getYear(), 11);
		sendKeys(b.getCvv(), excelData(1, 8));
		
		buttonClick(b.getBookNow());
		
		WebElement orderNo = driver.findElement(By.id("order_no"));
		String print = orderNo.getAttribute("value");
		System.out.println("Order No is " + print);
		

	}
	
	@AfterClass
	public void close() 
	{
		driver.close();
		

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
