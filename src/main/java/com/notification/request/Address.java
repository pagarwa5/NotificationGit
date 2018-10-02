package com.notification.request;

import javax.validation.constraints.NotBlank;

public class Address {

	@NotBlank
	private String county;

	@NotBlank
	private String state;

	@NotBlank
	private String city;

	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
