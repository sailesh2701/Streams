package com.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.streams.Data.Employee;
import com.streams.Data.EmployeeHardCodeData;

public class RemoveDuplicates {
	public static void main(String[] args) {
		List<Integer> list = getList();

		List<Integer> removeDuplicate = list.stream().distinct().toList();
		System.out.println("Disticnt Elements are: " + removeDuplicate);

		List<Employee> emp = EmployeeHardCodeData.getEmployeeDetails();
		emp = emp.stream().distinct().toList();
		System.out.println("Distinct Employee Objects are: " + emp);

		// ADVANCE DISTINCT.!
		Map<Integer, Long> map = emp.stream().collect(Collectors.groupingBy(Employee::getAge, Collectors.counting()));
		List<Employee> uniqueAgeEmployees = emp.stream().filter(e -> map.get(e.getAge()) == 1)
				.collect(Collectors.toList());
		System.out.println("Advance Distinct EMpolyess of same Age: " + uniqueAgeEmployees);

	}

	private static List<Integer> getList() {
		List<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(12);
		list.add(2);
		list.add(3);
		list.add(22);
		list.add(13);
		list.add(3);
		list.add(2);
		list.add(23);
		list.add(3);
		System.out.println("All Elements are: " + list);
		return list;
	}
}
