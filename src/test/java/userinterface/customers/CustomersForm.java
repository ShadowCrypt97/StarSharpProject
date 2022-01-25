package userinterface.customers;

import model.customers.CustomerData;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import tasks.customers.CreateNewCustomerTask;

public class CustomersForm {
    //labels
    public static final Target LABEL_NEW_CUSTOMER = Target.the("titulo New Customer").located(By.xpath("//div[contains(text(),'New Customer')]"));
    //General
    public static final Target INPUT_CUSTOMER_ID = Target.the("Campo customer id").located(By.cssSelector("input[name='CustomerID']"));
    public static final Target INPUT_COMPANY_NAME = Target.the("Campo company name").located(By.cssSelector("input[name='CompanyName']"));
    //Contact
    public static final Target INPUT_CONTACT_NAME = Target.the("Campo contact name").located(By.cssSelector("input[name='ContactName']"));
    public static final Target INPUT_CONTACT_TITLE = Target.the("Campo contact title").located(By.cssSelector("input[name='ContactTitle']"));
    public static final Target DROPDOWN_REPRESENTATIVES = Target.the("Campo dropdown representatives").located(By.xpath("//div[@id='s2id_Serenity_Demo_Northwind_CustomerDialog9_Representatives']"));
    public static final Target SELECT_REPRESENTATIVES = Target.the("Campo para seleccionar representatives").located(By.xpath("//div[contains(text(),'Andrew Fuller')]"));
    //Address
    public static final Target INPUT_ADDRESS = Target.the("Campo address").located(By.cssSelector("#Serenity_Demo_Northwind_CustomerDialog44_Address"));
    public static final Target DROPDOWN_COUNTRY = Target.the("Campo dropdown país").located(By.cssSelector("#select2-chosen-5"));
    public static final Target SELECT_COUNTRY = Target.the("Seleccion de país").located(By.xpath("//li/div[contains(text(),'Argentina')]"));
    public static final Target DROPDOWN_CITY = Target.the("Campo dropdown ciudad").located(By.xpath("//div[@id='s2id_Serenity_Demo_Northwind_CustomerDialog9_City']"));
    public static final Target SELECT_CITY = Target.the("Seleccion de ciudad").located(By.xpath("//li/div[contains(text(),'Buenos Aires')]"));
    public static final Target INPUT_REGION  = Target.the("Campo región").located(By.cssSelector("input[name='Region']"));
    public static final Target INPUT_POSTAL_CODE = Target.the("Campo postal code").located(By.cssSelector("input[name='PostalCode']"));
    public static final Target INPUT_PHONE = Target.the("Campo phone").located(By.cssSelector("input[name='Phone']"));
    public static final Target INPUT_FAX = Target.the("Campo fax").located(By.cssSelector("input[name='Fax']"));
    //Details
    public static final Target LAST_CONTACT_DATE = Target.the("Campo ultima fecha de contacto").located(By.cssSelector("#div.LastContactDate >button[type='button'].ui-datepicker-trigger > i.fa-calendar"));
    public static final Target DROPDOWN_DATE_MONTH = Target.the("Dropdown meses").located(By.cssSelector("select.ui-datepicker-month"));
    public static final Target SELECT_MONTH = Target.the("Seleccion mes").located(By.cssSelector("select.ui-datepicker-month > option[value='0']"));
    public static final Target DROPDOWN_DATE_YEAR = Target.the("Dropdown años").located(By.cssSelector("select.ui-datepicker-year"));
    public static final Target SELECT_YEAR = Target.the("Seleccion año").located(By.cssSelector("select.ui-datepicker-year > option[value='2022']"));
    public static final Target SELECT_DAY = Target.the("Seleccion día").located(By.xpath("//td[@data-handler='selectDay']/a[text()='10']"));
    public static final Target DROPDOWN_LAST_CONTACTED_BY = Target.the("Dropdown para mostrar el listado de personas").located(By.cssSelector("#Serenity_Demo_Northwind_CustomerDialog79_ContactTitle"));
    public static final Target SELECT_LAST_CONTACTED_BY = Target.the("seleccionar la persona de la lista").located(By.xpath("//div[@id='select2-result-label-60']"));
    public static final Target INPUT_EMAIL = Target.the("Campo email").located(By.cssSelector("input[name='Email']"));
    public static final Target INPUT_SEND_BULLETIN  = Target.the("Campo send bulletin").located(By.cssSelector("#Serenity_Demo_Northwind_CustomerDialog79_ContactName"));
    //Buttons
    public static final Target BUTTON_APPLY_CHANGES = Target.the("Botón para aplicar cambios").located(By.cssSelector("span.button-inner > i.fa-clipboard-check,text-purple"));
    public static final Target BUTTON_SAVE = Target.the("Botón para guardar").located(By.xpath("//span[contains(text(),'Save')]"));
    //Alerts
    public static final Target ALERT_SUCCESS_MESSAGE = Target.the("alert con mensaje success").located(By.xpath("//div[contains(text(),'Save success')]"));
}
