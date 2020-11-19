package org.baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


@SuppressWarnings("unused")
public class LibMethods 
{
public static WebDriver driver;
	
	public static  void browserLaunch() 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sowmiya\\eclipse-workspace\\MavenProject\\Driver\\chromedriver.exe");
		 driver = new ChromeDriver();


	}
	
	public static  void getUrl(String data) 
	{
		driver.get(data);
		driver.manage().window().maximize();

	}
	
	public static void getTitle() 
	{
		String print = driver.getTitle();
		System.out.println(print);
		return;
		

	}
	//4
	
	public static void getCurrentUrl() 
	{
		String print = driver.getCurrentUrl();
		System.out.println(print);
		

	}
	//5
	
	public static void getPageSource()
	{
		String print = driver.getPageSource();
		System.out.println(print);

	}
	
	//6
	
	public static String sendKeys(WebElement reference , String data)
	{
		reference.sendKeys(data);
		//return data;
		return data;

	}
	
	//7
	
	public static void buttonClick(WebElement reference) 
	{
		reference.click();

	}
	
	//8
	
	public  static void elementClear(WebElement reference)
	{
		
		reference.clear();

	}
	
	//9
	
	public static void navigate(String data)
	{
		driver.navigate().to(data);
	}
	
	//10
	
	public static void navigateToForward() 
	{
		driver.navigate().forward();

	}
	
	//11
	
	public static void navigateToBack() 
	{
		driver.navigate().back();

	}
	
	//12
	
	public static void navigateToReload() 
	{
		driver.navigate().refresh();

	}
	
	//13
	
	public static void getText(WebElement ref )
	{
		String print = ref.getText();
		System.out.println(print);
		
	}
	
	//14
	
	public static void getAttribute(WebElement reference)
	{
		String print = reference.getAttribute("value");
		System.out.println(print);
	}
	
	//15
	
	public static void isDisplayed(WebElement reference) 
	{
		boolean print = reference.isDisplayed();
		System.out.println(print);
		//we can check the condition here
		//going to return in boolean

	}
	
	//16
	
	public static void isEnabled(WebElement reference) 
	{
		boolean print = reference.isEnabled();
		System.out.println(print);
		//going to return in boolean
		//example like textbox we can check

	}
	
	//17
	
	public static void isSelected(WebElement reference)
	{
		boolean print = reference.isSelected();
		System.out.println(print);
		// going to return in boolean
		//example like button click we can check

	}
	
	//18
	public static void getSize(WebElement reference) 
	{
		Dimension print = reference.getSize();
		System.out.println(print);
		//going to return dimensions of height and width

	}
	
	//19
	public void close() 
	{
		driver.close();
		//close the current tab

	}
	
	//20
	public void quit() 
	{
		driver.quit();
		// it close the entire tab

	}
	
	//21
	public static void getCssValue(WebElement reference , String data) 
	{
		String print = reference.getCssValue(data);
		System.out.println(print);

	}
	
	//22
	
	public static void selectByIndex(WebElement element , int value) 
	{
		Select s = new Select(element);
		s.selectByIndex(value);
		
	}
	
	//23
	
	public static void selectByValue(WebElement element , String value)
	{
		Select s = new Select(element);
		s.selectByValue(value);

	}
	
	//24
	
	public static void selectByVisibleText(WebElement element , String value) 
	{
		Select s = new Select(element);
		s.selectByVisibleText(value);
		
	}
	
	//25
	
	public static void deselectByIndex(WebElement element , int value) 
	{
		Select s = new Select(element);
		s.deselectByIndex(value);

	}
	
	//26
	
	public static void deselectByValue(WebElement element , String value)
	{
		Select s = new Select(element);
		s.deselectByValue(value);
	}
	
	//27
	
	public static void deselectByVisibleText(WebElement element , String value) 
	{
		Select s = new Select(element);
		s.deselectByVisibleText(value);
	}
	
	//28
	
	public static void deselectAll(WebElement element) 
	{
		Select s = new Select(element);
		s.deselectAll();

	}
	
	//29
	
	public static void getAllSelectedOptions(WebElement element) 
	{
		Select s = new Select(element);
		List<WebElement> all = s.getAllSelectedOptions();
		for (WebElement webElement : all) 
		{
			String print = webElement.getText();
			System.out.println(print);
		}
		// for list of elements

	}
	
	//30
	
	public static void getFirstSelectedOptions(WebElement element) 
	{
		Select s = new Select(element);
		s.getFirstSelectedOption();

	}
	
	//31
	
	public static void getOptions(WebElement element) 
	{
		Select s = new Select(element);
		List<WebElement> list = s.getOptions();
		for (WebElement webElement : list) 
		{
			String print = webElement.getText();
			System.out.println(print);
		}
		// it will give list of web elements
	}
	
	//32
	
	public static void isMultiple(WebElement element)
	{
		Select s = new Select(element);
		boolean print = s.isMultiple();
		System.out.println(print);
		//return in boolean
	}
	
	//33
	
	
	public  static void scrollDown(WebElement element) 
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)" , element);
		

	}
	
	//34
	
	public  static void scrollup(WebElement element) 
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(false)" , element);
		

	}
	
	//35
	
	public  static void setAttribute(WebElement reference) 
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeAsyncScript("arguments[0].setAttribute('value','data')" , reference);

	}
	
	//36
	
	public  static void buttonClick1(WebElement reference) 
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeAsyncScript("arguments[0].click()" , reference);

	}
	
	
	//37
	
	public static void screenshots() 
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		System.out.println(temp);

	}
	
	//38
	
	public static void moveToElement(WebElement target)
	{
		Actions a = new Actions(driver);
		a.moveToElement(target);

	}
	
	//39
	
	public static void dragDrop(WebElement source , WebElement target)
	{
		Actions a = new Actions(driver);
		a.dragAndDrop(source, target);

	}
	
	//40
	
	public static void contextClick(WebElement target) 
	{
		Actions a = new Actions(driver);
		a.contextClick(target);
	}
	
	
	//41
	
	public static void actionsclick()
	{
		Actions a = new Actions(driver);
		a.click();
	}
	
	
	//42
	
	public static void actionsClickAndHold(WebElement target)
	{
		Actions a = new Actions(driver);
		a.clickAndHold(target);
	}
	
	//43
	
	public static void actionsDoubleClick() 
	{
		Actions a = new Actions(driver);
		a.doubleClick();

	}
	
	//44
	
	public static void actionsDoubleClick(WebElement target) 
	{
		Actions a = new Actions(driver);
		a.doubleClick(target);

	}
	
	//45
	
	public static void keyEnter() throws Exception 
	{
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

	}
	
	//46
	
	public static void keyDown() throws AWTException 
	{
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		

	}
	
	
	//47
	
	public static void alertAccept()
	{
		Alert a = driver.switchTo().alert();
		a.accept();
	}
	
	
	//48
	
	public static void alertDismiss() 
	{
		Alert a = driver.switchTo().alert();
		a.dismiss();

	}
	
	//49
	
	public static void alertPromt(String data) 
	{
		Alert a = driver.switchTo().alert();
		a.sendKeys(data);
		a.accept();

	}
	
	//50
	
	public static void getWindowHandle() 
	{
		String ParentTab = driver.getWindowHandle();
		System.out.println(ParentTab);
		

	}
	
	//51
	
	
	public static void getWindowHandles() 
	{
		String ParentTab = driver.getWindowHandle();
		Set<String> AllTab = driver.getWindowHandles();
		for (String s : AllTab) 
		{
			if (!ParentTab.equals(s))
			{
				driver.switchTo().window(s);
			}
		}

	}
	
	//52
	
	public static void parentTab() 
	{
		driver.switchTo().defaultContent();
	}
	
	//53
	
	public static void delayTime(int data) throws AWTException 
	{
		Robot r = new Robot();
		r.delay(data);

	}
	
	//54
	
	public static void frameElement(WebElement element) 
	{
		driver.switchTo().frame(element);	

	}
	
	//55
	
	public static void frameByIndex(int index) 
	{
		driver.switchTo().frame(index);

	}
	
	//56
	
	public static void frameIdName(String value) 
	{
		driver.switchTo().frame(value);

	}
	
	//57
	
	public static void frameSize(String data) 
	{
		List<WebElement> fSize = driver.findElements(By.tagName(data));
		int print = fSize.size();
		System.out.println(print);

	}
	
	//58
	
	public static void implicityWait(long seconds) 
	{
		driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);

	}
	
	//59
	
	public static void radioClick(WebElement reference) 
	{
		reference.click();

	}
	
	//60
	
	public static void textInAction(WebElement reference, CharSequence data) 
	{
		Actions a = new Actions(driver);
		a.keyDown(reference ,Keys.SHIFT).sendKeys(reference , data).keyUp(reference , Keys.SHIFT).perform();
	}
	
	
	
	public static String excelData(int rowNo,int columnNo) throws IOException {

		File f = new File("C:\\Users\\Sowmiya\\eclipse-workspace\\TestngFramework\\ExcelSheet\\WorkBook1.xlsx");
		FileInputStream finStream = new FileInputStream(f);

		Workbook w = new XSSFWorkbook(finStream);
		Sheet s = w.getSheet("Sheet1");
 {
			Row r = s.getRow(rowNo);
			 {
				Cell c = r.getCell(columnNo);
				String value = "";
				int cellType = c.getCellType();
				if (cellType == 1) {
					value = c.getStringCellValue();
				} else if (DateUtil.isCellDateFormatted(c)) {
					Date d = c.getDateCellValue();
					SimpleDateFormat sim = new SimpleDateFormat("dd-MM-yyyy");
					value = sim.format(d);

				} else {
					double d = c.getNumericCellValue();
					long l = (long) d;
					value = String.valueOf(l);
				}
				return value;

			}

		}
	}

}
