package com.apcompsci.business;

@SuppressWarnings("unused")
public class Employee implements Comparable<Employee>
{
	private String lastName;
	private String firstName;
	private int age;
	private boolean currentEmployee;
	private boolean hourly;
	private int yearsEmployed;
	private double hourlyRate;
	private double salary;
	private double profit;
	private double baseSalarySales = 50000;
	private double baseHourlySecretary = 14.50;
	private double baseSalaryManager = 81000;
	private double baseHourlyCustodian = 12.75;
	private Object[] occupations = {"Manager", "Salesperson", "Secretary", "Custodian"};
	private String job;


	public Employee(String lastName, String firstName, int age, int yearsEmployed)
	{
		this.lastName = lastName;
		this.firstName = firstName;
		this.age = age;
		this.currentEmployee = true;
		this.yearsEmployed = yearsEmployed;
		this.profit = 0;
	}

	public String getName()
	{
		return lastName + ", " + firstName;
	}

	public String getLastName()
	{
		return lastName;
	}

	public String getFirstName()
	{
		return firstName;
	}

	public void setJob(String s)
	{
		job = s;
	}

	public String getJob()
	{
		return job;
	}

	public void setName(String newLastName, String newFirstName)
	{
		if (newLastName == null)
		{
			firstName = newFirstName;
			return;
		}

		if (newFirstName == null)
		{
			lastName = newLastName;
			return;
		}

		lastName = newLastName;
		firstName = newFirstName;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int newAge)
	{
		age = newAge;
	}

	public boolean getStatus()
	{
		return currentEmployee;
	}

	public void setProfit(double p)
	{
		profit = p;
	}

	public double getProfit()
	{
		return profit;
	}

	@SuppressWarnings("null")
	public void terminate() //terminate
	{
		currentEmployee = false;
		firstName = null;
		lastName = null;
		age = (Integer) null;
		yearsEmployed = (Integer) null;
		profit = (Double) null;
	}

	public void makeCurrent()
	{
		currentEmployee = true;
	}

	public boolean getHourly()
	{
		return hourly;
	}

	public void setHourly()
	{
		hourly = true;
	}

	public void setSalary()
	{
		hourly = false;
	}

	public int getYearsEmployed()
	{
		return yearsEmployed;
	}

	public void setYearsEmployed(int time)
	{
		yearsEmployed = time;
	}

	public double getHourlyRate()
	{
		return hourlyRate;
	}

	public void setHourlyRate(double pay)
	{
		hourlyRate = pay;
	}

	public double getSalary()
	{
		return salary;
	}

	public void setSalary(double pay)
	{
		salary = pay;
	}


	public double getBaseSalarySales()
	{
		return baseSalarySales;
	}

	public void setBaseSalarySales(double n)
	{
		baseSalarySales = n;
	}

	public double getBaseHourlySecretary()
	{
		return baseHourlySecretary;
	}

	public void setBaseHourlySecretary(double n)
	{
		baseSalarySales = n;
	}

	public double getBaseSalaryManager()
	{
		return baseSalaryManager;
	}

	public void setBaseSalaryManager(double n)
	{
		baseSalarySales = n;
	}

	public double getBaseHourlyCustodian()
	{
		return baseHourlyCustodian;
	}

	public void setBaseHourlyCustodian(double n)
	{
		baseHourlyCustodian = n;
	}

	@Override
	public String toString()
	{
		String s = "";
		s += getName();
		s += "\t";
		s += "Age: " + age;
		s += "\t";
		if (hourly)
			s += "Hourly ($" + hourlyRate + "/hour)";
		else
			s += "Salary ($" + salary + ")";
		s += "\t";
		s += "Years at the company: " + yearsEmployed;
		s += "\t";
		if (currentEmployee)
			s += "Status: Currently Employed";
		else
			s += "Status: No longer with us.";
		return s;
	}

	//This compareTo method should compare employees by their 
	//last names and if those are the same, then by their first 
	//names.
	@Override
	public int compareTo(Employee e) 
	{
		return 1;
	}
}

