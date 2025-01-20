package com.jasperRport.entities;

import java.sql.Timestamp;

public class GrantFreshLeaseApplicationListFields {
	
	private String application_no;
	private Timestamp update_timestamp;
	private String estate;
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
	public String getEstate() {
		return estate;
	}
	public void setEstate(String estate) {
		this.estate = estate;
	}
	public String getForm_status() {
		return form_status;
	}
	public void setForm_status(String form_status) {
		this.form_status = form_status;
	}
	
	@Override
	public String toString() {
		return "GrantFreshLeaseApplicationListFields [application_no=" + application_no + ", update_timestamp="
				+ update_timestamp + ", estate=" + estate + ", form_status=" + form_status + "]";
	}
}	
