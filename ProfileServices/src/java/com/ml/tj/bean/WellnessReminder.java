package com.ml.tj.bean;

import java.util.ArrayList;
import java.util.List;

public class WellnessReminder {

	private String source = "VA";
	private String lastUpdateDate = "02 Dec 2011 @ 0706";
	private List<Reminder> reminder = getReminder();

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

	public List<Reminder> getReminder() {
		reminder = new ArrayList<>();

		Reminder r = new Reminder();
		reminder.add(r);

		r = new Reminder();
		r.setReminder("Influenza Vaccine");
		reminder.add(r);

		return reminder;
	}

	public void setReminder(List<Reminder> reminder) {
		this.reminder = reminder;
	}
}
