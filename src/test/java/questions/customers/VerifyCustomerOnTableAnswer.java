package questions.customers;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;
import userinterface.customers.CustomersTable;

public class VerifyCustomerOnTableAnswer implements Question<String>{

    public static VerifyCustomerOnTableAnswer verifyCustomerDataOnTable(){ return new VerifyCustomerOnTableAnswer();}

    @Override
    public String answeredBy(Actor actor) {
        return TextContent.of(CustomersTable.CUSTOMER_ID).answeredBy(actor).trim();
    }
}
