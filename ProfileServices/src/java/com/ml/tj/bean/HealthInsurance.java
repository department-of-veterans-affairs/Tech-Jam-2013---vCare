package com.ml.tj.bean;

import java.util.ArrayList;
import java.util.List;

public class HealthInsurance {

	private List<Company> company= getCompany();

	public List<Company> getCompany() {
		company = new ArrayList<>();

		Company c1 = new Company();

		c1.setComments("Need to get pre-authorization for special services.");
		c1.setCompanyName("My Health Insurance Company");
		c1.setCompanyIdNumber("0001234");
		c1.setInsured("One Mhvveteran");
		c1.setPreApprovedPhnNbr("000-000-0003");
		c1.setPrimaryProvider("Yes");
		c1.setStartDate("01 Jan 2000");

		company.add(c1);

		c1 = new Company();

		c1.setComments("Coverage only for vision and dental.");
		c1.setCompanyName("My Other Health Insurance Company");
		c1.setCompanyIdNumber("000567891010");
		c1.setInsured("One Mhvveteran");
		c1.setPreApprovedPhnNbr("000-000-0003");
		c1.setPrimaryProvider("No");
		c1.setStartDate("01 Jan 2009");

		company.add(c1);

		return company;
	}

	public void setCompany(List<Company> company) {
		this.company = company;
	}

}
