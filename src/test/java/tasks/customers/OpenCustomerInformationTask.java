package tasks.customers;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import org.openqa.selenium.By;
import userinterface.customers.CustomersTable;

public class OpenCustomerInformationTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(CustomersTable.CUSTOMER_ID));
    }

    public static OpenCustomerInformationTask openFromTable() {
        return Tasks.instrumented(OpenCustomerInformationTask.class);
    }
}
