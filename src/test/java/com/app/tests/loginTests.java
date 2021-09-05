package com.app.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.app.pages.LoginObjects;
import com.app.pages.searchObject;

public class loginTests {
      LoginObjects lp;
      searchObject sp;
      

    public loginTests() {
    	lp= new LoginObjects();
    	sp= new searchObject();
    }
    @Test
    public void verifyLogin() {
    	lp.login("Vasudevan18", "Vasu24");
    	String usertxt=sp.getwelcomepage();
    	Assert.assertTrue(usertxt.contains("Vasudevan18"),"failed");
    }    

    @BeforeMethod
    @Test
    public void verifyUsernametextbox() {
    	lp.setUserName("Vasudevan18");
    	String user= lp.getUserName();
    	Assert.assertTrue(user.contains("Vasudevan"));
    }
    }
