package stepDefinitions;

import org.testng.Assert;
import cucumber.TestContext;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.HomePage;

public class HomePageSteps {
		
	TestContext testContext;	
	HomePage homePage;
	
	public HomePageSteps(TestContext context) {
		testContext = context;	
		homePage = testContext.getPageObjectManager().getHomePage();
	}
	
	@Given("^user is on home page$")
	public void user_is_on_home_page() throws Throwable {
		homePage.navigateToHomePage();	
	}
	
	//Verify English as default language
	@When("^user type a string$")
	public void user_type_a_string() throws Throwable {
	    homePage.typeString("Hello");
	    Assert.assertEquals("EN", homePage.verifyLanguageIsEnglish());
	}
	
	//Click the search button
	@When("^user click search button$")
	public void user_click_search_button() throws Throwable {
	    homePage.click_searchButton();
	}
	
	//Validate that the first heading of the search results page matches the search string (ignoring case
	@Then("^search results matches the search string$")
	public void search_results_matches_the_search_string() throws Throwable {
		Assert.assertEquals(homePage.verifyFirstHeadingOfSearchResultsMatchesSearchString(), "hello");		
		
	}
	
	//Verify that the search results page is available in other languages
	@Then("^search results is available in other languages$")
	public void search_results_is_available_in_other_languages() throws Throwable {
	    Assert.assertEquals("Languages", homePage.verifyOtherLanguageExist());
	}
	
	//Navigate to the search results page in a different language. 
	//Validate that the search results page in the new language includes a link to the version in English. 
	@Then("^search results page in the new language includes a link to the version in English$")
	public void search_results_page_in_the_new_language_includes_a_link_to_the_version_in_English() throws Throwable {
	    Assert.assertEquals(true, homePage.selectAnotherLanguageAndDoChecks());
	}

}
