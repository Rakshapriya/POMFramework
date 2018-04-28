package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class FindLeadPage extends ProjectMethods{
	
	public FindLeadPage() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.XPATH,using="(//label[text()='First name:'])[3]/following::input[1]")
	private WebElement eleFindFirstName;
	@And("enter fname to find as (.*)")
	public FindLeadPage enterFindFirstName(String data) {
		type(eleFindFirstName, data);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//button[text()='Find Leads']")
	private WebElement eleFindLeadsBTN;
	@And("click on findLeads button")
	public FindLeadPage clickFindLeadsBTN() {
		click(eleFindLeadsBTN);
		return this;		
	}
	@FindBy(how=How.XPATH,using="(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")
	private WebElement eleWaitUntilClickName;
	@And("click first cell")
	public ViewLeadPage clickFirstNameCell() {
		
		Waituntilclick(eleWaitUntilClickName, 20);
		return new ViewLeadPage();		
	}
	
}
