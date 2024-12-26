package com.jasperRport.entities;

public class PlotInformationSubReportZoneTable {
	
	private String zone_name;
	private String sub_zone_desc;
	
	public String getZone_name() {
		return zone_name;
	}
	public void setZone_name(String zone_name) {
		this.zone_name = zone_name;
	}
	public String getSub_zone_desc() {
		return sub_zone_desc;
	}
	public void setSub_zone_desc(String sub_zone_desc) {
		this.sub_zone_desc = sub_zone_desc;
	}
	
	@Override
	public String toString() {
		return "PlotInformationSubReportZoneTable [zone_name=" + zone_name + ", sub_zone_desc=" + sub_zone_desc + "]";
	}
}
