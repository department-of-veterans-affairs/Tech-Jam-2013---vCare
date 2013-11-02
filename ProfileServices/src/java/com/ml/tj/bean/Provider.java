package com.ml.tj.bean;

public class Provider {

	private String providerName = "John Doe";
	private String providerType = "Primary";
	private String comment = "Dr. Doe can be reached on the weekend if needed by leaving a message with the clinic.";
	private String phone="000-000-0000    Ext: 1234";
	private String email="provider@institution.org";
	private String otherInfo="Seen as needed";
	
	public String getProviderName() {
		return providerName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getOtherInfo() {
		return otherInfo;
	}

	public void setOtherInfo(String otherInfo) {
		this.otherInfo = otherInfo;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setProviderName(String providerName) {
		this.providerName = providerName;
	}

	public String getProviderType() {
		return providerType;
	}

	public void setProviderType(String providerType) {
		this.providerType = providerType;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getPhone() {
		return phone;
	}

	public void setContact(String contact) {
		this.phone = contact;
	}

}
