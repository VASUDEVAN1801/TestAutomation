package com.app.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class searchObject extends BasePage{
	@FindBy(xpath="//*[@id=\'username_show\']")
	 private WebElement welcomemsg;
	
	
	public searchObject() {
		PageFactory.initElements(driver, this);
		
	}
	public String getwelcomepage() {
		String welcomemsg2= getTxtAttribute(welcomemsg);
		return welcomemsg2;
	}
}	