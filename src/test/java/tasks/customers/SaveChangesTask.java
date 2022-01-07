package tasks.customers;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import userinterface.customers.CustomersForm;

public class SaveChangesTask implements Task {

    public static ApplyChangesTask save() {
        return Tasks.instrumented(ApplyChangesTask.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(CustomersForm.BUTTON_SAVE));
    }
}
