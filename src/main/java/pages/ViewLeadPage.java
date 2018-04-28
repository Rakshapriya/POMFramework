package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class ViewLeadPage extends ProjectMethods{
	
	public ViewLeadPage()
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(how=How.ID,using="viewLead_firstName_sp")
	private WebElement eleVerifyFirstName;
	
	public ViewLeadPage verifyFirstName(String data)
	{
		verifyPartialText(eleVerifyFirstName, data);
		return this;
	}
	@FindBy(how=How.LINK_TEXT,using="Edit")
	private WebElement eleClickEdit;
	@And("click on Edit Button")
	public EditLeadPage clickEditBTN() {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleClickEdit);
		return new EditLeadPage();		
	}
	@FindBy(how=How.XPATH,using="//a[text()='Delete']")
	private WebElement eleClickDelete;
	
	public MyLeadsPage clickDeleteBTN() {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleClickDelete);
		return new MyLeadsPage();		
	}
	@FindBy(how=How.XPATH,using="//a[text()='Duplicate Lead']")
	private WebElement eleClickDuplicate;
	
	public DuplicateLeadPage clickDuplicateBTN() {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleClickDuplicate);
		return new DuplicateLeadPage();		
	}
}
