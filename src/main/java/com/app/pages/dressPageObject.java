package com.app.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class dressPageObject extends BasePage {
	
	 @FindBy(id="layered_id_attribute_group_1")
	 private WebElement checkboxshort;
	
	
	
	 @FindBy(xpath="//*[@id='center_column']/h1/span[2]")
	 private WebElement dressproducttext;
	 
	 
	 @FindBy(xpath="//*[@id=\'center_column\']")
	 private WebElement dressProductImage;
	 
	 
	 public dressPageObject() {
		 PageFactory.initElements(driver, this);
		 
	 }
	 
	 
	 public Boolean verifycheckboxshort() {
		boolean shortcheckbox= checkboxshort.isSelected();
	    return shortcheckbox;
	 }
 
	 public String verifydressProductText() {
		 //dressproducttext.
	 }
}
