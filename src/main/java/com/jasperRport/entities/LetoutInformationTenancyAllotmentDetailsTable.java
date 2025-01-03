package com.jasperRport.entities;

import java.math.BigDecimal;
import java.sql.Date;

public class LetoutInformationTenancyAllotmentDetailsTable {
	
	private String tenancy_id;
	private Date period_from;
	private Date period_to;
	private BigDecimal calculated_rent;
	
	public String getTenancy_id() {
		return tenancy_id;
	}
	public void setTenancy_id(String tenancy_id) {
		this.tenancy_id = tenancy_id;
	}
	public Date getPeriod_from() {
		return period_from;
	}
	public void setPeriod_from(Date period_from) {
		this.period_from = period_from;
	}
	public Date getPeriod_to() {
		return period_to;
	}
	public void setPeriod_to(Date period_to) {
		this.period_to = period_to;
	}
	public BigDecimal getCalculated_rent() {
		return calculated_rent;
	}
	public void setCalculated_rent(BigDecimal calculated_rent) {
		this.calculated_rent = calculated_rent;
	}
	
	@Override
	public String toString() {
		return "LetoutInformationTenancyAllotmentDetailsTable [tenancy_id=" + tenancy_id + ", period_from="
				+ period_from + ", period_to=" + period_to + ", calculated_rent=" + calculated_rent + "]";
	}
}
