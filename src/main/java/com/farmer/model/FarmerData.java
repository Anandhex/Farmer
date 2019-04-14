package com.farmer.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="FarmerData")
public class FarmerData {
	String farmerName;
	String farmerAadhar;
	String farmerDOB;
	String farmerPhno;
	String farmerState;
	String farmerDistrict;
	String farmerTaluk;
	String farmerVillage;
	public String getFarmerName() {
		return farmerName;
	}
	public void setFarmerName(String farmerName) {
		this.farmerName = farmerName;
	}
	public String getFarmerAadhar() {
		return farmerAadhar;
	}
	public void setFarmerAadhar(String farmerAadhar) {
		this.farmerAadhar = farmerAadhar;
	}
	public String getFarmerDOB() {
		return farmerDOB;
	}
	public void setFarmerDOB(String farmerDOB) {
		this.farmerDOB = farmerDOB;
	}
	public String getFarmerPhno() {
		return farmerPhno;
	}
	public void setFarmerPhno(String farmerPhno) {
		this.farmerPhno = farmerPhno;
	}
	public String getFarmerState() {
		return farmerState;
	}
	public void setFarmerState(String farmerState) {
		this.farmerState = farmerState;
	}
	public String getFarmerDistrict() {
		return farmerDistrict;
	}
	public void setFarmerDistrict(String farmerDistrict) {
		this.farmerDistrict = farmerDistrict;
	}
	public String getFarmerTaluk() {
		return farmerTaluk;
	}
	public void setFarmerTaluk(String farmerTaluk) {
		this.farmerTaluk = farmerTaluk;
	}
	public String getFarmerVillage() {
		return farmerVillage;
	}
	public void setFarmerVillage(String farmerVillage) {
		this.farmerVillage = farmerVillage;
	}
	public FarmerData(String farmerName, String farmerAadhar, String farmerDOB, String farmerPhno, String farmerState,
			String farmerDistrict, String farmerTaluk, String farmerVillage) {
		super();
		this.farmerName = farmerName;
		this.farmerAadhar = farmerAadhar;
		this.farmerDOB = farmerDOB;
		this.farmerPhno = farmerPhno;
		this.farmerState = farmerState;
		this.farmerDistrict = farmerDistrict;
		this.farmerTaluk = farmerTaluk;
		this.farmerVillage = farmerVillage;
	}
	public FarmerData() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "FarmerData [farmerName=" + farmerName + ", farmerAadhar=" + farmerAadhar + ", farmerDOB=" + farmerDOB
				+ ", farmerPhno=" + farmerPhno + ", farmerState=" + farmerState + ", farmerDistrict=" + farmerDistrict
				+ ", farmerTaluk=" + farmerTaluk + ", farmerVillage=" + farmerVillage + "]";
	}
	
	
	

}
