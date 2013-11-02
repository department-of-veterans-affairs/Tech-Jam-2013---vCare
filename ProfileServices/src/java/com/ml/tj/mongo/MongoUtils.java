package com.ml.tj.mongo;

import java.net.UnknownHostException;

import com.ml.tj.bean.Allergies;
import com.ml.tj.bean.Demographics;
import com.ml.tj.bean.FamilyHealthHistory;
import com.ml.tj.bean.HealthCareProvider;
import com.ml.tj.bean.HealthInsurance;
import com.ml.tj.bean.Immunizations;
import com.ml.tj.bean.LabsTests;
import com.ml.tj.bean.MedicalEvents;
import com.ml.tj.bean.MedicalHistory;
import com.ml.tj.bean.MedicationsSupplements;
import com.ml.tj.bean.MilitaryHealthHistory;
import com.ml.tj.bean.MilitaryService;
import com.ml.tj.bean.TreatmentFacilities;
import com.ml.tj.bean.VitalReadings;
import com.ml.tj.bean.WellnessReminder;
import com.ml.tj.bean.json.JsonConverter;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.Mongo;
import com.mongodb.util.JSON;

public class MongoUtils {

    public static String get(String collectionName) throws UnknownHostException{
        Mongo mongo = new Mongo("137.116.81.48", 27017);
		DB db = mongo.getDB("va_grey");
    
        DBCollection collection = db.getCollection(collectionName);
//		DBObject dbObject = (DBObject) JSON.parse(json);

		//collection.insert(dbObject);

		DBCursor cursorDoc = collection.find();
		while (cursorDoc.hasNext()) {
                    return cursorDoc.next().toString();
                }
                return "";
    }
    
     public static String getAll(String collectionName) throws UnknownHostException{
        Mongo mongo = new Mongo("137.116.81.48", 27017);
		DB db = mongo.getDB("va_grey");
    
        DBCollection collection = db.getCollection(collectionName);
//		DBObject dbObject = (DBObject) JSON.parse(json);

		//collection.insert(dbObject);

		DBCursor cursorDoc = collection.find();
                StringBuffer buffer = new StringBuffer();
                buffer.append("{");
		while (cursorDoc.hasNext()) {
                    buffer.append(cursorDoc.next().toString());
                    buffer.append(",");
                }
                String result = buffer.toString();
                return   result.subSequence(0, (result.length()-1)) + "}";
                
    }
//    
//       public static String get(String collectionName,String Id) throws UnknownHostException{
//        Mongo mongo = new Mongo("137.116.81.48", 27017);
//		DB db = mongo.getDB("va_grey");
//    
//        DBCollection collection = db.getCollection(collectionName);
////		DBObject dbObject = (DBObject) JSON.parse(json);
//
//		//collection.insert(dbObject);
//                String qry = "VET_ID:"+ Id;
//		DBCursor cursorDoc = collection.find(qry);
//                
//		while (cursorDoc.hasNext()) {
//                    return cursorDoc.next().toString();
//                }
//                return "";
//    }
         
	public static void store(String collectionName, String json)
			throws UnknownHostException {
		Mongo mongo = new Mongo("137.116.81.48", 27017);
		DB db = mongo.getDB("va_grey");

		// ACC_SUMMARY
		// ALLERGIESADVERSEREACTIONS
		// DEMOGRAPHICS
		// DODMILITARYSERVICEINFORMATION
		// FAMILYHEALTHHISTORY
		// HEALTHCAREPROVIDERS
		// HEALTHINSURANCE
		// IMMUNIZATIONS
		// LABSANDTESTS
		// MEDICALEVENTS
		// MEDICATIONSANDSUPPLEMENTS
		// MILITARYHEALTHHISTORY
		// TREATMENTFACILITIES
		// VAALLERGIES
		// VALABORATORYRESULTS
		// VAMEDICATIONHISTORY
		// VAWELLNESSREMINDERS
		// VITALSANDREADINGS

//		DBCollection collection = db.getCollection(collectionName);
//		DBObject dbObject = (DBObject) JSON.parse(json);
//
//		collection.insert(dbObject);
//
//		DBCursor cursorDoc = collection.find();
//		while (cursorDoc.hasNext()) {
//			// DBObject dbo = cursorDoc.next();
//
//			System.out.println(JsonConverter.objectify(cursorDoc.next()
//					.toString()));
//		}
	}

	public static void storeData() {

		try {
			store("DEMOGRAPHICS", JsonConverter.jsonify(new Demographics()));
			store("HEALTHCAREPROVIDERS",
					JsonConverter.jsonify(new HealthCareProvider()));
			store("ALLERGIESADVERSEREACTIONS",
					JsonConverter.jsonify(new Allergies()));
			store("DODMILITARYSERVICEINFORMATION",
					JsonConverter.jsonify(new MilitaryService()));
			store("FAMILYHEALTHHISTORY",
					JsonConverter.jsonify(new FamilyHealthHistory()));
			store("HEALTHINSURANCE",
					JsonConverter.jsonify(new HealthInsurance()));
			store("IMMUNIZATIONS", JsonConverter.jsonify(new Immunizations()));
			store("LABSANDTESTS", JsonConverter.jsonify(new LabsTests()));
			store("MEDICALEVENTS", JsonConverter.jsonify(new MedicalEvents()));
			store("MEDICATIONSANDSUPPLEMENTS",
					JsonConverter.jsonify(new MedicationsSupplements()));
			store("MILITARYHEALTHHISTORY",
					JsonConverter.jsonify(new MilitaryHealthHistory()));
			store("TREATMENTFACILITIES",
					JsonConverter.jsonify(new TreatmentFacilities()));
			store("VAALLERGIES", JsonConverter.jsonify(new Allergies()));
			store("VALABORATORYRESULTS",
					JsonConverter.jsonify(new MedicationsSupplements()));
			store("VAMEDICATIONHISTORY",
					JsonConverter.jsonify(new MedicalHistory()));
			store("VAWELLNESSREMINDERS",
					JsonConverter.jsonify(new WellnessReminder()));
			store("VITALSANDREADINGS",
					JsonConverter.jsonify(new VitalReadings()));
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
//		try {
			storeData();
			// store("DEMOGRAPHICS", JsonConverter.jsonify(new Demographics()));
//			store("HEALTHCAREPROVIDERS",
//					JsonConverter.jsonify(new HealthCareProvider()));
//		} catch (UnknownHostException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

	}
}
