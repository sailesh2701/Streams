package com.streams.Data;

import java.util.ArrayList;
import java.util.List;

public class EmployeeHardCodeData {

	public static List<Employee> getEmployeeDetails() {
		List<Employee> finaEmployees = new ArrayList<>();
		finaEmployees.add(new Employee(1, "Ksvs", 24, 1800000L, 3));
		finaEmployees.add(new Employee(2, "Sailesh", 23, 1500000L, 2));
		finaEmployees.add(new Employee(3, "Venkat", 30, 2800000L, 8));
		finaEmployees.add(new Employee(4, "Heman", 34, 3800000L, 12));
		finaEmployees.add(new Employee(5, "Sai", 27, 1500000L, 5));
		finaEmployees.add(new Employee(5, "Sai", 27, 1500000L, 5));
		finaEmployees.add(new Employee(6, "Ram", 27, 1500000L, 5));

		return finaEmployees;
	}
}
