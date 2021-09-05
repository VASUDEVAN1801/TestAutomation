package com.app.tests;

import java.util.Random;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.app.pages.BasePage;
import com.app.pages.HomePageObject;

public class HomePageTest {
	HomePageObject hp;
	BasePage bp;
	int randomvalue = new Random().nextInt(500000);

	public HomePageTest() {
		hp = new HomePageObject();
		bp = new BasePage();

	}

	@Test
	public void verifyHomePageObject() {
		hp.HomePageTabWomen();
		Assert.assertTrue(bp.getTitlte().contains("Woman"));
		hp.homepageTabDresses();

		Assert.assertTrue(bp.getTitlte().contains("Dresses"));
		hp.homepageTabTshirts();
		
		Assert.assertTrue(bp.getTitlte().contains("Tshirts"));
	}

	@Test
	public void verifyemailSubscription() {
		String emailid = "AutoTest" + randomvalue + "@gmail.com";
	
		hp.emailSubscription(emailid);
		String SuccessfulMsg = hp.getemailSubscription(emailid);
		
		Assert.assertTrue(SuccessfulMsg.contains("successfully"));

	}

}
