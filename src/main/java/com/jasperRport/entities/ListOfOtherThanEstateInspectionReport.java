package com.jasperRport.entities;

import java.sql.Date;

public class ListOfOtherThanEstateInspectionReport {
	
	private String div_name;
	private String unit_code;
	private String estate_name;
	private String plot_location;
	private String let_out_name;
	private String insp_type;
	private Date inspection_date;
	private Date observation_date;
	private String person_at_site;
	
	public String getDiv_name() {
		return div_name;
	}
	public void setDiv_name(String div_name) {
		this.div_name = div_name;
	}
	public String getUnit_code() {
		return unit_code;
	}
	public void setUnit_code(String unit_code) {
		this.unit_code = unit_code;
	}
	public String getEstate_name() {
		return estate_name;
	}
	public void setEstate_name(String estate_name) {
		this.estate_name = estate_name;
	}
	public String getPlot_location() {
		return plot_location;
	}
	public void setPlot_location(String plot_location) {
		this.plot_location = plot_location;
	}
	public String getLet_out_name() {
		return let_out_name;
	}
	public void setLet_out_name(String let_out_name) {
		this.let_out_name = let_out_name;
	}
	public String getInsp_type() {
		return insp_type;
	}
	public void setInsp_type(String insp_type) {
		this.insp_type = insp_type;
	}
	public Date getInspection_date() {
		return inspection_date;
	}
	public void setInspection_date(Date inspection_date) {
		this.inspection_date = inspection_date;
	}
	public Date getObservation_date() {
		return observation_date;
	}
	public void setObservation_date(Date observation_date) {
		this.observation_date = observation_date;
	}
	public String getPerson_at_site() {
		return person_at_site;
	}
	public void setPerson_at_site(String person_at_site) {
		this.person_at_site = person_at_site;
	}
	
	@Override
	public String toString() {
		return "ListOfOtherThanEstateInspectionReport [div_name=" + div_name + ", unit_code=" + unit_code
				+ ", estate_name=" + estate_name + ", plot_location=" + plot_location + ", let_out_name=" + let_out_name
				+ ", insp_type=" + insp_type + ", inspection_date=" + inspection_date + ", observation_date="
				+ observation_date + ", person_at_site=" + person_at_site + "]";
	}
}
