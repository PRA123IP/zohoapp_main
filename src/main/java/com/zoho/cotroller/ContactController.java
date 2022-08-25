package com.zoho.cotroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zoho.entity.Contact;
import com.zoho.service.ContactService;

@Controller
public class ContactController {
@Autowired
private ContactService contactservice;
@RequestMapping("/showcontact")

public String getallcontact(ModelMap model)
{
	List<Contact> contact = contactservice.getAllContact();
	model.addAttribute("contact", contact);
	return "contact_all_list";
}
@RequestMapping("/contactinfo")
public String getOneContactDetails(@RequestParam("id") long id,ModelMap model)
{
	Contact contact = contactservice.getonebyid(id);
	model.addAttribute("contact", contact);
	return "contact_info";
}

@RequestMapping("/delete2")
public String deletebyid(@RequestParam("id") long id,ModelMap model)
{
	contactservice.deleteonerecord(id);
	List<Contact> contact = contactservice.getAllContact();
	model.addAttribute("contact", contact);
	return "contact_all_list";
}
}
