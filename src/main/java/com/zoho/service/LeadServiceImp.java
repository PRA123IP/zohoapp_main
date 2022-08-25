package com.zoho.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zoho.entity.Lead;
import com.zoho.repository.LeadRepository;

@Service
public class LeadServiceImp implements LeadService {
@Autowired
private LeadRepository leadrepo;
	@Override
	public void saveoneLead(Lead lead) {
		leadrepo.save(lead);
	}
	@Override
	public Lead getoneleadbyid(long id) {
		Optional<Lead> findById = leadrepo.findById(id);
		Lead lead = findById.get();
		return lead;
	}
	@Override
	public void deletebyid(long id) {
      leadrepo.deleteById(id);		
	}
	@Override
	public List<Lead> getAllLead() {
		List<Lead> leads = leadrepo.findAll();
		return leads;
	}

}
