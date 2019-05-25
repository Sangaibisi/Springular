package com.emrullah.Springular.Controller;

import com.emrullah.Springular.Entitiy.Customer;
import com.emrullah.Springular.Service.ICustomerService;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/customers")
public class CustomerController {

    ICustomerService _customerService;
    public CustomerController(ICustomerService customerService) {
    	this._customerService=customerService;
    }
    
    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public List<Customer> findAll(){
    	return _customerService.findAll();
    }
    
    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = "application/json")
    public Customer findById(@PathVariable int id){
    	return _customerService.findById(id);
    }
    
    @RequestMapping(method = RequestMethod.POST, produces = "application/json")
    public void addCustomer(@RequestBody Customer customer){
    	customer.setId(0);
    	_customerService.save(customer);
    }
    
    @RequestMapping(method = RequestMethod.PUT, produces = "application/json")
    public void updateCustomer(@RequestBody Customer customer){
    	_customerService.save(customer);
    }
    
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE, produces = "application/json")
    public String deleteCustomerById(@PathVariable int id){
    	return _customerService.deleteById(id);
    }
}
