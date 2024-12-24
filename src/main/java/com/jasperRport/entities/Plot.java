package com.jasperRport.entities;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "plot", schema = "public")
public class Plot {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "plot_id", nullable = false)
	private Integer plotId;
	
	@Column(name = "estate_id", nullable = false)
    private Integer estateId;

    @Column(name = "plot_code", length = 11)
    private Integer plotCode;

    @Column(name = "rr_no", length = 100)
    private String rrNo;

    @Column(name = "street_no", length = 50)
    private String streetNo;

    @Column(name = "main_structure_name", length = 100)
    private String mainStructureName;

    @Column(name = "mcgm_allotted_no", length = 10)
    private String mcgmAllottedNo;

    @Column(name = "mcgm_ward_name", length = 100)
    private String mcgmWardName;

    @Column(name = "location", length = 100)
    private String location;

    @Column(name = "city_survey_no", length = 50)
    private String citySurveyNo;

    @Column(name = "city_survey_div", length = 50)
    private String citySurveyDiv;

    @Column(name = "area", precision = 15, scale = 2, nullable = false)
    private BigDecimal area;

    @Column(name = "plot_desc", length = 2000)
    private String plotDesc;

    @Column(name = "update_by", nullable = false, length = 40)
    private String updateBy;

    @Column(name = "update_timestamp", nullable = false)
    private Timestamp updateTimestamp;

    @Column(name = "status", nullable = false, length = 3)
    private String status;

    @Column(name = "verified_return_by", length = 40)
    private String verifiedReturnBy;

    @Column(name = "is_verified", nullable = false)
    private Boolean isVerified;

    @Column(name = "is_active", nullable = false)
    private Boolean isActive;

    @Column(name = "remarks", length = 3000)
    private String remarks;

    @Column(name = "approve_reject_on")
    private Timestamp approveRejectOn;

    @Column(name = "approve_reject_by", length = 40)
    private String approveRejectBy;

    @Column(name = "verified_return_on")
    private Timestamp verifiedReturnOn;

    @Column(name = "div_id")
    private Integer divId;

    @Column(name = "unit_id")
    private Integer unitId;

    @Column(name = "row_update_by", length = 40)
    private String rowUpdateBy;

    @Column(name = "mcgm_plot_no", length = 20)
    private String mcgmPlotNo;

    @Column(name = "existing_plot_no", length = 50)
    private String existingPlotNo;

    @Column(name = "no_of_splits", columnDefinition = "int4 default 0")
    private Integer noOfSplits;

    @Column(name = "owner", nullable = false)
    private Boolean owner;

    @Column(name = "owner_name", length = 100)
    private String ownerName;

    @Column(name = "owner_contactno", length = 10)
    private String ownerContactNo;

    @Column(name = "dept_name", length = 100)
    private String deptName;

    @Column(name = "zone_id")
    private Integer zoneId;

    @Column(name = "zone_detail_id")
    private Integer zoneDetailId;

    @Column(name = "admin_id")
    private Integer adminId;

    @Column(name = "schedule_east", length = 300)
    private String scheduleEast;

    @Column(name = "schedule_west", length = 300)
    private String scheduleWest;

    @Column(name = "schedule_north", length = 300)
    private String scheduleNorth;

    @Column(name = "schedule_south", length = 300)
    private String scheduleSouth;

    @Column(name = "pincode", precision = 6)
    private BigDecimal pincode;

    @Column(name = "ward_id")
    private Integer wardId;

    @Column(name = "customer_code", length = 2000)
    private String customerCode;

    @Column(name = "mbpt_road_connectivity")
    private Boolean mbptRoadConnectivity;

    @Column(name = "from_date")
    private Date fromDate;

    @Column(name = "to_date")
    private Date toDate;

    @Column(name = "created_by_merge")
    private Boolean createdByMerge;

    @Column(name = "created_by_split")
    private Boolean createdBySplit;

    @Column(name = "prev_plot_id")
    private Integer prevPlotId;

    @Column(name = "result_statement", length = 100)
    private String resultStatement;

    @Column(name = "rr_noplot", length = 50)
    private String rrNoPlot;

    @Column(name = "reservation", length = 50)
    private String reservation;

    @Column(name = "plot_split_no", length = 200)
    private String plotSplitNo;

    @Column(name = "plot_action_forwardedto", length = 20)
    private String plotActionForwardedTo;

    @Column(name = "plot_action_forward_rmk", length = 100)
    private String plotActionForwardRemark;

    @Column(name = "plot_action_apr_rmk", length = 100)
    private String plotActionApprovedRemark;

    @Column(name = "plot_action_aprovedby", length = 20)
    private String plotActionApprovedBy;

    @Column(name = "plot_action_type", length = 20)
    private String plotActionType;

    @Column(name = "is_vacant")
    private Boolean isVacant;

    @Column(name = "rrzone2017", length = 50)
    private String rrZone2017;

	public Integer getPlotId() {
		return plotId;
	}

	public void setPlotId(Integer plotId) {
		this.plotId = plotId;
	}

	public Integer getEstateId() {
		return estateId;
	}

	public void setEstateId(Integer estateId) {
		this.estateId = estateId;
	}

	public Integer getPlotCode() {
		return plotCode;
	}

	public void setPlotCode(Integer plotCode) {
		this.plotCode = plotCode;
	}

	public String getRrNo() {
		return rrNo;
	}

	public void setRrNo(String rrNo) {
		this.rrNo = rrNo;
	}

	public String getStreetNo() {
		return streetNo;
	}

	public void setStreetNo(String streetNo) {
		this.streetNo = streetNo;
	}

	public String getMainStructureName() {
		return mainStructureName;
	}

	public void setMainStructureName(String mainStructureName) {
		this.mainStructureName = mainStructureName;
	}

	public String getMcgmAllottedNo() {
		return mcgmAllottedNo;
	}

	public void setMcgmAllottedNo(String mcgmAllottedNo) {
		this.mcgmAllottedNo = mcgmAllottedNo;
	}

	public String getMcgmWardName() {
		return mcgmWardName;
	}

	public void setMcgmWardName(String mcgmWardName) {
		this.mcgmWardName = mcgmWardName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getCitySurveyNo() {
		return citySurveyNo;
	}

	public void setCitySurveyNo(String citySurveyNo) {
		this.citySurveyNo = citySurveyNo;
	}

	public String getCitySurveyDiv() {
		return citySurveyDiv;
	}

	public void setCitySurveyDiv(String citySurveyDiv) {
		this.citySurveyDiv = citySurveyDiv;
	}

	public BigDecimal getArea() {
		return area;
	}

	public void setArea(BigDecimal area) {
		this.area = area;
	}

	public String getPlotDesc() {
		return plotDesc;
	}

	public void setPlotDesc(String plotDesc) {
		this.plotDesc = plotDesc;
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
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

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
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

	public Integer getDivId() {
		return divId;
	}

	public void setDivId(Integer divId) {
		this.divId = divId;
	}

	public Integer getUnitId() {
		return unitId;
	}

	public void setUnitId(Integer unitId) {
		this.unitId = unitId;
	}

	public String getRowUpdateBy() {
		return rowUpdateBy;
	}

	public void setRowUpdateBy(String rowUpdateBy) {
		this.rowUpdateBy = rowUpdateBy;
	}

	public String getMcgmPlotNo() {
		return mcgmPlotNo;
	}

	public void setMcgmPlotNo(String mcgmPlotNo) {
		this.mcgmPlotNo = mcgmPlotNo;
	}

	public String getExistingPlotNo() {
		return existingPlotNo;
	}

	public void setExistingPlotNo(String existingPlotNo) {
		this.existingPlotNo = existingPlotNo;
	}

	public Integer getNoOfSplits() {
		return noOfSplits;
	}

	public void setNoOfSplits(Integer noOfSplits) {
		this.noOfSplits = noOfSplits;
	}

	public Boolean getOwner() {
		return owner;
	}

	public void setOwner(Boolean owner) {
		this.owner = owner;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getOwnerContactNo() {
		return ownerContactNo;
	}

	public void setOwnerContactNo(String ownerContactNo) {
		this.ownerContactNo = ownerContactNo;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public Integer getZoneId() {
		return zoneId;
	}

	public void setZoneId(Integer zoneId) {
		this.zoneId = zoneId;
	}

	public Integer getZoneDetailId() {
		return zoneDetailId;
	}

	public void setZoneDetailId(Integer zoneDetailId) {
		this.zoneDetailId = zoneDetailId;
	}

	public Integer getAdminId() {
		return adminId;
	}

	public void setAdminId(Integer adminId) {
		this.adminId = adminId;
	}

	public String getScheduleEast() {
		return scheduleEast;
	}

	public void setScheduleEast(String scheduleEast) {
		this.scheduleEast = scheduleEast;
	}

	public String getScheduleWest() {
		return scheduleWest;
	}

	public void setScheduleWest(String scheduleWest) {
		this.scheduleWest = scheduleWest;
	}

	public String getScheduleNorth() {
		return scheduleNorth;
	}

	public void setScheduleNorth(String scheduleNorth) {
		this.scheduleNorth = scheduleNorth;
	}

	public String getScheduleSouth() {
		return scheduleSouth;
	}

	public void setScheduleSouth(String scheduleSouth) {
		this.scheduleSouth = scheduleSouth;
	}

	public BigDecimal getPincode() {
		return pincode;
	}

	public void setPincode(BigDecimal pincode) {
		this.pincode = pincode;
	}

	public Integer getWardId() {
		return wardId;
	}

	public void setWardId(Integer wardId) {
		this.wardId = wardId;
	}

	public String getCustomerCode() {
		return customerCode;
	}

	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}

	public Boolean getMbptRoadConnectivity() {
		return mbptRoadConnectivity;
	}

	public void setMbptRoadConnectivity(Boolean mbptRoadConnectivity) {
		this.mbptRoadConnectivity = mbptRoadConnectivity;
	}

	public Date getFromDate() {
		return fromDate;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	public Date getToDate() {
		return toDate;
	}

	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}

	public Boolean getCreatedByMerge() {
		return createdByMerge;
	}

	public void setCreatedByMerge(Boolean createdByMerge) {
		this.createdByMerge = createdByMerge;
	}

	public Boolean getCreatedBySplit() {
		return createdBySplit;
	}

	public void setCreatedBySplit(Boolean createdBySplit) {
		this.createdBySplit = createdBySplit;
	}

	public Integer getPrevPlotId() {
		return prevPlotId;
	}

	public void setPrevPlotId(Integer prevPlotId) {
		this.prevPlotId = prevPlotId;
	}

	public String getResultStatement() {
		return resultStatement;
	}

	public void setResultStatement(String resultStatement) {
		this.resultStatement = resultStatement;
	}

	public String getRrNoPlot() {
		return rrNoPlot;
	}

	public void setRrNoPlot(String rrNoPlot) {
		this.rrNoPlot = rrNoPlot;
	}

	public String getReservation() {
		return reservation;
	}

	public void setReservation(String reservation) {
		this.reservation = reservation;
	}

	public String getPlotSplitNo() {
		return plotSplitNo;
	}

	public void setPlotSplitNo(String plotSplitNo) {
		this.plotSplitNo = plotSplitNo;
	}

	public String getPlotActionForwardedTo() {
		return plotActionForwardedTo;
	}

	public void setPlotActionForwardedTo(String plotActionForwardedTo) {
		this.plotActionForwardedTo = plotActionForwardedTo;
	}

	public String getPlotActionForwardRemark() {
		return plotActionForwardRemark;
	}

	public void setPlotActionForwardRemark(String plotActionForwardRemark) {
		this.plotActionForwardRemark = plotActionForwardRemark;
	}

	public String getPlotActionApprovedRemark() {
		return plotActionApprovedRemark;
	}

	public void setPlotActionApprovedRemark(String plotActionApprovedRemark) {
		this.plotActionApprovedRemark = plotActionApprovedRemark;
	}

	public String getPlotActionApprovedBy() {
		return plotActionApprovedBy;
	}

	public void setPlotActionApprovedBy(String plotActionApprovedBy) {
		this.plotActionApprovedBy = plotActionApprovedBy;
	}

	public String getPlotActionType() {
		return plotActionType;
	}

	public void setPlotActionType(String plotActionType) {
		this.plotActionType = plotActionType;
	}

	public Boolean getIsVacant() {
		return isVacant;
	}

	public void setIsVacant(Boolean isVacant) {
		this.isVacant = isVacant;
	}

	public String getRrZone2017() {
		return rrZone2017;
	}

	public void setRrZone2017(String rrZone2017) {
		this.rrZone2017 = rrZone2017;
	}

	@Override
	public String toString() {
		return "Plot [plotId=" + plotId + ", estateId=" + estateId + ", plotCode=" + plotCode + ", rrNo=" + rrNo
				+ ", streetNo=" + streetNo + ", mainStructureName=" + mainStructureName + ", mcgmAllottedNo="
				+ mcgmAllottedNo + ", mcgmWardName=" + mcgmWardName + ", location=" + location + ", citySurveyNo="
				+ citySurveyNo + ", citySurveyDiv=" + citySurveyDiv + ", area=" + area + ", plotDesc=" + plotDesc
				+ ", updateBy=" + updateBy + ", updateTimestamp=" + updateTimestamp + ", status=" + status
				+ ", verifiedReturnBy=" + verifiedReturnBy + ", isVerified=" + isVerified + ", isActive=" + isActive
				+ ", remarks=" + remarks + ", approveRejectOn=" + approveRejectOn + ", approveRejectBy="
				+ approveRejectBy + ", verifiedReturnOn=" + verifiedReturnOn + ", divId=" + divId + ", unitId=" + unitId
				+ ", rowUpdateBy=" + rowUpdateBy + ", mcgmPlotNo=" + mcgmPlotNo + ", existingPlotNo=" + existingPlotNo
				+ ", noOfSplits=" + noOfSplits + ", owner=" + owner + ", ownerName=" + ownerName + ", ownerContactNo="
				+ ownerContactNo + ", deptName=" + deptName + ", zoneId=" + zoneId + ", zoneDetailId=" + zoneDetailId
				+ ", adminId=" + adminId + ", scheduleEast=" + scheduleEast + ", scheduleWest=" + scheduleWest
				+ ", scheduleNorth=" + scheduleNorth + ", scheduleSouth=" + scheduleSouth + ", pincode=" + pincode
				+ ", wardId=" + wardId + ", customerCode=" + customerCode + ", mbptRoadConnectivity="
				+ mbptRoadConnectivity + ", fromDate=" + fromDate + ", toDate=" + toDate + ", createdByMerge="
				+ createdByMerge + ", createdBySplit=" + createdBySplit + ", prevPlotId=" + prevPlotId
				+ ", resultStatement=" + resultStatement + ", rrNoPlot=" + rrNoPlot + ", reservation=" + reservation
				+ ", plotSplitNo=" + plotSplitNo + ", plotActionForwardedTo=" + plotActionForwardedTo
				+ ", plotActionForwardRemark=" + plotActionForwardRemark + ", plotActionApprovedRemark="
				+ plotActionApprovedRemark + ", plotActionApprovedBy=" + plotActionApprovedBy + ", plotActionType="
				+ plotActionType + ", isVacant=" + isVacant + ", rrZone2017=" + rrZone2017 + "]";
	}
    
}
