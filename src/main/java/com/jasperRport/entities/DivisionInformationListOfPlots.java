package com.jasperRport.entities;

public class DivisionInformationListOfPlots {
	
	private String unit_code;
	private String mbpt_unit_id;
	private String unit_desc;
	private String status;
	
	public String getUnit_code() {
		return unit_code;
	}
	public void setUnit_code(String unit_code) {
		this.unit_code = unit_code;
	}
	public String getMbpt_unit_id() {
		return mbpt_unit_id;
	}
	public void setMbpt_unit_id(String mbpt_unit_id) {
		this.mbpt_unit_id = mbpt_unit_id;
	}
	public String getUnit_desc() {
		return unit_desc;
	}
	public void setUnit_desc(String unit_desc) {
		this.unit_desc = unit_desc;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		return "DivisionInformationListOfPlots [unit_code=" + unit_code + ", mbpt_unit_id=" + mbpt_unit_id
				+ ", unit_desc=" + unit_desc + ", status=" + status + "]";
	}
}
