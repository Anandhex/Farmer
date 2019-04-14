package com.farmer.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.farmer.model.FarmerData;
import com.farmer.services.FarmerDataDaoImpl;

@Controller
public class Test{
	
	@Autowired
	FarmerDataDaoImpl farmerDataDaoImpl;
	
	@RequestMapping(value="/test",method=RequestMethod.GET)
	@ResponseBody
	public String showPage() {
		FarmerData farmerData = farmerDataDaoImpl.find("Anand");
		return farmerData.toString();
	}
	
}