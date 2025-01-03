package com.jasperRport.entities;

import java.math.BigDecimal;

public class WayleaveInformationZoneTable {
	
	private String zone_name;
	private String sub_zone_desc;
	private String city_survey_no;
	private String wyl_instl_type;
	private BigDecimal diameter;
	private String wyl_measure_unit;
	private BigDecimal length;
	private BigDecimal width;
	private BigDecimal area;
	
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
	public String getCity_survey_no() {
		return city_survey_no;
	}
	public void setCity_survey_no(String city_survey_no) {
		this.city_survey_no = city_survey_no;
	}
	public String getWyl_instl_type() {
		return wyl_instl_type;
	}
	public void setWyl_instl_type(String wyl_instl_type) {
		this.wyl_instl_type = wyl_instl_type;
	}
	public BigDecimal getDiameter() {
		return diameter;
	}
	public void setDiameter(BigDecimal diameter) {
		this.diameter = diameter;
	}
	public String getWyl_measure_unit() {
		return wyl_measure_unit;
	}
	public void setWyl_measure_unit(String wyl_measure_unit) {
		this.wyl_measure_unit = wyl_measure_unit;
	}
	public BigDecimal getLength() {
		return length;
	}
	public void setLength(BigDecimal length) {
		this.length = length;
	}
	public BigDecimal getWidth() {
		return width;
	}
	public void setWidth(BigDecimal width) {
		this.width = width;
	}
	public BigDecimal getArea() {
		return area;
	}
	public void setArea(BigDecimal area) {
		this.area = area;
	}
	
	@Override
	public String toString() {
		return "WayleaveInformationMainReportFields [zone_name=" + zone_name + ", sub_zone_desc=" + sub_zone_desc
				+ ", city_survey_no=" + city_survey_no + ", wyl_instl_type=" + wyl_instl_type + ", diameter=" + diameter
				+ ", wyl_measure_unit=" + wyl_measure_unit + ", length=" + length + ", width=" + width + ", area="
				+ area + "]";
	}
}
