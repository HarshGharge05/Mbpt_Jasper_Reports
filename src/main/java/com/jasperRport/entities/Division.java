package com.jasperRport.entities;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "division", schema = "public")
public class Division {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "div_id", nullable = false)
	private Integer divId;
	
	@Column(name = "div_code", nullable = false, length = 2, unique = true)
    private String divCode;

    @Column(name = "div_name", nullable = false, length = 30)
    private String divName;

    @Column(name = "div_desc", length = 2000)
    private String divDesc;

    @Column(name = "update_by", nullable = false, length = 40)
    private String updateBy;

    @Column(name = "update_timestamp", nullable = false)
    private Timestamp updateTimestamp;

    @Column(name = "verified_return_by", length = 40)
    private String verifiedReturnBy;

    @Column(name = "is_verified", nullable = false)
    private Boolean isVerified;

    @Column(name = "status", nullable = false, length = 2)
    private String status;

    @Column(name = "remarks", length = 3000)
    private String remarks;

    @Column(name = "approve_reject_on")
    private Timestamp approveRejectOn;

    @Column(name = "approve_reject_by", length = 40)
    private String approveRejectBy;

    @Column(name = "verified_return_on")
    private Timestamp verifiedReturnOn;

    @Column(name = "row_update_by", length = 40)
    private String rowUpdateBy;

    @Column(name = "admin_id")
    private Integer adminId;

    @Column(name = "mbpt_div_id", length = 5)
    private String mbptDivId;

    @Column(name = "email_verification_code", length = 10)
    private String emailVerificationCode;

	public Integer getDivId() {
		return divId;
	}

	public void setDivId(Integer divId) {
		this.divId = divId;
	}

	public String getDivCode() {
		return divCode;
	}

	public void setDivCode(String divCode) {
		this.divCode = divCode;
	}

	public String getDivName() {
		return divName;
	}

	public void setDivName(String divName) {
		this.divName = divName;
	}

	public String getDivDesc() {
		return divDesc;
	}

	public void setDivDesc(String divDesc) {
		this.divDesc = divDesc;
	}

	public String getUpdateBy() {
		return updateBy;
	}

	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}

	public Timestamp getUpdateTimestamp() {
		return updateTimestamp;
	}

	public void setUpdateTimestamp(Timestamp updateTimestamp) {
		this.updateTimestamp = updateTimestamp;
	}

	public String getVerifiedReturnBy() {
		return verifiedReturnBy;
	}

	public void setVerifiedReturnBy(String verifiedReturnBy) {
		this.verifiedReturnBy = verifiedReturnBy;
	}

	public Boolean getIsVerified() {
		return isVerified;
	}

	public void setIsVerified(Boolean isVerified) {
		this.isVerified = isVerified;
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

	public Timestamp getApproveRejectOn() {
		return approveRejectOn;
	}

	public void setApproveRejectOn(Timestamp approveRejectOn) {
		this.approveRejectOn = approveRejectOn;
	}

	public String getApproveRejectBy() {
		return approveRejectBy;
	}

	public void setApproveRejectBy(String approveRejectBy) {
		this.approveRejectBy = approveRejectBy;
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

	public String getMbptDivId() {
		return mbptDivId;
	}

	public void setMbptDivId(String mbptDivId) {
		this.mbptDivId = mbptDivId;
	}

	public String getEmailVerificationCode() {
		return emailVerificationCode;
	}

	public void setEmailVerificationCode(String emailVerificationCode) {
		this.emailVerificationCode = emailVerificationCode;
	}

	@Override
	public String toString() {
		return "Division [divId=" + divId + ", divCode=" + divCode + ", divName=" + divName + ", divDesc=" + divDesc
				+ ", updateBy=" + updateBy + ", updateTimestamp=" + updateTimestamp + ", verifiedReturnBy="
				+ verifiedReturnBy + ", isVerified=" + isVerified + ", status=" + status + ", remarks=" + remarks
				+ ", approveRejectOn=" + approveRejectOn + ", approveRejectBy=" + approveRejectBy
				+ ", verifiedReturnOn=" + verifiedReturnOn + ", rowUpdateBy=" + rowUpdateBy + ", adminId=" + adminId
				+ ", mbptDivId=" + mbptDivId + ", emailVerificationCode=" + emailVerificationCode + "]";
	}
    
}
