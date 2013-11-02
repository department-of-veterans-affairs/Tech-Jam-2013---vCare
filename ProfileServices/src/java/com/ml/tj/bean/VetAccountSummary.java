package com.ml.tj.bean;

import java.util.ArrayList;
import java.util.List;

public class VetAccountSummary {

	private String authenticationStatus = "Authenticated";
	private String date = "19 Aug 2010";
	private String faciltyId = "979";
	private String faciltyName = "SLC10 TEST LAB";
	private List<Facility> facility = getFacility();

	public String getAuthenticationStatus() {
		return authenticationStatus;
	}

	public void setAuthenticationStatus(String authenticationStatus) {
		this.authenticationStatus = authenticationStatus;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getFaciltyId() {
		return faciltyId;
	}

	public List<Facility> getFacility() {
		facility = new ArrayList<>();
		facility.add(new Facility());
		facility.add(new Facility("AUSTIN HDR INT", "OTHER"));
		facility.add(new Facility("AUSTIN PSIM", "OTHER"));

		return facility;
	}

	public void setFacility(List<Facility> facility) {
		this.facility = facility;
	}

	public void setFaciltyId(String faciltyId) {
		this.faciltyId = faciltyId;
	}

	public String getFaciltyName() {
		return faciltyName;
	}

	public void setFaciltyName(String faciltyName) {
		this.faciltyName = faciltyName;
	}

}
