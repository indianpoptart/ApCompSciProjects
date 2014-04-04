package com.apcompsci.business;


public class Manager extends Employee{
	
	
	public Manager(String lastName, String firstName, int n, int yearsEmployed) 
	{
		super(lastName, firstName, n, yearsEmployed);
		setSalary();
		setSalary(getBaseSalaryManager() + yearsEmployed*1024);
		setJob("Manager");
	}

	@Override
	public String toString()
	{
		String s = "";
		s += getName();
		s += "\t";
		s += "Manager ";
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
