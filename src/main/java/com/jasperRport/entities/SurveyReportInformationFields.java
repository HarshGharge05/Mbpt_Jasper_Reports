package com.jasperRport.entities;

import java.sql.Date;

public class SurveyReportInformationFields {
	
	private String div_name;
	private String unit_code;
	private String estate_name;
	private String rr_no;
	private String let_out_name;
	private Date survey_date;
	private String plot_is_covered_with;
	private String plot_area;
	private String location_part_of_encroachment;
	private String area_of_encroachment;
	private String type_of_encroachment;
	private String forwarded_to;
	private String status;
	private String remark;
	
	public String getDiv_name() {
		return div_name;
	}
	public void setDiv_name(String div_name) {
		this.div_name = div_name;
	}
	public String getUnit_code() {
		return unit_code;
	}
	public void setUnit_code(String unit_code) {
		this.unit_code = unit_code;
	}
	public String getEstate_name() {
		return estate_name;
	}
	public void setEstate_name(String estate_name) {
		this.estate_name = estate_name;
	}
	public String getRr_no() {
		return rr_no;
	}
	public void setRr_no(String rr_no) {
		this.rr_no = rr_no;
	}
	public String getLet_out_name() {
		return let_out_name;
	}
	public void setLet_out_name(String let_out_name) {
		this.let_out_name = let_out_name;
	}
	public Date getSurvey_date() {
		return survey_date;
	}
	public void setSurvey_date(Date survey_date) {
		this.survey_date = survey_date;
	}
	public String getPlot_is_covered_with() {
		return plot_is_covered_with;
	}
	public void setPlot_is_covered_with(String plot_is_covered_with) {
		this.plot_is_covered_with = plot_is_covered_with;
	}
	public String getPlot_area() {
		return plot_area;
	}
	public void setPlot_area(String plot_area) {
		this.plot_area = plot_area;
	}
	public String getLocation_part_of_encroachment() {
		return location_part_of_encroachment;
	}
	public void setLocation_part_of_encroachment(String location_part_of_encroachment) {
		this.location_part_of_encroachment = location_part_of_encroachment;
	}
	public String getArea_of_encroachment() {
		return area_of_encroachment;
	}
	public void setArea_of_encroachment(String area_of_encroachment) {
		this.area_of_encroachment = area_of_encroachment;
	}
	public String getType_of_encroachment() {
		return type_of_encroachment;
	}
	public void setType_of_encroachment(String type_of_encroachment) {
		this.type_of_encroachment = type_of_encroachment;
	}
	public String getForwarded_to() {
		return forwarded_to;
	}
	public void setForwarded_to(String forwarded_to) {
		this.forwarded_to = forwarded_to;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	@Override
	public String toString() {
		return "SurveyReportInformationFields [div_name=" + div_name + ", unit_code=" + unit_code + ", estate_name="
				+ estate_name + ", rr_no=" + rr_no + ", let_out_name=" + let_out_name + ", survey_date=" + survey_date
				+ ", plot_is_covered_with=" + plot_is_covered_with + ", plot_area=" + plot_area
				+ ", location_part_of_encroachment=" + location_part_of_encroachment + ", area_of_encroachment="
				+ area_of_encroachment + ", type_of_encroachment=" + type_of_encroachment + ", forwarded_to="
				+ forwarded_to + ", status=" + status + ", remark=" + remark + "]";
	}
}
