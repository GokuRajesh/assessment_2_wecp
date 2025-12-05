@rec

Feature: user should be able to search employee based on their info

Scenario: search using valid name

Given user is in the recruitment page
When he enters the candidate name as "<name>"
Then the system displays the result

Examples:
| name		|
|	John Doe|