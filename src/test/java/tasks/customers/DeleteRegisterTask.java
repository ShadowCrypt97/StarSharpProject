package tasks.customers;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import userinterface.customers.CustomersTable;

public class DeleteRegisterTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(CustomersTable.DELETE_BUTTON),
                         Click.on(CustomersTable.CONFIRMATION_BUTTON));
    }

    public static DeleteRegisterTask deleteCustomer() {
        return Tasks.instrumented(DeleteRegisterTask.class);
    }
}
