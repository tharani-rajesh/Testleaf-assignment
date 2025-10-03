package testcases;

	import org.testng.annotations.Test;
	import base.ProjectSpecificMethods;
	import pages.LoginPage;
	
	public class TC_003_CreateAccount extends ProjectSpecificMethods {
	
	    @Test
	    public void CreateAccount() {
	       new LoginPage(driver)
	            .enterUsername()
	            .enterPassword()
	            .clickLoginButton()
	            .clickCRMSFA()
	            .clickAccountLink()
	            .clickCreateAccountLink()
	            .enterAccountName()
	            .enterDescription()
	            .enterIndustryId()
	            .enterownershipId()
	            .enterDataSouceId()
	            .entermarketingCampaignId()
	            .entergeneralStateProvinceGeoId()
	            .clickSubmit()
	            .verifyAccount();
	    
	    }
	}



