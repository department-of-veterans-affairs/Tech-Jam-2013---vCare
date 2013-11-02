package com.ml.tj.bean;

import java.util.ArrayList;
import java.util.List;

public class LabResult {

	private String source;
	private String lastUpdated;
	private String sortedBy;
	private List<LabsTests> labTest = new ArrayList<LabsTests>();
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getLastUpdated() {
		return lastUpdated;
	}
	public void setLastUpdated(String lastUpdated) {
		this.lastUpdated = lastUpdated;
	}
	public String getSortedBy() {
		return sortedBy;
	}
	public void setSortedBy(String sortedBy) {
		this.sortedBy = sortedBy;
	}
	public List<LabsTests> getLabTest() {
		return labTest;
	}
	public void setLabTest(List<LabsTests> labTest) {
		this.labTest = labTest;
	}
	
	
	
	
	
	
}
