package com.ml.tj.bean;

public class Reminder {

	private String reminder = "Colon Cancer Screening";
	private String dueDate = "DUE NOW";
	private String lastCompleted = "UNKNOWN";
	private String location = "DAYT29";

	public String getReminder() {
		return reminder;
	}

	public void setReminder(String reminder) {
		this.reminder = reminder;
	}

	public String getDueDate() {
		return dueDate;
	}

	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}

	public String getLastCompleted() {
		return lastCompleted;
	}

	public void setLastCompleted(String lastCompleted) {
		this.lastCompleted = lastCompleted;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

}
