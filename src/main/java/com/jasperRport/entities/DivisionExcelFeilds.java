package com.jasperRport.entities;

public class DivisionExcelFeilds {
	
	private String div_code;
	private String div_name;
	private String div_desc;
	private String status;
	private String custodian;
	
	public String getDiv_code() {
		return div_code;
	}
	public void setDiv_code(String div_code) {
		this.div_code = div_code;
	}
	public String getDiv_name() {
		return div_name;
	}
	public void setDiv_name(String div_name) {
		this.div_name = div_name;
	}
	public String getDiv_desc() {
		return div_desc;
	}
	public void setDiv_desc(String div_desc) {
		this.div_desc = div_desc;
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
	
	@Override
	public String toString() {
		return "DivisionExcelFeilds [div_code=" + div_code + ", div_name=" + div_name + ", div_desc=" + div_desc
				+ ", status=" + status + ", custodian=" + custodian + "]";
	}
	
}
