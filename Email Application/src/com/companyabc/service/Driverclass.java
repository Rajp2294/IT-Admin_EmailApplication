package com.companyabc.service;

import java.util.Scanner;

import com.companyabc.model.Employee;

public class Driverclass {
	
	public static void main(String[] args) {
		
	
	
	Employee employee = new Employee("Raj", "Parekh");
	CredentialService cs = new CredentialService();
	String generatedEmail;
	char[] generatedPassword;
	
	System.out.println("Please Enter the department from the following ");
	System.out.println("1. Technical");
	System.out.println("2. Admin");
	System.out.println("3. Human Resource");
	System.out.println("4. Legal");
	
	Scanner sc = new Scanner(System.in);
	int option = sc.nextInt();
	
	switch(option) {
		case 1: {
			generatedEmail = cs.generateEmailAddress(employee.getFirstName().toLowerCase(),
					employee.getLastName().toLowerCase(),"tech");
			generatedPassword = cs.generatePassword();
			cs.showCredentials(employee, generatedEmail, generatedPassword);
			break;
		   }
		case 2: {
			generatedEmail = cs.generateEmailAddress(employee.getFirstName().toLowerCase(),
					employee.getLastName().toLowerCase(),"adm");
			generatedPassword = cs.generatePassword();
			cs.showCredentials(employee, generatedEmail, generatedPassword);
			break;
		   }
		case 3: {
			generatedEmail = cs.generateEmailAddress(employee.getFirstName().toLowerCase(),
				employee.getLastName().toLowerCase(),"hr");
		    generatedPassword = cs.generatePassword();
		cs.showCredentials(employee, generatedEmail, generatedPassword);
			break;
		   }
		case 4: {
			generatedEmail = cs.generateEmailAddress(employee.getFirstName().toLowerCase(),
					employee.getLastName().toLowerCase(),"lg");
			generatedPassword = cs.generatePassword();
			cs.showCredentials(employee, generatedEmail, generatedPassword);
			break;
		   }
		default: {
			System.out.println("Error!! Enter option between (1-4)");
			break;
		   }		
	     }
	sc.close();
	}
	

}
