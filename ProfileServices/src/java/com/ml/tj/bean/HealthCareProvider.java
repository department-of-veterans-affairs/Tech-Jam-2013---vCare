package com.ml.tj.bean;

import java.util.ArrayList;
import java.util.List;

public class HealthCareProvider {

	private List<Provider> provider = getProvider();

	public List<Provider> getProvider() {
		provider = new ArrayList<>();
		provider.add(new Provider());

		Provider p = new Provider();
		p.setProviderName("Jane Smith");
		p.setProviderType("Specialist");
		p.setEmail("specialist@institution.org");
		provider.add(p);

		return provider;
	}

	public void setProvider(List<Provider> provider) {
		this.provider = provider;
	}

}
