package com.jasperRport.entities;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "let_out", schema = "public")
public class LetOut {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "let_out_id", nullable = false)
    private Long let_out_id;
	
	@Column(name = "plot_id", nullable = false)
    private Integer plot_id;
	
	@Column(name = "let_out_name", length = 100)
    private String let_out_name;
	
	@Column(name = "letout_category_id", length = 2)
    private String letout_category_id;
	
	@Column(name = "layout_type_id", length = 2)
    private String layout_type_id;
	
	@Column(name = "prev_cust_code", length = 50)
    private String prev_cust_code;
	
	@Column(name = "status", length = 3)
    private String status;
	
	@Column(name = "remarks", length = 3000)
    private String remarks;
	
	@Column(name = "let_out_no", length = 300)
    private String let_out_no;

	@Column(name = "cess_building", nullable = false)
    private Boolean cess_building = false;
	
	@Column(name = "cess_building_no", length = 50)
    private String cess_building_no;
	
	@Column(name = "allotment_status", length = 2)
    private String allotment_status;
	
	@Column(name = "from_date")
    private Date from_date;
	
	@Column(name = "to_date")
    private Date to_date;
	
	@Column(name = "sor", length = 20)
    private String sor;
	
	@Column(name = "is_mbpt_prop", nullable = false)
    private Boolean is_mbpt_prop = false;
	
	@Column(name = "building_name", length = 200)
    private String building_name;
	
	@Column(name = "land_area", precision = 15, scale = 2)
    private BigDecimal land_area;
	
	@Column(name = "dept_id")
    private Integer dept_id;
	
	@Column(name = "struct_type_id")
    private Integer struct_type_id;
	
	@Column(name = "amount", precision = 11, scale = 2)
    private BigDecimal amount;

	@Column(name = "is_higher_fee_applicable", nullable = false)
    private Boolean is_higher_fee_applicable = false;
	
	@Column(name = "percent_home_occupant", precision = 15, scale = 2)
    private BigDecimal percent_home_occupant;
	
	@Column(name = "letout_from_date")
    private Date letout_from_date;
	
	@Column(name = "prev_letout_id")
    private Date prev_letout_id;
	
	@Column(name = "area")
    private String area;
	
	@Column(name = "year_of_constr")
    private String year_of_constr;
	
	@Column(name = "home_occupation")
    private String home_occupation;
	
	@Column(name = "non_home_occupation")
    private BigInteger non_home_occupation;
	
	@Column(name = "billable_area")
    private BigInteger billable_area;
	
	@Column(name = "surrender_status", length = 20)
    private String surrender_status;

	public Long getLet_out_id() {
		return let_out_id;
	}

	public void setLet_out_id(Long let_out_id) {
		this.let_out_id = let_out_id;
	}

	public Integer getPlot_id() {
		return plot_id;
	}

	public void setPlot_id(Integer plot_id) {
		this.plot_id = plot_id;
	}

	public String getLet_out_name() {
		return let_out_name;
	}

	public void setLet_out_name(String let_out_name) {
		this.let_out_name = let_out_name;
	}

	public String getLetout_category_id() {
		return letout_category_id;
	}

	public void setLetout_category_id(String letout_category_id) {
		this.letout_category_id = letout_category_id;
	}

	public String getLayout_type_id() {
		return layout_type_id;
	}

	public void setLayout_type_id(String layout_type_id) {
		this.layout_type_id = layout_type_id;
	}

	public String getPrev_cust_code() {
		return prev_cust_code;
	}

	public void setPrev_cust_code(String prev_cust_code) {
		this.prev_cust_code = prev_cust_code;
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

	public String getLet_out_no() {
		return let_out_no;
	}

	public void setLet_out_no(String let_out_no) {
		this.let_out_no = let_out_no;
	}

	public Boolean getCess_building() {
		return cess_building;
	}

	public void setCess_building(Boolean cess_building) {
		this.cess_building = cess_building;
	}

	public String getCess_building_no() {
		return cess_building_no;
	}

	public void setCess_building_no(String cess_building_no) {
		this.cess_building_no = cess_building_no;
	}

	public String getAllotment_status() {
		return allotment_status;
	}

	public void setAllotment_status(String allotment_status) {
		this.allotment_status = allotment_status;
	}

	public Date getFrom_date() {
		return from_date;
	}

	public void setFrom_date(Date from_date) {
		this.from_date = from_date;
	}

	public Date getTo_date() {
		return to_date;
	}

	public void setTo_date(Date to_date) {
		this.to_date = to_date;
	}

	public String getSor() {
		return sor;
	}

	public void setSor(String sor) {
		this.sor = sor;
	}

	public Boolean getIs_mbpt_prop() {
		return is_mbpt_prop;
	}

	public void setIs_mbpt_prop(Boolean is_mbpt_prop) {
		this.is_mbpt_prop = is_mbpt_prop;
	}

	public String getBuilding_name() {
		return building_name;
	}

	public void setBuilding_name(String building_name) {
		this.building_name = building_name;
	}

	public BigDecimal getLand_area() {
		return land_area;
	}

	public void setLand_area(BigDecimal land_area) {
		this.land_area = land_area;
	}

	public Integer getDept_id() {
		return dept_id;
	}

	public void setDept_id(Integer dept_id) {
		this.dept_id = dept_id;
	}

	public Integer getStruct_type_id() {
		return struct_type_id;
	}

	public void setStruct_type_id(Integer struct_type_id) {
		this.struct_type_id = struct_type_id;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public Boolean getIs_higher_fee_applicable() {
		return is_higher_fee_applicable;
	}

	public void setIs_higher_fee_applicable(Boolean is_higher_fee_applicable) {
		this.is_higher_fee_applicable = is_higher_fee_applicable;
	}

	public BigDecimal getPercent_home_occupant() {
		return percent_home_occupant;
	}

	public void setPercent_home_occupant(BigDecimal percent_home_occupant) {
		this.percent_home_occupant = percent_home_occupant;
	}

	public Date getLetout_from_date() {
		return letout_from_date;
	}

	public void setLetout_from_date(Date letout_from_date) {
		this.letout_from_date = letout_from_date;
	}

	public Date getPrev_letout_id() {
		return prev_letout_id;
	}

	public void setPrev_letout_id(Date prev_letout_id) {
		this.prev_letout_id = prev_letout_id;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getYear_of_constr() {
		return year_of_constr;
	}

	public void setYear_of_constr(String year_of_constr) {
		this.year_of_constr = year_of_constr;
	}

	public String getHome_occupation() {
		return home_occupation;
	}

	public void setHome_occupation(String home_occupation) {
		this.home_occupation = home_occupation;
	}

	public BigInteger getNon_home_occupation() {
		return non_home_occupation;
	}

	public void setNon_home_occupation(BigInteger non_home_occupation) {
		this.non_home_occupation = non_home_occupation;
	}

	public BigInteger getBillable_area() {
		return billable_area;
	}

	public void setBillable_area(BigInteger billable_area) {
		this.billable_area = billable_area;
	}

	public String getSurrender_status() {
		return surrender_status;
	}

	public void setSurrender_status(String surrender_status) {
		this.surrender_status = surrender_status;
	}

	@Override
	public String toString() {
		return "LetOut [let_out_id=" + let_out_id + ", plot_id=" + plot_id + ", let_out_name=" + let_out_name
				+ ", letout_category_id=" + letout_category_id + ", layout_type_id=" + layout_type_id
				+ ", prev_cust_code=" + prev_cust_code + ", status=" + status + ", remarks=" + remarks + ", let_out_no="
				+ let_out_no + ", cess_building=" + cess_building + ", cess_building_no=" + cess_building_no
				+ ", allotment_status=" + allotment_status + ", from_date=" + from_date + ", to_date=" + to_date
				+ ", sor=" + sor + ", is_mbpt_prop=" + is_mbpt_prop + ", building_name=" + building_name
				+ ", land_area=" + land_area + ", dept_id=" + dept_id + ", struct_type_id=" + struct_type_id
				+ ", amount=" + amount + ", is_higher_fee_applicable=" + is_higher_fee_applicable
				+ ", percent_home_occupant=" + percent_home_occupant + ", letout_from_date=" + letout_from_date
				+ ", prev_letout_id=" + prev_letout_id + ", area=" + area + ", year_of_constr=" + year_of_constr
				+ ", home_occupation=" + home_occupation + ", non_home_occupation=" + non_home_occupation
				+ ", billable_area=" + billable_area + ", surrender_status=" + surrender_status + "]";
	}
	
}
