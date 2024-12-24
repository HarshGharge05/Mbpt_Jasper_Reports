package com.jasperRport.entities;

import java.sql.Timestamp;

public class DivisionInformation {
	
	private String div_code;
	private String div_name;
	private String custodian;
	private String status;
	private String div_desc;
	private String forward_to;
	private String update_timestamp;
	private String remark;
	
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
	public String getDiv_desc() {
		return div_desc;
	}
	public void setDiv_desc(String div_desc) {
		this.div_desc = div_desc;
	}
	public String getForward_to() {
		return forward_to;
	}
	public void setForward_to(String forward_to) {
		this.forward_to = forward_to;
	}
	public String getUpdate_timestamp() {
		return update_timestamp;
	}
	public void setUpdate_timestamp(String update_timestamp) {
		this.update_timestamp = update_timestamp;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	@Override
	public String toString() {
		return "DivisionInformation [div_code=" + div_code + ", div_name=" + div_name + ", custodian=" + custodian
				+ ", status=" + status + ", div_desc=" + div_desc + ", forward_to=" + forward_to + ", update_timestamp="
				+ update_timestamp + ", remark=" + remark + "]";
	}
}
