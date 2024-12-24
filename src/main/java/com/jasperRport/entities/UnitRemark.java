package com.jasperRport.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "unit_rmk", schema = "public")
public class UnitRemark {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "unit_rmk_id", nullable = false)
	private Long unitRmkId;
	
	@Column(name = "unit_id", nullable = false)
	private Integer unitId;
	
	@Column(name = "update_by", nullable = false, length = 40)
	private String updateBy;
	
	@Column(name = "update_timestamp", nullable = false)
	private String updateTimestamp;
	
	@Column(name = "remark", nullable = false, length = 3000)
	private String remark;
	
	@Column(name = "row_update_by", nullable = false, length = 40)
	private String rowUpdateBy;

	public Long getUnitRmkId() {
		return unitRmkId;
	}

	public void setUnitRmkId(Long unitRmkId) {
		this.unitRmkId = unitRmkId;
	}

	public Integer getUnitId() {
		return unitId;
	}

	public void setUnitId(Integer unitId) {
		this.unitId = unitId;
	}

	public String getUpdateBy() {
		return updateBy;
	}

	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}

	public String getUpdateTimestamp() {
		return updateTimestamp;
	}

	public void setUpdateTimestamp(String updateTimestamp) {
		this.updateTimestamp = updateTimestamp;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getRowUpdateBy() {
		return rowUpdateBy;
	}

	public void setRowUpdateBy(String rowUpdateBy) {
		this.rowUpdateBy = rowUpdateBy;
	}

	@Override
	public String toString() {
		return "UnitRemark [unitRmkId=" + unitRmkId + ", unitId=" + unitId + ", updateBy=" + updateBy
				+ ", updateTimestamp=" + updateTimestamp + ", remark=" + remark + ", rowUpdateBy=" + rowUpdateBy + "]";
	}

}
