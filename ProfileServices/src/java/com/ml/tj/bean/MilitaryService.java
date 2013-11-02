package com.ml.tj.bean;

import java.util.List;

public class MilitaryService {
	
	private String serviceName;
	private List<String> serviceType;
	private List<String> beginDate;
	private List<String> endDate;
	private List<String> serviceCharacte;
	private List<String> rank;
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	public List<String> getServiceType() {
		return serviceType;
	}
	public void setServiceType(List<String> serviceType) {
		this.serviceType = serviceType;
	}
	public List<String> getBeginDate() {
		return beginDate;
	}
	public void setBeginDate(List<String> beginDate) {
		this.beginDate = beginDate;
	}
	public List<String> getEndDate() {
		return endDate;
	}
	public void setEndDate(List<String> endDate) {
		this.endDate = endDate;
	}
	public List<String> getServiceCharacte() {
		return serviceCharacte;
	}
	public void setServiceCharacte(List<String> serviceCharacte) {
		this.serviceCharacte = serviceCharacte;
	}
	public List<String> getRank() {
		return rank;
	}
	public void setRank(List<String> rank) {
		this.rank = rank;
	}
	
	
	
	
	
}
