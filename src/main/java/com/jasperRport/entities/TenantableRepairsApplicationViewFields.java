package com.jasperRport.entities;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class TenantableRepairsApplicationViewFields {
	
	private String application_no;
    private String form_status;
    private String tenancy_id;
    private String name;
    private String sanctioned_user;
    private String structure_type;
    private String year;
    private String listofrepair;
    private String area_affected;
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
	public String getTenancy_id() {
		return tenancy_id;
	}
	public void setTenancy_id(String tenancy_id) {
		this.tenancy_id = tenancy_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSanctioned_user() {
		return sanctioned_user;
	}
	public void setSanctioned_user(String sanctioned_user) {
		this.sanctioned_user = sanctioned_user;
	}
	public String getStructure_type() {
		return structure_type;
	}
	public void setStructure_type(String structure_type) {
		this.structure_type = structure_type;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getListofrepair() {
		return listofrepair;
	}
	public void setListofrepair(String listofrepair) {
		this.listofrepair = listofrepair;
	}
	public String getArea_affected() {
		return area_affected;
	}
	public void setArea_affected(String area_affected) {
		this.area_affected = area_affected;
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
		return "TenantableRepairsApplicationViewFields [application_no=" + application_no + ", form_status="
				+ form_status + ", tenancy_id=" + tenancy_id + ", name=" + name + ", sanctioned_user=" + sanctioned_user
				+ ", structure_type=" + structure_type + ", year=" + year + ", listofrepair=" + listofrepair
				+ ", area_affected=" + area_affected + ", verification_remarks=" + verification_remarks + ", signature="
				+ signature + ", update_timestamp=" + update_timestamp + "]";
	}
}
