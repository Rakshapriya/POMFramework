package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class MyLeadsPage extends ProjectMethods{
	
	public MyLeadsPage() {		
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.LINK_TEXT,using="Create Lead")
	private WebElement eleCreateLeadsLink;
	@And("click on create leads")
	public CreateLeadPage ClickCreateLeadsLink() {
		
		click(eleCreateLeadsLink);
		return new CreateLeadPage();		
	}
	@FindBy(how=How.LINK_TEXT,using="Find Leads")
	private WebElement eleFindLeadsLink;
	@And("click on Find Leads")
	public FindLeadPage ClickFindLeadsLink() {
		
		click(eleFindLeadsLink);
		return new FindLeadPage();		
	}
	@FindBy(how=How.LINK_TEXT,using="Merge Leads")
	private WebElement eleMergeLeadsLink;
	
	public MergeLeadPage ClickMergeLeadsLink() {
		
		click(eleMergeLeadsLink);
		return new MergeLeadPage();		
	}
	
	
}
