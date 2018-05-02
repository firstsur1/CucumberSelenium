$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/functionalTests/E2E_Tests.feature");
formatter.feature({
  "line": 2,
  "name": "Get a loan Quotation on Zopa site",
  "description": "",
  "id": "get-a-loan-quotation-on-zopa-site",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4455890594,
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
  "duration": 1726533496,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_select_Get_a_zopa_loan()"
});
formatter.result({
  "duration": 2269705119,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.loans_page_is_displayed()"
});
formatter.result({
  "duration": 16406267,
  "status": "passed"
});
formatter.after({
  "duration": 600307425,
  "status": "passed"
});
formatter.before({
  "duration": 2524091487,
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
  "duration": 1688744890,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_select_Get_a_zopa_loan()"
});
formatter.result({
  "duration": 589837985,
  "status": "passed"
});
formatter.match({
  "location": "LoanPageSteps.borrower_select_Get_my_personlised_rates()"
});
formatter.result({
  "duration": 4593237958,
  "status": "passed"
});
formatter.match({
  "location": "LoanPageSteps.loans_sign_up_page_is_displayed()"
});
formatter.result({
  "duration": 25434,
  "status": "passed"
});
formatter.after({
  "duration": 542643660,
  "status": "passed"
});
formatter.before({
  "duration": 2466105692,
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
  "duration": 1648807507,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_select_Get_a_zopa_loan()"
});
formatter.result({
  "duration": 2173712888,
  "status": "passed"
});
formatter.match({
  "location": "LoanPageSteps.borrower_select_Get_my_personlised_rates()"
});
formatter.result({
  "duration": 4425366313,
  "status": "passed"
});
formatter.match({
  "location": "LoanSignUpPageSteps.borrower_enters_details(DataTable)"
});
formatter.result({
  "duration": 40628392898,
  "status": "passed"
});
formatter.after({
  "duration": 651842787,
  "status": "passed"
});
formatter.before({
  "duration": 2615006321,
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
  "duration": 1921219724,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_select_Get_a_zopa_loan()"
});
formatter.result({
  "duration": 2597767290,
  "status": "passed"
});
formatter.match({
  "location": "LoanPageSteps.borrower_select_Get_my_personlised_rates()"
});
formatter.result({
  "duration": 4127068680,
  "status": "passed"
});
formatter.match({
  "location": "LoanSignUpPageSteps.borrower_enter_invalidDetails(DataTable)"
});
formatter.result({
  "duration": 36307974924,
  "status": "passed"
});
formatter.match({
  "location": "LoanSignUpPageSteps.warning_message_box_with_relevant_messages_is_shown()"
});
formatter.result({
  "duration": 2777511357,
  "status": "passed"
});
formatter.after({
  "duration": 642367330,
  "status": "passed"
});
});