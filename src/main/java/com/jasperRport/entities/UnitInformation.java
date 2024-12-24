package com.jasperRport.entities;

public class UnitInformation {
	
	private String div_name;
	private String unit_id;
	private String custodian;
	private String status;
	private String unit_desc;
	private String update_timestamp;
	private String attached_document;
	private String forwardTo;
	private String remark;
	
	public String getDiv_name() {
		return div_name;
	}
	public void setDiv_name(String div_name) {
		this.div_name = div_name;
	}
	public String getUnit_id() {
		return unit_id;
	}
	public void setUnit_id(String unit_id) {
		this.unit_id = unit_id;
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
	public String getUnit_desc() {
		return unit_desc;
	}
	public void setUnit_desc(String unit_desc) {
		this.unit_desc = unit_desc;
	}
	public String getUpdate_timestamp() {
		return update_timestamp;
	}
	public void setUpdate_timestamp(String update_timestamp) {
		this.update_timestamp = update_timestamp;
	}
	public String getAttached_document() {
		return attached_document;
	}
	public void setAttached_document(String attached_document) {
		this.attached_document = attached_document;
	}
	public String getForwardTo() {
		return forwardTo;
	}
	public void setForwardTo(String forwardTo) {
		this.forwardTo = forwardTo;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	@Override
	public String toString() {
		return "UnitInformation [div_name=" + div_name + ", unit_id=" + unit_id + ", custodian=" + custodian
				+ ", status=" + status + ", unit_desc=" + unit_desc + ", update_timestamp=" + update_timestamp
				+ ", attached_document=" + attached_document + ", forwardTo=" + forwardTo + ", remark=" + remark + "]";
	}
}
