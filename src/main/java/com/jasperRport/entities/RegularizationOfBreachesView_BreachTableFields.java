package com.jasperRport.entities;

public class RegularizationOfBreachesView_BreachTableFields {
	
	private String typeo_of_breach;
	private String removal_date;
	private String location;
	
	public String getTypeo_of_breach() {
		return typeo_of_breach;
	}
	public void setTypeo_of_breach(String typeo_of_breach) {
		this.typeo_of_breach = typeo_of_breach;
	}
	public String getRemoval_date() {
		return removal_date;
	}
	public void setRemoval_date(String removal_date) {
		this.removal_date = removal_date;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	@Override
	public String toString() {
		return "RegularizationOfBreachesView_BreachTableFields [typeo_of_breach=" + typeo_of_breach + ", removal_date="
				+ removal_date + ", location=" + location + "]";
	}
}
