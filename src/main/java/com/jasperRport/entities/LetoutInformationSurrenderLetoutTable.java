package com.jasperRport.entities;

import java.sql.Date;

public class LetoutInformationSurrenderLetoutTable {

	private String tenancy_id;
	private Integer letout_id;
	private String from_date;
	private String to_date;
	private Date surrender_date;
	private String surrender_remark;
	
	public String getTenancy_id() {
		return tenancy_id;
	}
	public void setTenancy_id(String tenancy_id) {
		this.tenancy_id = tenancy_id;
	}
	public Integer getLetout_id() {
		return letout_id;
	}
	public void setLetout_id(Integer letout_id) {
		this.letout_id = letout_id;
	}
	public String getFrom_date() {
		return from_date;
	}
	public void setFrom_date(String from_date) {
		this.from_date = from_date;
	}
	public String getTo_date() {
		return to_date;
	}
	public void setTo_date(String to_date) {
		this.to_date = to_date;
	}
	public Date getSurrender_date() {
		return surrender_date;
	}
	public void setSurrender_date(Date surrender_date) {
		this.surrender_date = surrender_date;
	}
	public String getSurrender_remark() {
		return surrender_remark;
	}
	public void setSurrender_remark(String surrender_remark) {
		this.surrender_remark = surrender_remark;
	}
	
	@Override
	public String toString() {
		return "LetoutInformationSurrenderLetout [tenancy_id=" + tenancy_id + ", letout_id=" + letout_id
				+ ", from_date=" + from_date + ", to_date=" + to_date + ", surrender_date=" + surrender_date
				+ ", surrender_remark=" + surrender_remark + "]";
	}
}
