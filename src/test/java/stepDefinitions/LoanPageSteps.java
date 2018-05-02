package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import cucumber.TestContext;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.LoanPage;

public class LoanPageSteps {
		
	TestContext testContext;
	LoanPage loanPage;
	
	public LoanPageSteps(TestContext context) {
		testContext = context;
		loanPage = testContext.getPageObjectManager().getLoanPage();
	}
	
	@When("^borrower select 'Get my personlised rates'$")
	public void borrower_select_Get_my_personlised_rates() throws Throwable {
		Thread.sleep(1000);
		loanPage.selectNoOfYears();	
	    loanPage.select_GetPersonlisedRates();
	    
	}

	@Then("^loan sign up page is displayed$")
	public void loans_sign_up_page_is_displayed() throws Throwable {
		//todo
	}




}
