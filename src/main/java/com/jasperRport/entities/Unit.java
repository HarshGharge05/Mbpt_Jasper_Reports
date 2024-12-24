package com.jasperRport.entities;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="unit", schema = "public")
public class Unit {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "unit_unit_id_seq")
	@SequenceGenerator(name = "unit_unit_id_seq", sequenceName = "unit_unit_id_seq", allocationSize = 1)
	@Column(name = "unit_id", nullable = false)
	private Integer unitId;
	
	@Column(name = "unit_code", nullable = false, length = 2)
	private String unitCode;
	
	@Column(name = "unit_desc", length = 2000)
	private String unitDesc;
	
	@Column(name = "div_id")
	private Integer divId;
	
	@Column(name = "update_by", length = 40, nullable = false)
	private String updatedBy;
	
	@Column(name = "update_timestamp", nullable = false)
	private Timestamp updateTimestamp;
	
	@Column(name = "is_verified", nullable = false)
	private Boolean isVerified;
	
	@Column(name = "verified_return_by", length = 40)
	private String verifiedReturnBy;
	
	@Column(name = "status", length = 2, nullable = false)
	private String status;
	
	@Column(name = "remarks", length = 3000)
	private String remarks;
	
	@Column(name = "approve_reject_by", length = 40)
	private String approveRejectBy;
	
	@Column(name = "approve_reject_on")
	private Timestamp approveRejectOn;
	
	@Column(name = "verified_return_on")
	private Timestamp verifiedReturnOn;
	
	@Column(name = "row_update_by", length = 40)
	private String rowUpdateBy;
	
	@Column(name = "admin_id")
	private Integer adminId;
	
	@Column(name = "mbpt_unit_id", length = 5)
	private String mbptUnitId;

	public Integer getUnitId() {
		return unitId;
	}

	public void setUnitId(Integer unitId) {
		this.unitId = unitId;
	}

	public String getUnitCode() {
		return unitCode;
	}

	public void setUnitCode(String unitCode) {
		this.unitCode = unitCode;
	}

	public String getUnitDesc() {
		return unitDesc;
	}

	public void setUnitDesc(String unitDesc) {
		this.unitDesc = unitDesc;
	}

	public Integer getDivId() {
		return divId;
	}

	public void setDivId(Integer divId) {
		this.divId = divId;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Timestamp getUpdateTimestamp() {
		return updateTimestamp;
	}

	public void setUpdateTimestamp(Timestamp updateTimestamp) {
		this.updateTimestamp = updateTimestamp;
	}

	public Boolean getIsVerified() {
		return isVerified;
	}

	public void setIsVerified(Boolean isVerified) {
		this.isVerified = isVerified;
	}

	public String getVerifiedReturnBy() {
		return verifiedReturnBy;
	}

	public void setVerifiedReturnBy(String verifiedReturnBy) {
		this.verifiedReturnBy = verifiedReturnBy;
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

	public String getApproveRejectBy() {
		return approveRejectBy;
	}

	public void setApproveRejectBy(String approveRejectBy) {
		this.approveRejectBy = approveRejectBy;
	}

	public Timestamp getApproveRejectOn() {
		return approveRejectOn;
	}

	public void setApproveRejectOn(Timestamp approveRejectOn) {
		this.approveRejectOn = approveRejectOn;
	}

	public Timestamp getVerifiedReturnOn() {
		return verifiedReturnOn;
	}

	public void setVerifiedReturnOn(Timestamp verifiedReturnOn) {
		this.verifiedReturnOn = verifiedReturnOn;
	}

	public String getRowUpdateBy() {
		return rowUpdateBy;
	}

	public void setRowUpdateBy(String rowUpdateBy) {
		this.rowUpdateBy = rowUpdateBy;
	}

	public Integer getAdminId() {
		return adminId;
	}

	public void setAdminId(Integer adminId) {
		this.adminId = adminId;
	}

	public String getMbptUnitId() {
		return mbptUnitId;
	}

	public void setMbptUnitId(String mbptUnitId) {
		this.mbptUnitId = mbptUnitId;
	}

	@Override
	public String toString() {
		return "Unit [unitId=" + unitId + ", unitCode=" + unitCode + ", unitDesc=" + unitDesc + ", divId=" + divId
				+ ", updatedBy=" + updatedBy + ", updateTimestamp=" + updateTimestamp + ", isVerified=" + isVerified
				+ ", verifiedReturnBy=" + verifiedReturnBy + ", status=" + status + ", remarks=" + remarks
				+ ", approveRejectBy=" + approveRejectBy + ", approveRejectOn=" + approveRejectOn
				+ ", verifiedReturnOn=" + verifiedReturnOn + ", rowUpdateBy=" + rowUpdateBy + ", adminId=" + adminId
				+ ", mbptUnitId=" + mbptUnitId + "]";
	}
	
}
