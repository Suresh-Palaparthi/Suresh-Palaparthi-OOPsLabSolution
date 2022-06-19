package com.suresh.main;

import java.util.Scanner;

import com.suresh.model.Employee;
import com.suresh.service.CredentialService;

public class Driver {

	public static void main(String[] args) {

		Employee employee = new Employee("Suresh", "Palaparthi");
		CredentialService cs = new CredentialService();
		String generatedEmail;
		char[] generatedPassword;

		System.out.println("Enter Department Name");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. legal");

		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();

		if (option ==1) {
			generatedEmail =cs.generateEmailAddress(employee.getFirstName().toLowerCase(),
					employee.getLastName().toLowerCase(), "tech");
			generatedPassword = cs.generatepassword();
			cs.showCredentials(employee, generatedEmail,generatedPassword);
		}
		else if (option ==2) {
			generatedEmail =cs.generateEmailAddress(employee.getFirstName().toLowerCase(),
					employee.getLastName().toLowerCase(), "adm");
			generatedPassword = cs.generatepassword();
			cs.showCredentials(employee, generatedEmail,generatedPassword);
		}
		else if (option ==3) {
			generatedEmail =cs.generateEmailAddress(employee.getFirstName().toLowerCase(),
					employee.getLastName().toLowerCase(), "humanres");
			generatedPassword = cs.generatepassword();
			cs.showCredentials(employee, generatedEmail,generatedPassword);
		}
		else if (option ==4) {
			generatedEmail =cs.generateEmailAddress(employee.getFirstName().toLowerCase(),
					employee.getLastName().toLowerCase(), "legal");
			generatedPassword = cs.generatepassword();
			cs.showCredentials(employee, generatedEmail,generatedPassword);
		sc.close();
		}
		else {
			System.out.println("Please enter 1-4 Numbers only. There are only 4 departments");
		}
		sc.close();
	}	

}
