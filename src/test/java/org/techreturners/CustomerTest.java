package org.techreturners;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CustomerTest {

    @Test
    public void canCreateCustomerObject(){
        Customer customer = new Customer("Debbie");
        assertNotNull(customer);
    }
}
