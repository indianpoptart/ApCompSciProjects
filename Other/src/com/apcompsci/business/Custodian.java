package com.apcompsci.business;


public class Custodian extends Employee 
{
	
	public Custodian(String lastName, String firstName, int age, int yearsEmployed) 
	{
		super(lastName, firstName, age, yearsEmployed);
		setHourly();
		setHourlyRate(getBaseHourlyCustodian() + yearsEmployed*.45);
		setJob("Custodian");
	}
	
	@Override
	public String toString()
	{
		String s = "";
		s += getName();
		s += "\t";
		s += "Custodian";
		s += "\t";
		s += "Age: " + getAge();
		s += "\t";
		if (getHourly())
			s += "Hourly ($" + getHourlyRate() + "/hour)";
		else
			s += "Salary ($" + getSalary() + ")";
		s += "\t";
		s += "Years at the company: " + getYearsEmployed();
		s += "\t";
		if (getStatus())
			s += "Status: Currently Employed";
		else
			s += "Status: No longer with us.";
		return s;
	}


}
