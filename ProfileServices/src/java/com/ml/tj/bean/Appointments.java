package com.ml.tj.bean;

import java.util.List;

public class Appointments {

	private String source;
	private String lastUpdateDate;
	private List<FutureAppointment> futureAppointment;
	private List<PastAppointment> pastAppointment;
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getLastUpdateDate() {
		return lastUpdateDate;
	}
	public void setLastUpdateDate(String lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}
	public List<FutureAppointment> getFutureAppointment() {
		return futureAppointment;
	}
	public void setFutureAppointment(List<FutureAppointment> futureAppointment) {
		this.futureAppointment = futureAppointment;
	}
	public List<PastAppointment> getPastAppointment() {
		return pastAppointment;
	}
	public void setPastAppointment(List<PastAppointment> pastAppointment) {
		this.pastAppointment = pastAppointment;
	}
	
	
	
}
