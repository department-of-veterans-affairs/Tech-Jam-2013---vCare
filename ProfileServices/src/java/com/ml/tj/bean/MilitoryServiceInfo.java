package com.ml.tj.bean;

import java.util.List;

public class MilitoryServiceInfo {

	private String source="Self-Entered";
	private String lastUpdatedDate="02 Dec 2011 @ 1013";
	private List<MilitaryService> service;
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getLastUpdatedDate() {
		return lastUpdatedDate;
	}
	public void setLastUpdatedDate(String lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}
	public List<MilitaryService> getService() {
		return service;
	}
	public void setService(List<MilitaryService> service) {
		this.service = service;
	}
	
	
	
	
	
}
