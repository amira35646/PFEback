package com.orientation.sujetOrientation.servicesImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.orientation.sujetOrientation.models.ContactModel;
import com.orientation.sujetOrientation.repositories.ContactRepository;
import com.orientation.sujetOrientation.services.ContactService;
@Service
public class ContactServiceImpl implements ContactService{
	@Autowired
	private ContactRepository contactRepository;
	public ContactModel addContact(ContactModel contact) {
		// TODO Auto-generated method stub
		return this.contactRepository.save(contact);
	}

}
