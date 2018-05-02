package managers;

import org.openqa.selenium.WebDriver;

import pageObjects.HomePage;
import pageObjects.LoanPage;
import pageObjects.LoanSignUpPage;
 
 
 
public class PageObjectManager {
 
	private WebDriver driver; 
	
	private HomePage homePage;
	
	private LoanPage loanPage;
	
	private LoanSignUpPage loanSignUpPage;
	
 
	public PageObjectManager(WebDriver driver) {
 
		this.driver = driver;
 
	}
 
	
 
	public HomePage getHomePage(){
 
		return (homePage == null) ? homePage = new HomePage(driver) : homePage;
 
	}
	
	public LoanPage getLoanPage(){
		 
		return (loanPage == null) ? loanPage = new LoanPage(driver) : loanPage;
 
	}
	
	public LoanSignUpPage getLoanSignUpPage(){
		 
		return (loanSignUpPage == null) ? loanSignUpPage = new LoanSignUpPage(driver) : loanSignUpPage;
 
	}

}
