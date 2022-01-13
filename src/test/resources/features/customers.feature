@customers
  Feature: Create a new customer

    Background: the user is logged in the StartSharp Page
      Given User login in the StartSharp with the user 'admin' and password 'serenity'

    @CreateNewCustomer
    Scenario: The user wants register a new customer appling changes before save
      Given the user goes to the customers table
      When he does apply changes of a new customer
      |customerId|companyName|
      |ACAB      |Zucaritas  |
      Then he should see 'Save success' message

    @CreateNewCustomer
    Scenario: The user wants register a new customer saving the form
      Given the user goes to the customers table
      And he saves a new customer
        |customerId|companyName|
        |AFAR      |Rampage    |
      When he search the customer by id 'AFAR'
      Then he should see the create customer 'AFAR' on table