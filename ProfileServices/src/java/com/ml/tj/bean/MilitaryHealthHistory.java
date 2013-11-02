package com.ml.tj.bean;

import java.util.List;

public class MilitaryHealthHistory {

	private String source;
	private List<History> eventTitle;
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public List<History> getEventTitle() {
		return eventTitle;
	}
	public void setEventTitle(List<History> eventTitle) {
		this.eventTitle = eventTitle;
	}
	
	
	
}
