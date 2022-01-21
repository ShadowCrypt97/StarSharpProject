package model.customers;

import java.util.Map;

public class CustomerData {

    public String customerId;
    public String companyName;
    public String contactName;
    public String contactTitle;
    public String region;
    public String postalCode;
    public String country;
    public String city;
    public String phone;
    public String fax;
    public String representatives;
    public String email;

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


    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactTitle() {
        return contactTitle;
    }

    public void setContactTitle(String contactTitle) {
        this.contactTitle = contactTitle;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getRepresentatives() {
        return representatives;
    }

    public void setRepresentatives(String representatives) {
        this.representatives = representatives;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static CustomerData createCustomerData(Map<String, String> entry) {
        CustomerData customerData = new CustomerData();
        customerData.setCustomerId(entry.get("customerId"));
        customerData.setCompanyName(entry.get("companyName"));
        customerData.setContactName(entry.get("contactName"));
        customerData.setContactTitle(entry.get("contactTitle"));
        customerData.setRegion(entry.get("region"));
        customerData.setPostalCode(entry.get("postalCode"));
        customerData.setCountry(entry.get("country"));
        customerData.setCity(entry.get("city"));
        customerData.setPhone(entry.get("phone"));
        customerData.setFax(entry.get("fax"));
        customerData.setRepresentatives(entry.get("representatives"));
        customerData.setEmail(entry.get("email"));
        return customerData;
    }
}
