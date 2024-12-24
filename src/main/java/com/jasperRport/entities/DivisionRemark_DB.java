package com.jasperRport.entities;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "division_rmk")
public class DivisionRemark_DB {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "div_rmk_id")
    private int divRemarkId;

    @Column(name = "div_code", nullable = false)
    private int divCode;

    @Column(name = "update_by")
    private String updatedBy;

    @Column(name = "update_timestamp")
    private LocalDateTime updateTimestamp;

    @Column(name = "remark")
    private String remark;

	public int getDivRemarkId() {
		return divRemarkId;
	}

	public void setDivRemarkId(int divRemarkId) {
		this.divRemarkId = divRemarkId;
	}

	public int getDivCode() {
		return divCode;
	}

	public void setDivCode(int divCode) {
		this.divCode = divCode;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public LocalDateTime getUpdateTimestamp() {
		return updateTimestamp;
	}

	public void setUpdateTimestamp(LocalDateTime updateTimestamp) {
		this.updateTimestamp = updateTimestamp;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Override
	public String toString() {
		return "DivisionRemark_DB [divRemarkId=" + divRemarkId + ", divCode=" + divCode + ", updatedBy=" + updatedBy
				+ ", updateTimestamp=" + updateTimestamp + ", remark=" + remark + "]";
	}
}
