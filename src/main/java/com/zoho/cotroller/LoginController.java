package com.zoho.cotroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.zoho.entity.Login;
import com.zoho.repository.LoginRepository;
import com.zoho.service.LoginService;
@Controller
public class LoginController {
@Autowired
private LoginService loginservice;
@RequestMapping("/")
public String savelogin()
{
	return "loginpage";
}
//for data insert into login table
//@RequestMapping("/save")
//public String login(@ModelAttribute("login") Login login )
//{
//	loginrepo.save(login);
//	return "loginpage";
//}
@RequestMapping("/verifylogin")
public String verifylogin(@RequestParam("email") String email,@RequestParam("password") String password ,ModelMap modelmap)
{
	
	
	Login login = loginservice.verify(email);

	if(login!=null)
	{
	if(login.getEmail().equals(email) && login.getPassword().equals(password))
	{
		return "createLead";
	}
	else
	{
		modelmap.addAttribute("msg", "invalid password / email !!!");
		return"loginpage";
	}
	}
	else
	{
		modelmap.addAttribute("msg", "insert password/email !!!");
		return"loginpage";
	}
}
}
