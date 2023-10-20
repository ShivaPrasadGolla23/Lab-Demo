package com.cg.eis.exception;
import com.cg.eis.exception.EmployeeException;

public class SalaryofEmployee {

	public static void main(String[] args) {
		try {
			int employeeSalary = 2500;
		if (employeeSalary < 3000) {
			throw new EmployeeException("Employee's Salary is below 3000");
		}
		else {
			System.out.println("Employee's Salary is above 3000");
		}
		}
		
		catch(EmployeeException e) {
			System.out.println("EXcetpion:" + e.getMessage());
		}
		}

	}