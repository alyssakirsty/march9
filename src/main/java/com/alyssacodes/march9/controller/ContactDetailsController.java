package com.alyssacodes.march9.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alyssacodes.march9.service.ContactDetailsService;

@RestController
@CrossOrigin(origins="http://localhost:3000")
@RequestMapping("contactdetails")
public class ContactDetailsController {
	
	private ContactDetailsService contactDetailsService;

	@Autowired
	public ContactDetailsController(ContactDetailsService contactDetailsService) {
		super();
		this.contactDetailsService = contactDetailsService;
	}
	
	

}
