package com.capgemini.dto;

import java.util.ArrayList;
import java.util.List;

public class DiagnosticCenter {
	
	private String centerId;
	
	private String centerName;
	
	private List<CenterTest> listOfTests = new ArrayList<CenterTest>();
	
	public DiagnosticCenter(String centerId, String centerName) {
		super();
		this.centerId = centerId;
		this.centerName = centerName;
	}
	
	public DiagnosticCenter(String centerId, String centerName, List<CenterTest> listOfTests) {
		super();
		this.centerId = centerId;
		this.centerName = centerName;
		this.listOfTests = listOfTests;
	}

	public String getCenterId() {
		return centerId;
	}
	
	public void setCenterId(String centerId) {
		this.centerId = centerId;
	}
	
	public String getCenterName() {
		return centerName;
	}
	
	public void setCenterName(String centerName) {
		this.centerName = centerName;
	}
	
	public  List<CenterTest> getListOfTests() {
		return listOfTests;
	}
	
	public void setListOfTests(List<CenterTest> listOfTests) {
		this.listOfTests = listOfTests;
	}
	
}
