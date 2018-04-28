package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/main/java/features/CreateLead.feature",glue= {"hooks","pages"}, tags= {"~@Smoke","@Sanity"},monochrome =true)
public class Run_CreateLead {

}
