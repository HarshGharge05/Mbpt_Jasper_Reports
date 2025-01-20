package com.jasperRport.entities;

import java.sql.Timestamp;

public class TenantableRepairsApplicationListFields {
	
	private String application_no;
    private Timestamp update_timestamp;
    private String tenancy_id;
    private String listofrepair;
    private String year;
    private String form_status;
    
	public String getApplication_no() {
		return application_no;
	}
	public void setApplication_no(String application_no) {
		this.application_no = application_no;
	}
	public Timestamp getUpdate_timestamp() {
		return update_timestamp;
	}
	public void setUpdate_timestamp(Timestamp update_timestamp) {
		this.update_timestamp = update_timestamp;
	}
	public String getTenancy_id() {
		return tenancy_id;
	}
	public void setTenancy_id(String tenancy_id) {
		this.tenancy_id = tenancy_id;
	}
	public String getListofrepair() {
		return listofrepair;
	}
	public void setListofrepair(String listofrepair) {
		this.listofrepair = listofrepair;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getForm_status() {
		return form_status;
	}
	public void setForm_status(String form_status) {
		this.form_status = form_status;
	}
	
	@Override
	public String toString() {
		return "TenantableRepairsApplicationListFields [application_no=" + application_no + ", update_timestamp="
				+ update_timestamp + ", tenancy_id=" + tenancy_id + ", listofrepair=" + listofrepair + ", year=" + year
				+ ", form_status=" + form_status + "]";
	}
}
