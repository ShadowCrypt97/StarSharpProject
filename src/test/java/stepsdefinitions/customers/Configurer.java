package stepsdefinitions.customers;

import io.cucumber.core.api.TypeRegistry;
import io.cucumber.core.api.TypeRegistryConfigurer;
import io.cucumber.datatable.DataTableType;
import io.cucumber.datatable.TableEntryTransformer;
import model.customers.CustomerData;

import java.util.Locale;
import java.util.Map;

public class Configurer implements TypeRegistryConfigurer {
    @Override
    public Locale locale() {
        return TypeRegistryConfigurer.super.locale();
    }

    @Override
    public void configureTypeRegistry(TypeRegistry typeRegistry) {
        typeRegistry.defineDataTableType(new DataTableType(CustomerData.class, new TableEntryTransformer<CustomerData>() {
            @Override
            public CustomerData transform(Map<String, String> entry) {
                return CustomerData.createCustomerData(entry);
            }
        }));
    }
}
