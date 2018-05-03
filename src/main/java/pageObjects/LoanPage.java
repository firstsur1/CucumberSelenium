package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utility.Log;
 
public class LoanPage {
	WebDriver driver;
	JavascriptExecutor jse;
	
	
	public LoanPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		jse = (JavascriptExecutor)driver;		
	}
	
	@FindBy(how = How.XPATH, using = ".//*[@id='submit-loan-button']" )
	private WebElement btn_SelectPersonlisedRates;
	
	@FindBy(how = How.ID, using ="slider_calc_results")
	private WebElement rdo_SelectNoOfYears;
	
		
	public void select_GetPersonlisedRates() {	
		try {
			btn_SelectPersonlisedRates.click();	
		} catch(NoSuchElementException e){
			Log.error("Element not found");
		}
	}
 
	public String getTitleOfLoanSignUpPage() {		
		return driver.getTitle();		
	}
	
	public void selectNoOfYears() {	
		try {
			rdo_SelectNoOfYears.click();
		} catch(NoSuchElementException e){
			Log.error("Element not found");
		}
	}
	
	public void scrollDown() {		 
		jse.executeScript("window.scrollBy(0,50)", "");
	}
	
	public String getUrl() {		
		return driver.getCurrentUrl();		
	}
}
