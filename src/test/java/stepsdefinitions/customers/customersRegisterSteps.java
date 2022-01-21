package stepsdefinitions.customers;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import model.customers.CustomerData;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;
import questions.customers.VerifyCustomerOnTableAnswer;
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

    @When("he search the customer by id {string}")
    public void he_search_the_customer_by_id(String message) {
        OnStage.theActorInTheSpotlight().attemptsTo(SearchCustomerByIdTask.search(message));
    }

    @Then("he should see the create customer data on table")
    public void he_should_see_the_create_customer_on_table(List<CustomerData> customerDataList) {
        String customerId = customerDataList.get(0).customerId;
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat("Verifiy the customer on table", VerifyCustomerOnTableAnswer.verifyCustomerDataOnTable(customerId)));
    }
}
