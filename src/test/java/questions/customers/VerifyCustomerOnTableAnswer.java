package questions.customers;

import model.customers.CustomerData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import userinterface.customers.CustomersTable;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class VerifyCustomerOnTableAnswer implements Question<Boolean>{

    public List<CustomerData> customerDataList;

    public VerifyCustomerOnTableAnswer(List<CustomerData> customerDataList) {
        this.customerDataList = customerDataList;
    }
    public static VerifyCustomerOnTableAnswer verifyCustomerDataOnTable(List<CustomerData> customerDataList){ return new VerifyCustomerOnTableAnswer(customerDataList);}

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        List<String> customerDataExp = customerDataList.stream().flatMap(customerDataList -> Stream.of(
                customerDataList.getCustomerId(),
                customerDataList.getCompanyName(),
                customerDataList.getContactName(),
                customerDataList.getCity(),
                customerDataList.getCountry(),
                customerDataList.getContactTitle(),
                customerDataList.getPhone(),
                customerDataList.getFax(),
                customerDataList.getPostalCode(),
                customerDataList.getRegion(),
                customerDataList.getRepresentatives())).collect(Collectors.toList());

        List<String> customerDataObtained = new ArrayList();
                customerDataObtained.add(CustomersTable.CUSTOMER_ID.resolveFor(actor).getText());
                customerDataObtained.add(CustomersTable.COMPANY_NAME.resolveFor(actor).getText());
                customerDataObtained.add(CustomersTable.CONTACT_NAME.resolveFor(actor).getText());
                customerDataObtained.add(CustomersTable.CITY.resolveFor(actor).getText());
                customerDataObtained.add(CustomersTable.COUNTRY.resolveFor(actor).getText());
                customerDataObtained.add(CustomersTable.CONTACT_TITLE.resolveFor(actor).getText());
                customerDataObtained.add(CustomersTable.PHONE.resolveFor(actor).getText());
                customerDataObtained.add(CustomersTable.FAX.resolveFor(actor).getText());
                customerDataObtained.add(CustomersTable.POSTAL_CODE.resolveFor(actor).getText());
                customerDataObtained.add(CustomersTable.REGION.resolveFor(actor).getText());
                customerDataObtained.add(CustomersTable.REPRESENTATIVES.resolveFor(actor).getText());

        result = customerDataExp.containsAll(customerDataObtained);
        return result;
    }
}
