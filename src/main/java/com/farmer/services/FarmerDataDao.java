package com.farmer.services;

import java.util.List;

import com.farmer.model.FarmerData;



public interface FarmerDataDao {
	public List<FarmerData> listFarmers();
	public void addFarmer(FarmerData farmerData);
	public FarmerData find(String id);
	
}
