package tasks.customers;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import userinterface.customers.CustomersTable;

public class OpenCustomerInformationTask implements Task {

    public String customerIdObtained;

    public OpenCustomerInformationTask(String customerIdObtained) {
        this.customerIdObtained = customerIdObtained;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        Target customerId = Target.the("CustomerId en la tabla").locatedBy("//a[contains(text(),'"+customerIdObtained+"')]");
        actor.attemptsTo(Click.on(customerId));
    }

    public static OpenCustomerInformationTask openFromTable(String customerIdObtained) {
        return Tasks.instrumented(OpenCustomerInformationTask.class, customerIdObtained);
    }
}
