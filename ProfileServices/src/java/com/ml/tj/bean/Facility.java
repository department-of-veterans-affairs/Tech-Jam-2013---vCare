package com.ml.tj.bean;

public class Facility {

	public Facility() {
		
	}
	
	public Facility(String treatingFacilty, String facilityType) {
		super();
		this.treatingFacilty = treatingFacilty;
		this.facilityType = facilityType;
	}
	
	private String treatingFacilty = "DAYT29";
	private String facilityType = "M&ROC";
	private Contact contact = new Contact();
	private String comment = "";
	
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public Contact getContact() {
		return contact;
	}
	public void setContact(Contact contact) {
		this.contact = contact;
	}
	public String getTreatingFacilty() {
		return treatingFacilty;
	}
	public void setTreatingFacilty(String treatingFacilty) {
		this.treatingFacilty = treatingFacilty;
	}
	public String getFacilityType() {
		return facilityType;
	}
	public void setFacilityType(String facilityType) {
		this.facilityType = facilityType;
	}
	
	
}
