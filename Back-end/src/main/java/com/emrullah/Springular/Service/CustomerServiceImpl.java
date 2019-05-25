package com.emrullah.Springular.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emrullah.Springular.DAO.ICustomerRepoService;
import com.emrullah.Springular.Entitiy.Customer;


@Service
public class CustomerServiceImpl implements ICustomerService {
	
	private ICustomerRepoService _customerRepository;
	
	@Autowired
	public CustomerServiceImpl(ICustomerRepoService customerRepository) {
		this._customerRepository=customerRepository;
	}

	@Override
	public List<Customer> findAll() {
		return _customerRepository.findAll();
	}

	@Override
	public Customer findById(int id) {
		Optional<Customer> result = _customerRepository.findById(id);
		Customer theCustomer = null;

		if (result.isPresent()) {
			theCustomer = result.get();
		} else {
			// we didn't find the employee
			throw new RuntimeException("Did not find employee id - " + id);
		}
		return theCustomer;
	}

	@Override
	public void save(Customer theCustomer) {
		_customerRepository.save(theCustomer);

	}

	@Override
	public String deleteById(int id) {
		_customerRepository.deleteById(id);
		return "The user has been deleted!";
	}
}
