
Feature: Get a loan Quotation on Zopa site
  
  Scenario: Navigate to the Loan page
		Given borrower is on Home Page
		When borrower select 'Get a zopa loan'
		Then loans page is displayed
		
  
	Scenario: Navigate to Loan Quotation page for personlised rates
		Given borrower is on Home Page
		When borrower select 'Get a zopa loan'
	  And borrower select 'Get my personlised rates'
    Then loan sign up page is displayed
    
    
  Scenario: Navigate to Loan Quotation page and complete application with valid Data
		Given borrower is on Home Page
		When borrower select 'Get a zopa loan'
	  And borrower select 'Get my personlised rates'
    And borrower enters valid details
    |Email|Title|FirstName|LastName|Phone|DOBDay|DOBMonth|DOBYear|LoanReason|PostCode|Address|EmploymentStatus|AnnualIncome|OwnHome|MonthlyCont|Password|
    |a1w@gmail.com|Mr|David|Smith|07921258888|01|01|1977|Car|IG2 7HE|31 HERTFORD ROAD IG2 7HE ILFORD ESSEX|Employed full-time|11000|Yes, owner outright|1100|password|
    
    
  Scenario: Navigate to Loan Quotation page and complete application with invalid Data
		Given borrower is on Home Page
		When borrower select 'Get a zopa loan'
	  And borrower select 'Get my personlised rates'
    And borrower enters invalidDetails
    |Email|Title|FirstName|LastName|Phone|DOBDay|DOBMonth|DOBYear|LoanReason|PostCode|Address|EmploymentStatus|AnnualIncome|OwnHome|MonthlyCont|Password|
    |a1w|Mr||Smith|07921258888|01|01|1977|Car|IG2 7HE|31 HERTFORD ROAD IG2 7HE ILFORD ESSEX|Employed full-time|11000|Yes, owner outright|1100|password|
    Then warning message box with relevant messages is shown
    
  
		
		


  