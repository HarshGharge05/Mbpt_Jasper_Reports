package com.jasperRport.entities;

import java.math.BigDecimal;

public class SurveyReportInformationFloorObservationListFields {
	
	private String floor_no;
	private BigDecimal main_structure;
	private BigDecimal mezzanine_floor;
	private String others;
	private BigDecimal others_area;
	private BigDecimal area_not_in_fsi;
	private String area_not_considered_fsi_justify;
	private BigDecimal home_occupation;
	private BigDecimal non_home_occupation;
	private BigDecimal sum;
	
	public String getFloor_no() {
		return floor_no;
	}
	public void setFloor_no(String floor_no) {
		this.floor_no = floor_no;
	}
	public BigDecimal getMain_structure() {
		return main_structure;
	}
	public void setMain_structure(BigDecimal main_structure) {
		this.main_structure = main_structure;
	}
	public BigDecimal getMezzanine_floor() {
		return mezzanine_floor;
	}
	public void setMezzanine_floor(BigDecimal mezzanine_floor) {
		this.mezzanine_floor = mezzanine_floor;
	}
	public String getOthers() {
		return others;
	}
	public void setOthers(String others) {
		this.others = others;
	}
	public BigDecimal getOthers_area() {
		return others_area;
	}
	public void setOthers_area(BigDecimal others_area) {
		this.others_area = others_area;
	}
	public BigDecimal getArea_not_in_fsi() {
		return area_not_in_fsi;
	}
	public void setArea_not_in_fsi(BigDecimal area_not_in_fsi) {
		this.area_not_in_fsi = area_not_in_fsi;
	}
	public String getArea_not_considered_fsi_justify() {
		return area_not_considered_fsi_justify;
	}
	public void setArea_not_considered_fsi_justify(String area_not_considered_fsi_justify) {
		this.area_not_considered_fsi_justify = area_not_considered_fsi_justify;
	}
	public BigDecimal getHome_occupation() {
		return home_occupation;
	}
	public void setHome_occupation(BigDecimal home_occupation) {
		this.home_occupation = home_occupation;
	}
	public BigDecimal getNon_home_occupation() {
		return non_home_occupation;
	}
	public void setNon_home_occupation(BigDecimal non_home_occupation) {
		this.non_home_occupation = non_home_occupation;
	}
	public BigDecimal getSum() {
		return sum;
	}
	public void setSum(BigDecimal sum) {
		this.sum = sum;
	}
	
	@Override
	public String toString() {
		return "SurveyReportInformationFloorObservationListFields [floor_no=" + floor_no + ", main_structure="
				+ main_structure + ", mezzanine_floor=" + mezzanine_floor + ", others=" + others + ", others_area="
				+ others_area + ", area_not_in_fsi=" + area_not_in_fsi + ", area_not_considered_fsi_justify="
				+ area_not_considered_fsi_justify + ", home_occupation=" + home_occupation + ", non_home_occupation="
				+ non_home_occupation + ", sum=" + sum + "]";
	}
}
