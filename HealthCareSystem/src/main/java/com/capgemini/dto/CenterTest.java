package com.capgemini.dto;

public class CenterTest {
	
	private String testId;
	
	private String testName;

	public CenterTest(String testId, String testName) {
		super();
		this.testId = testId;
		this.testName = testName;
	}
	
	public String getTestId() {
		return testId;
	}
	
	public void setTestId(String testId) {
		this.testId = testId;
	}
	
	public String getTestName() {
		return testName;
	}
	
	public void setTestName(String testName) {
		this.testName = testName;
	}
	
}
