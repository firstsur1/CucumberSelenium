package pageObjects;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import managers.FileReaderManager;
import utility.Log;
	 
	public class HomePage {
		WebDriver driver;		
		
		public HomePage(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);			
		}
		
		@FindBy(how = How.XPATH, using = "//input[@id=\"searchInput\"]")	
		private WebElement txt_searchInput;
		
		@FindBy(how = How.XPATH, using = "//*[@id=\"search-form\"]/fieldset/button/i")		
		private WebElement btn_search;
		
		@FindBy(how = How.XPATH, using = "//*[@id=\"searchLanguage\"]")		
		private WebElement select_searchLanguage;
		
		@FindBy(how = How.XPATH, using = "//*[@id=\"section_0\"]")		
		private WebElement lbl_heading;		
		
		@FindBy(how = How.ID, using = "p-lang-label")		
		private WebElement lbl_languages;
		
		@FindBy(how = How.XPATH, using = "//*[@id=\"p-lang\"]/div/ul")		
		private WebElement ul_languages;
		
		@FindBy(how = How.XPATH, using = "//*[@id=\"language-selector\"]/a")		
		private WebElement select_languageSelector;	
		
		
		public void navigateToHomePage() {
			//Launch the Website
			driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl());
			Log.info("Web application launched");
		}
		
		public void typeString(String str) {
			//Type in a string given as parameter in the search input field 
			txt_searchInput.sendKeys("Hello");
		}		
		
		public String verifyLanguageIsEnglish() {
			//Get the default language
			Select drpLanguage = new Select(select_searchLanguage);
			return drpLanguage.getFirstSelectedOption().getText();			
		}
		
		public void click_searchButton() {
			//Click the search button
			btn_search.click();				
		}
		
		public String verifyFirstHeadingOfSearchResultsMatchesSearchString() {
			return lbl_heading.getText().toLowerCase();	
		}		
		
		public String verifyOtherLanguageExist() {
			return lbl_languages.getText();			
		}
		
		public boolean selectAnotherLanguageAndDoChecks() {
			//Navigate to the search results page in different language
			List<WebElement> languagesList=ul_languages.findElements(By.tagName("li"));
			for (WebElement li : languagesList) {
			if (li.getText().equals("Deutsch")) {
			     li.click();
			   }
			}
			//Validate that the search results page in the new language includes a link to the version in English
			return select_languageSelector.isDisplayed();
		}
		
		

}
