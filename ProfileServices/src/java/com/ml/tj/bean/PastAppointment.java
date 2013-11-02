package com.ml.tj.bean;

import java.util.ArrayList;
import java.util.List;

public class PastAppointment {

	List<AppointmentDetails> appointmentDetail = getAppointmentDetail();

	public List<AppointmentDetails> getAppointmentDetail() {
		appointmentDetail = new ArrayList<>();
		
		AppointmentDetails ad = new AppointmentDetails();

		ad.setAppointmentLocation("DAYT29 TEST LAB");
		ad.setAppointmentSatus("NOT APPLICABLE");
		ad.setAppointmentType("Compensation and Pension Appointment");
		ad.setClinic("C&P CHRISTIE");
		ad.setDate("13 Oct 2011 @ 1600");
		ad.setLocation("DAYT29 TEST LAB");

		appointmentDetail.add(ad);
		
		ad = new AppointmentDetails();

		ad.setAppointmentLocation("DAYT29 TEST LAB");
		ad.setAppointmentSatus("NOT APPLICABLE");
		ad.setAppointmentType("Compensation and Pension Appointment");
		ad.setClinic("C&P CHRISTIE");
		ad.setDate("27 Jul 2011 @ 1400");
		ad.setLocation("DAYT29 TEST LAB");

		appointmentDetail.add(ad);
		
		ad = new AppointmentDetails();

		ad.setAppointmentLocation("DAYT29 TEST LAB");
		ad.setAppointmentSatus("NOT APPLICABLE");
		ad.setAppointmentType("Compensation and Pension Appointment");
		ad.setClinic("C&P CHRISTIE");
		ad.setDate("07 Sep 2011 @ 1100");
		ad.setLocation("DAYT29 TEST LAB");

		appointmentDetail.add(ad);
		
		ad = new AppointmentDetails();

		ad.setAppointmentLocation("DAYT29 TEST LAB");
		ad.setAppointmentSatus("NOT APPLICABLE");
		ad.setAppointmentType("Compensation and Pension Appointment");
		ad.setClinic("C&P CHRISTIE");
		ad.setDate("13 Oct 2011 @ 1600");
		ad.setLocation("DAYT29 TEST LAB");

		appointmentDetail.add(ad);
		
		ad = new AppointmentDetails();

		ad.setAppointmentLocation("DAYT29 TEST LAB");
		ad.setAppointmentSatus("NOT APPLICABLE");
		ad.setAppointmentType("Compensation and Pension Appointment");
		ad.setClinic("C&P CHRISTIE");
		ad.setDate("13 Oct 2011 @ 1600");
		ad.setLocation("DAYT29 TEST LAB");

		appointmentDetail.add(ad);
		return appointmentDetail;
	}

	public void setAppointmentDetail(List<AppointmentDetails> appointmentDetail) {
		this.appointmentDetail = appointmentDetail;
	}
	
	
}
