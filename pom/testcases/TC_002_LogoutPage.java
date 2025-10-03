package testcases;

import org.testng.annotations.Test;
import base.ProjectSpecificMethods;
import pages.LoginPage;


public class TC_002_LogoutPage extends ProjectSpecificMethods{

	    @Test
	    public void LogoutTest() {
	        new LoginPage(driver)
	            .enterUsername()
	            .enterPassword()
	            .clickLoginButton()
	            .clickLogout(); 
	    }
	}


