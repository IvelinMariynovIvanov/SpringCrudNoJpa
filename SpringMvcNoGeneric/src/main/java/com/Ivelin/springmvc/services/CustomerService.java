package com.Ivelin.springmvc.services;

import com.Ivelin.springmvc.domain.Customer;

import java.util.List;

public interface CustomerService {

   List<Customer> getAllCustomers();

   void deleteCustomer(int id);

   Customer saveOrUpdateCustomer(int id);

   Customer getCustomerById(int id);

}
