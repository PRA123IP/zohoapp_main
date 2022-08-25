package com.zoho.cotroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zoho.entity.Contact;
import com.zoho.entity.Lead;
import com.zoho.service.ContactService;
import com.zoho.service.LeadService;

@Controller
public class LeadController {
@Autowired
private LeadService leadservice;
@Autowired
private ContactService  contactservice;
// without login direct access 
@RequestMapping("/abc")
public String simplepage()
{
	return "createLead";
}
@RequestMapping("/leadsave")
	public String savepage(@ModelAttribute("lead") Lead lead,ModelMap model)
	{
	leadservice.saveoneLead(lead);
	model.addAttribute("lead", lead);
		return "lead_info";	
	}
@RequestMapping("/convert")
public String convertcontact(@RequestParam("id") long id ,ModelMap model)
{
	Lead lead = leadservice.getoneleadbyid(id);
	Contact contact=new Contact();
	contact.setFirstName(lead.getFirstName());
	contact.setLastName(lead.getLastName());
	contact.setEmail(lead.getEmail());
	contact.setMobile(lead.getMobile());
	contactservice.savecontact(contact);
	leadservice.deletebyid(id);
	
	List<Contact> contact1 = contactservice.getAllContact();
	model.addAttribute("contact", contact1);
	return "contact_all_list";
}

@RequestMapping("/listall")
public String listalllead(ModelMap model)
{
	List<Lead> lead = leadservice.getAllLead();
	model.addAttribute("lead", lead);
	return "list_all_lead";
}
@RequestMapping("/leadinfo")
public String leadinfo(@RequestParam("id") long id,ModelMap model) {
	Lead lead = leadservice.getoneleadbyid(id);
	model.addAttribute("lead", lead);
	return "lead_info";	
}
}