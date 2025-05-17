Feature: To Test the Login functionality of swag labs application with multiple users
	
	Background:
	Then user can able to see the product name
	
	Scenario Outline: I need to test the login fucntion using given datas with multiple users
	Given user have the username with multiple users
	And user have the password and login button with multiple users
	When the user enters username as "<usernames>" and password as "<passwords>"
	Then clicked on the login button and verifies that all users successfully logged in
	
	Examples:
	|usernames|passwords|
	|standard_user|secret_sauce|
	|problem_user|secret_sauce|