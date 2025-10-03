package testcases;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class TC_001_CreateLead extends BaseClass {
	
	@Test
	public void createLead() {
		LoginPage lp=new LoginPage();
		lp.enterUsername()
		.enterPassword()
		.clickLoginButton()
		.clickCRMSFA()
		.clickLeadsLink()
		.clickCreateLeadLink()
		.enterCompanyName()
		.enterFirstname()
		.enterLastname()
		.clickCreateLeadButton()
		.verifyLead();
	}

}
//@Test     @BeforeMethod    @AfterMethod