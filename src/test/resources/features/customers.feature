@customers
  Feature: Create a new customer

    Background: the user is logged in the StartSharp Page
      Given User login in the StartSharp with the user 'admin' and password 'serenity'

    Scenario: The user wants register a new customer
      Given the user goes to the customers table
      When he does register of a new customer
      |customerId|companyName|
      |ACAB      |Zucaritas  |
      Then he should filter and find the new customer in the Customers table
