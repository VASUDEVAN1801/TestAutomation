package com.app.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageObject extends BasePage{
	@FindBy(xpath="//*[@id='block_top_menu']/ul/li[1]/a")
	private WebElement btnWomen;
	@FindBy(xpath="//*[@id='block_top_menu']/ul/li[2]/a")
	private WebElement btnDresses;
	@FindBy(xpath="//*[@id='block_top_menu']/ul/li[3]/a")
	private WebElement btnTshirts;
	@FindBy(xpath="//*[@id='center_column']/div[1]/div/div")
	private WebElement womenTab;
       @FindBy(id="newsletter-input")
       private WebElement emailEnter;
       @FindBy(xpath="//*[@id='coloumns']/p")
       private WebElement emailEnterSuccessful;
       public HomePageObject() {
    	   PageFactory.initElements(driver, this);
    	   
       }
       public void HomePageTabWomen() {
    	   btnWomen.click();
       }
	    public void homepageTabDresses() {
	    	btnDresses.click();
	    }
         public void  homepageTabTshirts() {
        	 btnWomen.click();
         }
         public String getwomenTextTab() {
        	 String womenElement=getTitlte();
        	 return womenElement;
        	 
         }
         
         public void emailSubscription(String email) {
        	 setText(emailEnterSuccessful, email);
        	 driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
         }
         public String getemailSubscription(String emailmsg) {
        	 String Subscriptionmsg=getTitlte();
        	 return Subscriptionmsg;
         }
		
		}
		
			
		

