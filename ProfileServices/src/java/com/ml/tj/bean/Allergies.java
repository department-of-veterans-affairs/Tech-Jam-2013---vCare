package com.ml.tj.bean;

import java.util.List;

public class Allergies {

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

	private String source = "";
	private String lastUpdated;
	
	private List<Allergy> allergy;

	public List<Allergy> getAllergy() {
		return allergy;
	}

	public void setAllergy(List<Allergy> allergy) {
		this.allergy = allergy;
	}
	
	
	
}
