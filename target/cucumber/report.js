$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/functionalTests/E2E_Tests.feature");
formatter.feature({
  "line": 2,
  "name": "Get a loan Quotation on Zopa site",
  "description": "",
  "id": "get-a-loan-quotation-on-zopa-site",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3523271851,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Navigate to the Loan page",
  "description": "",
  "id": "get-a-loan-quotation-on-zopa-site;navigate-to-the-loan-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "borrower is on Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "borrower select \u0027Get a zopa loan\u0027",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "loans page is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageSteps.borrower_is_on_Home_Page()"
});
formatter.result({
  "duration": 1993245588,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_select_Get_a_zopa_loan()"
});
formatter.result({
  "duration": 2393704470,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.loans_page_is_displayed()"
});
formatter.result({
  "duration": 16505542,
  "status": "passed"
});
formatter.after({
  "duration": 556799004,
  "status": "passed"
});
formatter.before({
  "duration": 2573435409,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Navigate to Loan Quotation page for personlised rates",
  "description": "",
  "id": "get-a-loan-quotation-on-zopa-site;navigate-to-loan-quotation-page-for-personlised-rates",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 11,
  "name": "borrower is on Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "borrower select \u0027Get a zopa loan\u0027",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "borrower select \u0027Get my personlised rates\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "loan sign up page is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageSteps.borrower_is_on_Home_Page()"
});
formatter.result({
  "duration": 1503123069,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_select_Get_a_zopa_loan()"
});
formatter.result({
  "duration": 2337044534,
  "status": "passed"
});
formatter.match({
  "location": "LoanPageSteps.borrower_select_Get_my_personlised_rates()"
});
formatter.result({
  "duration": 4527981274,
  "status": "passed"
});
formatter.match({
  "location": "LoanPageSteps.loans_sign_up_page_is_displayed()"
});
formatter.result({
  "duration": 22973,
  "status": "passed"
});
formatter.after({
  "duration": 544175863,
  "status": "passed"
});
formatter.before({
  "duration": 2504697116,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Navigate to Loan Quotation page and complete application with valid Data",
  "description": "",
  "id": "get-a-loan-quotation-on-zopa-site;navigate-to-loan-quotation-page-and-complete-application-with-valid-data",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 18,
  "name": "borrower is on Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "borrower select \u0027Get a zopa loan\u0027",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "borrower select \u0027Get my personlised rates\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "borrower enters valid details",
  "rows": [
    {
      "cells": [
        "Email",
        "Title",
        "FirstName",
        "LastName",
        "Phone",
        "DOBDay",
        "DOBMonth",
        "DOBYear",
        "LoanReason",
        "PostCode",
        "Address",
        "EmploymentStatus",
        "AnnualIncome",
        "OwnHome",
        "MonthlyCont",
        "Password"
      ],
      "line": 22
    },
    {
      "cells": [
        "a1w@gmail.com",
        "Mr",
        "David",
        "Smith",
        "07921258888",
        "01",
        "01",
        "1977",
        "Car",
        "IG2 7HE",
        "31 HERTFORD ROAD IG2 7HE ILFORD ESSEX",
        "Employed full-time",
        "11000",
        "Yes, owner outright",
        "1100",
        "password"
      ],
      "line": 23
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "HomePageSteps.borrower_is_on_Home_Page()"
});
formatter.result({
  "duration": 1516980997,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_select_Get_a_zopa_loan()"
});
formatter.result({
  "duration": 2189701543,
  "status": "passed"
});
formatter.match({
  "location": "LoanPageSteps.borrower_select_Get_my_personlised_rates()"
});
formatter.result({
  "duration": 4322842014,
  "status": "passed"
});
formatter.match({
  "location": "LoanSignUpPageSteps.borrower_enters_details(DataTable)"
});
formatter.result({
  "duration": 65979592364,
  "status": "passed"
});
formatter.after({
  "duration": 636566700,
  "status": "passed"
});
formatter.before({
  "duration": 2565746907,
  "status": "passed"
});
formatter.scenario({
  "line": 26,
  "name": "Navigate to Loan Quotation page and complete application with invalid Data",
  "description": "",
  "id": "get-a-loan-quotation-on-zopa-site;navigate-to-loan-quotation-page-and-complete-application-with-invalid-data",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 27,
  "name": "borrower is on Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 28,
  "name": "borrower select \u0027Get a zopa loan\u0027",
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "borrower select \u0027Get my personlised rates\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "borrower enters invalidDetails",
  "rows": [
    {
      "cells": [
        "Email",
        "Title",
        "FirstName",
        "LastName",
        "Phone",
        "DOBDay",
        "DOBMonth",
        "DOBYear",
        "LoanReason",
        "PostCode",
        "Address",
        "EmploymentStatus",
        "AnnualIncome",
        "OwnHome",
        "MonthlyCont",
        "Password"
      ],
      "line": 31
    },
    {
      "cells": [
        "a1w",
        "Mr",
        "",
        "Smith",
        "abc",
        "01",
        "01",
        "1977",
        "Car",
        "IG2",
        "31 HERTFORD ROAD IG2 7HE ILFORD ESSEX",
        "Employed full-time",
        "11000",
        "Yes, owner outright",
        "1100",
        "password"
      ],
      "line": 32
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "warning message box with relevant messages is shown",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageSteps.borrower_is_on_Home_Page()"
});
formatter.result({
  "duration": 1883355226,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_select_Get_a_zopa_loan()"
});
formatter.result({
  "duration": 2630298819,
  "status": "passed"
});
formatter.match({
  "location": "LoanPageSteps.borrower_select_Get_my_personlised_rates()"
});
formatter.result({
  "duration": 4543750456,
  "status": "passed"
});
formatter.match({
  "location": "LoanSignUpPageSteps.borrower_enter_invalidDetails(DataTable)"
});
formatter.result({
  "duration": 30080478211,
  "status": "passed"
});
formatter.match({
  "location": "LoanSignUpPageSteps.warning_message_box_with_relevant_messages_is_shown()"
});
formatter.result({
  "duration": 3586088086,
  "status": "passed"
});
formatter.after({
  "duration": 820339210,
  "status": "passed"
});
});