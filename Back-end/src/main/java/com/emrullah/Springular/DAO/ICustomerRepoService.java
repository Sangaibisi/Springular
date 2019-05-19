package com.emrullah.Springular.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import com.emrullah.Springular.Entitiy.Customer;

public interface ICustomerRepoService extends JpaRepository<Customer, Integer> {
	
	// Our thanks to Spring Framework :)
	// We do not need to write any CRUD operations code.
	// Spring Framework will handle this for us.

}
