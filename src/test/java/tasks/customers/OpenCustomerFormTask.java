package tasks.customers;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import userinterface.customers.CustomersTable;

public class OpenCustomerFormTask implements Task {

    public static OpenCustomerFormTask customerForm() {
        return Tasks.instrumented(OpenCustomerFormTask.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(CustomersTable.BUTTON_NEW_CUSTOMER));
    }
}
