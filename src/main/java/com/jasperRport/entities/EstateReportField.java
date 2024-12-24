package com.jasperRport.entities;

public class EstateReportField {
	
	private String estateCode;
	private String estateName;
	private int unitId;
	private String status;
	private String custodian;
	private String remark;
	
	public String getEstateCode() {
		return estateCode;
	}
	public void setEstateCode(String estateCode) {
		this.estateCode = estateCode;
	}
	public String getEstateName() {
		return estateName;
	}
	public void setEstateName(String estateName) {
		this.estateName = estateName;
	}
	public int getUnitId() {
		return unitId;
	}
	public void setUnitId(int unitId) {
		this.unitId = unitId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCustodian() {
		return custodian;
	}
	public void setCustodian(String custodian) {
		this.custodian = custodian;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	@Override
	public String toString() {
		return "EstateReportField [estateCode=" + estateCode + ", estateName=" + estateName + ", unitId=" + unitId
				+ ", status=" + status + ", custodian=" + custodian + ", remark=" + remark + "]";
	}
}
