package com.jasperRport.entities;

public class PlotInformationSubreportMergeLetoutTable {

	private Integer let_out_id;
	private String let_out_name;
	private String billable_area;
	private String let_out_desc;
	
	public Integer getLet_out_id() {
		return let_out_id;
	}
	public void setLet_out_id(Integer let_out_id) {
		this.let_out_id = let_out_id;
	}
	public String getLet_out_name() {
		return let_out_name;
	}
	public void setLet_out_name(String let_out_name) {
		this.let_out_name = let_out_name;
	}
	public String getBillable_area() {
		return billable_area;
	}
	public void setBillable_area(String billable_area) {
		this.billable_area = billable_area;
	}
	public String getLet_out_desc() {
		return let_out_desc;
	}
	public void setLet_out_desc(String let_out_desc) {
		this.let_out_desc = let_out_desc;
	}
	
	@Override
	public String toString() {
		return "PlotInformationSubreportMergeLetoutTable [let_out_id=" + let_out_id + ", let_out_name=" + let_out_name
				+ ", billable_area=" + billable_area + ", let_out_desc=" + let_out_desc + "]";
	}
}
