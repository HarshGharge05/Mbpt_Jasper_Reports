package com.jasperRport.entities;

public class EstateInformation {
	
	private String estate_code;
	private String estate_name;
	private String estate_desc;
	private String update_timestamp;
	private String status;
	private String unit_code;
	private String name;
	private String div_name;
	private String remark;
	private String custodian;
	
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
	public String getEstate_desc() {
		return estate_desc;
	}
	public void setEstate_desc(String estate_desc) {
		this.estate_desc = estate_desc;
	}
	public String getUpdate_timestamp() {
		return update_timestamp;
	}
	public void setUpdate_timestamp(String update_timestamp) {
		this.update_timestamp = update_timestamp;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getUnit_code() {
		return unit_code;
	}
	public void setUnit_code(String unit_code) {
		this.unit_code = unit_code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDiv_name() {
		return div_name;
	}
	public void setDiv_name(String div_name) {
		this.div_name = div_name;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getCustodian() {
		return custodian;
	}
	public void setCustodian(String custodian) {
		this.custodian = custodian;
	}
	
	@Override
	public String toString() {
		return "EstateInformation [estate_code=" + estate_code + ", estate_name=" + estate_name + ", estate_desc="
				+ estate_desc + ", update_timestamp=" + update_timestamp + ", status=" + status + ", unit_code="
				+ unit_code + ", name=" + name + ", div_name=" + div_name + ", remark=" + remark + ", custodian="
				+ custodian + "]";
	}
}
