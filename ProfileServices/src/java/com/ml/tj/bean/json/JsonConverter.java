package com.ml.tj.bean.json;

import com.google.gson.Gson;
import com.ml.tj.bean.Demographics;
import com.ml.tj.bean.HealthCareProvider;
import com.ml.tj.bean.HealthInsurance;
import com.ml.tj.bean.TreatmentFacilities;
import com.ml.tj.bean.VetAccountSummary;
import com.ml.tj.bean.WellnessReminder;

public class JsonConverter {

	public static String jsonify(Object obj) {

		Gson gson = new Gson();
		String json = gson.toJson(obj);

		return json;
	}

	public static String objectify(String json) {

		Gson gson = new Gson();
		Demographics obj = gson.fromJson(json, Demographics.class);

		System.err.println("obj:; " + obj.getPerson().getFirstName());
		return json;
	}
	
	public static void main(String[] args) {
		System.err.println(jsonify(new Demographics()));
		System.err.println(jsonify(new VetAccountSummary()));
		System.err.println(jsonify(new HealthCareProvider()));
		System.err.println(jsonify(new TreatmentFacilities()));
		System.err.println(jsonify(new HealthInsurance()));
		System.err.println(jsonify(new WellnessReminder()));
	}
}
