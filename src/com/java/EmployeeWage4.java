package com.java;

import java.util.Random;

public class EmployeeWage4 {
	static final int IS_FULL_TIME = 1;
	static final int IS_PART_TIME = 2;
	static final int EMP_RATE_PER_HR = 20;

	public static int empCheckStatus() {
		int empWrkHrs = 0;
		Random random = new Random();
		int empCheck = random.nextInt(3);

		switch (empCheck) {
		case IS_FULL_TIME:
			empWrkHrs = 8;
			break;

		case IS_PART_TIME:
			empWrkHrs = 4;
			break;

		default:
			empWrkHrs = 0;
			break;
		}

		return empWrkHrs;
	}

	public static int empWagePerDayStatus(int empWrkHrs) {
		int empWagePerDay = empWrkHrs * EMP_RATE_PER_HR;
		return empWagePerDay;
	}

	public static void main(String[] args) {
		int empWrkHrs;
		int empWagePerDay;
		empWrkHrs = empCheckStatus();
		empWagePerDay = empWagePerDayStatus(empWrkHrs);
		System.out.println("Employee Wage per day: " + empWagePerDay);

	}
}
