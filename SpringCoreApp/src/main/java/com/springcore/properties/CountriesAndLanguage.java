package com.springcore.properties;

import java.util.Properties;

public class CountriesAndLanguage {
	
	private Properties countryAndLangs;

	public Properties getCountryAndLangs() {
		return countryAndLangs;
	}

	public void setCountryAndLangs(Properties countryAndLangs) {
		this.countryAndLangs = countryAndLangs;
	}

	@Override
	public String toString() {
		return "CountriesAndLanguage [countryAndLangs=" + countryAndLangs + "]";
	}
	
	

}
