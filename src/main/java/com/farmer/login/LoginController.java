package com.farmer.login;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.farmer.bid.Bid;
import com.farmer.model.FarmerData;
import com.farmer.model.TractorDetails;
import com.farmer.services.BidDaoImpl;
import com.farmer.services.FarmerDataDaoImpl;
import com.farmer.services.TractorDataDaoImpl;


@Controller
@SessionAttributes("farmerData")
public class LoginController {
	
	@Autowired
	FarmerDataDaoImpl farmerDataDaoImpl;
	
	@Autowired
	loginService loginService;
	
	@Autowired
	BidDaoImpl bidDaoImpl;
	
	@Autowired
	TractorDataDaoImpl tractorDataDaoImpl;
	
	private static final Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME); 
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String showLoginPage() {
		return "login";
	}
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String handleUserLogin(ModelMap model,FarmerData farmerData,@RequestParam String aadhaar_no,@RequestParam String name,@RequestParam String dob ) {
		
		if (!loginService.validateUser(aadhaar_no,name,dob)) {
			model.clear();
			model.addAttribute("errorMessage", "Invalid Credentials");
			return "login";
		}else {
		farmerData = farmerDataDaoImpl.find(aadhaar_no);
		model.put("farmerData", farmerData);
		List<TractorDetails>tractors=tractorDataDaoImpl.findAll();
		List<Bid> bidding = bidDaoImpl.listBids();
		model.put("bidding", bidding);
		model.put("tractors",tractors );
		return "dashboard";
		}

	}
	
	@RequestMapping(value="/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "home";
	}
}
