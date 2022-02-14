package com.java;

public class EmployeeWageComputation {

	public static void main(String[] args) {
		int PRESENT = 1;
		double empcheck = (int) (Math.random() * 100) % 2;
		if (empcheck == PRESENT)

			System.out.println("Employee is Present");

		else

			System.out.println("Employee is Absent");

	}
}
