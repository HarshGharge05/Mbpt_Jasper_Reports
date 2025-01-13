package com.jasperRport.entities;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Timestamp;

public class MortgageOfLeaseholdRightsApplicationViewFields {
	
	private String application_no;
	private String form_status;
	private String tenancy_id;
	private String plot_no;
	private String estate;
	private String mortgagor;
	private String mortgagee;
	private String name_of_org;
	private BigDecimal area_for_noc;
	private BigInteger tenure;
	private BigDecimal amount_for_loan;
	private String purpose_of_mortgage;
	private String form_date;
	private String to_date;
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
	public String getName_of_org() {
		return name_of_org;
	}
	public void setName_of_org(String name_of_org) {
		this.name_of_org = name_of_org;
	}
	public BigDecimal getArea_for_noc() {
		return area_for_noc;
	}
	public void setArea_for_noc(BigDecimal area_for_noc) {
		this.area_for_noc = area_for_noc;
	}
	public BigInteger getTenure() {
		return tenure;
	}
	public void setTenure(BigInteger tenure) {
		this.tenure = tenure;
	}
	public BigDecimal getAmount_for_loan() {
		return amount_for_loan;
	}
	public void setAmount_for_loan(BigDecimal amount_for_loan) {
		this.amount_for_loan = amount_for_loan;
	}
	public String getPurpose_of_mortgage() {
		return purpose_of_mortgage;
	}
	public void setPurpose_of_mortgage(String purpose_of_mortgage) {
		this.purpose_of_mortgage = purpose_of_mortgage;
	}
	public String getForm_date() {
		return form_date;
	}
	public void setForm_date(String form_date) {
		this.form_date = form_date;
	}
	public String getTo_date() {
		return to_date;
	}
	public void setTo_date(String to_date) {
		this.to_date = to_date;
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
		return "MortgageOfLeaseholdRightsApplicationViewFields [application_no=" + application_no + ", form_status="
				+ form_status + ", tenancy_id=" + tenancy_id + ", plot_no=" + plot_no + ", estate=" + estate
				+ ", mortgagor=" + mortgagor + ", mortgagee=" + mortgagee + ", name_of_org=" + name_of_org
				+ ", area_for_noc=" + area_for_noc + ", tenure=" + tenure + ", amount_for_loan=" + amount_for_loan
				+ ", purpose_of_mortgage=" + purpose_of_mortgage + ", form_date=" + form_date + ", to_date=" + to_date
				+ ", verification_remarks=" + verification_remarks + ", signature=" + signature + ", update_timestamp="
				+ update_timestamp + "]";
	}
}
