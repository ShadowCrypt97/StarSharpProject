package stepsdefinitions.customers;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import model.customers.CustomerData;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.hamcrest.Matchers;
import questions.customers.VerifyCustomerOnTableAnswer;
import questions.customers.AlertMessagesAnswer;
import tasks.customers.*;
import userinterface.customers.CustomersTable;

import java.util.List;

public class customersRegisterSteps {
    @Given("the user goes to the customers table")
    public void the_user_goes_to_the_customers_table() {
        OnStage.theActorCalled("admin").wasAbleTo(OpenCustomersModuleTask.customerTable());
    }

    @When("he goes to register form")
    public void he_goes_to_register_form() {
        OnStage.theActorCalled("admin").wasAbleTo(OpenCustomerFormTask.customerForm());
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
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat("Verifiy the customer on table", VerifyCustomerOnTableAnswer.verifyCustomerDataOnTable(customerDataList)));
    }

    @When("he goes to customer information")
    public void he_goes_to_customer_information() {
        OnStage.theActorInTheSpotlight().attemptsTo(OpenCustomerInformationTask.openFromTable());
    }

    @Then("he deletes the customer record created")
    public void he_deletes_the_customer_record_created() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
