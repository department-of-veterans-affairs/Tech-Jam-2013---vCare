package com.ml.tj.bean;

import java.util.ArrayList;
import java.util.List;

public class Demographics {

	private String source = "Self-Entered";
	private Person person = new Person();
	private Address address = new Address();
	private Contact contact = new Contact();
	private List<EmergencyContact> emergencyContacts = getEmergencyContact();
	
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	
	
	public List<EmergencyContact> getEmergencyContact() {
		emergencyContacts = new ArrayList<>();
		EmergencyContact emergencyContact = new EmergencyContact();
		emergencyContact.setFirstName("TWO");
		emergencyContact.setLastName("MHVVeteran");
		
		Contact c = new Contact();
		c.setEmailId("twomhvveteran@domain.com");
		emergencyContact.setContact(c);
		

		EmergencyContact emergencyContact2 = new EmergencyContact();
		emergencyContact2.setFirstName("THREE");
		emergencyContact2.setLastName("MHVVeteran");
		
		Contact c2 = new Contact();
		c2.setEmailId("threemhvveteran@domain.com");
		emergencyContact2.setContact(c2);
		
		emergencyContacts.add(emergencyContact);
		emergencyContacts.add(emergencyContact2);
		return emergencyContacts;
	}
	public void setEmergencyContact(List<EmergencyContact> emergencyContact) {
		this.emergencyContacts = emergencyContact;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Contact getContact() {
		return contact;
	}
	public void setContact(Contact contact) {
		this.contact = contact;
	}

}
