package com.farmer.bid;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.farmer.model.FarmerData;
import com.farmer.model.TractorDetails;
import com.farmer.services.BidDaoImpl;
import com.farmer.services.FarmerDataDaoImpl;
import com.farmer.services.TractorDataDaoImpl;


@Controller
@SessionAttributes("farmerData")
public class BidController {

	@Autowired
	BidDaoImpl bidDaoImpl;
	
	@Autowired
	TractorDataDaoImpl tractorDataDaoImpl;
	
	@Autowired
	FarmerDataDaoImpl farmerDataDaoImpl;
	
	 private final static Logger LOGGER =  
             Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	
	
	@RequestMapping(value="/bid",method=RequestMethod.GET)
	public String showBidPage(@ModelAttribute("farmerData")FarmerData farmerData,ModelMap model,@RequestParam("tractorName")String tractorName) {
		TractorDetails tractorDetails = tractorDataDaoImpl.findOneByName(tractorName);
		model.addAttribute("tractorDetails", tractorDetails);
		
		Bid bid= bidDaoImpl.find(tractorName);
		model.addAttribute("maxbid", bid.getMaxBid());
		LOGGER.log(Level.INFO, tractorDetails.toString());
		return "product";
	}
	
	@RequestMapping(value="/bid",method=RequestMethod.POST)
	public String bidControl(@RequestParam("tractorName")String tractorName,@RequestParam("maxbid")int maxbid,ModelMap model,@ModelAttribute("farmerData")FarmerData farmerData) {
		TractorDetails tractorDetails = tractorDataDaoImpl.findOneByName(tractorName);
		Bid bid= bidDaoImpl.find(tractorName);
		model.addAttribute("tractorDetails", tractorDetails);
		LOGGER.log(Level.INFO, tractorName+farmerData.getFarmerName()+Integer.toString(maxbid));
		if(bid.getMaxBid()<maxbid) {
			bidDaoImpl.update(tractorName, farmerData.getFarmerName(), maxbid);
			
			model.addAttribute("success", "Succesfully counted ");
			model.addAttribute("maxbid", maxbid);
			List<Bid> bidding = bidDaoImpl.listBids();
			model.put("bidding", bidding);
			
//			farmerData = farmerDataDaoImpl.find(farmerData.getFarmerAadhar());
//			model.put("farmerData", farmerData);
			List<TractorDetails>tractors=tractorDataDaoImpl.findAll();
			model.put("tractors",tractors );
		}else {
			List<TractorDetails>tractors=tractorDataDaoImpl.findAll();
			model.put("tractors",tractors );
			model.addAttribute("error", "Error in bidding ,less value enterd");
			model.addAttribute("maxbid", bid.getMaxBid());
			List<Bid> bidding = bidDaoImpl.listBids();
			model.put("bidding", bidding);
			
		}
			
		return "dashboard";
	}
}
