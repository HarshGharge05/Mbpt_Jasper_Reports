package com.jasperRport.entities;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class MonsoonProtectionShedsViewFields {
	
	private String application_no;
    private String form_status;
    private String tenancy_id;
    private String plot_no;
    private String estate;
    private String location;
    private String from_date;
    private String to_date;
    private BigDecimal area;
    private String signature;
    private Timestamp update_timestamp;
    private String verification_remarks;
    
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
	public String getEstate() {
		return estate;
	}
	public void setEstate(String estate) {
		this.estate = estate;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
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
	public BigDecimal getArea() {
		return area;
	}
	public void setArea(BigDecimal area) {
		this.area = area;
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
	public String getVerification_remarks() {
		return verification_remarks;
	}
	public void setVerification_remarks(String verification_remarks) {
		this.verification_remarks = verification_remarks;
	}
	
	@Override
	public String toString() {
		return "MonsoonProtectionShedsViewFields [application_no=" + application_no + ", form_status=" + form_status
				+ ", tenancy_id=" + tenancy_id + ", plot_no=" + plot_no + ", estate=" + estate + ", location="
				+ location + ", from_date=" + from_date + ", to_date=" + to_date + ", area=" + area + ", signature="
				+ signature + ", update_timestamp=" + update_timestamp + ", verification_remarks="
				+ verification_remarks + "]";
	}
}
