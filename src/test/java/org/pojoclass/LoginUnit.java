package org.pojoclass;

import org.baseclass.LibMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginUnit extends LibMethods
{
	public LoginUnit()
	{
		PageFactory.initElements(driver, this);
	}
		
		@FindBy(id="username") 
		private WebElement txtUser;
	
		
		@FindBy(id="password")
		private WebElement txtPass;
	
		
		@FindBy(id="login")
		private WebElement login;
		

		
		public WebElement getTxtUser() {
			return txtUser;
		}

		public WebElement getTxtPass() {
			return txtPass;
		}

		public WebElement getLogin() {
			return login;
		}
		
		
		

	
	
}
