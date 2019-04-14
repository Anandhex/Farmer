package com.farmer.login;



import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.farmer.model.FarmerData;
import com.farmer.services.FarmerDataDaoImpl;
@Service
public class loginService {
	 private final static Logger LOGGER =  
             Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	@Autowired
	FarmerDataDaoImpl framerDataDaoImpl;

	public  boolean validateUser(String farmerAadhar, String farmerName,String farmerDOB) {
		FarmerData farmerData = new FarmerData();
		LOGGER.log(Level.INFO, farmerAadhar+farmerName+farmerDOB);
		LOGGER.log(Level.INFO, "coming"+farmerAadhar);
		farmerData = framerDataDaoImpl.find(farmerAadhar);
		if(farmerData.getFarmerName().equals(farmerName)&&farmerData.getFarmerDOB().equals(farmerDOB))
		{return true;
		}else {
			return false;
		}
		
	}

}
