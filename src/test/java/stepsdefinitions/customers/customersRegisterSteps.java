package stepsdefinitions.customers;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import model.customers.CustomerData;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import questions.customers.VerifyCustomerOnTableAnswer;
import questions.customers.VerifyDeleteCustomersAnswer;
import tasks.customers.*;

import java.util.List;

public class customersRegisterSteps {

    @When("the user goes to the customers table")
    public void the_user_goes_to_the_customers_table() {
        OnStage.theActorCalled("admin").wasAbleTo(OpenCustomersModuleTask.customerTable());
    }

    @When("he goes to register form")
    public void he_goes_to_register_form() {
        OnStage.theActorCalled("admin").wasAbleTo(OpenCustomerFormTask.customerForm());
    }

    @When("he does the register of a new customer")
    public void he_does_the_register_of_a_new_customer(List<CustomerData> customerDataList){
        OnStage.theActorInTheSpotlight().attemptsTo(CreateNewCustomerTask.registerForm(customerDataList));
    }

    @When("he verifies the success message {string}")
    public void he_verifies_the_success_message(String message){
        OnStage.theActorInTheSpotlight().attemptsTo(ApplyChangesTask.apply(message));
    }

    @When("he saves the new customer")
    public void he_does_saves_a_new_customer() {
        OnStage.theActorInTheSpotlight().attemptsTo(SaveChangesTask.save());
    }

    @When("he search the customer by id {string}")
    public void he_search_the_customer_by_id(String message) {
        OnStage.theActorInTheSpotlight().attemptsTo(SearchCustomerByIdTask.search(message));
    }

    @Then("he should see the create customer data on table")
    public void he_should_see_the_create_customer_on_table(List<CustomerData> customerDataList) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat("Verifiy the customer on table", VerifyCustomerOnTableAnswer.verifyCustomerDataOnTable(customerDataList)));
    }

    @When("he goes to customer information and Delete customer {string}")
    public void he_goes_to_customer_information(String customerId) {
        OnStage.theActorInTheSpotlight().attemptsTo(OpenCustomerInformationTask.openFromTable(customerId), DeleteRegisterTask.deleteCustomer());
    }

    @Then("he shouldn't see the customer created previously on table {string}")
    public void he_deletes_the_customer_record_created(String customerId) {
            OnStage.theActorInTheSpotlight().attemptsTo(SearchCustomerByIdTask.search(customerId));
            OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat("Verify that delete customers does not exist anymore", VerifyDeleteCustomersAnswer.the()));
    }

}

