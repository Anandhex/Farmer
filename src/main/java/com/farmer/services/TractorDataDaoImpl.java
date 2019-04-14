package com.farmer.services;

import java.util.List;

import org.apache.taglibs.standard.tag.el.sql.QueryTag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.farmer.model.TractorDetails;
@Repository
public class TractorDataDaoImpl implements TractorDataDao {
	public static final String COLLECTION="TractorDetails";
	
	@Autowired
	MongoTemplate mongoTemplate;
	
	@Override
	public List<TractorDetails> findAll() {
		
		return mongoTemplate.findAll(TractorDetails.class, COLLECTION);
	}

	@Override
	public TractorDetails findOne(String id) {
		// TODO Auto-generated method stub
		
		Query query = Query.query(Criteria.where("_id").is(id)); 
		return mongoTemplate.findOne(query, TractorDetails.class, COLLECTION);
	}
	@Override
	public TractorDetails findOneByName(String name) {
		// TODO Auto-generated method stub
		
		Query query = Query.query(Criteria.where("tractorName").is(name)); 
		return mongoTemplate.findOne(query, TractorDetails.class, COLLECTION);
	}

	@Override
	public void addTractor(TractorDetails tractorDetails) {
		// TODO Auto-generated method stub
		mongoTemplate.save(tractorDetails);
	}
	
}
