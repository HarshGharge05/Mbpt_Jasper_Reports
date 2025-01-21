package com.jasperRport.entities;

public class ListOfMultipleBreachReportFields {
	
	private String sanctioned_user;
	private String prev_cust_code;
	private String ren_earning;
	private String rent_paid_amount_txt;
	private String party_name;
	private String amount;
	
	public String getSanctioned_user() {
		return sanctioned_user;
	}
	public void setSanctioned_user(String sanctioned_user) {
		this.sanctioned_user = sanctioned_user;
	}
	public String getPrev_cust_code() {
		return prev_cust_code;
	}
	public void setPrev_cust_code(String prev_cust_code) {
		this.prev_cust_code = prev_cust_code;
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
	public String getParty_name() {
		return party_name;
	}
	public void setParty_name(String party_name) {
		this.party_name = party_name;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	
	@Override
	public String toString() {
		return "ListOfMultipleBreachReportFields [sanctioned_user=" + sanctioned_user + ", prev_cust_code="
				+ prev_cust_code + ", ren_earning=" + ren_earning + ", rent_paid_amount_txt=" + rent_paid_amount_txt
				+ ", party_name=" + party_name + ", amount=" + amount + "]";
	}
}
