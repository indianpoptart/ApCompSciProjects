package com.apcompsci.business;


public class Secretary extends Employee{
	
	public double baseHourlyRate = 14.50;

	public Secretary(String lastName, String firstName, int age, int yearsEmployed) 
	{
		super(lastName, firstName, age, yearsEmployed);
		setHourly();
		setHourlyRate(getBaseHourlySecretary() + yearsEmployed*1.05);
		setJob("Secretary");
	}

	@Override
	public String toString()
	{
		String s = "";
		s += getName();
		s += "\t";
		s += "Secretary";
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
