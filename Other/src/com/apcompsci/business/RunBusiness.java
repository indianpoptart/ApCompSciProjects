package com.apcompsci.business;

import java.io.IOException;
import javax.swing.JOptionPane;

@SuppressWarnings("unused")
public class RunBusiness 
{

	private static Object[] occupations = {"Manager", "Salesperson", "Secretary", "Custodian"};


	public static void main(String[] args) throws IOException
	{

		String[] menu1 = {"Create new business", "Quit"};
		int firstMenu = JOptionPane.showOptionDialog(null, "What What would you like to do?", "Choose an option", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, menu1, menu1[1]);

		if (firstMenu == 0)
		{
			String companyName = JOptionPane.showInputDialog(null, "What is the Name  of your company?", "Company");
			String n = JOptionPane.showInputDialog(null, "What is the starting value of your company?", "10");
			int value = Integer.parseInt(n);




			Business b = new Business(companyName, value);

			while (true)
			{
				String[] options = {"Add/Edit Employee", "Terminate Employee", "Run Profits Report", "Display Payroll", "Calculate Worth", "Increase year", "Display Employees", "Save and Quit"};
				int runningMenu = JOptionPane.showOptionDialog(null, "What would you like to do?", "Choose an option", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[6]);
				if (runningMenu == 0)// add employee
				{
					b.updateEmployeeList();
				}

				if (runningMenu == 1) // terminate employee
				{
					boolean exists = false;
					String s = "";
					
						s = JOptionPane.showInputDialog(null, "What's the last name of the employee that you wish to remove?");
						b.terminateEmployee(s);

				}
				if (runningMenu == 2) //profits report
				{
					JOptionPane.showMessageDialog(null, b.getProfits());
				}

				if (runningMenu == 3) //payroll
				{
					JOptionPane.showMessageDialog(null, b.getSalaryPayout());
				}
				if (runningMenu == 4)//worth
				{
					JOptionPane.showMessageDialog(null, b.getWorth());
				}

				if (runningMenu == 5)//increase year
				{
					b.increaseYear();
				}
				if (runningMenu == 6)//list all employees
				{
					b.printEmployees();
				}

				if (runningMenu == 7)//quit
				{
					b.sortList();
					b.saveList();
					return;
				}
			}
		}

		else
		{
			return;
		}
	}
}