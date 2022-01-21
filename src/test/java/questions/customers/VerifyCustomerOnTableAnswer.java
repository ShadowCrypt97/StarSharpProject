package questions.customers;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import userinterface.customers.CustomersTable;

public class VerifyCustomerOnTableAnswer implements Question<Boolean>{

    public String customerIdExp;

    public VerifyCustomerOnTableAnswer(String customerIdExp) {
        this.customerIdExp = customerIdExp;
    }
    public static VerifyCustomerOnTableAnswer verifyCustomerDataOnTable(String customerIdExp){ return new VerifyCustomerOnTableAnswer(customerIdExp);}

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String customerIdObtained = CustomersTable.CUSTOMER_ID.resolveFor(actor).getText();
        result = customerIdExp.equals(customerIdObtained);
        return result;
    }
}
