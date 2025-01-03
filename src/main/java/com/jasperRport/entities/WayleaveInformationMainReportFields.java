package com.jasperRport.entities;

import java.math.BigDecimal;

public class WayleaveInformationMainReportFields {

	private String origin_estate_name;
	private String terminating_estate_name;
	private String wyl_type;
	private String wyl_facility;
	private String wyl_instl_type;
	private BigDecimal supervision_charge_amount;
	private BigDecimal pipeline_length;
	private Boolean is_supervision_charge;
	private String wyl_desc;
	private String remarks;
	private String name;
	private Boolean is_min_guarantee;
	
	public String getOrigin_estate_name() {
		return origin_estate_name;
	}
	public void setOrigin_estate_name(String origin_estate_name) {
		this.origin_estate_name = origin_estate_name;
	}
	public String getTerminating_estate_name() {
		return terminating_estate_name;
	}
	public void setTerminating_estate_name(String terminating_estate_name) {
		this.terminating_estate_name = terminating_estate_name;
	}
	public String getWyl_type() {
		return wyl_type;
	}
	public void setWyl_type(String wyl_type) {
		this.wyl_type = wyl_type;
	}
	public String getWyl_facility() {
		return wyl_facility;
	}
	public void setWyl_facility(String wyl_facility) {
		this.wyl_facility = wyl_facility;
	}
	public String getWyl_instl_type() {
		return wyl_instl_type;
	}
	public void setWyl_instl_type(String wyl_instl_type) {
		this.wyl_instl_type = wyl_instl_type;
	}
	public BigDecimal getSupervision_charge_amount() {
		return supervision_charge_amount;
	}
	public void setSupervision_charge_amount(BigDecimal supervision_charge_amount) {
		this.supervision_charge_amount = supervision_charge_amount;
	}
	public BigDecimal getPipeline_length() {
		return pipeline_length;
	}
	public void setPipeline_length(BigDecimal pipeline_length) {
		this.pipeline_length = pipeline_length;
	}
	public Boolean getIs_supervision_charge() {
		return is_supervision_charge;
	}
	public void setIs_supervision_charge(Boolean is_supervision_charge) {
		this.is_supervision_charge = is_supervision_charge;
	}
	public String getWyl_desc() {
		return wyl_desc;
	}
	public void setWyl_desc(String wyl_desc) {
		this.wyl_desc = wyl_desc;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Boolean getIs_min_guarantee() {
		return is_min_guarantee;
	}
	public void setIs_min_guarantee(Boolean is_min_guarantee) {
		this.is_min_guarantee = is_min_guarantee;
	}
	
	@Override
	public String toString() {
		return "WayleaveInformationMainReportFields [origin_estate_name=" + origin_estate_name
				+ ", terminating_estate_name=" + terminating_estate_name + ", wyl_type=" + wyl_type + ", wyl_facility="
				+ wyl_facility + ", wyl_instl_type=" + wyl_instl_type + ", supervision_charge_amount="
				+ supervision_charge_amount + ", pipeline_length=" + pipeline_length + ", is_supervision_charge="
				+ is_supervision_charge + ", wyl_desc=" + wyl_desc + ", remarks=" + remarks + ", name=" + name
				+ ", is_min_guarantee=" + is_min_guarantee + "]";
	}
}
