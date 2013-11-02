package com.ml.tj.bean;

import java.util.ArrayList;
import java.util.List;

public class TreatmentFacilities {

	private List<TreatmentFacility> treatmentFacilities = getTreatmentFacilities();

	public List<TreatmentFacility> getTreatmentFacilities() {
		treatmentFacilities = new ArrayList<>();
		
		treatmentFacilities.add(new TreatmentFacility());
		
		TreatmentFacility t = new TreatmentFacility();
		t.setComments("Reminder to bring My HealtheVet printouts for all visits");
		t.setFacilityName("Health Care Inc.");
		t.setFacilityType("Non-VA");
		t.setVAHomeFacility("No");
		t.setPhoneNumber("000-000-0002   Ext: 5678");
		t.setMailingAddress("123 Anywhere Road");
		t.setMailingAddress2("B-Wing");
		t.setMailingCity("Anywhere");
		t.setMailingState("DC");
		t.setMailingCountry("United States");
		t.setMailingZip("00001");
		
		treatmentFacilities.add(t);
		
		
		return treatmentFacilities;
	}

	public void setTreatmentFacilities(
			List<TreatmentFacility> treatmentFacilities) {
		this.treatmentFacilities = treatmentFacilities;
	}

}
