package com.jasperRport.entities;

import java.math.BigDecimal;
import java.sql.Date;

public class PlotReportField {
	
	private String plot_code;
	private String customer_name;
	private String div_name;
	private Integer unit_id;
	private String estate_name;
	private Integer plot_id;
	private String rr_no;
	private String street_no;
	private String main_structure_name;
	private String mcgm_allotted_no;
	private String mcgm_ward_name;
	private String location;
	private BigDecimal area;
	private String status;
	private String customer_code;
	private Date from_date;
	private Date to_date;
	
	public String getPlot_code() {
		return plot_code;
	}
	public void setPlot_code(String plot_code) {
		this.plot_code = plot_code;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public String getDiv_name() {
		return div_name;
	}
	public void setDiv_name(String div_name) {
		this.div_name = div_name;
	}
	public Integer getUnit_id() {
		return unit_id;
	}
	public void setUnit_id(Integer unit_id) {
		this.unit_id = unit_id;
	}
	public String getEstate_name() {
		return estate_name;
	}
	public void setEstate_name(String estate_name) {
		this.estate_name = estate_name;
	}
	public Integer getPlot_id() {
		return plot_id;
	}
	public void setPlot_id(Integer plot_id) {
		this.plot_id = plot_id;
	}
	public String getRr_no() {
		return rr_no;
	}
	public void setRr_no(String rr_no) {
		this.rr_no = rr_no;
	}
	public String getStreet_no() {
		return street_no;
	}
	public void setStreet_no(String street_no) {
		this.street_no = street_no;
	}
	public String getMain_structure_name() {
		return main_structure_name;
	}
	public void setMain_structure_name(String main_structure_name) {
		this.main_structure_name = main_structure_name;
	}
	public String getMcgm_allotted_no() {
		return mcgm_allotted_no;
	}
	public void setMcgm_allotted_no(String mcgm_allotted_no) {
		this.mcgm_allotted_no = mcgm_allotted_no;
	}
	public String getMcgm_ward_name() {
		return mcgm_ward_name;
	}
	public void setMcgm_ward_name(String mcgm_ward_name) {
		this.mcgm_ward_name = mcgm_ward_name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public BigDecimal getArea() {
		return area;
	}
	public void setArea(BigDecimal area) {
		this.area = area;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCustomer_code() {
		return customer_code;
	}
	public void setCustomer_code(String customer_code) {
		this.customer_code = customer_code;
	}
	public Date getFrom_date() {
		return from_date;
	}
	public void setFrom_date(Date from_date) {
		this.from_date = from_date;
	}
	public Date getTo_date() {
		return to_date;
	}
	public void setTo_date(Date to_date) {
		this.to_date = to_date;
	}
	
	@Override
	public String toString() {
		return "PlotReportField [plot_code=" + plot_code + ", customer_name=" + customer_name + ", div_name=" + div_name
				+ ", unit_id=" + unit_id + ", estate_name=" + estate_name + ", plot_id=" + plot_id + ", rr_no=" + rr_no
				+ ", street_no=" + street_no + ", main_structure_name=" + main_structure_name + ", mcgm_allotted_no="
				+ mcgm_allotted_no + ", mcgm_ward_name=" + mcgm_ward_name + ", location=" + location + ", area=" + area
				+ ", status=" + status + ", customer_code=" + customer_code + ", from_date=" + from_date + ", to_date="
				+ to_date + "]";
	}
	
}
