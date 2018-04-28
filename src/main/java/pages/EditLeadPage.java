package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import wdMethods.ProjectMethods;

public class EditLeadPage extends ProjectMethods{
	
	public EditLeadPage() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.ID,using="updateLeadForm_firstName")
	private WebElement eleEditFirstName;
	@And("enter edit fname as (.*)")
	public EditLeadPage enterEditFirstName(String data) {
		type(eleEditFirstName, data);
		return this;
	}
	@FindBy(how=How.XPATH,using="//input[@value='Update']")
	private WebElement eleClickUpdate;
	@Then("click on EditLead Button")
	public ViewLeadPage clickUpdateBTN() {
		
		click(eleClickUpdate);
		return new ViewLeadPage();		
	}
	
}
