package com.ml.tj.bean;


public class AppointmentDetails {

	private String date;
	private String appointmentLocation;
	private String appointmentSatus;
	private String clinic;
	private String appointmentType;
	private String location;
	private String note;

	public String getLocation() {
		return location;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getString() {
		return date;
	}

	public void setString(String date) {
		this.date = date;
	}

	public String getAppointmentLocation() {
		return appointmentLocation;
	}

	public void setAppointmentLocation(String appointmentLocation) {
		this.appointmentLocation = appointmentLocation;
	}

	public String getAppointmentSatus() {
		return appointmentSatus;
	}

	public void setAppointmentSatus(String appointmentSatus) {
		this.appointmentSatus = appointmentSatus;
	}

	public String getClinic() {
		return clinic;
	}

	public void setClinic(String clinic) {
		this.clinic = clinic;
	}

	public String getAppointmentType() {
		return appointmentType;
	}

	public void setAppointmentType(String appointmentType) {
		this.appointmentType = appointmentType;
	}

}
