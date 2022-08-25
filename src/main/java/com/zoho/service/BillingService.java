package com.zoho.service;

import java.util.List;

import com.zoho.entity.Billing;
import com.zoho.entity.Contact;

public interface BillingService {

	void billingsave(Billing bill);

	List<Billing> getAllbill();

	Billing getonebyid(long id);

	void deleteonebyid(long id);
	

	

	
}
