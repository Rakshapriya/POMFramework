package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import wdMethods.ProjectMethods;

public class CreateLeadPage extends ProjectMethods{
	
	public CreateLeadPage() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.ID,using="createLeadForm_companyName")
	private WebElement eleCompanyName;
	@And("enter cname as (.*)")
	public CreateLeadPage enterCompanyName(String data) {
		type(eleCompanyName, data);
		return this;
	}
	
	@FindBy(how=How.ID,using="createLeadForm_firstName")
	private WebElement eleFirstName;
	@And("enter fname as (.*)")
	public CreateLeadPage enterFirstName(String data) {
		type(eleFirstName,data);
		return this;
	}
	@FindBy(how=How.ID,using="createLeadForm_lastName")
	private WebElement eleLastName;
	@And("enter lname as (.*)")
	public CreateLeadPage enterLastName(String data) {
		type(eleLastName,data);
		return this;
	}
	
	
	@FindBy(how=How.CLASS_NAME,using="smallSubmit")
	private WebElement eleCreateLeadBtn;
	@When("Click on create lead button")
	public ViewLeadPage clickCreateLeadBtn() {
		click(eleCreateLeadBtn);
		return new ViewLeadPage();		
	}


}
