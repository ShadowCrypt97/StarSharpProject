package questions.customers;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;
import userinterface.customers.CustomersForm;
import userinterface.customers.CustomersTable;

public class VerifyCustomerOnTableAnswer {

    public static Question<String> verifyById(){
        return actor -> TextContent.of(CustomersTable.CUSTOMER_ID).answeredBy(actor).trim();
    }
}
