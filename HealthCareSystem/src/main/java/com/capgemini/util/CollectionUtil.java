package com.capgemini.util;

import java.util.ArrayList;
import java.util.List;

import com.capgemini.dto.DiagnosticCenter;
import com.capgemini.dto.CenterTest;

public class CollectionUtil {
	public static List<DiagnosticCenter> centerList= new ArrayList<DiagnosticCenter>();
	public static List<CenterTest> listOfTests1 = new ArrayList<CenterTest>();
	public static List<CenterTest> listOfTests2 = new ArrayList<CenterTest>();
	public static int centerCount = 0;
	public static int testCount = 0;
	public static String centerAutogeneratedId()
	{
		String key = "C"+(++centerCount);
		return key;
	}
	public static String testAutogeneratedId()
	{
	    String	key= "T"+(++testCount);
		return key;	
	}
	static
	{
		listOfTests1.add(new CenterTest(testAutogeneratedId(),"blood group"));
		listOfTests1.add(new CenterTest(testAutogeneratedId(),"blood sugar"));
		listOfTests1.add(new CenterTest(testAutogeneratedId(),"blood pressure"));
	}
	static
	{
		listOfTests2.add(new CenterTest(testAutogeneratedId(),"blood group"));
		listOfTests2.add(new CenterTest(testAutogeneratedId(),"blood sugar"));
		listOfTests2.add(new CenterTest(testAutogeneratedId(),"blood pressure"));
	}
	static
	{
	centerList.add(new DiagnosticCenter(centerAutogeneratedId(),"Sai Chaitanya Diagnostic Center",listOfTests1));
	centerList.add(new DiagnosticCenter(centerAutogeneratedId(),"Adarsh Diagnostic Center",listOfTests2));
	}
	
	

}
