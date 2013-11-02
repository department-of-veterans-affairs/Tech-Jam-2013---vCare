package com.ml.tj.bean;

import java.util.List;

public class MedicalEvents {

	private String source;
	
	private List<Event> event;

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public List<Event> getEvent() {
		return event;
	}

	public void setEvent(List<Event> event) {
		this.event = event;
	}
	
	
	
}
