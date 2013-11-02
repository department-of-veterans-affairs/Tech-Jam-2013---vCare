package com.ml.tj.bean;

public class Immunization {

	private String immunization = "Measles + Rubella (German Measles)";
	private String other = "none";
	private String method = "Injection";
	private String receivedDate = "01 Mar 1950";
	private String reactions = "pain";
	private String comments = "Received as a child";
	public String getImmunization() {
		return immunization;
	}
	public void setImmunization(String immunization) {
		this.immunization = immunization;
	}
	public String getOther() {
		return other;
	}
	public void setOther(String other) {
		this.other = other;
	}
	public String getMethod() {
		return method;
	}
	public void setMethod(String method) {
		this.method = method;
	}
	public String getReceivedDate() {
		return receivedDate;
	}
	public void setReceivedDate(String receivedDate) {
		this.receivedDate = receivedDate;
	}
	public String getReactions() {
		return reactions;
	}
	public void setReactions(String reactions) {
		this.reactions = reactions;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	
	
	
	
}
