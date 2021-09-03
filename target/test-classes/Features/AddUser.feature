@AddUser @Orangehrm
Feature: AddUser

@PositiveCase 
Scenario: User on Add User page
 Given User Open Admin menu
 When user set User Role ESS
 And user set Mandatory fields
 Then user see Admin List Pages
 