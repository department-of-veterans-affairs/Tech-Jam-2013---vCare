package com.ml.tj.bean;

import java.util.ArrayList;
import java.util.List;

public class FutureAppointment {

	List<AppointmentDetails> appointmentDetail = getAppointmentDetail();

	public List<AppointmentDetails> getAppointmentDetail() {
		AppointmentDetails ad = new AppointmentDetails();

		ad.setAppointmentLocation("DAYT29 TEST LAB");
		ad.setAppointmentSatus("NOT APPLICABLE");
		ad.setAppointmentType("Compensation and Pension Appointment");
		ad.setClinic("C&P CHRISTIE");
		ad.setDate("13 Oct 2012 @ 1100");
		ad.setLocation("DAYT29 TEST LAB");

		appointmentDetail = new ArrayList<>();
		appointmentDetail.add(ad);

		return appointmentDetail;
	}

	public void setAppointmentDetail(List<AppointmentDetails> appointmentDetail) {
		this.appointmentDetail = appointmentDetail;
	}

}
