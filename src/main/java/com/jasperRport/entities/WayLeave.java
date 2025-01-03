package com.jasperRport.entities;

import java.sql.Date;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "wayleave")
public class WayLeave {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "wyl_id")
	private int wylId;

	@Column(name = "origin_estate_id", nullable = false)
	private int origin_estate_id;

	@Column(name = "terminating_estate_id", nullable = false)
	private int terminating_estate_id;

	@Column(name = "wyl_code", length = 15, nullable = false)
	private String wyl_code;

	@Column(name = "wyl_type_id", length = 2, nullable = false)
	private String wyl_type_id;

	@Column(name = "status", length = 2, nullable = false)
	private String status;

	@Column(name = "unit_id")
	private String unit_id;

	@Column(name = "wyl_date")
	private Date wyl_date;

	@Column(name = "draw_number")
	private String draw_number;

	@Column(name = "tr_no")
	private String tr_no;

	@Column(name = "tr_year")
	private String tr_year;

	public int getWylId() {
		return wylId;
	}

	public void setWylId(int wylId) {
		this.wylId = wylId;
	}

	public int getOrigin_estate_id() {
		return origin_estate_id;
	}

	public void setOrigin_estate_id(int origin_estate_id) {
		this.origin_estate_id = origin_estate_id;
	}

	public int getTerminating_estate_id() {
		return terminating_estate_id;
	}

	public void setTerminating_estate_id(int terminating_estate_id) {
		this.terminating_estate_id = terminating_estate_id;
	}

	public String getWyl_code() {
		return wyl_code;
	}

	public void setWyl_code(String wyl_code) {
		this.wyl_code = wyl_code;
	}

	public String getWyl_type_id() {
		return wyl_type_id;
	}

	public void setWyl_type_id(String wyl_type_id) {
		this.wyl_type_id = wyl_type_id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getUnit_id() {
		return unit_id;
	}

	public void setUnit_id(String unit_id) {
		this.unit_id = unit_id;
	}

	public Date getWyl_date() {
		return wyl_date;
	}

	public void setWyl_date(Date wyl_date) {
		this.wyl_date = wyl_date;
	}

	public String getDraw_number() {
		return draw_number;
	}

	public void setDraw_number(String draw_number) {
		this.draw_number = draw_number;
	}

	public String getTr_no() {
		return tr_no;
	}

	public void setTr_no(String tr_no) {
		this.tr_no = tr_no;
	}

	public String getTr_year() {
		return tr_year;
	}

	public void setTr_year(String tr_year) {
		this.tr_year = tr_year;
	}

	@Override
	public String toString() {
		return "WayLeave [wylId=" + wylId + ", origin_estate_id=" + origin_estate_id + ", terminating_estate_id="
				+ terminating_estate_id + ", wyl_code=" + wyl_code + ", wyl_type_id=" + wyl_type_id + ", status="
				+ status + ", unit_id=" + unit_id + ", wyl_date=" + wyl_date + ", draw_number=" + draw_number
				+ ", tr_no=" + tr_no + ", tr_year=" + tr_year + "]";
	}
	
}
