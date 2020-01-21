package com.FrankUzoka.JUnitAutomatedTesting.service;
import com.FrankUzoka.JUnitAutomatedTesting.domain.CustomerContact;

import com.FrankUzoka.JUnitAutomatedTesting.repos.CustomerContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactsManagementService {

	@Autowired
	private CustomerContactRepository customerContactRepository;
	
	public CustomerContact add(CustomerContact aContact) {
		
		CustomerContact newContact = customerContactRepository.save(aContact);
		
		return newContact;	
	}
	
	/*
	public CustomerContact addContactOccasion(CustomerContact aContact, ContactImportantOccasion anOccasion) {
		CustomerContact newContact = null;
		
		return newContact;	
	}
	*/
}
