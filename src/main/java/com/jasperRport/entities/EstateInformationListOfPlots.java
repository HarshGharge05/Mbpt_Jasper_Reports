package com.jasperRport.entities;

public class EstateInformationListOfPlots {
	
	private String rr_no;
	private String plot_code;
	private String customer_code;
	private String plot_desc;
	private String status;
	
	public String getRr_no() {
		return rr_no;
	}
	public void setRr_no(String rr_no) {
		this.rr_no = rr_no;
	}
	public String getPlot_code() {
		return plot_code;
	}
	public void setPlot_code(String plot_code) {
		this.plot_code = plot_code;
	}
	public String getCustomer_code() {
		return customer_code;
	}
	public void setCustomer_code(String customer_code) {
		this.customer_code = customer_code;
	}
	public String getPlot_desc() {
		return plot_desc;
	}
	public void setPlot_desc(String plot_desc) {
		this.plot_desc = plot_desc;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		return "EstateInformationListOfPlots [rr_no=" + rr_no + ", plot_code=" + plot_code + ", customer_code="
				+ customer_code + ", plot_desc=" + plot_desc + ", status=" + status + "]";
	}
}
