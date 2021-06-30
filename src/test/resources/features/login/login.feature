Feature: Free CRM Login Feature

Scenario Outline: Free CRM Login Test Scenario

Given user is already on Login Page
Then I should see Log In Page
Then I click on LOGIN button
Then user enters "<username>" and "<password>"
Then user clicks on login button
Then Close the browser



Examples:
	| username | password |
	| vinavm  | test@123 |