@AddEmployeeesatu @development
Feature: Add Employee
  User want to Add Employee

 @PositiveCase
  Scenario Outline: User input employee with correct data
    Given User already login with "<email>" as username and "<password>" as password
    When User Open Add Employee Page
    And User input "<firstname>" as firstName, "<middlename>" as middleName and "<lastname>" as lastName
    And User upload photo "arisa.jpg"
    Then User "arisa hazriaty testing" already created
    
    Examples: 
      |email|password|firstname|middlename|lastname|
      |Admin|admin123|arisa		 |hazriaty  |testing |
    
