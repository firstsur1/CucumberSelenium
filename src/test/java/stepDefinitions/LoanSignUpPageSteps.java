package stepDefinitions;

import cucumber.TestContext;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.LoanSignUpPage;

public class LoanSignUpPageSteps {
		
	TestContext testContext;
	LoanSignUpPage loanSignUpPage;
	
	public LoanSignUpPageSteps(TestContext context) {
		testContext = context;
		loanSignUpPage = testContext.getPageObjectManager().getLoanSignUpPage();
	}
	
	@When("^borrower enters valid details$")
	public void borrower_enters_details(DataTable borrowerDetails) throws Throwable {
		loanSignUpPage.fill_ValidBorrowerDetails(borrowerDetails);
	}
	
	@When("^borrower enters invalidDetails$")
	public void borrower_enter_invalidDetails(DataTable borrowerDetails) throws Throwable {
		loanSignUpPage.fill_InValidBorrowerDetails(borrowerDetails);
	    
	}
	
	@Then("^warning message box with relevant messages is shown$")
	public void warning_message_box_with_relevant_messages_is_shown() throws Throwable {
		loanSignUpPage.display_errorMessageBox();
	}


	


}
