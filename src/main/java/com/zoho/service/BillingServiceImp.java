package com.zoho.service;


import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zoho.entity.Billing;
import com.zoho.entity.Contact;
import com.zoho.repository.BillingRepository;
import com.zoho.utilities.EmailUtil;
import com.zoho.utilities.PdfGenerator;
@Service
public class BillingServiceImp implements BillingService {
@Autowired
private BillingRepository billingrepo;
 @Autowired 
 private PdfGenerator pdfgenerator;

 @Autowired 
 private EmailUtil emailsend;
 
@Override
public void billingsave(Billing bill) {
	
	 billingrepo.save(bill);
	 String filepath="C:\\Users\\hp\\Documents\\workspace-spring-tool-suite-4-4.15.1.RELEASE\\zohoapp\\bill\\bils"+bill.getId()+".pdf";
	 PdfGenerator pdf = new PdfGenerator();
            pdf.generatePDF(bill, filepath);
            emailsend.sendItinerary(bill.getEmail(), filepath);
}

@Override
public List<Billing> getAllbill() {
	List<Billing> billing = billingrepo.findAll();
	
	return billing;
}

@Override
public Billing getonebyid(long id) {
Optional<Billing> findById = billingrepo.findById(id);	
Billing billing = findById.get();
return billing ;
}

@Override
public void deleteonebyid(long id) {
billingrepo.deleteById(id);	
}


}
