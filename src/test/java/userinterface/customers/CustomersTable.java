package userinterface.customers;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;
import tasks.customers.CreateNewCustomerTask;

public class CustomersTable {
    public static final Target BUTTON_NEW_CUSTOMER = Target.the("Botón para crear nuevo cliente").located(By.xpath("//span[contains(text(),'New Customer')]"));
    public static final Target SEARCH_BAR = Target.the("Barra de busqueda de la tabla").located(By.cssSelector("input.s-Serenity-QuickSearchInput[placeholder='search...']"));
    public static final Target CUSTOMER_ID = Target.the("Id del cliente en la tabla").located(By.cssSelector("div > div > div.slick-cell.l0.r0 > a"));
    public static final Target COMPANY_NAME = Target.the("company name").located(By.cssSelector("div[style='top:0px'] div.r1"));
    public static final Target CONTACT_NAME = Target.the("contact name").located(By.cssSelector("div[style='top:0px'] div.r2"));
    public static final Target CONTACT_TITLE = Target.the("contact title").located(By.cssSelector("div[style='top:0px'] div.r3"));
    public static final Target REGION = Target.the("region").located(By.cssSelector("div[style='top:0px'] div.r4"));
    public static final Target POSTAL_CODE = Target.the("postal code").located(By.cssSelector("div[style='top:0px'] div.r5"));
    public static final Target COUNTRY = Target.the("country").located(By.cssSelector("div[style='top:0px'] div.r6"));
    public static final Target CITY = Target.the("city").located(By.cssSelector("div[style='top:0px'] div.r7"));
    public static final Target PHONE = Target.the("phone").located(By.cssSelector("div[style='top:0px'] div.r8"));
    public static final Target FAX = Target.the("fax").located(By.cssSelector("div[style='top:0px'] div.r9"));
    public static final Target REPRESENTATIVES = Target.the("representatives").located(By.cssSelector("div[style='top:0px'] div.r10"));
    public static final Target DELETE_BUTTON = Target.the("delete button").located(By.cssSelector("div.delete-button"));
    public static final Target CONFIRMATION_BUTTON = Target.the("confirm delete").located(By.cssSelector("div.modal-footer > button.btn.btn-primary"));

}
