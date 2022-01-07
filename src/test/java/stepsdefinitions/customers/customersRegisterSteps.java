package stepsdefinitions.customers;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import model.customers.CustomerData;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;
import questions.customers.AlertMessagesAnswer;
import tasks.customers.*;

import java.util.List;

public class customersRegisterSteps {
    @Given("the user goes to the customers table")
    public void the_user_goes_to_the_customers_table() {
        OnStage.theActorCalled("admin").wasAbleTo(OpenCustomersModuleTask.customerTable(),OpenCustomerFormTask.customerForm());
    }

    @When("he does apply changes of a new customer")
    public void he_does_register_and_apply_changes_of_a_new_customer(List<CustomerData> customerDataList) {
        OnStage.theActorInTheSpotlight().attemptsTo(CreateNewCustomerTask.registerForm(customerDataList), ApplyChangesTask.apply());
    }

    @Then("he should see {string} message")
    public void he_should_see_success_message(String message) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat("Verify the success message", AlertMessagesAnswer.successMessage(), Matchers.equalTo(message)));
    }

    @When("he saves a new customer")
    public void he_does_saves_a_new_customer(List<CustomerData> customerDataList) {
        OnStage.theActorInTheSpotlight().attemptsTo(CreateNewCustomerTask.registerForm(customerDataList), SaveChangesTask.save());
    }

    @Then("he should see the create customer on table")
    public void he_should_see_the_create_customer_on_table() throws Throwable {
        throw new PendingException();
    }
}
