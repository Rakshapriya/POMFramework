package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class FindLeadsWindow extends ProjectMethods{
	
	public FindLeadsWindow() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.XPATH,using="//input[@name='firstName']")
	private WebElement eleEnterFirstName;
	
	public FindLeadsWindow enterFindFirstName(String data) {
		type(eleEnterFirstName, data);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//button[text()='Find Leads']")
	private WebElement eleFindLeadsBTN;
	
	public FindLeadsWindow clickFindLeadsBTN() {
		click(eleFindLeadsBTN);
		return this;		
	}
	@FindBy(how=How.XPATH,using="(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")
	private WebElement eleWaitUntilClickCell;
	
	public MergeLeadPage clickfirstCell() {
		
		clickWithNoSnap(eleWaitUntilClickCell);
		switchToWindow(0);
		return new MergeLeadPage();
	}
	
}
