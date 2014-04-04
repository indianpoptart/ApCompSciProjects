package com.apcompsci.business;


public class Salesperson extends Employee {

	//The company requires salespeople to bring in a minimum of $20,000 in sales.
	private double salesProfits = 20000;
	
	public Salesperson(String lastName, String firstName, int age, int yearsEmployed) 
	{
		super(lastName, firstName, age, yearsEmployed);
		setSales(150000);
		setSalary();
		setSalary(getBaseSalarySales() + salesProfits*.15);
		setJob("Salesperson");
		
	}
	
	public void setSales(double salesProf)
	{
		setProfit(salesProf);
	}
	
	public double getSales()
	{
		return salesProfits;
	}
	
	@Override
	public String toString()
	{
		String s = "";
		s += getName();
		s += "\t";
		s += "Salesperson";
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
