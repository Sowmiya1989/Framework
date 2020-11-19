package org.pojoclass;

import org.baseclass.LibMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonPojoClass extends LibMethods
{
	public AmazonPojoClass() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="twotabsearchtextbox")
	private WebElement searchProduct;
	
	@FindBy(xpath="//input[@type='submit'][1]")
	private WebElement click;

	public WebElement getSearchProduct() {
		return searchProduct;
	}

	public WebElement getClick() {
		return click;
	}
	
}
