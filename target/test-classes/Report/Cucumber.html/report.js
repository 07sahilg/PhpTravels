$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Feature/SignUp.feature");
formatter.feature({
  "name": "To Validate the SignUp Feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "SignUp Validation",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user is on PHPTravels HomePage",
  "keyword": "Given "
});
formatter.match({
  "location": "SignUpSteps.user_is_on_PHPTravels_HomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks My Account",
  "keyword": "When "
});
formatter.match({
  "location": "SignUpSteps.user_clicks_My_Account()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select Sign Up",
  "keyword": "And "
});
formatter.match({
  "location": "SignUpSteps.user_select_Sign_Up()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the personal details",
  "rows": [
    {
      "cells": [
        "John",
        "Michael",
        "9876543210",
        "John123@gmail.com",
        "John@123",
        "John@123"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "SignUpSteps.user_enters_the_personal_details(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks Sign Up button",
  "keyword": "Then "
});
formatter.match({
  "location": "SignUpSteps.user_clicks_Sign_Up_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "SignUpSteps.close_the_browser()"
});
formatter.result({
  "status": "passed"
});
});