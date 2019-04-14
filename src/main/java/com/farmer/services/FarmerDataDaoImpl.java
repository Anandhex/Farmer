package com.farmer.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.farmer.model.FarmerData;

@Repository
public class FarmerDataDaoImpl implements FarmerDataDao {

	@Autowired
	MongoTemplate mongoTemplate;
	public static final String COLLECTION="FarmerData";
	
	@Override
	public List<FarmerData> listFarmers() {
		// TODO Auto-generated method stub
		return mongoTemplate.findAll(FarmerData.class,COLLECTION);
	}

	@Override
	public void addFarmer(FarmerData farmerData) {
		// TODO Auto-generated method stub
		mongoTemplate.save(farmerData);
	}

	@Override
	public FarmerData find(String name) {
		// TODO Auto-generated method stub
		
		Query query = new Query(Criteria.where("farmerAadhar").is(name)); 
		
		return mongoTemplate.findOne(query,FarmerData.class,COLLECTION );
	}

}
