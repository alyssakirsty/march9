package com.alyssacodes.march9.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alyssacodes.march9.dal.ContactDetailsRepo;
import com.alyssacodes.march9.model.ContactDetails;

@Service
public class ContactDetailsService {
	
	private ContactDetailsRepo contactDetailsRepo;

	@Autowired
	public ContactDetailsService(ContactDetailsRepo contactDetailsRepo) {
		super();
		this.contactDetailsRepo = contactDetailsRepo;
	}
	
	public void saveContactDetials(ContactDetails contactDetails) {
		this.contactDetailsRepo.save(contactDetails);
	}

}
