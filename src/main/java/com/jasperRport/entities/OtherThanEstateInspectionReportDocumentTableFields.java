package com.jasperRport.entities;

public class OtherThanEstateInspectionReportDocumentTableFields {
	
	private String doc_type;
	private String doc_name;
	
	public String getDoc_type() {
		return doc_type;
	}
	public void setDoc_type(String doc_type) {
		this.doc_type = doc_type;
	}
	public String getDoc_name() {
		return doc_name;
	}
	public void setDoc_name(String doc_name) {
		this.doc_name = doc_name;
	}
	
	@Override
	public String toString() {
		return "OtherThanEstateInspectionReportDocumentTableFields [doc_type=" + doc_type + ", doc_name=" + doc_name
				+ "]";
	}
}
