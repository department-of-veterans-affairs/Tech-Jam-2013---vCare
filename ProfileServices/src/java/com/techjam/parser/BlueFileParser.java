package com.techjam.parser;

import java.io.File;
import java.util.Scanner;

public class BlueFileParser {
	 
	public static void main(String[] args) throws Exception {
		 BlueFileParser f = new BlueFileParser();
		 f.process();
	}

	private String  accountSummary = "MY HEALTHEVET ACCOUNT SUMMARY";
	private String  demographics = "DEMOGRAPHICS";
	private String  healthcarePRod = "HEALTH CARE PROVIDERS";
	private String  treatmentFacilities = "TREATMENT FACILITIES";
	private String  HealthInsurance = "HEALTH INSURANCE";
	private String  WellNessREminders = "VA WELLNESS REMINDERS";
	private String  futureAppointments = "VA APPOINTMENTS";
	private String  VaAppointments = "VA APPOINTMENTS (LIMITED TO PAST 2 YEARS)";
	private String  VaMedication = "VA MEDICATION HISTORY";
	private String  MedicationSuppliement = "MEDICATIONS AND SUPPLEMENTS";
	private String  vaAllergies = "VA ALLERGIES";
	private String   otherAllergies = "ALLERGIES/ADVERSE REACTIONS";
	private String   medicialEvents = "MEDICAL EVENTS";
	private String   Immunizations = "IMMUNIZATIONS";
	private String   vaLabResults = "VA LABORATORY RESULTS";
	private String   otherlabTest = "LABS AND TESTS";
	private String   vitalandReading = "VITALS AND READINGS";
	private String   FamilyHealthHistory = "FAMILY HEALTH HISTORY";
	private String   MilitaryHealthHistory = "MILITARY HEALTH HISTORY";
	private String   dodMiltarySErviceInformation = "DOD MILITARY SERVICE INFORMATION";

	private void process () throws Exception {
		
		String[] listobject = {accountSummary,
				demographics,
				healthcarePRod,
				treatmentFacilities,
				HealthInsurance,
				WellNessREminders,
				futureAppointments,
				VaAppointments,
				VaMedication,
				MedicationSuppliement,
				 vaAllergies,
				 otherAllergies,
				 medicialEvents,
				 Immunizations,
				 vaLabResults,
				 otherlabTest,
				 vitalandReading,
				 FamilyHealthHistory,
				 MilitaryHealthHistory,
				 dodMiltarySErviceInformation};
		
		Scanner s = new Scanner(new File("SampleData.txt"));
		
		s.skip("");

		while (s.hasNext()){
			String str = s.nextLine();
			parseObject(str, listobject, s);
		}
		

	}
	public void parseObject ( String str , String[] listobject , Scanner s){
		String apstr = "";
		for (String string : listobject ) {
			if (str.indexOf(string)>1){
				//System.out.println(string  + "{ ");
				if (string.equals(demographics)) {
					DemographicParser al = new DemographicParser( listobject ,string);
					apstr = al.parse(s);
					System.out.println(al.getParselist().toString());
					
				}else if (string.equals(healthcarePRod)) {
					HealthProviderParser al = new HealthProviderParser( listobject ,string);
					apstr = al.parse(s);
					System.out.println(al.getParselist().toString());
				}else if (string.equals(treatmentFacilities)) {
					TreatmentFacilitiesParser al = new TreatmentFacilitiesParser( listobject ,string);
					apstr = al.parse(s);
					System.out.println(al.getParselist().toString());
				}else if (string.equals(HealthInsurance)) {
					HealthInsuranceParser al = new HealthInsuranceParser( listobject ,string);
					apstr = al.parse(s);
					System.out.println(al.getParselist().toString());
					
				}else if (string.equals(MedicationSuppliement)) {
					MedicationSupplementParser al = new MedicationSupplementParser( listobject ,string);
					apstr = al.parse(s);
					System.out.println(al.getParselist().toString());
				}else if (string.equals(MilitaryHealthHistory)) {
					MilitaryHealthHistoryParser al = new MilitaryHealthHistoryParser( listobject ,string);
					apstr = al.parse(s);
					System.out.println(al.getParselist().toString());
					
				}else{
					GeneralParser al = new GeneralParser( listobject ,string);
					apstr = al.parse(s);
					System.out.println(al.getParselist().toString());
				}
				//System.out.println( "},");
				break;
			}
		}
		if (!"".equals(apstr)){
			parseObject(apstr, listobject, s);
		}
	}
	/*
	private void process() throws Exception {
		
		String[] listobject = {vaAllergies,otherAllergies,medicialEvents,Immunizations,vaLabResults,otherlabTest,vitalandReading,FamilyHealthHistory,MilitaryHealthHistory,dodMiltarySErviceInformation};	
		Scanner s = new Scanner(new File("SampleData.txt"));
		s.skip("");
		
		while (s.hasNext()){
			
			String str = s.nextLine();
			
			if (str.indexOf(vaAllergies)>1){
				System.out.println("allergies" );
				AllergiesParser a = new AllergiesParser( listobject , vaAllergies );
				str = a.parse(s);
				System.out.println(a.getParselist());
			}
			
		
			if (str.indexOf(otherAllergies)>1){
				System.out.println("otherAllergies" );
				OtherAllergies a = new OtherAllergies( listobject ,otherAllergies);
				str = a.parse(s);
				System.out.println(a.getParselist());

			}

			if (str.indexOf(medicialEvents)>1){
				System.out.println("otherAllergies" );
				OtherAllergies a = new OtherAllergies( listobject , medicialEvents);
				str = a.parse(s);
				System.out.println(a.getParselist());

			}

			if (str.indexOf(Immunizations)>1){
				System.out.println("otherAllergies" );
				OtherAllergies a = new OtherAllergies( listobject ,Immunizations);
				str = a.parse(s);
				System.out.println(a.getParselist());

			}
			if (str.indexOf(vaLabResults)>1){
				System.out.println("otherAllergies" );
				OtherAllergies a = new OtherAllergies( listobject, vaLabResults);
				str = a.parse(s);
				System.out.println(a.getParselist());

			}
			if (str.indexOf(otherlabTest)>1){
				System.out.println("otherAllergies" );
				OtherAllergies a = new OtherAllergies( listobject ,otherlabTest);
				str = a.parse(s);
				System.out.println(a.getParselist());

			}
			if (str.indexOf(vitalandReading)>1){
				System.out.println("otherAllergies" );
				OtherAllergies a = new OtherAllergies( listobject ,vitalandReading);
				str = a.parse(s);
				System.out.println(a.getParselist());

			}
			if (str.indexOf(FamilyHealthHistory)>1){
				System.out.println("otherAllergies" );
				OtherAllergies a = new OtherAllergies( listobject,FamilyHealthHistory);
				str = a.parse(s);
				System.out.println(a.getParselist());

			}
			if (str.indexOf(MilitaryHealthHistory)>1){
				System.out.println("otherAllergies" );
				OtherAllergies a = new OtherAllergies( listobject, MilitaryHealthHistory);
				str = a.parse(s);
				System.out.println(a.getParselist());

			}

			if (str.indexOf(dodMiltarySErviceInformation)>1){
				System.out.println("otherAllergies" );
				OtherAllergies a = new OtherAllergies( listobject, dodMiltarySErviceInformation);
				str = a.parse(s);
				System.out.println(a.getParselist());

			}

			//System.out.println();
			
		}
		
	}
*/
}
