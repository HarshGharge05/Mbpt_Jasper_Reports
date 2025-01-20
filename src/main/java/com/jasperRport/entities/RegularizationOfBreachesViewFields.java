package com.jasperRport.entities;

import java.sql.Timestamp;

public class RegularizationOfBreachesViewFields {
	
	private String estate;
    private String plot_no;
    private String tenancy_id;
    private String application_no;
    private String form_status;
    private String signature;
    private Timestamp update_timestamp;
    
	public String getEstate() {
		return estate;
	}
	public void setEstate(String estate) {
		this.estate = estate;
	}
	public String getPlot_no() {
		return plot_no;
	}
	public void setPlot_no(String plot_no) {
		this.plot_no = plot_no;
	}
	public String getTenancy_id() {
		return tenancy_id;
	}
	public void setTenancy_id(String tenancy_id) {
		this.tenancy_id = tenancy_id;
	}
	public String getApplication_no() {
		return application_no;
	}
	public void setApplication_no(String application_no) {
		this.application_no = application_no;
	}
	public String getForm_status() {
		return form_status;
	}
	public void setForm_status(String form_status) {
		this.form_status = form_status;
	}
	public String getSignature() {
		return signature;
	}
	public void setSignature(String signature) {
		this.signature = signature;
	}
	public Timestamp getUpdate_timestamp() {
		return update_timestamp;
	}
	public void setUpdate_timestamp(Timestamp update_timestamp) {
		this.update_timestamp = update_timestamp;
	}
	
	@Override
	public String toString() {
		return "RegularizationOfBreachesViewFields [estate=" + estate + ", plot_no=" + plot_no + ", tenancy_id="
				+ tenancy_id + ", application_no=" + application_no + ", form_status=" + form_status + ", signature="
				+ signature + ", update_timestamp=" + update_timestamp + "]";
	}
}
