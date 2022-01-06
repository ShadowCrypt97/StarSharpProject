package stepsdefinitions.customers;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import model.customers.CustomerData;
import net.serenitybdd.screenplay.actors.OnStage;
import tasks.customers.CreateNewCustomerTask;
import tasks.customers.OpenCustomerFormTask;
import tasks.customers.OpenCustomersModuleTask;

import java.util.List;

public class customersRegisterSteps {
    @Given("the user goes to the customers table")
    public void the_user_goes_to_the_customers_table() {
        OnStage.theActorCalled("admin").wasAbleTo(OpenCustomersModuleTask.customerTable(),OpenCustomerFormTask.customerForm());
    }

    @When("he does register of a new customer")
    public void he_does_register_of_a_new_customer(List<CustomerData> customerDataList) {
        OnStage.theActorInTheSpotlight().attemptsTo(CreateNewCustomerTask.registerForm(customerDataList));
    }

    @Then("he should filter and find the new customer in the Customers table")
    public void he_should_filter_and_find_the_new_customer_in_the_customers_table() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
