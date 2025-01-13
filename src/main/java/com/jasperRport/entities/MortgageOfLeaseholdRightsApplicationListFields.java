package com.jasperRport.entities;

import java.sql.Date;
import java.sql.Timestamp;

public class MortgageOfLeaseholdRightsApplicationListFields {
	
	private String application_no;
	private Timestamp update_timestamp;
	private String tenancy_id;
	private String plot_no;
	private String mortgagor;
	private String mortgagee;
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
	public String getPlot_no() {
		return plot_no;
	}
	public void setPlot_no(String plot_no) {
		this.plot_no = plot_no;
	}
	public String getMortgagor() {
		return mortgagor;
	}
	public void setMortgagor(String mortgagor) {
		this.mortgagor = mortgagor;
	}
	public String getMortgagee() {
		return mortgagee;
	}
	public void setMortgagee(String mortgagee) {
		this.mortgagee = mortgagee;
	}
	public String getForm_status() {
		return form_status;
	}
	public void setForm_status(String form_status) {
		this.form_status = form_status;
	}
	
	@Override
	public String toString() {
		return "MortgageOfLeaseholdRightsApplicationListFields [application_no=" + application_no
				+ ", update_timestamp=" + update_timestamp + ", tenancy_id=" + tenancy_id + ", plot_no=" + plot_no
				+ ", mortgagor=" + mortgagor + ", mortgagee=" + mortgagee + ", form_status=" + form_status + "]";
	}
}
