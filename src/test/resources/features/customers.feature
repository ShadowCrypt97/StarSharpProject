@customers
  Feature: Create a new customer

    Background: the user is logged in the StartSharp Page
      Given User login in the StartSharp with the user 'admin' and password 'serenity'
      Given the user goes to the customers table

    @CreateNewCustomerAndApplyChanges
    Scenario Outline: The user wants register a new customer appling changes before save
      And he goes to register form
      When he does apply changes of a new customer
        |customerId  |companyName     |contactName  |contactTitle   |address  |region   |postalCode   |phone  |fax   |email   |country  |city     |representatives  |
        |<customerId>|<companyName>   |<contactName>|<contactTitle> |<address>|<region> |<postalCode> |<phone>|<fax> |<email> |<country>|<city>   |<representatives>|
      Then he should see 'Save success' message
      Examples:
        |customerId|companyName|contactName  |contactTitle |address         |region   |postalCode |phone     |fax         |email                    |country|city           |representatives|
        |ACAB      |Pruebas S.A|Juan Pedraza  |Lawyer      |Cll 100 #15 - 03|Usaquen  |10101      |3123456789|31478951357 |juan.pedraza@example.com |Brazil |Rio de Janeiro |Andrew Fuller  |

    @CreateNewCustomerAndSave
    Scenario Outline: The user wants register a new customer saving the form
      And he goes to register form
      And he saves a new customer
        |customerId  |companyName     |contactName  |contactTitle   |address  |region   |postalCode   |phone  |fax   |email   |country  |city     |representatives  |
        |<customerId>|<companyName>   |<contactName>|<contactTitle> |<address>|<region> |<postalCode> |<phone>|<fax> |<email> |<country>|<city>   |<representatives>|
      When he search the customer by id '<customerId>'
      Then he should see the create customer data on table
        |customerId  |companyName     |contactName  |contactTitle   |address  |region   |postalCode  |phone  |fax   |email  |country  |city  |representatives   |
        |<customerId>|<companyName>   |<contactName>|<contactTitle> |<address>|<region> |<postalCode>|<phone>|<fax> |<email>|<country>|<city>|<representatives> |
      Examples:
        |customerId|companyName|contactName  |contactTitle |address         |region   |postalCode |phone     |fax         |email                   |country|city     |representatives|
        |KASR      |Rampage    |Juan Pedraza|Lawyer       |Cll 100 #15 - 03|Usaquen  |10101      |3123456789|31478951357 |juan.pedraza@example.com |Brazil |Rio de Janeiro |Andrew Fuller|

    @Delete
    Scenario Outline: The user wants delete the created customers
      And he search the customer by id '<customerId>'
      When he goes to customer information
      Then he deletes the customer record created

      Examples:
        |customerId|
        |KASR      |
        |ACAB      |