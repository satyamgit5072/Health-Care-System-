package com.capgemini.service;

import com.capgemini.dao.UserDaoImplementation;
import com.capgemini.dto.DiagnosticCenter;
import com.capgemini.dto.CenterTest;

public class ServiceImplementation implements Service {
	
	UserDaoImplementation udi = new UserDaoImplementation();
	
	public boolean addCenter(DiagnosticCenter center)
	{
		return udi.addCenter(center); //calling the addCenter method of the UserDaoImplementation class that interacts with the DiagnosticCenter arrayList.
	}
	
	public boolean removeCenter(DiagnosticCenter center)
	{
		return udi.removeCenter(center); //calling the removeCenter method of the UserDaoImplementation class that interacts with the DiagnosticCenter arrayList.
	}
	
	public String addTest(DiagnosticCenter center,CenterTest test)
	{
		return udi.addTest(center,test); //calling the addTest method of the UserDaoImplementation class that interacts with the DiagnosticCenter arrayList and the objects respective Test ArrayList.
	}
	
	public boolean removeTest(DiagnosticCenter center,CenterTest test)
	{
		return udi.removeTest(center,test);
	}
	
	public void viewCenters()
	{
		udi.viewCenters();
	}
	
	public void viewCentersAndTests()
	{
		udi.viewCentersAndTests();
	}
	
	public void viewCenterRepectiveTests(String centerId)
	{
		udi.viewCenterRepectiveTests(centerId);
	}
	
	public DiagnosticCenter getCenterObjectOfcenterId(String centerId)
	{
		return udi.getCenterObjectOfcenterId(centerId); //calling the getCenterObject method of the UserDaoImplementation class that interacts with the DiagnosticCenter arrayList.
	}
	
	public boolean isCenterNamePresent(String centerName)
	{
		return udi.isCenterNamePresent(centerName); //calling the getCenterObject method of the UserDaoImplementation class that interacts with the DiagnosticCenter arrayList.
	}
	
	public boolean isCenterIdPresent(String centerId)
	{
		return udi.isCenterIdPresent(centerId);
	}
	
	public CenterTest getTestObject(DiagnosticCenter center, String testId) 
	{
		return udi.getTestObject(center, testId);
	}
	
	public boolean isTestNamePresent(DiagnosticCenter centerObject,String testName)
	{
		return udi.isTestNamePresent(centerObject,testName); //calling the getCenterObject method of the UserDaoImplementation class that interacts with the DiagnosticCenter arrayList.
	}
	
	public boolean isTestIdPresent(DiagnosticCenter centerObject,String testId)
	{
		return udi.isTestIdPresent(centerObject,testId); //calling the getCenterObject method of the UserDaoImplementation class that interacts with the DiagnosticCenter arrayList.
	}
	
}
