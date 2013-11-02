package com.ml.domain;

import java.util.HashMap;
import java.util.Map;

public class BBDomainValues {

	public static Map<String, String> serviceCodes = new HashMap<>();
	public static Map<String, String> doDOccupationCodes = new HashMap<>();
	public static Map<String, String> militaryPayTypeCodes = new HashMap<>();
	public static Map<String, String> separationPayTypeCodes = new HashMap<>();
	public static Map<String, String> retirementPayTypeCodes = new HashMap<>();
	public static Map<String, String> stopPaymentReasonCodes = new HashMap<>();
	public static Map<String, String> retiredPayStatusCodes = new HashMap<>();
	public static Map<String, String> retiredPayTerminationCodes = new HashMap<>();

	static {
		loadServiceCodes();
		loadDodOccupationCodes();
		loadMilitaryPayTypeCodes();
		loadSeparationPayTypeCodes();
		loadRetirementPayTypeCodes();
		loadStopPaymentReasonCodes();
		loadRetiredPayStatusCodes();
		loadRetiredPayTerminationCodes();
	}

	private static void loadRetiredPayTerminationCodes() {
		retiredPayTerminationCodes.put("C", "Pay condition terminated");
		retiredPayTerminationCodes
				.put("S",
						"Pay terminated for the reason reported in the Stop Payment Reason Code");
		retiredPayTerminationCodes.put("W", "Not terminated");
	}

	private static void loadRetiredPayStatusCodes() {
		retiredPayStatusCodes.put("1", "Receiving retired pay");
		retiredPayStatusCodes.put("2", "Eligible, not receiving pay");
		retiredPayStatusCodes.put("3",
				"Eligible, not receiving direct SBP remittance");
		retiredPayStatusCodes.put("4", "Terminated");
		retiredPayStatusCodes.put("5", "Suspended");
	}

	private static void loadStopPaymentReasonCodes() {
		stopPaymentReasonCodes.put("A", "Member died");
		stopPaymentReasonCodes.put("B", "Recalled to Active Duty");
		stopPaymentReasonCodes.put("C",
				"Removed from TDRL, returned to Active Duty");
		stopPaymentReasonCodes.put("D",
				"Removed from TDRL, returned to Civilian");
		stopPaymentReasonCodes.put("E",
				"Pay suspended, failure to report for TDRL physical");
		stopPaymentReasonCodes.put("F", "Civil Service retirement waiver");
		stopPaymentReasonCodes.put("G", "VA compensation waiver");
		stopPaymentReasonCodes.put("H", "Dual compensation, pay cap offset");
		stopPaymentReasonCodes.put("J", "Refused retired pay");
		stopPaymentReasonCodes.put("K", "Pay suspended, whereabouts unknown");
		stopPaymentReasonCodes.put("L", "Suspected death");
		stopPaymentReasonCodes.put("M", "Pay suspended, miscellaneous");
		stopPaymentReasonCodes.put("Z", "Not applicable");
	}

	private static void loadRetirementPayTypeCodes() {
		retirementPayTypeCodes.put("A", "Mandatory");
		retirementPayTypeCodes.put("B", "Voluntary");
		retirementPayTypeCodes.put("C", "Fleet Reserve");
		retirementPayTypeCodes.put("D", "Temporary Disability Retirement List");
		retirementPayTypeCodes
				.put("E", " Permanent Disability Retirement List");
		retirementPayTypeCodes.put("F", "Title III");
		retirementPayTypeCodes.put("G", "Special Act");
		retirementPayTypeCodes.put("H", "Philippine Scouts");
	}

	private static void loadSeparationPayTypeCodes() {
		separationPayTypeCodes.put("01", "Separation Pay");
		separationPayTypeCodes.put("02", "Readjustment Pay");
		separationPayTypeCodes.put("03", "Non-Disability Severance Pay");
		separationPayTypeCodes.put("04", "Disability Severance Pay");
		separationPayTypeCodes.put("05", "Discharge Gratuity");
		separationPayTypeCodes.put("06", "Death Gratuity");
		separationPayTypeCodes.put("07", "Special Separation Benefit");
		separationPayTypeCodes.put("08", "Voluntary Separation Incentive Pay");
		separationPayTypeCodes.put("09", "Voluntary Separation Pay (VSP)");
	}

	private static void loadMilitaryPayTypeCodes() {
		militaryPayTypeCodes.put("01", "Combat Zone Tax Exclusion (CZTE)");
		militaryPayTypeCodes.put("02", "Hostile Fire/Imminent Danger");
		militaryPayTypeCodes.put("03", "Hazardous Duty incentive");
	}

	private static void loadDodOccupationCodes() {
		doDOccupationCodes.put("3A", "Intelligence, General");
		doDOccupationCodes.put("9E", "Other");
	}

	private static void loadServiceCodes() {
		serviceCodes.put("00A", "Duties Unassigned");
		serviceCodes.put("01A", "Officer Generalist");
		serviceCodes.put("35B00",
				"Land Combat Support Systems (LCSS) Test Specialist");
		serviceCodes.put("35D", "Air Traffic Control Equipment Repairer");
		serviceCodes.put("35D00", "Air Traffic Control Equipment Repairer");
		serviceCodes.put("35D5K", "Air Traffic Control Equipment Repairer");
		serviceCodes.put("66HD5", "Medical Surgical Nurse");
		serviceCodes.put("66HD5", "Observation Airplane Technical Inspector");
	}
}
