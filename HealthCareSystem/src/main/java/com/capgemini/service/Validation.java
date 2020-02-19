package com.capgemini.service;

import java.util.regex.Pattern;

import com.capgemini.dto.DiagnosticCenter;

import java.util.regex.Matcher;

public class Validation {
	
	ServiceImplementation siv = new ServiceImplementation();
	
	public boolean validateCenterName(String centerName)
	{
		if(!centerName.matches("[A-Z][a-z,A-Z,0-9,\\s]*"))
		{
			System.out.println("\n*Note: Center name should not be blank, fist letter should be capital");
			return false;
		}
		else if(siv.isCenterNamePresent(centerName))
		{
			System.out.println("Center Name already there in the list");
			return false;
		}
		return true;
	}
	
	public boolean validateCenterId(String centerId)
	{
		if(!siv.isCenterIdPresent(centerId))
		{
			System.out.println("Center Id does not exit in the center list");
			return false;
		}
		return true;
	}
	
	public boolean validateCenterTest(DiagnosticCenter centerObject,String testName)
	{
		if(!testName.matches("[a-z,A-Z,0-9,\\s]*"))
		{
			System.out.println("\n*Note: Test name should not be blank");
			return false;
		}
		else if(siv.isTestNamePresent(centerObject,testName))
		{
			System.out.println("Test Name already there in the test list of "+centerObject.getCenterName());
			return false;
		}
		return true;
	}
	
	public boolean validateCenterTestId(DiagnosticCenter centerObject,String testId)
	{
		if(!siv.isTestIdPresent(centerObject, testId))
		{
			System.out.println("Entered Test Id does not exit in the test list of "+centerObject.getCenterName());
			return false;
		}
		return true;
	}
	

}
