package tasks.customers;

import model.customers.CustomerData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.customers.CustomersForm;

import java.util.List;

public class CreateNewCustomerTask implements Task {
    private String customerId;
    private String companyName;
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
        }
        actor.attemptsTo(Enter.theValue(customerId).into(CustomersForm.INPUT_CUSTOMER_ID),
                         Enter.theValue(companyName).into(CustomersForm.INPUT_COMPANY_NAME));
    }
}
