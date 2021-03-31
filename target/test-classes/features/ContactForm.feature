Feature: Creating a contact Form
	Scenario: Valid creation
		Given I am on the contactform web page
		When I enter a valid name , email address, enter a message and click submit
		| fake name| test1@gmail.com|
		Then I should be redirected to the Thank you page
