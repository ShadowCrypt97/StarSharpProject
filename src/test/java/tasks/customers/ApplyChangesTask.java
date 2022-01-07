package tasks.customers;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import userinterface.customers.CustomersForm;

public class ApplyChangesTask implements Task {

    public static ApplyChangesTask apply() {
        return Tasks.instrumented(ApplyChangesTask.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(CustomersForm.BUTTON_APPLY_CHANGES));
    }
}
