package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC005_DeleteLead extends ProjectMethods{
	
	
		@BeforeTest
		public void setData() {
			testCaseName="TC005_DeleteLead";
			testDescription="Deleting the Lead";
			testNodes="DeleteLead";
			category="Smoke";
			authors="Raksha";
			browserName="chrome";
			dataSheetName="TC005";
		}
		
		
		
		@Test(dataProvider="fetchData")
		public void createLead(String uName,String pwd,String fName){
			
			new LoginPage()
			.enterUserName(uName)
			.enterPassword(pwd)
			.clickLogIn()
			.clickCrmSfa()
			.clickLeadsLink()
			.ClickFindLeadsLink()
			.enterFindFirstName(fName)
			.clickFindLeadsBTN()
			.clickFirstNameCell()
			.clickDeleteBTN();
			
		}

	}


