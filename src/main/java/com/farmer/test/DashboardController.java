package com.farmer.test;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.farmer.bid.Bid;
import com.farmer.model.FarmerData;
import com.farmer.model.TractorDetails;
import com.farmer.services.BidDaoImpl;
import com.farmer.services.FarmerDataDaoImpl;
import com.farmer.services.TractorDataDaoImpl;

@Controller
@SessionAttributes("farmerData")
public class DashboardController {
	 private final static Logger LOGGER =  
             Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	@Autowired
	FarmerDataDaoImpl farmerDataDaoImpl;
	@Autowired
	BidDaoImpl bidDaoImpl;
	
	@Autowired
	TractorDataDaoImpl tractorDataDaoImpl;
	@RequestMapping(value="/dashboard",method=RequestMethod.GET)
	public String showDashBoard(ModelMap model,@ModelAttribute("farmerData")FarmerData farmerData) {
		farmerData = farmerDataDaoImpl.find(farmerData.getFarmerAadhar());
		model.put("farmerData", farmerData);
		LOGGER.log(Level.INFO, farmerData.toString());
		List<TractorDetails>tractors=tractorDataDaoImpl.findAll();
		List<Bid> bidding = bidDaoImpl.listBids();
		model.put("bidding", bidding);
		model.put("tractors",tractors );
		return "dashboard";
	}
	
}
