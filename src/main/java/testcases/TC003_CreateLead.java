package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC003_CreateLead extends ProjectMethods{
	
	
		@BeforeTest
		public void setData() {
			testCaseName="TC003_CreateLead";
			testDescription="Creating the Lead";
			testNodes="CreteLead";
			category="Smoke";
			authors="Raksha";
			browserName="chrome";
			dataSheetName="TC003";
		}
		
		
		
		@Test(dataProvider="fetchData")
		public void createLead(String uName,String pwd,String cname , String fname,String lname){
			
			new LoginPage()
			.enterUserName(uName)
			.enterPassword(pwd)
			.clickLogIn()
			.clickCrmSfa()
			.clickLeadsLink()
			.ClickCreateLeadsLink()
			.enterCompanyName(cname)
			.enterFirstName(fname)
			.enterLastName(lname)
			.clickCreateLeadBtn()
			.verifyFirstName(fname);
					
		}

	}


