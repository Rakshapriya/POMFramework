package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class DuplicateLeadPage extends ProjectMethods{
	
	public DuplicateLeadPage() {
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(how=How.XPATH,using="//input[@value='Create Lead']")
	private WebElement eleClickCreateDuplicate;
	public ViewLeadPage clickCreateDuplicateBTN() {
		
		click(eleClickCreateDuplicate);
		return new ViewLeadPage();		
	}
	
}
