package com.emrullah.Springular.Controller;

import com.emrullah.Springular.Entitiy.Customer;
import com.emrullah.Springular.Service.ICustomerService;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class LoginController {

    ICustomerService _customerService;
    public LoginController(ICustomerService customerService) {
    	this._customerService=customerService;
    }
    
    @RequestMapping(value = "/customers", method = RequestMethod.GET, produces = "application/json")
    public List<Customer> findAll(){
    	return _customerService.findAll();
    }

}
