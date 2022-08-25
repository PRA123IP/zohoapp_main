package com.zoho.service;

import java.util.List;

import com.zoho.entity.Lead;

public interface LeadService {

	void saveoneLead(Lead lead);

	public Lead getoneleadbyid(long id);

	void deletebyid(long id);

	public List<Lead> getAllLead();
	

}
