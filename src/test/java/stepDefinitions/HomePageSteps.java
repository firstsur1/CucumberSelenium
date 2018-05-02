package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import cucumber.TestContext;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.HomePage;
import utility.Log;

public class HomePageSteps {
		
	TestContext testContext;
	WebDriver driver;
	HomePage homePage;
	
	public HomePageSteps(TestContext context) {
		testContext = context;
		driver = testContext.getWebDriverManager().getDriver();
		homePage = testContext.getPageObjectManager().getHomePage();
	}
	
	@Given("^borrower is on Home Page$")
	public void borrower_is_on_Home_Page(){
		homePage.navigateTo_HomePage();	
	}
 
	@When("^borrower select 'Get a zopa loan'$")
	public void user_select_Get_a_zopa_loan() throws Throwable {
	    homePage.select_GetZopaLoan();
	}

	@Then("^loans page is displayed$")
	public void loans_page_is_displayed() throws Throwable {
	    Assert.assertEquals("Zopa loans – See rates & apply online | Zopa.com", homePage.getTitleOfLoansPage());
	}

}
