package com.jasperRport.entities;

import java.math.BigDecimal;
import java.sql.Date;

public class InspectionReportInformationTableFields {
	
	private String constr_type;
	private BigDecimal area;
	private Date detection_date;
	private String location_unauth;
	private String remarks;
	
	public String getConstr_type() {
		return constr_type;
	}
	public void setConstr_type(String constr_type) {
		this.constr_type = constr_type;
	}
	public BigDecimal getArea() {
		return area;
	}
	public void setArea(BigDecimal area) {
		this.area = area;
	}
	public Date getDetection_date() {
		return detection_date;
	}
	public void setDetection_date(Date detection_date) {
		this.detection_date = detection_date;
	}
	public String getLocation_unauth() {
		return location_unauth;
	}
	public void setLocation_unauth(String location_unauth) {
		this.location_unauth = location_unauth;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
	@Override
	public String toString() {
		return "InspectionReportInformationTableFields [constr_type=" + constr_type + ", area=" + area
				+ ", detection_date=" + detection_date + ", location_unauth=" + location_unauth + ", remarks=" + remarks
				+ "]";
	}
}
