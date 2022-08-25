package com.zoho.service;

import java.util.List;

import com.zoho.entity.Contact;

public interface ContactService {

public	void savecontact(Contact contact);

public List<Contact> getAllContact();

public Contact getonebyid(long id);

public void deleteonerecord(long id);

//public Contact getoneContact(long id);


}
