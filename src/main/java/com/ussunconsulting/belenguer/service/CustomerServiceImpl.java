package com.ussunconsulting.belenguer.service;

import com.ussunconsulting.belenguer.model.Customer;
import com.ussunconsulting.belenguer.repository.CustomerRepository;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {


    private CustomerRepository customerRepository;

    public CustomerServiceImpl() {};

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();

    }

    public void setCustomerRepository(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }
}
