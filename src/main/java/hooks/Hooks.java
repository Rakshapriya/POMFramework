package hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import wdMethods.ProjectMethods;

public class Hooks extends ProjectMethods{

	@Before
	public void before()
	{
		startResult();
		startTestModule("create lead", "creating a lead");
		test = startTestCase("Create Lead");
		test.assignCategory("Smoke");
		test.assignAuthor("Raksha");
		startApp("chrome");
	}
	@After
	public void after()
	{
		endResult();
		closeAllBrowsers();
	}
}
