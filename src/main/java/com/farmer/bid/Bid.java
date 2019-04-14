package com.farmer.bid;

public class Bid {
	private String farmerName;
	private int maxBid;
	private String tractorName;
	
	public String getFarmerName() {
		return farmerName;
	}
	public void setFarmerName(String farmerName) {
		this.farmerName = farmerName;
	}
	public int getMaxBid() {
		return maxBid;
	}
	public void setMaxBid(int maxBid) {
		this.maxBid = maxBid;
	}
	public String getTractorName() {
		return tractorName;
	}
	public void setTractorName(String tractorName) {
		this.tractorName = tractorName;
	}
	public Bid() {
		// TODO Auto-generated constructor stub
	}
	public Bid(String farmerName, int maxBid, String tractorName) {
		super();
		this.farmerName = farmerName;
		this.maxBid = maxBid;
		this.tractorName = tractorName;

	}
	@Override
	public String toString() {
		return "Bid [farmerName=" + farmerName + ", maxBid=" + maxBid + ", tractorName=" + tractorName + ", "
				+"]";
	}
	
}
