@log

Feature: login

Scenario: Login with valid values

Given user is in the login page
When user enters valid username as "<username>" and password as "<password>"
Then user logs in

Examples:
| username 	|	password	|
|	Admin	|	admin123	|

Scenario: Login with invalid values

Given user is in the login page
When user enters invalid username as "<username>" and password as "<password>"
Then user doesn't log in

Examples:
| username 	|	password	|
|	qwerty	|	qwerty123	|