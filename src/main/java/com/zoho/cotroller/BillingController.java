package com.zoho.cotroller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.zoho.entity.Billing;
import com.zoho.entity.Contact;
import com.zoho.service.BillingService;
import com.zoho.service.ContactService;

@Controller
public class BillingController {
	
@Autowired
private BillingService billingservice;

@Autowired
private ContactService contactservice;
@RequestMapping("/generatebiling")
public String bilingpage(@RequestParam("id") long id, ModelMap model)
{
	Contact contact = contactservice.getonebyid(id);
	model.addAttribute("contact", contact);
	return "billingpage";
}

@RequestMapping("/billingsave")
public String savebilling(@ModelAttribute("bill") Billing bill,ModelMap model)
{
	billingservice.billingsave(bill);
	List<Billing> billing = billingservice.getAllbill();
	model.addAttribute("billing", billing);
	
	return "billing_search_list";
}
@RequestMapping("/getbilling")
public String getallbillig(ModelMap model)
{
	List<Billing> billing = billingservice.getAllbill();
	model.addAttribute("billing", billing);
	return "billing_search_list";
}
@RequestMapping("/billgenerated")
public String getOnebillingDetails(@RequestParam("id") long id,ModelMap model)
{

	Billing lead = billingservice.getonebyid(id);
	model.addAttribute("lead", lead);
	return "billing_info";

}
@RequestMapping("/delete")
public String dleteonebyid(@RequestParam("id") long id,ModelMap model)
{

	 billingservice.deleteonebyid(id);
		List<Billing> billing = billingservice.getAllbill();
		model.addAttribute("billing", billing);
		return "billing_search_list";


}
}
