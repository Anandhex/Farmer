package com.farmer.register;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.farmer.model.FarmerData;
import com.farmer.services.FarmerDataDaoImpl;


@Controller
public class RegisterController {
	
	@Autowired
	FarmerDataDaoImpl farmerDataDaoImpl;
	
	@RequestMapping(value="/register", method= RequestMethod.GET )
	public String showRegisterPage(ModelMap model) {
		model.addAttribute("farmerData", new FarmerData("", "", "","","", "", "", "" )) ;
		return "register";
	}
	@RequestMapping(value="/register",method=RequestMethod.POST)
	public String validate(ModelMap model,FarmerData farmerData) {
		farmerData.setFarmerState("Karnataka");
		farmerDataDaoImpl.addFarmer(farmerData);
		model.clear();
		model.addAttribute("farmerData", farmerData);
		return "redirect:/login";
	}
	
}
