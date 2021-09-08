package com.cg.first;

import java.time.LocalDate;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.time.Month;
import java.time.Period;


public class Datetime {
	public static void main(String[] args) {
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter date in dd/MM/yyyy format:");
		String input  = scanner.nextLine();
		LocalDate enteredDate = LocalDate.parse(input,formatter);
		System.out.print("Enter date in dd/MM/yyyy format:");
		String onput  = scanner.nextLine();
		LocalDate end = LocalDate.parse(input,formatter);
		

		System.out.println("Entered Date:"+ enteredDate);
		System.out.println("Entered Date:"+ end);
		scanner.close();
		Period period = enteredDate.until(end);
		System.out.println("Days:"+ period.getDays());
		System.out.println("Months:"+period.getMonths());
		System.out.println("Years:"+ period.getYears());
	
	
	
	}

}
