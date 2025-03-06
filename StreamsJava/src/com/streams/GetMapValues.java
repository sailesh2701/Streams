package com.streams;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.streams.Data.Employee;
import com.streams.Data.EmployeeHardCodeData;

public class GetMapValues {
	// COMPLEX Streams
	public static void main(String[] args) {
		List<Employee> list = EmployeeHardCodeData.getEmployeeDetails();
		Map<Integer, String> map = list.stream().collect(Collectors.toMap(emp -> emp.getId(), emp -> emp.getName()));
		System.out.println(map);

		list = EmployeeHardCodeData.getEmployeeDetails();
		Map<Integer, Object> highestSalaryByDept = list.stream()
				.collect(Collectors.groupingBy(Employee::getAge,
						Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingLong(Employee::getSalary)),
								emp -> emp.map(Employee::getSalary))));

		System.out.println("\n\n" + highestSalaryByDept);

	}

}
