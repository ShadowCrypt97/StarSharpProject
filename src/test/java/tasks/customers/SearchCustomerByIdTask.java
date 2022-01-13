package tasks.customers;

import model.customers.CustomerData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;
import userinterface.customers.CustomersTable;

import java.util.List;

public class SearchCustomerByIdTask implements Task {

    private final String message;

    public SearchCustomerByIdTask(String message) {
        this.message = message;
    }

    public static SearchCustomerByIdTask search(String message) {
        return Tasks.instrumented(SearchCustomerByIdTask.class,message);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(message).into(CustomersTable.SEARCH_BAR),
                         Enter.keyValues(Keys.ENTER).into(CustomersTable.SEARCH_BAR));
    }
}
