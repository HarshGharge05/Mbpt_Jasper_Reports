package com.jasperRport.entities;

import java.math.BigDecimal;

public class PlotInformationMainReportFields {
	
	private String div_name;
    private String unit_code;
    private String estate_name;
    private String plot_code;
    private String main_structure_name;
    private BigDecimal area;
    private String street_no;
    private String mcgm_allotted_no;
    private String ward_name;
    private String location;
    private BigDecimal pincode;
    private String city_survey_no;
    private String city_survey_div;
    private Boolean mbpt_road_connectivity;
    private String from_date;
    private String plot_desc;
    private String owner_name;
    private String dept_name;
    private String schedule_north;
    private String schedule_south;
    private String schedule_east;
    private String schedule_west;
    private String reservation;
    private Integer plot_id;
    private String remarks;
    private Boolean created_by_merge;
    private String documents_attached;
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
	public String getPlot_code() {
		return plot_code;
	}
	public void setPlot_code(String plot_code) {
		this.plot_code = plot_code;
	}
	public String getMain_structure_name() {
		return main_structure_name;
	}
	public void setMain_structure_name(String main_structure_name) {
		this.main_structure_name = main_structure_name;
	}
	public BigDecimal getArea() {
		return area;
	}
	public void setArea(BigDecimal row) {
		this.area = row;
	}
	public String getStreet_no() {
		return street_no;
	}
	public void setStreet_no(String street_no) {
		this.street_no = street_no;
	}
	public String getMcgm_allotted_no() {
		return mcgm_allotted_no;
	}
	public void setMcgm_allotted_no(String mcgm_allotted_no) {
		this.mcgm_allotted_no = mcgm_allotted_no;
	}
	public String getWard_name() {
		return ward_name;
	}
	public void setWard_name(String ward_name) {
		this.ward_name = ward_name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public BigDecimal getPincode() {
		return pincode;
	}
	public void setPincode(BigDecimal pincode) {
		this.pincode = pincode;
	}
	public String getCity_survey_no() {
		return city_survey_no;
	}
	public void setCity_survey_no(String city_survey_no) {
		this.city_survey_no = city_survey_no;
	}
	public String getCity_survey_div() {
		return city_survey_div;
	}
	public void setCity_survey_div(String city_survey_div) {
		this.city_survey_div = city_survey_div;
	}
	public Boolean getMbpt_road_connectivity() {
		return mbpt_road_connectivity;
	}
	public void setMbpt_road_connectivity(Boolean row) {
		this.mbpt_road_connectivity = row;
	}
	public String getFrom_date() {
		return from_date;
	}
	public void setFrom_date(String from_date) {
		this.from_date = from_date;
	}
	public String getPlot_desc() {
		return plot_desc;
	}
	public void setPlot_desc(String plot_desc) {
		this.plot_desc = plot_desc;
	}
	public String getOwner_name() {
		return owner_name;
	}
	public void setOwner_name(String owner_name) {
		this.owner_name = owner_name;
	}
	public String getDept_name() {
		return dept_name;
	}
	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}
	public String getSchedule_north() {
		return schedule_north;
	}
	public void setSchedule_north(String schedule_north) {
		this.schedule_north = schedule_north;
	}
	public String getSchedule_south() {
		return schedule_south;
	}
	public void setSchedule_south(String schedule_south) {
		this.schedule_south = schedule_south;
	}
	public String getSchedule_east() {
		return schedule_east;
	}
	public void setSchedule_east(String schedule_east) {
		this.schedule_east = schedule_east;
	}
	public String getSchedule_west() {
		return schedule_west;
	}
	public void setSchedule_west(String schedule_west) {
		this.schedule_west = schedule_west;
	}
	public String getReservation() {
		return reservation;
	}
	public void setReservation(String reservation) {
		this.reservation = reservation;
	}
	public Integer getPlot_id() {
		return plot_id;
	}
	public void setPlot_id(Integer plot_id) {
		this.plot_id = plot_id;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public Boolean getCreated_by_merge() {
		return created_by_merge;
	}
	public void setCreated_by_merge(Boolean created_by_merge) {
		this.created_by_merge = created_by_merge;
	}
	public String getDocuments_attached() {
		return documents_attached;
	}
	public void setDocuments_attached(String documents_attached) {
		this.documents_attached = documents_attached;
	}
	
	@Override
	public String toString() {
		return "PlotInformationMainReportFields [div_name=" + div_name + ", unit_code=" + unit_code + ", estate_name="
				+ estate_name + ", plot_code=" + plot_code + ", main_structure_name=" + main_structure_name + ", area="
				+ area + ", street_no=" + street_no + ", mcgm_allotted_no=" + mcgm_allotted_no + ", ward_name="
				+ ward_name + ", location=" + location + ", pincode=" + pincode + ", city_survey_no=" + city_survey_no
				+ ", city_survey_div=" + city_survey_div + ", mbpt_road_connectivity=" + mbpt_road_connectivity
				+ ", from_date=" + from_date + ", plot_desc=" + plot_desc + ", owner_name=" + owner_name
				+ ", dept_name=" + dept_name + ", schedule_north=" + schedule_north + ", schedule_south="
				+ schedule_south + ", schedule_east=" + schedule_east + ", schedule_west=" + schedule_west
				+ ", reservation=" + reservation + ", plot_id=" + plot_id + ", remarks=" + remarks
				+ ", created_by_merge=" + created_by_merge + ", documents_attached=" + documents_attached + "]";
	}
    
}
