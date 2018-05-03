package pageObjects;


	
	import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.validator.routines.EmailValidator;
import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.DataTable;
import utility.Log;


	 
	public class LoanSignUpPage {
		WebDriver driver;
				
		public LoanSignUpPage(WebDriver driver) {
		    PageFactory.initElements(driver, this);		    
		}
		
		@FindBy(how = How.ID, using = "member_email") 
		private WebElement txtbx_Email;
		
		@FindAll(@FindBy(how = How.XPATH, using = ".//*[@id='content']/div/div[1]/div/form/fieldset[1]/div[2]/p[1]/span[2]/label")) 
		private List<WebElement> rdbtn_Titles;
		
		@FindBy(how = How.ID, using = "applications_loan_apply_first_name") 
		private WebElement txtbx_FirstName;
		
		@FindBy(how = How.ID, using = "applications_loan_apply_last_name") 
		private WebElement txtbx_LastName;		
		
		@FindBy(how = How.ID, using = "applications_loan_apply_home_phone") 
		private WebElement txtbx_Phone;
		
		@FindBy(how = How.ID, using = "date_of_birth_day") 
		private WebElement txtbx_DobDay;
		
		@FindBy(how = How.ID, using = "date_of_birth_month") 
		private WebElement txtbx_DobMonth;
		
		@FindBy(how = How.ID, using = "date_of_birth_year") 
		private WebElement txtbx_DobYear;
		
		@FindAll(@FindBy(how = How.XPATH, using = ".//*[@id='content']/div/div[1]/div/form/fieldset[1]/div[5]/p[1]/span[2]/label")) 
		private List<WebElement> rdbtn_LoanReason;
		
		@FindBy(how = How.ID, using = "address_postcode") 
		private WebElement txtbx_PostCode;
		
		@FindBy(how = How.XPATH, using = ".//*[@id='address-lookup']/p[2]/input")
		private WebElement btn_LookUpAddress;
		
		@FindBy(how = How.ID, using = "address_possible_address") 
		private WebElement drpdwn_Address;
		
		@FindBy(how = How.ID, using = "address_from_2i") 
		private WebElement txtbx_MoveInMonth;
		
		@FindBy(how = How.ID, using = "address_from_1i") 
		private WebElement txtbx_MoveInYear;
		
		@FindBy(how = How.NAME, using = "select_address") 
		private WebElement btn_UseAddress;
		
		@FindAll(@FindBy(how = How.XPATH, using = ".//*[@id='content']/div/div[1]/div/form/fieldset[3]/div[1]/p/span[2]/label")) 
		private List<WebElement> rdbtn_EmploymentStatus;
		
		@FindBy(how = How.ID, using = "applications_loan_apply_salary") 
		private WebElement rdbtn_AnnualIncomeBeforeTax;
		
		@FindAll(@FindBy(how = How.CLASS_NAME, using = "residential-status")) 
		private List<WebElement> rdbtn_OwnHome;
		
		@FindBy(how = How.ID, using = "applications_loan_apply_rent") 
		private WebElement txtbx_MonthlyContributionToRentOrMortgage;
		
		@FindBy(how = How.ID, using = "member_password") 
		private WebElement txtbx_Password;
		
		@FindBy(how = How.ID, using = "show_password") 
		private WebElement chkbx_ShowPassword;
		
		@FindBy(how = How.CSS, using = ".action>button") 
		private WebElement btn_CalculateMyRates;
		
		@FindBy(how = How.ID, using = "feedback") 
		private WebElement msgbx_error;
		
		
		public void enter_Email(String email) {
			try {
				txtbx_Email.sendKeys(email);		
				Log.info("Email element found and email entered in the email text box");
				if(!validateEmail(email))
					Log.error("Email is invalid");
				else
					Log.info("Email is valid");
			} catch(NoSuchElementException e){
				Log.error("Element not found");
			}
		}
		
		public boolean validateEmail(String email) {
			boolean valid = EmailValidator.getInstance().isValid(email);			
			return valid;
		}
		
		public void select_Title(String title) {
			try {
				for(WebElement titleName : rdbtn_Titles){
					if(titleName.getText().equals(title)) {
						titleName.click();	
						try { Thread.sleep(3000);}
						catch (InterruptedException e) {}
						break;
					}
				}
			} catch(NoSuchElementException e){
				Log.error("Element not found");
			}
		}
		
		public void enter_FirstName(String name) {
			try {
				txtbx_FirstName.sendKeys(name);
			} catch(NoSuchElementException e){
				Log.error("Element not found");
			}
		}
		
		public void enter_LastName(String lastName) {
			try {
				txtbx_LastName.sendKeys(lastName);
			} catch(NoSuchElementException e){
				Log.error("Element not found");
			}
		}	 
		
		
		public void enter_Phone(String phone) {
			try {
				txtbx_Phone.sendKeys(phone);
				if(!validatePhone(phone))
					Log.error("Phone is invalid");
				else
					Log.info("Phone is valid");
			} catch(NoSuchElementException e){
				Log.error("Element not found");
			}			
		}
		
		public boolean validatePhone(String phone) {
			String regex = "^[0-9]*$";			 
			Pattern pattern = Pattern.compile(regex);			
			Matcher matcher = pattern.matcher(phone);						
			return matcher.matches();
		}
		
		
		
		public void enter_DOB(String day,String month,String year) {			
			txtbx_DobDay.sendKeys(day);
			txtbx_DobMonth.sendKeys(month);
			txtbx_DobYear.sendKeys(year);
		}
		
		public void select_LoanReason(String loanReason) {
			try {
				for(WebElement loanReasonName : rdbtn_LoanReason){
					if(loanReasonName.getText().equals(loanReason)) {
						loanReasonName.click();	
						try { Thread.sleep(3000);}
						catch (InterruptedException e) {}
						break;
					}
				}
			} catch(NoSuchElementException e){
				Log.error("Element not found");
			}
				
		}
		
		public boolean enter_PostCode(String postCode) {
			boolean isValid = false;
			try {
				txtbx_PostCode.sendKeys(postCode.toUpperCase());
				if(!validatePostCode(postCode.toUpperCase())) {
					Log.error("Postcode is invalid");
									}
				else {
					Log.info("Postcode is valid");
				isValid =true;
				}
			} catch(NoSuchElementException e){
				Log.error("Element not found");
			}	
			return isValid;
		}
		
		public boolean validatePostCode(String postCode) {
			String regex = "^[A-Z]{1,2}[0-9R][0-9A-Z]? [0-9][ABD-HJLNP-UW-Z]{2}$";			 
			Pattern pattern = Pattern.compile(regex);			
			Matcher matcher = pattern.matcher(postCode);						
			return matcher.matches();
		}
		
		
		public void select_LookUpAddress() {
			try {
				btn_LookUpAddress.click();	
			} catch(NoSuchElementException e){
				Log.error("Element not found");
			}
		}
		
		public void enter_MoveInMonth(String moveInMonth) {
			try {
				txtbx_MoveInMonth.sendKeys(moveInMonth);
			} catch(NoSuchElementException e){
				Log.error("Element not found");
			}
		}
		
		public void enter_MoveInYear(String moveInMonth) {
			try {
				txtbx_MoveInYear.sendKeys(moveInMonth);
			} catch(NoSuchElementException e){
				Log.error("Element not found");
			}
		}
		
		public void enter_UseAddress(String useAddress) {
			try {
				btn_UseAddress.sendKeys(useAddress);
			} catch(NoSuchElementException e){
				Log.error("Element not found");
			}
		}
		
		public void select_EmploymentStatus(String employmentStatus) {
			try {
				for(WebElement employmentStatusName : rdbtn_EmploymentStatus){
					if(employmentStatusName.getText().equals(employmentStatus)) {
						employmentStatusName.click();	
						try { Thread.sleep(3000);}
						catch (InterruptedException e) {}
						break;
					}
				}
			} catch(NoSuchElementException e){
				Log.error("Element not found");
			}
		}
		
		public void select_OwnHome(String ownHome) {
			try {
				for(WebElement ownHomeName : rdbtn_OwnHome){
					if(ownHomeName.getText().equals(ownHome)) {
						ownHomeName.click();	
						try { Thread.sleep(3000);}
						catch (InterruptedException e) {}
						break;
					}
				}
			} catch(NoSuchElementException e){
				Log.error("Element not found");
			}
		}
		
		public void enter_AnnualIncomeBeforeTax(String annualIncomeBeforeTax) {
			try {
				rdbtn_AnnualIncomeBeforeTax.sendKeys(annualIncomeBeforeTax);
			} catch(NoSuchElementException e){
				Log.error("Element not found");
			}
		}
		
		public void enter_MonthlyContributionToRentOrMortgage(String monthlyContributionToRentOrMortgage) {
			try {
				txtbx_MonthlyContributionToRentOrMortgage.sendKeys(monthlyContributionToRentOrMortgage);
			} catch(NoSuchElementException e){
				Log.error("Element not found");
			}
		}
		
		public void enter_Password(String Password) {
			try {
				txtbx_Password.sendKeys(Password);
			} catch(NoSuchElementException e){
				Log.error("Element not found");
			}
		}
		
		public void enter_ShowPassword(String showPassword) {
			try {
			chkbx_ShowPassword.sendKeys(showPassword);
			} catch(NoSuchElementException e){
				Log.error("Element not found");
			}
		}
		
		public void select_Address(String address) {
			try {
				Select select = new Select(drpdwn_Address);
				select.selectByVisibleText(address);
				enter_MoveInMonth("June");
				enter_MoveInYear("2000");
				btn_UseAddress.click();
			} catch(NoSuchElementException e){
				Log.error("Element not found");
			}
			
		}
	
		public void display_errorMessageBox() {
			try {
				Assert.assertTrue(msgbx_error.isDisplayed());
			} catch(NoSuchElementException e){
				Log.error("Element not found");
			}
		}
	
	
	
		public void fill_ValidBorrowerDetails(DataTable borrowerDetails) throws Exception {
			
			Thread.sleep(3000);
			List<Map<String,String>> data =borrowerDetails.asMaps();	
			enter_Email(data.get(0).get("Email"));
			select_Title(data.get(0).get("Title"));
			enter_FirstName(data.get(0).get("FirstName"));
			enter_LastName(data.get(0).get("LastName"));
			enter_Phone(data.get(0).get("Phone"));
			enter_DOB(data.get(0).get("DOBDay"),data.get(0).get("DOBMonth"),data.get(0).get("DOBYear"));			
			select_LoanReason(data.get(0).get("LoanReason"));		
			if(enter_PostCode(data.get(0).get("PostCode"))) {
				select_LookUpAddress();
				Thread.sleep(3000);
				select_Address(data.get(0).get("Address"));	
			}
			select_Address(data.get(0).get("Address"));		
			select_EmploymentStatus(data.get(0).get("EmploymentStatus"));
			select_OwnHome(data.get(0).get("OwnHome"));
			enter_AnnualIncomeBeforeTax(data.get(0).get("AnnualIncome"));
			enter_MonthlyContributionToRentOrMortgage(data.get(0).get("MonthlyCont"));
			enter_Password(data.get(0).get("Password"));
		
		}
		
		public void fill_InValidBorrowerDetails(DataTable borrowerDetails) throws Exception {
			Thread.sleep(3000);
			List<Map<String,String>> data =borrowerDetails.asMaps();				
			enter_Email(data.get(0).get("Email"));
			select_Title(data.get(0).get("Title"));
			enter_FirstName(data.get(0).get("FirstName"));
			enter_LastName(data.get(0).get("LastName"));
			enter_Phone(data.get(0).get("Phone"));
			enter_DOB(data.get(0).get("DOBDay"),data.get(0).get("DOBMonth"),data.get(0).get("DOBYear"));			
			select_LoanReason(data.get(0).get("LoanReason"));		
			if(enter_PostCode(data.get(0).get("PostCode"))) {
				select_LookUpAddress();
				Thread.sleep(3000);
				select_Address(data.get(0).get("Address"));	
			}
			select_EmploymentStatus(data.get(0).get("EmploymentStatus"));
			select_OwnHome(data.get(0).get("OwnHome"));
			enter_AnnualIncomeBeforeTax(data.get(0).get("AnnualIncome"));
			enter_MonthlyContributionToRentOrMortgage(data.get(0).get("MonthlyCont"));
			enter_Password(data.get(0).get("Password"));
			try {
				btn_CalculateMyRates.click();
			} catch(NoSuchElementException e){
				Log.error("Element not found");
			}
		
		}

				
}
