package com.jasperRport.entities;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class GrantFreshLeaseApplicationViewFields {

	private String plot;
	private String tenancy_id;
	private BigDecimal period_of_lease;
	private String application_no;
	private String form_status;
	private String signature;
	private Timestamp update_timestamp;
	
	public String getPlot() {
		return plot;
	}
	public void setPlot(String plot) {
		this.plot = plot;
	}
	public String getTenancy_id() {
		return tenancy_id;
	}
	public void setTenancy_id(String tenancy_id) {
		this.tenancy_id = tenancy_id;
	}
	public BigDecimal getPeriod_of_lease() {
		return period_of_lease;
	}
	public void setPeriod_of_lease(BigDecimal period_of_lease) {
		this.period_of_lease = period_of_lease;
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
		return "GrantFreshLeaseApplicationView [plot=" + plot + ", tenancy_id=" + tenancy_id + ", period_of_lease="
				+ period_of_lease + ", application_no=" + application_no + ", form_status=" + form_status
				+ ", signature=" + signature + ", update_timestamp=" + update_timestamp + "]";
	}
}
