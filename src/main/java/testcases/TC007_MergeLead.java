package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC007_MergeLead extends ProjectMethods{
	
	
		@BeforeTest
		public void setData() {
			testCaseName="TC007_MergeLead";
			testDescription="Merging two Leads";
			testNodes="Merge Lead";
			category="Smoke";
			authors="Raksha";
			browserName="chrome";
			dataSheetName="TC007";
		}
		
		
		
		@Test(dataProvider="fetchData")
		public void createLead(String uName,String pwd,String fName1,String fName2){
			
			new LoginPage()
			.enterUserName(uName)
			.enterPassword(pwd)
			.clickLogIn()
			.clickCrmSfa()
			.clickLeadsLink()
			.ClickMergeLeadsLink()
			.clickImageLookUp1()
			.enterFindFirstName(fName1)
			.clickFindLeadsBTN()
			.clickfirstCell()
			.clickImageLookUp2()
			.enterFindFirstName(fName2)
			.clickFindLeadsBTN()
			.clickfirstCell()
			.ClickMergeButton();
			
		}

	}
 

