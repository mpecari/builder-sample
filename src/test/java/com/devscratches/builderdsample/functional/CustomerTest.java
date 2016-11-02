package com.devscratches.builderdsample.functional;

import org.junit.Test;

import java.util.function.Consumer;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.junit.Assert.assertThat;

public class CustomerTest {
    @Test
    public void buildCustomerUsingConsumers() throws Exception {

        Long id = 33L;
        String firstName = "Joe";
        String lastName = "Smith";
        Integer age = 31;
        String email = "joe@doe.com";

        Customer customer = Customer.build(c -> c.setId(id)
                .setFirstName(firstName)
                .setLastName(lastName)
                .setAge(age)
                .setEmail(email));


        // do not smell this multiple assertion
        assertThat(customer.getId(), is(id));
        assertThat(customer.getFirstName(), is(firstName));
        assertThat(customer.getLastName(), is(lastName));
        assertThat(customer.getAge(), is(age));
        assertThat(customer.getEmail(), is(email));
    }

    @Test
    public void buildCustomerWithSpecificParameters() throws Exception {
        String firstName = "Joe";
        String lastName = "Smith";
        Consumer<Customer> firstNameAndLastNameStrategy = c -> c.setFirstName(firstName)
                .setLastName(lastName);

        Customer customer = Customer.build(firstNameAndLastNameStrategy);

        assertThat(customer.getId(), nullValue());
        assertThat(customer.getFirstName(), is(firstName));
        assertThat(customer.getLastName(), is(lastName));
        assertThat(customer.getAge(), nullValue());
        assertThat(customer.getEmail(), nullValue());
    }
}