package com.farmer.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.FindAndModifyOptions;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;

import com.farmer.bid.Bid;

@Repository
public class BidDaoImpl implements BidDao {
	
	@Autowired
	MongoTemplate mongoTemplate;
	public static final String COLLECTION="bid";
	@Override
	public List<Bid> listBids() {
		// TODO Auto-generated method stub
		return mongoTemplate.findAll(Bid.class,COLLECTION);
	}

	@Override
	public void addBid(Bid bid) {
		// TODO Auto-generated method stub
		mongoTemplate.save(bid);
	}

	@Override
	public Bid find(String name) {
		// TODO Auto-generated method stub
		Query query = new Query(Criteria.where("tractorName").is(name));
		return mongoTemplate.findOne(query, Bid.class,COLLECTION);
	}

	@Override
	public void update(String tractorName,String farmerName,int maxBid) {
		// TODO Auto-generated method stub
		
		Query query = new Query(Criteria.where("tractorName").is(tractorName));
		Bid bid = new Bid();
		
		if(bid.getMaxBid()<maxBid) {
			Update update = new Update();
			update.set("maxBid", maxBid);
			update.set("farmerName", farmerName);
			
			mongoTemplate.findAndModify(query, update, new FindAndModifyOptions().returnNew(true),Bid.class);
		}
		
	}

}
