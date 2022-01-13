package userinterface.customers;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class CustomersTable {
    public static final Target BUTTON_NEW_CUSTOMER = Target.the("Botón para crear nuevo cliente").located(By.xpath("//span[contains(text(),'New Customer')]"));
    public static final Target SEARCH_BAR = Target.the("Barra de busqueda de la tabla").located(By.cssSelector("input.s-Serenity-QuickSearchInput[placeholder='search...']"));
    public static final Target CUSTOMER_ID = Target.the("Id del cliente en la tabla").located(By.xpath("//a[contains(text(),'AFAR')]"));
}
