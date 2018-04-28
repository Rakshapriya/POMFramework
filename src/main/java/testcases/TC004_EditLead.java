package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC004_EditLead extends ProjectMethods{
	
	
		@BeforeTest
		public void setData() {
			testCaseName="TC004_EditLead";
			testDescription="Editing the Lead";
			testNodes="EditLead";
			category="Smoke";
			authors="Raksha";
			browserName="chrome";
			dataSheetName="TC004";
		}
		
		
		
		@Test(dataProvider="fetchData")
		public void createLead(String uName,String pwd,String fName , String newName){
			
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
			.clickEditBTN()
			.enterEditFirstName(newName)
			.clickUpdateBTN();
			
		}

	}


