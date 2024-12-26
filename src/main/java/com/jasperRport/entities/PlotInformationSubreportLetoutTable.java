package com.jasperRport.entities;

public class PlotInformationSubreportLetoutTable {
	
	private String let_out_name;
	private String let_out_desc;
	private String layout_type_id;
	private String allotment_status;
	private String status;
	
	public String getLet_out_name() {
		return let_out_name;
	}
	public void setLet_out_name(String let_out_name) {
		this.let_out_name = let_out_name;
	}
	public String getLet_out_desc() {
		return let_out_desc;
	}
	public void setLet_out_desc(String let_out_desc) {
		this.let_out_desc = let_out_desc;
	}
	public String getLayout_type_id() {
		return layout_type_id;
	}
	public void setLayout_type_id(String layout_type_id) {
		this.layout_type_id = layout_type_id;
	}
	public String getAllotment_status() {
		return allotment_status;
	}
	public void setAllotment_status(String allotment_status) {
		this.allotment_status = allotment_status;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		return "PlotInformationSubreportLetoutTable [let_out_name=" + let_out_name + ", let_out_desc=" + let_out_desc
				+ ", layout_type_id=" + layout_type_id + ", allotment_status=" + allotment_status + ", status=" + status
				+ "]";
	}
}
