package questions.customers;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;
import userinterface.customers.CustomersForm;

public class AlertMessagesAnswer{

    public static Question<String> successMessage(){
        return actor -> TextContent.of(CustomersForm.ALERT_SUCCESS_MESSAGE).answeredBy(actor).trim();
    }
}
