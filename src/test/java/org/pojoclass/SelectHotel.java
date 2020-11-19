package org.pojoclass;

import org.baseclass.LibMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel extends LibMethods
{	
	public SelectHotel() {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getRadioButton() {
		return radioButton;
	}

	public WebElement getContin() {
		return contin;
	}

	@FindBy(id="radiobutton_0")
	private WebElement radioButton;
	
	@FindBy(id="continue")
	private WebElement contin;
	

	}

