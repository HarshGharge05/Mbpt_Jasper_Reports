package com.jasperRport.entities;

import java.sql.Date;

public class ListOfSurveyReportFields {
	
	private Date survey_date;
	private String customer_code;
	private String rr_no;
	private String let_out_name;
	private String status;
	private String forwarded_to;
	
	public Date getSurvey_date() {
		return survey_date;
	}
	public void setSurvey_date(Date survey_date) {
		this.survey_date = survey_date;
	}
	public String getCustomer_code() {
		return customer_code;
	}
	public void setCustomer_code(String customer_code) {
		this.customer_code = customer_code;
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getForwarded_to() {
		return forwarded_to;
	}
	public void setForwarded_to(String forwarded_to) {
		this.forwarded_to = forwarded_to;
	}
	
	@Override
	public String toString() {
		return "ListOfSurveyReportFields [survey_date=" + survey_date + ", customer_code=" + customer_code + ", rr_no="
				+ rr_no + ", let_out_name=" + let_out_name + ", status=" + status + ", forwarded_to=" + forwarded_to
				+ "]";
	}
}
