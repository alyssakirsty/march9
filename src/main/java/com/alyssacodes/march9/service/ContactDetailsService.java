package com.alyssacodes.march9.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alyssacodes.march9.dal.ContactDetailsRepo;

@Service
public class ContactDetailsService {
	
	private ContactDetailsRepo contactDetailsRepo;

	@Autowired
	public ContactDetailsService(ContactDetailsRepo contactDetailsRepo) {
		super();
		this.contactDetailsRepo = contactDetailsRepo;
	}
	

}
