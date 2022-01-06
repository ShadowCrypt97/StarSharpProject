package tasks.customers;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import userinterface.MainMenu;

public class OpenCustomersModuleTask implements Task {

    public static OpenCustomersModuleTask customerTable() {
        return Tasks.instrumented(OpenCustomersModuleTask.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(MainMenu.MENU_NORTHWIND),
                         Click.on(MainMenu.NORTHWIND_CUSTOMERS));
    }
}
