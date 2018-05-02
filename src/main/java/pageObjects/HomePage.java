package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import managers.FileReaderManager;
import utility.Log;
 
public class HomePage {
	WebDriver driver;
	
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(how = How.CLASS_NAME, using = "button--fullWidth") 
	private WebElement btn_SelectZopaLoan;
	
	
	public void navigateTo_HomePage() {
		driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl());
		Log.info("Web application launched");
	}
	
	public void select_GetZopaLoan() {
		btn_SelectZopaLoan.click();		
	}
 
	public String getTitleOfLoansPage() {		
		return driver.getTitle();
	}

}
