Feature: To Validate the SignUp Feature

	Scenario: SignUp Validation
		Given user is on PHPTravels HomePage
		When user clicks My Account
		And user select Sign Up
		And user enters the personal details
		| John | Michael | 9876543210 | John123@gmail.com | John@123 | John@123 |
		Then user clicks Sign Up button
		And close the browser