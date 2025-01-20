package com.jasperRport.entities;

public class GrantFreshLeaseApplicationView_AreaTableFields {
	
	private String plot_area;
	private String location;
	private String use;
	
	public String getPlot_area() {
		return plot_area;
	}
	public void setPlot_area(String plot_area) {
		this.plot_area = plot_area;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getUse() {
		return use;
	}
	public void setUse(String use) {
		this.use = use;
	}
	
	@Override
	public String toString() {
		return "GrantFreshLeaseApplicationView_AreaTableFields [plot_area=" + plot_area + ", location=" + location
				+ ", use=" + use + "]";
	}
}
