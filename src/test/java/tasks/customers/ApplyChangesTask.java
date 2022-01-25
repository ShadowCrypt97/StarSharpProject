package tasks.customers;

import net.serenitybdd.screenplay.*;
import net.serenitybdd.screenplay.actions.Click;
import org.hamcrest.Matchers;
import questions.customers.AlertMessagesAnswer;
import userinterface.customers.CustomersForm;

public class ApplyChangesTask implements Task {

    private final String message;

    public ApplyChangesTask(String message) {
        this.message = message;
    }

    public static ApplyChangesTask apply(String message) {
        return Tasks.instrumented(ApplyChangesTask.class, message);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(CustomersForm.BUTTON_APPLY_CHANGES));
        actor.should(GivenWhenThen.seeThat("Verify the success message", AlertMessagesAnswer.successMessage(), Matchers.equalTo(message)));
    }
}
