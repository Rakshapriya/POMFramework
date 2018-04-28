package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MergeLeadPage extends ProjectMethods{
	
	public MergeLeadPage() {		
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.XPATH,using="//img[@alt='Lookup']")
	private WebElement eleClickImage1;
	
	public FindLeadsWindow clickImageLookUp1() {
		
		click(eleClickImage1);
		switchToWindow(1);
		return new FindLeadsWindow();		
	}
	@FindBy(how=How.XPATH,using="(//img[@alt='Lookup'])[2]")
	private WebElement eleClickImage2;
	
	public FindLeadsWindow clickImageLookUp2() {
		
		click(eleClickImage2);
		switchToWindow(1);
		return new FindLeadsWindow();		
	}
	@FindBy(how=How.XPATH,using="//a[text()='Merge']")
	private WebElement eleClickMergeBTN;
	
	public ViewLeadPage ClickMergeButton() {
		
		clickWithNoSnap(eleClickMergeBTN);
		acceptAlert();
		return new ViewLeadPage();		
	}
	
	
}
