package com.jasperRport.entities;

public class UnitInformationListOfEstate {
	
	private String estate_code;
	private String estate_name;
	private String estate_desc;
	private String status;
	
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		return "UnitInformationListOfEstate [estate_code=" + estate_code + ", estate_name=" + estate_name
				+ ", estate_desc=" + estate_desc + ", status=" + status + "]";
	}
}
