package com.ml.tj.bean;

import java.util.List;

public class VitalReadings {

	private String source="Self-Entered";
	
	private List<Measurement> measurement;

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public List<Measurement> getMeasurement() {
		return measurement;
	}

	public void setMeasurement(List<Measurement> measurement) {
		this.measurement = measurement;
	}
	
	
	
		
}
