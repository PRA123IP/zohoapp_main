package com.zoho.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zoho.entity.Contact;
import com.zoho.repository.ContactRepository;
@Service
public class ContactServiceImp implements ContactService {
@Autowired 
private ContactRepository contactrepo;
	@Override
	public void savecontact(Contact contact) {
		contactrepo.save(contact);	
	}
	@Override
	public List<Contact> getAllContact() {
		List<Contact> findAll = contactrepo.findAll();
		
		return findAll;
	}
	@Override
	public Contact getonebyid(long id) {
		Optional<Contact> findById = contactrepo.findById(id);
		
		Contact contact = findById.get();
		return contact;
	}
	@Override
	public void deleteonerecord(long id) {
		contactrepo.deleteById(id);
	}

}
