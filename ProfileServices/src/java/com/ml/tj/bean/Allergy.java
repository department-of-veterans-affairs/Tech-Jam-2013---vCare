package com.ml.tj.bean;

public class Allergy {

	private String allergyName;
	private String location;
	private String enteredDate;
	private String reaction;
	private String allergyType;
	private String vaDrugClass;
	private String observedHistorical;
	private String comments;
	private String severity;
	private String diagnosed;
	
	public String getSeverity() {
		return severity;
	}
	public void setSeverity(String severity) {
		this.severity = severity;
	}
	public String getDiagnosed() {
		return diagnosed;
	}
	public void setDiagnosed(String diagnosed) {
		this.diagnosed = diagnosed;
	}
	public String getAllergyName() {
		return allergyName;
	}
	public void setAllergyName(String allergyName) {
		this.allergyName = allergyName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getEnteredDate() {
		return enteredDate;
	}
	public void setEnteredDate(String enteredDate) {
		this.enteredDate = enteredDate;
	}
	public String getReaction() {
		return reaction;
	}
	public void setReaction(String reaction) {
		this.reaction = reaction;
	}
	public String getAllergyType() {
		return allergyType;
	}
	public void setAllergyType(String allergyType) {
		this.allergyType = allergyType;
	}
	public String getVaDrugClass() {
		return vaDrugClass;
	}
	public void setVaDrugClass(String vaDrugClass) {
		this.vaDrugClass = vaDrugClass;
	}
	public String getObservedHistorical() {
		return observedHistorical;
	}
	public void setObservedHistorical(String observedHistorical) {
		this.observedHistorical = observedHistorical;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	
	
}
