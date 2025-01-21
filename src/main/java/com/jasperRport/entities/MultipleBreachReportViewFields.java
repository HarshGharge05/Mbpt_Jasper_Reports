package com.jasperRport.entities;

import java.sql.Timestamp;

public class MultipleBreachReportViewFields {
	
	private String prev_cust_code;
	private String party_name;
	private String area;
	private String rr_no;
	private String tenure;
	private Timestamp contractual_rent_on;
	private String addl_rent;
	private String sanctioned_user;
	private String ren_earning;
	private String rent_paid_amount_txt;
	
	public String getPrev_cust_code() {
		return prev_cust_code;
	}
	public void setPrev_cust_code(String prev_cust_code) {
		this.prev_cust_code = prev_cust_code;
	}
	public String getParty_name() {
		return party_name;
	}
	public void setParty_name(String party_name) {
		this.party_name = party_name;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getRr_no() {
		return rr_no;
	}
	public void setRr_no(String rr_no) {
		this.rr_no = rr_no;
	}
	public String getTenure() {
		return tenure;
	}
	public void setTenure(String tenure) {
		this.tenure = tenure;
	}
	public Timestamp getContractual_rent_on() {
		return contractual_rent_on;
	}
	public void setContractual_rent_on(Timestamp contractual_rent_on) {
		this.contractual_rent_on = contractual_rent_on;
	}
	public String getAddl_rent() {
		return addl_rent;
	}
	public void setAddl_rent(String addl_rent) {
		this.addl_rent = addl_rent;
	}
	public String getSanctioned_user() {
		return sanctioned_user;
	}
	public void setSanctioned_user(String sanctioned_user) {
		this.sanctioned_user = sanctioned_user;
	}
	public String getRen_earning() {
		return ren_earning;
	}
	public void setRen_earning(String ren_earning) {
		this.ren_earning = ren_earning;
	}
	public String getRent_paid_amount_txt() {
		return rent_paid_amount_txt;
	}
	public void setRent_paid_amount_txt(String rent_paid_amount_txt) {
		this.rent_paid_amount_txt = rent_paid_amount_txt;
	}
	
	@Override
	public String toString() {
		return "BreachReportViewFields [prev_cust_code=" + prev_cust_code + ", party_name=" + party_name + ", area="
				+ area + ", rr_no=" + rr_no + ", tenure=" + tenure + ", contractual_rent_on=" + contractual_rent_on
				+ ", addl_rent=" + addl_rent + ", sanctioned_user=" + sanctioned_user + ", ren_earning=" + ren_earning
				+ ", rent_paid_amount_txt=" + rent_paid_amount_txt + "]";
	}
}
