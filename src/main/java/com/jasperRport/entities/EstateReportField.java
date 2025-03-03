package com.jasperRport.entities;

public class EstateReportField {
	
	private String estate_code;
	private String estate_name;
	private int unit_id;
	private String status;
	private String custodian;
	private String remarks;
	
	public String getEstate_code() {
		return estate_code;
	}
	public void setEstate_code(String estate_code) {
		this.estate_code = estate_code;
	}
	public String getEstate_name() {
		return estate_name;
	}
	public void setEstate_name(String estate_name) {
		this.estate_name = estate_name;
	}
	public int getUnit_id() {
		return unit_id;
	}
	public void setUnit_id(int unit_id) {
		this.unit_id = unit_id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCustodian() {
		return custodian;
	}
	public void setCustodian(String custodian) {
		this.custodian = custodian;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
	@Override
	public String toString() {
		return "EstateReportField [estate_code=" + estate_code + ", estate_name=" + estate_name + ", unit_id=" + unit_id
				+ ", status=" + status + ", custodian=" + custodian + ", remarks=" + remarks + "]";
	}
}
