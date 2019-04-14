package com.farmer.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="TractorDetails")
public class TractorDetails {
	String tractorName;
	int tractorHp;
	int tractorCylinder;
	String tractorTransmission;
	String tractorTankCapacity;
	String tractorAge;
	String imageUrl;
	String higherPeriod;
	
	public String getHigherPeriod() {
		return higherPeriod;
	}
	public void setHigherPeriod(String higherPeriod) {
		this.higherPeriod = higherPeriod;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public String getTractorName() {
		return tractorName;
	}
	public void setTractorName(String tractorName) {
		this.tractorName = tractorName;
	}
	public int getTractorHp() {
		return tractorHp;
	}
	public void setTractorHp(int tractorHp) {
		this.tractorHp = tractorHp;
	}
	public int getTractorCylinder() {
		return tractorCylinder;
	}
	public void setTractorCylinder(int tractorCylinder) {
		this.tractorCylinder = tractorCylinder;
	}
	public String getTractorTransmission() {
		return tractorTransmission;
	}
	public void setTractorTransmission(String tractorTransmission) {
		this.tractorTransmission = tractorTransmission;
	}
	
	public String getTractorTankCapacity() {
		return tractorTankCapacity;
	}
	public void setTractorTankCapacity(String tractorTankCapacity) {
		this.tractorTankCapacity = tractorTankCapacity;
	}
	public String getTractorAge() {
		return tractorAge;
	}
	public void setTractorAge(String tractorAge) {
		this.tractorAge = tractorAge;
	}
	@Override
	public String toString() {
		return "TractorDetails [tractorName=" + tractorName + ", tractorHp=" + tractorHp + ", tractorCylinder="
				+ tractorCylinder + ", tractorTransmission=" + tractorTransmission + ", tractorTankCapacity="
				+ tractorTankCapacity + ", tractorAge=" + tractorAge + ", imageUrl=" + imageUrl + ", higherPeriod="
				+ higherPeriod + "]";
	}
	public TractorDetails(String tractorName, int tractorHp, int tractorCylinder, String tractorTransmission,
			String tractorTankCapacity, String tractorAge, String imageUrl, String higherPeriod) {
		super();
		this.tractorName = tractorName;
		this.tractorHp = tractorHp;
		this.tractorCylinder = tractorCylinder;
		this.tractorTransmission = tractorTransmission;
		this.tractorTankCapacity = tractorTankCapacity;
		this.tractorAge = tractorAge;
		this.imageUrl = imageUrl;
		this.higherPeriod = higherPeriod;
	}
	
}
