package com.farmer.tractor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.farmer.model.TractorDetails;
import com.farmer.services.TractorDataDao;
import com.farmer.services.TractorDataDaoImpl;



@Controller
public class TractorController {

	@Autowired
	TractorDataDaoImpl tractorDataDaoImpl;
	
	@RequestMapping(value="/addTractor",method=RequestMethod.GET)
	public String showTractorAddPage(ModelMap model) {
		model.addAttribute("tractorDetails", new TractorDetails("", 1, 1, "", "", "","","")) ;
		return "addTractor";
	}
	
	@RequestMapping(value="/addTractor",method=RequestMethod.POST)
	public String validate(ModelMap model,TractorDetails tractorDetails) {
		tractorDataDaoImpl.addTractor(tractorDetails);
		model.clear();
		model.addAttribute("tractorDetails", new TractorDetails("", 1, 1, "", "", "","","")) ;
		return "addTractor";
	}
	
}
