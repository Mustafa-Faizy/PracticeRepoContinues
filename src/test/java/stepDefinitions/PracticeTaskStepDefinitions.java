package stepDefinitions;



import core.Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObject.PracticeTaskPageObjects;

public class PracticeTaskStepDefinitions {
	
	
	
	
	PracticeTaskPageObjects object;

	
	@Given("^User is on Tek School HomePage$")
	public void user_is_on_Tek_School_HomePage() throws Throwable {
		
		Base.initializeDriver();
		object = new PracticeTaskPageObjects();
		
	   object.tekSchoolTitleVerification();
	}
	
	
	

	@When("^User clicks in Test Environment link at the bottom of the page$")
	public void user_clicks_in_Test_Environment_link_at_the_bottom_of_the_page() throws Throwable {
	  object.clickingOnTestEnvironment();
	   
	}

	@Then("^User should see the Test Environment page$")
	public void user_should_see_the_Test_Environment_page() throws Throwable {
	    
		object.testEnvironmentTitleVerificatin();
	    
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
