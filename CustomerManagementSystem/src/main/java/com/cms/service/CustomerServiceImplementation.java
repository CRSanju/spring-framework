package com.cms.service;

import org.springframework.stereotype.Service;

import com.cms.entity.Customer;
import com.cms.repository.CustomerRepository;

@Service
public class CustomerServiceImplementation implements CustomerService {

	CustomerRepository cusRepo;

	public CustomerServiceImplementation(CustomerRepository cusRepo) {
		super();
		this.cusRepo = cusRepo;
	}

	@Override
	public boolean validate(Customer cus) {
		Customer dbUser = cusRepo.findByUsername(cus.getUsername());
		if (dbUser == null)
			return false;
		return dbUser.getPassword().equals(cus.getPassword());
	}

	@Override
	public String addUser(Customer cus) {
		// Check username exists or not
		String uName = cus.getUsername();
		Customer dbCus = cusRepo.findByUsername(uName);
		boolean exists = (dbCus != null);

		if (exists == true) {
			return "Username already exists";
		} else {
			cusRepo.save(cus);
			return "Username added successfully";
		}
	}

}
