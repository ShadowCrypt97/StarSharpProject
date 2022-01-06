package userinterface.customers;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class CustomersTable {
    public static final Target BUTTON_NEW_CUSTOMER = Target.the("Botón para crear nuevo cliente").located(By.xpath("//span[contains(text(),'New Customer')]"));
}
