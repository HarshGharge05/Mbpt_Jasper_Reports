package com.jasperRport.entities;

import java.sql.Date;

public class ListOfInspectionReportFields {
	
	private String customer_code;
	private Date inspection_date;
	private String let_out_name;
	private String name;
	private String status;
	
	public String getCustomer_code() {
		return customer_code;
	}
	public void setCustomer_code(String customer_code) {
		this.customer_code = customer_code;
	}
	public Date getInspection_date() {
		return inspection_date;
	}
	public void setInspection_date(Date inspection_date) {
		this.inspection_date = inspection_date;
	}
	public String getLet_out_name() {
		return let_out_name;
	}
	public void setLet_out_name(String let_out_name) {
		this.let_out_name = let_out_name;
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
	
	@Override
	public String toString() {
		return "ListOfInspectionReportFields [customer_code=" + customer_code + ", inspection_date=" + inspection_date
				+ ", let_out_name=" + let_out_name + ", name=" + name + ", status=" + status + "]";
	}
}
