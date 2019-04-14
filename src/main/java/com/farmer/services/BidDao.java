package com.farmer.services;

import java.util.List;

import com.farmer.bid.Bid;


public interface BidDao {
	
	public List<Bid> listBids();
	public void addBid(Bid bid);
	public Bid find(String name);
	public void update(String tractorName,String farmerName,int maxBid);

}
