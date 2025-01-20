package com.jasperRport.entities;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class TemporaryUsePermissionApplicationViewFields {
	
	private String application_no;
    private String form_status;
    private String applicant_name;
    private String location_for_storage;
    private String estate;
    private BigDecimal area;
    private String from_date;
    private String to_date;
    private String purpose;
    private String pan_no;
    private String verification_remarks;
    private String signature;
    private Timestamp update_timestamp;
    
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
	public String getApplicant_name() {
		return applicant_name;
	}
	public void setApplicant_name(String applicant_name) {
		this.applicant_name = applicant_name;
	}
	public String getLocation_for_storage() {
		return location_for_storage;
	}
	public void setLocation_for_storage(String location_for_storage) {
		this.location_for_storage = location_for_storage;
	}
	public String getEstate() {
		return estate;
	}
	public void setEstate(String estate) {
		this.estate = estate;
	}
	public BigDecimal getArea() {
		return area;
	}
	public void setArea(BigDecimal area) {
		this.area = area;
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
	public String getPurpose() {
		return purpose;
	}
	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}
	public String getPan_no() {
		return pan_no;
	}
	public void setPan_no(String pan_no) {
		this.pan_no = pan_no;
	}
	public String getVerification_remarks() {
		return verification_remarks;
	}
	public void setVerification_remarks(String verification_remarks) {
		this.verification_remarks = verification_remarks;
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
		return "TemporaryUsePermissionApplicationViewFields [application_no=" + application_no + ", form_status="
				+ form_status + ", applicant_name=" + applicant_name + ", location_for_storage=" + location_for_storage
				+ ", estate=" + estate + ", area=" + area + ", from_date=" + from_date + ", to_date=" + to_date
				+ ", purpose=" + purpose + ", pan_no=" + pan_no + ", verification_remarks=" + verification_remarks
				+ ", signature=" + signature + ", update_timestamp=" + update_timestamp + "]";
	}
}
