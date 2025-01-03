package com.jasperRport.entities;

import java.math.BigDecimal;
import java.sql.Date;

public class LetoutInformationBuiltUpAreaTable {
	
	private BigDecimal built_up_area_commercial;
	private BigDecimal built_up_area_rec;
	private BigDecimal consumed_fsi;
	private Date from_date;
	
	public BigDecimal getBuilt_up_area_commercial() {
		return built_up_area_commercial;
	}
	public void setBuilt_up_area_commercial(BigDecimal built_up_area_commercial) {
		this.built_up_area_commercial = built_up_area_commercial;
	}
	public BigDecimal getBuilt_up_area_rec() {
		return built_up_area_rec;
	}
	public void setBuilt_up_area_rec(BigDecimal built_up_area_rec) {
		this.built_up_area_rec = built_up_area_rec;
	}
	public BigDecimal getConsumed_fsi() {
		return consumed_fsi;
	}
	public void setConsumed_fsi(BigDecimal consumed_fsi) {
		this.consumed_fsi = consumed_fsi;
	}
	public Date getFrom_date() {
		return from_date;
	}
	public void setFrom_date(Date from_date) {
		this.from_date = from_date;
	}
	
	@Override
	public String toString() {
		return "LetoutInformationBuiltUpAreaField [built_up_area_commercial=" + built_up_area_commercial
				+ ", built_up_area_rec=" + built_up_area_rec + ", consumed_fsi=" + consumed_fsi + ", from_date="
				+ from_date + "]";
	}
}
