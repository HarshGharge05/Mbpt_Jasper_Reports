package com.jasperRport.entities;

import java.sql.Date;

public class LetoutInformationMainReportField {

	private String div_name;       
    private String unit_code;           
    private String estate_name;         
    private String rr_no;               
    private String plot_code;           
    private String struct_type;      
    private String layout_type;         
    private String let_out_no;          
    private String let_out_name;         
    private String area;               
    private Long home_occupation;    
    private Long non_home_occupation; 
    private String dept_name;     
    private Date from_date;             
    private String billable_area;       
    private String status;            
    private String userName;           
    private String let_out_desc;  
    private String remarks;
    private String documentUploaded;
    
	public String getDiv_name() {
		return div_name;
	}

	public void setDiv_name(String div_name) {
		this.div_name = div_name;
	}
	
	public String getUnit_code() {
		return unit_code;
	}

	public void setUnit_code(String unit_code) {
		this.unit_code = unit_code;
	}

	public String getEstate_name() {
		return estate_name;
	}

	public void setEstate_name(String estate_name) {
		this.estate_name = estate_name;
	}

	public String getRr_no() {
		return rr_no;
	}

	public void setRr_no(String rr_no) {
		this.rr_no = rr_no;
	}

	public String getPlot_code() {
		return plot_code;
	}

	public void setPlot_code(String plot_code) {
		this.plot_code = plot_code;
	}

	public String getStruct_type() {
		return struct_type;
	}

	public void setStruct_type(String struct_type) {
		this.struct_type = struct_type;
	}

	public String getLayout_type() {
		return layout_type;
	}

	public void setLayout_type(String layout_type) {
		this.layout_type = layout_type;
	}

	public String getLet_out_no() {
		return let_out_no;
	}

	public void setLet_out_no(String let_out_no) {
		this.let_out_no = let_out_no;
	}

	public String getLet_out_name() {
		return let_out_name;
	}

	public void setLet_out_name(String let_out_name) {
		this.let_out_name = let_out_name;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public Long getHome_occupation() {
		return home_occupation;
	}

	public void setHome_occupation(Long home_occupation) {
		this.home_occupation = home_occupation;
	}

	public Long getNon_home_occupation() {
		return non_home_occupation;
	}

	public void setNon_home_occupation(Long non_home_occupation) {
		this.non_home_occupation = non_home_occupation;
	}

	public String getDept_name() {
		return dept_name;
	}

	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}

	public Date getFrom_date() {
		return from_date;
	}

	public void setFrom_date(Date from_date) {
		this.from_date = from_date;
	}

	public String getBillable_area() {
		return billable_area;
	}

	public void setBillable_area(String billable_area) {
		this.billable_area = billable_area;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getLet_out_desc() {
		return let_out_desc;
	}

	public void setLet_out_desc(String let_out_desc) {
		this.let_out_desc = let_out_desc;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getDocumentUploaded() {
		return documentUploaded;
	}

	public void setDocumentUploaded(String documentUploaded) {
		this.documentUploaded = documentUploaded;
	}

	@Override
	public String toString() {
		return "LetoutInformationMainReportField [div_name=" + div_name + ", unit_code=" + unit_code + ", estate_name="
				+ estate_name + ", rr_no=" + rr_no + ", plot_code=" + plot_code + ", struct_type=" + struct_type
				+ ", layout_type=" + layout_type + ", let_out_no=" + let_out_no + ", let_out_name=" + let_out_name
				+ ", area=" + area + ", home_occupation=" + home_occupation + ", non_home_occupation="
				+ non_home_occupation + ", dept_name=" + dept_name + ", from_date=" + from_date + ", billable_area="
				+ billable_area + ", status=" + status + ", userName=" + userName + ", let_out_desc=" + let_out_desc
				+ ", remarks=" + remarks + ", documentUploaded=" + documentUploaded + "]";
	}
}
