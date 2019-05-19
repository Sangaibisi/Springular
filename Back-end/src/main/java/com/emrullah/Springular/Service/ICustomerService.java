package com.emrullah.Springular.Service;

import java.util.List;

import com.emrullah.Springular.Entitiy.Customer;

public interface ICustomerService {
	
	public List<Customer> findAll();
	public Customer findById(int id);
	public void save(Customer theCustomer);
	public String deleteById(int id);
}
