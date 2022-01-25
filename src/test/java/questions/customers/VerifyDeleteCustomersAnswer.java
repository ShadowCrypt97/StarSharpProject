package questions.customers;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import userinterface.customers.CustomersTable;

public class VerifyDeleteCustomersAnswer implements Question<Boolean> {

    public static VerifyDeleteCustomersAnswer the(){ return new VerifyDeleteCustomersAnswer();}


    @Override
    public Boolean answeredBy(Actor actor) {
        return !CustomersTable.CUSTOMER_ID.isVisibleFor(actor);
    }
}
