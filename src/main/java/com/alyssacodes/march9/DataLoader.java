package com.alyssacodes.march9;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Service;

import com.alyssacodes.march9.dal.ContactDetailsRepo;
import com.alyssacodes.march9.model.ContactDetails;

import jakarta.transaction.Transactional;

@Service
public class DataLoader implements ApplicationRunner {
	
	private ContactDetailsRepo contactDetailsRepo;
	
	@Autowired
	public DataLoader(ContactDetailsRepo contactDetailsRepo) {
		super();
		this.contactDetailsRepo = contactDetailsRepo;
	}


	@Override
	@Transactional
	public void run(ApplicationArguments args) throws Exception {

		this.contactDetailsRepo.save(new ContactDetails("alyssa.k.chin@gmail.com", "0477018106"));
		
	}

}
