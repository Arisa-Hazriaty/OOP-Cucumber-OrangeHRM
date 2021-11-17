@LoginValidInvalid @development
Feature: Login

@NegativeCase
Scenario: username and password not match
 Given user open the web page
 When user input invalid username and password
 Then user see error message
 
@PositiveCase
Scenario: username and password match
 Given user open the web page
 When user input "admin" as username and "admin123" as password
 Then user see dashboard page
 
 
