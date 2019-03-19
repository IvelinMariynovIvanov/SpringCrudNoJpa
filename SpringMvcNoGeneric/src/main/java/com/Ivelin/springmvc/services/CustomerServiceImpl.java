package com.Ivelin.springmvc.services;

import com.Ivelin.springmvc.domain.Customer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class CustomerServiceImpl implements CustomerService{

    private Map<Integer, Customer> customers;

    public CustomerServiceImpl() {

        generateCustomers();
    }

    private void generateCustomers() {

    }

    @Override
    public List<Customer> getAllCustomers() {

        return new ArrayList<>(this.customers.values());
    }

    @Override
    public void deleteCustomer(int id) {

    }

    @Override
    public Customer saveOrUpdateCustomer(int id) {
        return null;
    }

    @Override
    public Customer getCustomerById(int id) {
        return null;
    }
}
