package com.jasperRport.entities;

public class UnitReportField {

	private String unit_id;
	private String div_name;
	private String unit_desc;
	private String custodian;
	private String status;
	private String remarks;
	
	public String getUnit_id() {
		return unit_id;
	}
	public void setUnit_id(String unit_id) {
		this.unit_id = unit_id;
	}
	public String getDiv_name() {
		return div_name;
	}
	public void setDiv_name(String div_name) {
		this.div_name = div_name;
	}
	public String getUnit_desc() {
		return unit_desc;
	}
	public void setUnit_desc(String unit_desc) {
		this.unit_desc = unit_desc;
	}
	public String getCustodian() {
		return custodian;
	}
	public void setCustodian(String custodian) {
		this.custodian = custodian;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
	@Override
	public String toString() {
		return "UnitReportField [unit_id=" + unit_id + ", div_name=" + div_name + ", unit_desc=" + unit_desc
				+ ", custodian=" + custodian + ", status=" + status + ", remarks=" + remarks + "]";
	}
	
}
