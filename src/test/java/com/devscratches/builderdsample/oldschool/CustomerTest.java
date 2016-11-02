package com.devscratches.builderdsample.oldschool;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CustomerTest {

    @Test
    public void oldSchoolCustomer() throws Exception {

        Long id = 33L;
        String firstName = "Joe";
        String lastName = "Smith";
        Integer age = 31;
        String email = "joe@doe.com";

        Customer customer = new Customer(33L, "Joe", "Smith", 31, "joe@doe.com");
        customer.setId(id);
        customer.setFirstName(firstName);
        customer.setLastName(lastName);
        customer.setAge(age);
        customer.setEmail(email);


        // do not smell this multiple assertion
        assertThat(customer.getId(), is(id));
        assertThat(customer.getFirstName(), is(firstName));
        assertThat(customer.getLastName(), is(lastName));
        assertThat(customer.getAge(), is(age));
        assertThat(customer.getEmail(), is(email));
    }

    @Test
    public void fillAllCustomerFieldsByBuilder() throws Exception {

        Long id = 33L;
        String firstName = "Joe";
        String lastName = "Smith";
        Integer age = 31;
        String email = "joe@doe.com";

        Customer customer = new Customer.CustomerBuilder()
                .setId(id)
                .setFirstName(firstName)
                .setLastName(lastName)
                .setAge(age)
                .setEmail(email)
                .build();

        // do not smell this multiple assertion
        assertThat(customer.getId(), is(id));
        assertThat(customer.getFirstName(), is(firstName));
        assertThat(customer.getLastName(), is(lastName));
        assertThat(customer.getAge(), is(age));
        assertThat(customer.getEmail(), is(email));
    }
}