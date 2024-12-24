package com.jasperRport.entities;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "estate", schema = "public")
public class Estate {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "estate_id", nullable = false)
	private int estate_id;
	
	@Column(name = "unit_id", nullable = false)
	private int unit_id;
	
	@Column(name = "estate_code", nullable = false, length = 2)
	private String estate_code;
	
	@Column(name = "estate_name", nullable = false, length = 75)
	private String estate_name;
	
	@Column(name = "estate_desc", length = 30000)
	private String estate_desc;
	
	@Column(name = "update_by", nullable = false, length = 40)
	private String update_by;
	
	@Column(name = "update_timestamp", nullable = false)
	private Timestamp update_timestamp;
	
	@Column(name = "is_verified", nullable = false)
	private boolean is_verified;
	
	@Column(name = "verified_return_by", length = 40)
	private String verified_return_by;
	
	@Column(name = "status", nullable = false)
	private String status;
	
	@Column(name = "remarks", length = 3000)
	private String remarks;
	
	@Column(name = "approve_reject_by", length = 40)
	private String approve_reject_by;
	
	@Column(name = "approve_reject_on")
	private Timestamp approve_reject_on;
	
	@Column(name = "verified_return_on")
	private Timestamp verified_return_on;
	
	@Column(name = "row_update_by", length = 40)
	private String row_update_by;
	
	@Column(name = "mbpt_estate_id", length = 10)
	private String mbpt_estate_id;
	
	@Column(name = "admin_id")
	private int admin_id;

	public int getEstate_id() {
		return estate_id;
	}

	public void setEstate_id(int estate_id) {
		this.estate_id = estate_id;
	}

	public int getUnit_id() {
		return unit_id;
	}

	public void setUnit_id(int unit_id) {
		this.unit_id = unit_id;
	}

	public String getEstate_code() {
		return estate_code;
	}

	public void setEstate_code(String estate_code) {
		this.estate_code = estate_code;
	}

	public String getEstate_name() {
		return estate_name;
	}

	public void setEstate_name(String estate_name) {
		this.estate_name = estate_name;
	}

	public String getEstate_desc() {
		return estate_desc;
	}

	public void setEstate_desc(String estate_desc) {
		this.estate_desc = estate_desc;
	}

	public String getUpdate_by() {
		return update_by;
	}

	public void setUpdate_by(String update_by) {
		this.update_by = update_by;
	}

	public Timestamp getUpdate_timestamp() {
		return update_timestamp;
	}

	public void setUpdate_timestamp(Timestamp update_timestamp) {
		this.update_timestamp = update_timestamp;
	}

	public boolean isIs_verified() {
		return is_verified;
	}

	public void setIs_verified(boolean is_verified) {
		this.is_verified = is_verified;
	}

	public String getVerified_return_by() {
		return verified_return_by;
	}

	public void setVerified_return_by(String verified_return_by) {
		this.verified_return_by = verified_return_by;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getApprove_reject_by() {
		return approve_reject_by;
	}

	public void setApprove_reject_by(String approve_reject_by) {
		this.approve_reject_by = approve_reject_by;
	}

	public Timestamp getApprove_reject_on() {
		return approve_reject_on;
	}

	public void setApprove_reject_on(Timestamp approve_reject_on) {
		this.approve_reject_on = approve_reject_on;
	}

	public Timestamp getVerified_return_on() {
		return verified_return_on;
	}

	public void setVerified_return_on(Timestamp verified_return_on) {
		this.verified_return_on = verified_return_on;
	}

	public String getRow_update_by() {
		return row_update_by;
	}

	public void setRow_update_by(String row_update_by) {
		this.row_update_by = row_update_by;
	}

	public String getMbpt_estate_id() {
		return mbpt_estate_id;
	}

	public void setMbpt_estate_id(String mbpt_estate_id) {
		this.mbpt_estate_id = mbpt_estate_id;
	}

	public int getAdmin_id() {
		return admin_id;
	}

	public void setAdmin_id(int admin_id) {
		this.admin_id = admin_id;
	}

	@Override
	public String toString() {
		return "Estate [estate_id=" + estate_id + ", unit_id=" + unit_id + ", estate_code=" + estate_code
				+ ", estate_name=" + estate_name + ", estate_desc=" + estate_desc + ", update_by=" + update_by
				+ ", update_timestamp=" + update_timestamp + ", is_verified=" + is_verified + ", verified_return_by="
				+ verified_return_by + ", status=" + status + ", remarks=" + remarks + ", approve_reject_by="
				+ approve_reject_by + ", approve_reject_on=" + approve_reject_on + ", verified_return_on="
				+ verified_return_on + ", row_update_by=" + row_update_by + ", mbpt_estate_id=" + mbpt_estate_id
				+ ", admin_id=" + admin_id + "]";
	}
	
}
