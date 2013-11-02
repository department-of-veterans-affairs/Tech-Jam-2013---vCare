package com.ml.tj.bean;

import java.util.List;

public class History {

	private String relationship;
	private String firstName;
	private String lastName;
	private String isAlive;
	
	private String eventTitle;
	private String eventDate;
	public String getEventTitle() {
		return eventTitle;
	}
	public void setEventTitle(String eventTitle) {
		this.eventTitle = eventTitle;
	}
	public String getEventDate() {
		return eventDate;
	}
	public void setEventDate(String eventDate) {
		this.eventDate = eventDate;
	}
	public String getServiceBranch() {
		return serviceBranch;
	}
	public void setServiceBranch(String serviceBranch) {
		this.serviceBranch = serviceBranch;
	}
	public String getExposures() {
		return exposures;
	}
	public void setExposures(String exposures) {
		this.exposures = exposures;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	public String getLocationService() {
		return locationService;
	}
	public void setLocationService(String locationService) {
		this.locationService = locationService;
	}
	public String getOccupationalSpeciality() {
		return occupationalSpeciality;
	}
	public void setOccupationalSpeciality(String occupationalSpeciality) {
		this.occupationalSpeciality = occupationalSpeciality;
	}
	public String getAssignment() {
		return assignment;
	}
	public void setAssignment(String assignment) {
		this.assignment = assignment;
	}
	public String getServiceDescription() {
		return serviceDescription;
	}
	public void setServiceDescription(String serviceDescription) {
		this.serviceDescription = serviceDescription;
	}
	private String serviceBranch;
	private String exposures;
	private String rank;
	private String locationService;
	private String occupationalSpeciality;
	private String assignment;
	
	private String serviceDescription;
	
	private List<String> healthIssues;
	private List<String> otherHealthIssues;
	private String comments;
	public String getRelationship() {
		return relationship;
	}
	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getIsAlive() {
		return isAlive;
	}
	public void setIsAlive(String isAlive) {
		this.isAlive = isAlive;
	}
	public List<String> getHealthIssues() {
		return healthIssues;
	}
	public void setHealthIssues(List<String> healthIssues) {
		this.healthIssues = healthIssues;
	}
	public List<String> getOtherHealthIssues() {
		return otherHealthIssues;
	}
	public void setOtherHealthIssues(List<String> otherHealthIssues) {
		this.otherHealthIssues = otherHealthIssues;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}

	
	
	
	
}

