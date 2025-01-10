package com.jasperRport.entities;

public class OtherThanEstateInspectionReportPersonTableFields {
	
	private String person_at_site;
	private String person_desg_lgl_status;
	private String person_contact_no;
	private String occupied_since;
	
	public String getPerson_at_site() {
		return person_at_site;
	}
	public void setPerson_at_site(String person_at_site) {
		this.person_at_site = person_at_site;
	}
	public String getPerson_desg_lgl_status() {
		return person_desg_lgl_status;
	}
	public void setPerson_desg_lgl_status(String person_desg_lgl_status) {
		this.person_desg_lgl_status = person_desg_lgl_status;
	}
	public String getPerson_contact_no() {
		return person_contact_no;
	}
	public void setPerson_contact_no(String person_contact_no) {
		this.person_contact_no = person_contact_no;
	}
	public String getOccupied_since() {
		return occupied_since;
	}
	public void setOccupied_since(String occupied_since) {
		this.occupied_since = occupied_since;
	}
	
	@Override
	public String toString() {
		return "OtherThanEstateInspectionReportPersonTableFields [person_at_site=" + person_at_site
				+ ", person_desg_lgl_status=" + person_desg_lgl_status + ", person_contact_no=" + person_contact_no
				+ ", occupied_since=" + occupied_since + "]";
	}
}
