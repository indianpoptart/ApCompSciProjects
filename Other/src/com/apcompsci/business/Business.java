package com.apcompsci.business;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import javax.swing.*;

@SuppressWarnings("unused")
public class Business 
{
	private String companyName;
	private ArrayList<Employee> employees;
	private double profits;
	
	private double worth;
	private double payrollTotal;
	private boolean bankrupt;
	private Object[] occupations = {"Manager", "Salesperson", "Secretary", "Custodian"};



	/** creates a new Business 
	 * @param name the name of the company you are creating
	 * @param startingValue the initial worth of the company
	 * Post Condition: Employee list has been imported
	 * @throws IOException 
	 * 				   
	 */
	public Business(String name, int startingValue) throws IOException
	{
		companyName = name;
		worth = startingValue;
		employees = getEmployees();
	}

	public ArrayList<Employee> getEmpList()
	{
		return employees;
	}

	/**
	 * reads all employees from a file
	 * @return complete list of employees
	 */
	public ArrayList<Employee> getEmployees() throws IOException
	{
		ArrayList<Employee> temp = new ArrayList<Employee>();

		Scanner scan = new Scanner(System.in);
		String fileName = JOptionPane.showInputDialog(null, "What is the name of the employee file?", "employees.txt");
		FileReader fileReader = new FileReader(fileName);
		BufferedReader reader = new BufferedReader(fileReader);

		String delims = "[ ,]+";
		String thisLine = reader.readLine();
		int i = 0;

		while (thisLine != null) 
		{
			String[] tokens = thisLine.split(delims);
			String lastName = tokens[0];
			//System.out.println(lastName);
			String firstName = tokens[1];
			//System.out.println(firstName);
			String job = tokens[2];
			//System.out.println(job);
			int age = Integer.parseInt(tokens[3]);
			//System.out.println(age);
			int yearsEmployed = Integer.parseInt(tokens[4]);
			//System.out.println(yearsEmployed);

			switch (job){
			case "Custodian": 
				Custodian c = new Custodian(lastName, firstName, age, yearsEmployed);
				temp.add(c);
				break;

			case "Secretary":
				Secretary s = new Secretary(lastName, firstName, age, yearsEmployed);
				temp.add(s);
				break;

			case "Sales":
				Salesperson p = new Salesperson(lastName, firstName, age, yearsEmployed);
				temp.add(p);
				break;

			case "Manager":
				Manager m = new Manager(lastName, firstName, age, yearsEmployed);
				temp.add(m);
				break;

			}

			thisLine = reader.readLine();
		}

		reader.close();
		scan.close();
		return temp;
	}


	//Adds or edits an employee
	public void updateEmployeeList()
	{

		Object[] options = {"Add", "Edit"};
		int choice = JOptionPane.showOptionDialog(null, "Add or Edit Employee?", "Choose an option",
				JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[1]);
		if (choice == 0)
		{
			createEmployee();
		}

		else
		{
			editEmployee();
		}

	}

	/*
	 * This method will allow you to edit any aspect of any employee
	 * You must bring up dialog windows to ask what employee the user 
	 * would like to edit and then find out what they want to change
	 * about that user.
	 */
	public void editEmployee() 
	{

		String edit1 = JOptionPane.showInputDialog(null, "What is the last name of the person you would like to edit?");
		for(int i = 0; i<employees.size()+1;i++)
		{	
			if(edit1.equals(employees.get(i).getLastName())){
				Employee edit=employees.get(i);

				String[] menuEdit = {"Last Name", "First Name", "Age", "Salary"};
				int runMenu = JOptionPane.showOptionDialog(null, "What would you like to do?", "Choose an option", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, menuEdit,  menuEdit[3]);


				if(runMenu == 0)
				{	
					String editName = JOptionPane.showInputDialog(null, "Enter new last name:");
					edit.setName(editName, "");
				}
				if(runMenu == 1)
				{	
					String editName = JOptionPane.showInputDialog(null, "Enter new first name:");
					edit.setName(editName, "");

				}
				if(runMenu == 2)
				{	
					String editAge = JOptionPane.showInputDialog(null, "Enter new age:");
					int age1 = Integer.parseInt(editAge);
					edit.setAge(age1);

				}
				if(runMenu == 3)
				{	
					String newPos = JOptionPane.showInputDialog(null, "Enter new position:");
					edit.setJob(newPos);
				}

			}


			else{
				String choice = JOptionPane.showInputDialog(null, "Name not found!! Would you like to try again?");
				if(choice.equalsIgnoreCase("yes"))
				{
					editEmployee();
				}
				else
					break;
			}
		}
	}

	/*
	 * This method will print all of the employees to the console
	 * in the following format:
	 * 
	 * Last Name, First Name     Position      Age: ___      Salary (amount)     Years at the company: ____     Status: Currently Emplyoed?
	 * 
	 * remember each subclass of employee has it's own toString
	 */
	public void printEmployees()
	{
		for(int i = 0; i < employees.size(); i++){
			System.out.println(employees.get(i));
		}
	}

	/*
	 * This method returns to sum of all of the profits
	 * from all of the employees.
	 */
	public double getProfits()
	{
		double totalSal = 0.0;
		for(Employee e: employees){
			totalSal += e.getProfit();
		}
		return totalSal;

	}

	public void createEmployee()
	{
		String firstName = JOptionPane.showInputDialog(null, "What is the first name of the employee that you wish to add?");
		String lastName = JOptionPane.showInputDialog(null, "What is the last name of the employee that you wish to add?");
		String n = JOptionPane.showInputDialog(null, "What is the age of the employee you are adding?");
		int age = Integer.parseInt(n);
		int occ = JOptionPane.showOptionDialog(null, "What position does this employee hold?", "Choose an option", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, occupations, occupations[3]);
		if (occ == 0)
		{
			Manager m = new Manager(lastName, firstName, age, 0);
			employees.add(m);
		}
		if (occ == 1)
		{
			Salesperson s = new Salesperson(lastName, firstName, age, 0);
			employees.add(s);
		}
		if (occ == 2)
		{
			Secretary sc = new Secretary(lastName, firstName, age, 0);
			employees.add(sc);
		}
		if (occ == 3)
		{
			Custodian c = new Custodian(lastName, firstName, age, 0);
			employees.add(c);
		}
	}

	/*
	 * This method sorts the list of employees
	 * alphabetically by their last names.
	 */

	public void sortList()
	{
		try{
			String inputFile = "employees.txt";
			String outputFile = "employees.txt";

			FileReader fileReader = new FileReader(inputFile);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String inputLine;
			ArrayList<String> lineList = new ArrayList<String>();
			while ((inputLine = bufferedReader.readLine()) != null) {
				lineList.add(inputLine);
			}
			fileReader.close();
			//System.out.println(lineList);
			Collections.sort(lineList);
			//System.out.println("            ");
			//System.out.println(lineList);
			PrintWriter writer = new PrintWriter("employees.txt");
			for (String outputLine : lineList) {
				//System.out.println(outputLine);
				writer.println(outputLine);
			}
			writer.close();
		}
		catch(Exception e){
			System.out.println("Error!");
		}
	}


	/*
	 * Calculate and return the worth of the company.
	 * We will define "worth" as profits minus payroll.
	 * If worth < 0, set bankrupt to true.
	 * 
	 * @precondition both getProfits() and getSalaryPayout()
	 * work.
	 */
	public double getWorth()
	{
		double totalProf = 0.0;
		double totalSal = 0.0;
		for(Employee e: employees){
			totalProf += e.getProfit();
			totalSal += e.getSalary();
		}
		double worth = totalProf + totalSal;
		return worth;
	}

	/*
	 * This method returns the total amount of money 
	 * that will be spent on a payday.
	 */
	public double getSalaryPayout()
	{
		double totalSal = 0.0;
		for(Employee e: employees){
			totalSal += e.getSalary();
		}
		return totalSal;

	}

	/*
	 * Search through the list to find the employee with this last name. 
	 * If there are multiple employees with the same last name, then 
	 * bring up a pop up box to ask for the first name of the individual.
	 * If there are two people with the same first and last names, they
	 * have brought too much confusion to the company...fire them both.
	 * If more than two have the exact same name, then they are clearly
	 * Cylons and must be terminated immediately. All of them.
	 * 
	 * @param lastName the last name of the employee to be terminated.
	 * @precondition the last name will match at least one employee in the list 
	 */
	public void terminateEmployee(String lastName)
	{
		String edit1 = JOptionPane.showInputDialog(null, "What is the last name of the person you would like to terminate?");
		for(int i = 0; i<employees.size()-1;i++)
		{	
			if(edit1.equals(employees.get(i).getLastName())){
				Employee edit=employees.get(i);
				edit.setName("", "");
				edit.setJob("");
				edit.terminate();
			}
		}
	}

	public void saveList()
	{
		try {
			String ultimateString = "";

			for (Employee e: employees)
			{
				String temp = "" + e.getLastName() + ", " + e.getFirstName() + " " + " " ;
				temp += e.getJob() + " " + " ";
				temp += e.getAge() + " " + " ";
				temp += e.getYearsEmployed();
				ultimateString += temp + "\n";
			}

			FileWriter fw = new FileWriter("employees.txt", false);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(ultimateString);
			bw.close();
			System.out.println("End of Line");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void increaseYear() 
	{
		try{
			String last = JOptionPane.showInputDialog(null, "What is the last name of the employee that you wish to increase year?");
			for (Employee e: employees)
			{
				String l = e.getLastName();
				if(l.equals(last)){
					int year = e.getYearsEmployed();
					e.setYearsEmployed(year +1);
				}
				else if(!l.equals(last)){
					JOptionPane.showMessageDialog(null, "The specified name is not an employee");
					System.out.println(e.getLastName());
					break;
				}
				else{

				}
			}
		}
		catch(Exception e){

		}
	}
}
