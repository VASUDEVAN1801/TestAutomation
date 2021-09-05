package com.app.pages;


	import java.util.ArrayList;
	import java.util.List;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.FindBys;
	import org.openqa.selenium.support.PageFactory;

	public class LoginObjects extends BasePage {

		@FindBy(id="username")
		private WebElement txtboxUserName;

		@FindBy(id="password")
		private WebElement txtboxUserPassword;

		@FindBy(id="login")
		private WebElement btnLogin;



		public LoginObjects() {
			PageFactory.initElements(driver, this);
		}

		
		public void login(String user,String pass) {
			setText(txtboxUserName, user);
			setText(txtboxUserPassword, pass);
			btnLogin.click();
		}
		
		public void setUserName(String user) {
			setText(txtboxUserName, user);
			
		}
			public String getUserName() {
		       String value=getTxtAttribute(txtboxUserName);
		       return value;
			}
		}
		
		
		