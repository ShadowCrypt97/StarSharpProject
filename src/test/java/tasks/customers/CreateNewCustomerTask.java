package tasks.customers;

import model.customers.CustomerData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.customers.CustomersForm;

import java.util.List;

public class CreateNewCustomerTask implements Task {
    private String customerId;
    private String companyName;
    private String contactName;
    private String contactTitle;
    private String region;
    private String postalCode;
    private String phone;
    private String fax;
    private String email;
    private final List<CustomerData> customerDataList;

    public CreateNewCustomerTask(List<CustomerData> customerDataList) {
        this.customerDataList = customerDataList;
    }

    public static CreateNewCustomerTask registerForm(List<CustomerData> customerDataList) {
        return Tasks.instrumented(CreateNewCustomerTask.class, customerDataList);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        for (CustomerData list : customerDataList) {
            customerId = list.getCustomerId();
            companyName = list.getCompanyName();
            contactName = list.getContactName();
            contactTitle = list.getContactTitle();
            region = list.getRegion();
            postalCode = list.getPostalCode();
            phone =list.getPhone();
            fax = list.getFax();
            email = list.getEmail();
            CustomersForm.city = list.getCity();
            CustomersForm.representative = list.getRepresentatives();
            CustomersForm.country = list.getCountry();
        }
        actor.attemptsTo(Enter.theValue(customerId).into(CustomersForm.INPUT_CUSTOMER_ID),
                         Enter.theValue(companyName).into(CustomersForm.INPUT_COMPANY_NAME),
                         Enter.theValue(contactName).into(CustomersForm.INPUT_CONTACT_NAME),
                         Enter.theValue(contactTitle).into(CustomersForm.INPUT_CONTACT_TITLE),
                         Click.on(CustomersForm.DROPDOWN_REPRESENTATIVES),
                         Click.on(CustomersForm.SELECT_REPRESENTATIVES),
                         Click.on(CustomersForm.DROPDOWN_COUNTRY),
                         Click.on(CustomersForm.SELECT_COUNTRY),
                         Click.on(CustomersForm.DROPDOWN_CITY),
                         Click.on(CustomersForm.SELECT_CITY),
                         Enter.theValue(region).into(CustomersForm.INPUT_REGION),
                         Enter.theValue(postalCode).into(CustomersForm.INPUT_POSTAL_CODE),
                         Enter.theValue(phone).into(CustomersForm.INPUT_PHONE),
                         Enter.theValue(fax).into(CustomersForm.INPUT_FAX),
                         Enter.theValue(email).into(CustomersForm.INPUT_EMAIL)

        );
    }
}
