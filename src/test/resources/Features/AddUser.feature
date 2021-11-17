@AddUser @development
Feature: AddUser

@PositiveCase 
Scenario Outline: User input user with correct data
 Given User login "<email>" as username and "<password>" as password
 When User Open Add User Page
 And user set the Role
 And User input "<name>" as EmployeeName, "<username>" Username
 And User set Status ,"<passwordusername>" as Password , "<confirmPassword>" as ConfirmPassword
 Then user see Username List Pages
     
    Examples: 
      |email|password|name					 |username      |passwordusername|confirmPassword|
      |Admin|admin123|Fiona Grace		 |valid         |P@ssw0rd123     |P@ssw0rd123    |
 