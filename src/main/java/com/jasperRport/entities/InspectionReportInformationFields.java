package com.jasperRport.entities;

import java.sql.Date;

public class InspectionReportInformationFields {
	
	private String div_name;
	private String unit_code;
	private String estate_name;
	private String rr_no;
	private String let_out_omponent;
	private Date inspection_date;
	private String person_at_site;
	private String customer_code;
	private String name;
	private String status;
	private Boolean is_fresh_survey;
	
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
	public Date getInspection_date() {
		return inspection_date;
	}
	public void setInspection_date(Date inspection_date) {
		this.inspection_date = inspection_date;
	}
	public String getPerson_at_site() {
		return person_at_site;
	}
	public void setPerson_at_site(String person_at_site) {
		this.person_at_site = person_at_site;
	}
	public String getCustomer_code() {
		return customer_code;
	}
	public void setCustomer_code(String customer_code) {
		this.customer_code = customer_code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Boolean getIs_fresh_survey() {
		return is_fresh_survey;
	}
	public void setIs_fresh_survey(Boolean is_fresh_survey) {
		this.is_fresh_survey = is_fresh_survey;
	}
	public String getLet_out_omponent() {
		return let_out_omponent;
	}
	public void setLet_out_omponent(String let_out_omponent) {
		this.let_out_omponent = let_out_omponent;
	}
	
	@Override
	public String toString() {
		return "InspectionReportInformationFields [div_name=" + div_name + ", unit_code=" + unit_code + ", estate_name="
				+ estate_name + ", rr_no=" + rr_no + ", let_out_omponent=" + let_out_omponent + ", inspection_date="
				+ inspection_date + ", person_at_site=" + person_at_site + ", customer_code=" + customer_code
				+ ", name=" + name + ", status=" + status + ", is_fresh_survey=" + is_fresh_survey + "]";
	}
}
