package model.customers;

import java.util.Map;

public class CustomerData {

    public String customerId;
    public String companyName;

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public static CustomerData createCustomerData(Map<String, String> entry) {
        CustomerData customerData = new CustomerData();
        customerData.setCustomerId(entry.get("customerId"));
        customerData.setCompanyName(entry.get("companyName"));
        return customerData;
    }
}
