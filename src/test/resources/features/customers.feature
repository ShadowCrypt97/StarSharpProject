@customers
  Feature: Create a new customer

    Background: the user is logged in the StartSharp Page
      Given User login in the StartSharp with the user 'admin' and password 'serenity'

    @CreateNewCustomerAndApplyChanges
    Scenario: The user wants register a new customer appling changes before save
      Given the user goes to the customers table
      When he does apply changes of a new customer
      |customerId|companyName|
      |ACAB      |Zucaritas  |
      Then he should see 'Save success' message

    @CreateNewCustomerAndSave
    Scenario Outline: The user wants register a new customer saving the form
      Given the user goes to the customers table
      And he saves a new customer
        |customerId  |companyName     |contactName  |contactTitle   |address  |region   |postalCode   |phone  |fax   |email   |country  |city     |representatives  |
        |<customerId>|<companyName>   |<contactName>|<contactTitle> |<address>|<region> |<postalCode> |<phone>|<fax> |<email> |<country>|<city>   |<representatives>|
      When he search the customer by id '<customerId>'
      Then he should see the create customer data on table
        |customerId  |companyName     |contactName  |contactTitle   |address  |region   |postalCode  |phone  |fax   |email  |country  |city  |representatives   |
        |<customerId>|<companyName>   |<contactName>|<contactTitle> |<address>|<region> |<postalCode>|<phone>|<fax> |<email>|<country>|<city>|<representatives> |
      Examples:
        |customerId|companyName|contactName  |contactTitle |address         |region   |postalCode |phone     |fax         |email                    |country|city     |representatives|
        |KASR      |Rampage    |Juan Pedraza|Lawyer       |Cll 100 #15 - 03|Usaquen  |10101      |3123456789|31478951357 |juan.pedraza@example.com |Canada |Vancouver|Janet Leverling|