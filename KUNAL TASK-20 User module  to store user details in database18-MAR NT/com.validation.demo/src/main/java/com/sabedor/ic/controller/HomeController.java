package com.sabedor.ic.controller;

import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.SabedorDAO.config.LoginDAO;
import com.SabedorDAO.config.RegisterDAO;
import com.sabedor.ic.api.RegisterDTO;
import com.sabedor.ic.api.loginDTO;

@Controller
public class HomeController {

	
	@RequestMapping("/")
	public String showLogin(Model model )
	{
		loginDTO obj=new loginDTO();
		model.addAttribute("userinfo",obj);
		return "login";
	}
	
	@RequestMapping("/process-menu")
	public String showMenu(@Valid @ModelAttribute("userinfo") loginDTO obj, BindingResult result) throws Exception
	{
		
		 
		  if(result.hasErrors())
		  {
			  return "login";  
		  }
		  else
		  {
			 LoginDAO obj2=new LoginDAO();
			 
			/* loginDTO obj1=new loginDTO();
			 obj1.setUn(obj.getUn());
			 obj1.setPs(obj.getPs());*/
			 
			   if(obj2.CheckLogin(obj))
			   {
				   return "Menu";
			   }
			   else
			   {
				
				 return "login";
			   }
			 
			 
		  }
	}
		
	@SuppressWarnings("unused")
	@RequestMapping("/process-register")
	public String showRegister(@Valid @ModelAttribute("reginfo") RegisterDTO obj, BindingResult result) throws Exception
	{
		 RegisterDAO obj1=new RegisterDAO();
		
		  if(result.hasErrors())
		  {
			  return "register";  
		  }
		  else
		  {
			  obj1.RegisterUser(obj);
			  return "success";
		  }
		
	}
	
	@RequestMapping("/showregister")
	public String showregister(Model model)
	{
		RegisterDTO obj=new RegisterDTO();
		model.addAttribute("reginfo",obj);
		return "register";
	}
}