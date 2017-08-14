package com.ussunconsulting.belenguer.repository;

import com.ussunconsulting.belenguer.model.Customer;
import org.springframework.beans.factory.annotation.Value;

import java.util.ArrayList;
import java.util.List;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {

    @Value("${dbUsername}")
    private String dbUsername;

    @Override
    public List<Customer> findAll() {

        System.out.println(dbUsername);

        List<Customer> customers = new ArrayList<>();

        Customer customer = new Customer();
        customer.setFirstname("Sergio");
        customer.setLastname("Belenguer");

        customers.add(customer);

        return customers;
    }

}
