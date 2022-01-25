@customers
  Feature: Create a new customer

    Background: the user is logged in the StartSharp Page
      Given User login in the StartSharp with the user 'admin' and password 'serenity'
      And the user goes to the customers table

    @CreateNewCustomer
    Scenario Outline: The user wants register a new customer applying changes before save
      And he goes to register form
      And he does the register of a new customer
        |customerId  |companyName     |contactName  |contactTitle   |address  |region   |postalCode   |phone  |fax   |email   |country  |city     |representatives  |
        |<customerId>|<companyName>   |<contactName>|<contactTitle> |<address>|<region> |<postalCode> |<phone>|<fax> |<email> |<country>|<city>   |<representatives>|
      And he verifies the success message 'Save success'
      And he saves the new customer
      When he search the customer by id '<customerId>'
      Then he should see the create customer data on table
        |customerId  |companyName     |contactName  |contactTitle   |address  |region   |postalCode  |phone  |fax   |email  |country  |city  |representatives   |
        |<customerId>|<companyName>   |<contactName>|<contactTitle> |<address>|<region> |<postalCode>|<phone>|<fax> |<email>|<country>|<city>|<representatives> |

      Examples:
        |customerId|companyName|contactName  |contactTitle |address         |region   |postalCode |phone     |fax         |email                    |country   |city        |representatives|
        |ACAB      |Pruebas S.A|Juan Pedraza |Lawyer       |Cll 100 #15 - 03|Usaquen  |10101      |3123456789|31478951357 |juan.pedraza@example.com |Argentina |Buenos Aires|Andrew Fuller  |

    @Delete
    Scenario Outline: The user wants delete the created customers
      And he search the customer by id '<customerId>'
      When he goes to customer information and Delete customer '<customerId>'
      Then he shouldn't see the customer created previously on table '<customerId>'

      Examples:
        |customerId|
        |ACAB      |