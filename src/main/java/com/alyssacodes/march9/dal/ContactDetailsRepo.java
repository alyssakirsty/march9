package com.alyssacodes.march9.dal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alyssacodes.march9.model.ContactDetails;

@Repository
public interface ContactDetailsRepo extends JpaRepository<ContactDetails, Integer>{

}
